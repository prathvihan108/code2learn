# ==============================================================================
# THE MASTER BLUEPRINT OF EXCEPTION HANDLING IN PYTHON
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE COMPLETE 4-STAGE ARCHITECTURE
# ------------------------------------------------------------------------------
# A full exception block can have up to four distinct stages:
# - try: The risky code you want to test.
# - except: The backup plan that executes ONLY if an error occurs inside 'try'.
# - else: Code that executes ONLY if the 'try' block ran with zero errors.
# - finally: Code that ALWAYS runs, regardless of whether an error happened or not.

def divide_numbers(a, b):
    try:
        print(f"\n--- Processing: {a} / {b} ---")
        result = a / b  # Risky line (could trigger ZeroDivisionError or TypeError)
        
    except ZeroDivisionError as e:
        # 'as e' captures the official error object message
        print(f"[EXCEPT BLOCK] Math Error: Cannot divide by zero. Details: {e}")
        result = None
        
    except TypeError:
        # You can catch different types of errors separately!
        print("[EXCEPT BLOCK] Type Error: Please provide integers or floats.")
        result = None
        
    else:
        print("[ELSE BLOCK] Clean execution! No errors occurred.")
        
    finally:
        print("[FINALLY BLOCK] Cleanup complete. This sentence ALWAYS prints.")
        
    return result

# Let's test different paths through the system:
divide_numbers(10, 2)   # Path: try -> else -> finally
divide_numbers(10, 0)   # Path: try -> except (ZeroDivisionError) -> finally
divide_numbers(10, "2") # Path: try -> except (TypeError) -> finally


# ------------------------------------------------------------------------------
# 2. THE DEADLY EXCEPT TRAPS (Interview Favorites)
# ------------------------------------------------------------------------------

# --- TRAP A: The Bare 'except:' or 'except Exception:' Blindfold ---
# Writing a broad exception handler catches absolutely everything. This is highly 
# dangerous because it hides bugs you didn't anticipate (like typos or system exit commands).

try:
    # Let's say you accidentally misspelled a variable name:
    value = 10 / 2
    # print(vlaue) # NameError!
except Exception:
    # This swallows the NameError silently! You will have no idea why your code is failing.
    print("Something went wrong...") 


# --- TRAP B: Wrong Exception Order (Hierarchical Blocking) ---
# Python evaluates 'except' blocks from top to bottom. If you place a broad, generic 
# parent error above a specific child error, the specific one will never be reached!

try:
    num = 1 / 0
except Exception: 
    # ❌ TRAP: Exception is the parent of ZeroDivisionError. It steals the error first!
    print("Caught by generic handler.")
# except ZeroDivisionError:
#     print("This code becomes unreachable dead code!")


# ------------------------------------------------------------------------------
# 3. REAL-WORLD PRODUCTION USE CASE: THE POWER OF FINALLY
# ------------------------------------------------------------------------------
# In professional development, the 'finally' block is critical for closing 
# system resources like file streams, database links, or network sockets. 
# Even if a function exits early via a 'return' statement, 'finally' WILL still execute!

def read_system_log():
    file_stream = None
    try:
        # Simulating opening a resource
        file_stream = "Active File Handle Connection"
        print(f"\nResource Status: {file_stream}")
        
        # Simulating an unexpected crash while reading data
        crash_trigger = 5 / 0 
        return "File Data Read Successfully"
        
    except ZeroDivisionError:
        print("Caught crash inside file reader.")
        return "Fallback Error Data" # Early return statement!
        
    finally:
        # Even though the except block calls 'return', Python pauses execution,
        # forces this finally block to run, and ONLY THEN returns the data out!
        print("CRITICAL: Closing file streams and releasing memory buffers.")
        file_stream = "Closed"

final_status = read_system_log()


# ------------------------------------------------------------------------------
# 4. INTENTIONAL CRASHES: THE 'RAISE' KEYWORD
# ------------------------------------------------------------------------------
# You can force your code to trigger an exception intentionally if business logic 
# rules are violated (e.g., negative balance, under-age user).

def verify_age(age):
    if age < 0:
        # Instantly halts execution and sends a ValueError up the call stack
        raise ValueError("Age cannot be a negative number!")
    return f"Age {age} verified successfully."

try:
    verify_age(-5)
except ValueError as error:
    print(f"\nCaught Intentional Crash: {error}")