# ==============================================================================
# THE MASTER BLUEPRINT OF PYTHON LAMBDA FUNCTIONS
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE ANATOMY: TRADITIONAL 'DEF' VS. ANONYMOUS 'LAMBDA'
# ------------------------------------------------------------------------------
# Syntax: lambda arguments: expression
# Notice: There is NO 'return' keyword! The result is returned automatically.

# Method A: The Traditional 'def' Way
def compute_square(x):
    return x ** 2

# Method B: The Anonymous 'lambda' Way
square_lambda = lambda x: x ** 2

print("1a. Standard Function:", compute_square(5))  # Output: 25
print("1b. Lambda Function:  ", square_lambda(5))   # Output: 25


# ------------------------------------------------------------------------------
# 2. MULTI-ARGUMENTS AND INLINE CONDITIONALS (TERNARY LOGIC)
# ------------------------------------------------------------------------------
# Lambdas can accept multiple parameters separated by commas. 
# They can also handle basic if-else ternary logic within their single allowed line.

# Multi-Argument Blueprint
calculate_area = lambda length, width: length * width
print("\n2a. Multi-Argument Area:", calculate_area(10, 5))  # Output: 50

# Ternary Conditional Blueprint: lambda args: value_if_true if condition else value_if_false
check_max = lambda a, b: a if a > b else b
print("2b. Inline Conditional Max:", check_max(12, 45))     # Output: 45


# ------------------------------------------------------------------------------
# 3. REAL-WORLD APPLICATIONS (HIGHER-ORDER FUNCTION DATA MANIPULATION)
# ------------------------------------------------------------------------------
# Lambdas show their true power when passed directly as inline sorting keys or 
# functional processing pipelines, preventing boilerplate code creation.

# Application A: Custom Sorting Keys (Highly Common in Technical Interviews)
# Suppose you have a list of tuples containing employee data: (Name, Age)
employees = [("Prathvi", 25), ("Akshat", 22), ("Harshith", 28)]

# Sort the list dynamically by AGE (index 1 of the tuple) using a lambda key
employees.sort(key=lambda emp: emp[1])
print("\n3a. Sorted by Age via Lambda Key:", employees) 
# Output: [('Akshat', 22), ('Prathvi', 25), ('Harshith', 28)]


# Application B: Transforming Data Streams with map()
base_numbers = [1, 2, 3, 4]
multiplied = list(map(lambda n: n * 10, base_numbers))
print("3b. Map Transformation:         ", multiplied)  # Output: [10, 20, 30, 40]


# Application C: Filtering Data Streams with filter()
scores = [15, 42, 11, 30, 8]
passed_scores = list(filter(lambda s: s >= 20, scores))
print("3c. Filtered Output Stream:     ", passed_scores)  # Output: [42, 30]


# ------------------------------------------------------------------------------
# 4. KEY LIMITATIONS AND CONFUSION TRAPS
# ------------------------------------------------------------------------------

# --- TRAP 1: The Multiple-Statement Illusion ---
# You can NEVER execute loops (for, while), perform multi-line variable updates, 
# or group separate code lines inside a lambda. It is strictly limited to ONE expression.

# bad_lambda = lambda x: for i in range(x): print(i) 
# ❌ CRASHES (SyntaxError)! If your logic needs structural statements, use a standard 'def' block.


# --- TRAP 2: Style Guide Violation (PEP 8 Name Binding) ---
# PEP 8 explicit style guidelines state that you should never explicitly bind 
# a lambda to a variable identifier (like we did in sections 1 and 2 for demo purposes). 
# Assigning a name defeats the purpose of an *anonymous* function.

# Anti-Pattern (Poor Style):
# add_numbers = lambda a, b: a + b

# Clean Pythonic Standard: Only use lambdas when passed directly into parameters!
def add_numbers(a, b): return a + b