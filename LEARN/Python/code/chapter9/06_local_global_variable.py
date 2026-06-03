# ==============================================================================
# LOCAL VS GLOBAL VARIABLES IN PYTHON
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. GLOBAL VARIABLES (The Open Space)
# ------------------------------------------------------------------------------
# A global variable is declared outside of any function, at the top level of 
# your script. It is visible and readable by ANY code block or function below it.

username = "Prathvi"  # This is a GLOBAL variable

def print_welcome():
    # Functions can read global variables perfectly fine without any extra setup
    print(f"1. Welcome back, {username}!")

print_welcome()  # Output: Welcome back, Prathvi!


# ------------------------------------------------------------------------------
# 2. LOCAL VARIABLES (The Private Box)
# ------------------------------------------------------------------------------
# A local variable is created INSIDE a function block. It exists only while 
# that specific function is running, and it is completely invisible to the 
# outside world.

def calculate_total():
    tax_rate = 0.18  # This is a LOCAL variable
    print(f"2a. Inside function, tax rate is: {tax_rate}")

calculate_total()

# --- THE CRASH TRAP ---
# If you try to access a local variable outside its home function, your code crashes!
# try:
#     print(tax_rate)
# except NameError as e:
#     print(f"2b. Outside function error: {e}")  # Output: name 'tax_rate' is not defined


# ------------------------------------------------------------------------------
# 3. VARIABLE SHADOWING (The Name Collision)
# ------------------------------------------------------------------------------
# If you create a local variable with the EXACT SAME NAME as a global variable, 
# Python creates a temporary local wall. It uses the local value inside the 
# function without altering the global one outside.

score = 100  # Global variable

def level_up():
    score = 500  # Local variable shadowing the global one
    print(f"3a. Inside function, score is: {score}")  # Output: 500

level_up()
print(f"3b. Outside function, global score remains: {score}")  # Output: 100


# ------------------------------------------------------------------------------
# 4. THE 'GLOBAL' KEYWORD (Modifying from Inside)
# ------------------------------------------------------------------------------
# TRAP: By default, you can READ a global variable inside a function, but if you 
# try to CHANGE it, Python will crash or create a new local variable.
# FIX: You must explicitly use the 'global' keyword to tell Python you want to 
# modify the actual global variable sitting outside.

count = 0  # Global counter

def increment():
    global count  # Declares that we are pointing to the global variable
    count += 1    # Safely modifies it

increment()
print(f"4. Global counter updated to: {count}")  # Output: 1