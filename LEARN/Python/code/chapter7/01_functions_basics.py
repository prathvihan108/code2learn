# ==============================================================================
# THE MASTER BLUEPRINT OF PYTHON FUNCTIONS
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. CORE SYNTAX: DECLARING AND CALLING
# ------------------------------------------------------------------------------
# Functions are defined using the 'def' keyword, followed by the function name, 
# parentheses (), a colon :, and indented block code.

def greet_user():
    print("Hello! Welcome back.")

# To execute a function, you must explicitly "call" it using its name:
greet_user()  # Output: Hello! Welcome back.


# ------------------------------------------------------------------------------
# 2. INPUTS & OUTPUTS: PARAMETERS, ARGUMENTS, AND THE RETURN KEYWORD
# ------------------------------------------------------------------------------
# - Parameters: The variable placeholders defined in the function signature (name, role).
# - Arguments: The actual real data values you pass into those placeholders when calling.
# - Return: Sends a calculated value back to the caller. It instantly exits the function!

def calculate_pay(hours, hourly_rate):
    total_salary = hours * hourly_rate
    return total_salary  # Sends the result back out
    print("This will never print!") # Dead code because it sits AFTER a return statement

# Capturing the returned value inside a variable:
monthly_income = calculate_pay(40, 25)
print("2. Income:", monthly_income)  # Output: 1000


# ------------------------------------------------------------------------------
# 3. POSITION VS KEYWORD ARGUMENTS
# ------------------------------------------------------------------------------
def show_profile(username, status):
    print(f"User: {username} | Status: {status}")

# Positional: Order matters completely!
show_profile("Alice", "Active")    # Output: User: Alice | Status: Active

# Keyword: Order does NOT matter because you explicitly name the parameters.
show_profile(status="Offline", username="Bob") # Output: User: Bob | Status: Offline


# ------------------------------------------------------------------------------
# 4. DEFAULT PARAMETER VALUE TRAP (An Interview Favorite!)
# ------------------------------------------------------------------------------
# You can set fallback default values for parameters if the caller omits them.
# RULE: Default parameters MUST be placed at the very end of the function signature!

def register_student(name, course="Python Basics"):
    print(f"Enrolled {name} into {course}")

register_student("Prathvi")                 # Uses default -> Enrolled Prathvi into Python Basics
register_student("Akshat", "Advanced Java") # Overrides default -> Enrolled Akshat into Advanced Java


# ------------------------------------------------------------------------------
# 5. DYNAMIC ARGUMENTS: *args AND **kwargs (Arbitrary Arguments)
# ------------------------------------------------------------------------------
# Used when you don't know ahead of time how many inputs a user will pass.
# - *args: Collects extra positional arguments into a TUPLE.
# - **kwargs: Collects extra keyword arguments into a DICTIONARY.

def sum_all_numbers(*args):
    print("5a. args looks like this tuple:", args)
    return sum(args)

print("Sum total:", sum_all_numbers(10, 20, 30, 40)) # Output: 100


def save_user_metadata(**kwargs):
    print("5b. kwargs looks like this dict:", kwargs)
    if "admin" in kwargs:
        print("Special administration permissions applied.")

save_user_metadata(id=109, email="test@test.com", admin=True)


# ------------------------------------------------------------------------------
# 6. VARIABLE SCOPE TRAPS (Local vs Global)
# ------------------------------------------------------------------------------
# Variables created inside a function are LOCAL to that function and cannot 
# be seen by the rest of your script out in the global space.

global_score = 100 # Global variable

def modify_score():
    # local_score = 50 # This would be localized
    
    # TRAP: To modify a global variable inside a function, you must use 'global'
    global global_score
    global_score = 250 

modify_score()
print("6. Global Score modified to:", global_score) # Output: 250


# ------------------------------------------------------------------------------
# 7. THE SILENT RETURN GOTCHA (Exam Multi-Choice Trick)
# ------------------------------------------------------------------------------
# If a function executes completely without running into a 'return' statement, 
# it doesn't return nothing—it secretly returns the special data object 'None'.

def dummy_func():
    x = 10 + 20

result = dummy_func()
print("7. What did it return?:", result) # Output: None