# ==============================================================================
# PASSING NORMAL FUNCTIONS AS ARGUMENTS
# ==============================================================================

# ------------------------------------------------------------------------------
# STEP 1: Define normal, basic functions (The Workers)
# ------------------------------------------------------------------------------
def shout(text):
    return text.upper() + "!!!"

def whisper(text):
    return text.lower() + "..."


# ------------------------------------------------------------------------------
# STEP 2: Define a Higher-Order Function (The Boss)
# ------------------------------------------------------------------------------
# Look at the parameter 'func_argument'. It expects to receive a function name.
def format_message(message, func_argument):
    print("1. Inside the boss function...")
    
    # We call the incoming function by adding parentheses () to the variable name!
    processed_text = func_argument(message)
    
    return processed_text


# ------------------------------------------------------------------------------
# STEP 3: Pass the functions as arguments
# ------------------------------------------------------------------------------
# CRITICAL RULE: When passing a function as an argument, pass ONLY its name. 
# Do NOT include parentheses (). 
# Writing 'shout' passes the tool itself. Writing 'shout()' runs the tool instantly.

print("\n--- Test Run 1: Passing Shout ---")
result_1 = format_message("Hello World", shout)
print("Final Output 1:", result_1) 
# Output: HELLO WORLD!!!


print("\n--- Test Run 2: Passing Whisper ---")
result_2 = format_message("Hello World", whisper)
print("Final Output 2:", result_2) 
# Output: hello world...

# note: you can not use normal function to assinn to a variable in a single like of code, only lambda functions can be assigned to a variable in a single line of code. 

# ==============================================================================
# SINGLE-LINE DECLARATION AND ASSIGNMENT
# ==============================================================================

# The moment this line runs, Python defines the logic AND assigns it to 'multiply'
multiply = lambda x, y: x * y

# Now you can use it immediately just like a normal function
print("Result:", multiply(6, 7))  # Output: 42