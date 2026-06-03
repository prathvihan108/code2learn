# ==============================================================================
# LIST COMPREHENSION: THE BASIC SYNTAX
# ==============================================================================

# THE CORE BLUEPRINT:
# new_list = [ expression for item in iterable ]

numbers = [1, 2, 3, 4, 5]

# --- Method A: The Traditional 3-Line Loop ---
squared_loop = []
for x in numbers:
    squared_loop.append(x ** 2)

print("Method A:", squared_loop)  # Output: [1, 4, 9, 16, 25]


# --- Method B: The Sleek 1-Line List Comprehension ---
# 1. Look at the variable being appended: 'x ** 2' goes FIRST.
# 2. Look at the loop statement: 'for x in numbers' follows right behind it.
squared_comp = [x ** 2 for x in numbers]

print("Method B:", squared_comp)  # Output: [1, 4, 9, 16, 25]

# ----------------------------------------------------------------------------
# Blueprint: [ expression for item in iterable if condition ]

numbers = [1, 2, 3, 4, 5, 6]

# Only include 'x' if it is an even number
evens = [x for x in numbers if x % 2 == 0]

print("Filtered Evens:", evens)  # Output: [2, 4, 6]

# ----------------------------------------------------------------------------
# Blueprint: [ value_if_true if condition else value_if_false for item in iterable ]

scores = [45, 88, 52, 91]

# Label each score as "Pass" or "Fail"
results = ["Pass" if s >= 50 else "Fail" for s in scores]

print("Evaluated Results:", results)  # Output: ['Fail', 'Pass', 'Pass', 'Pass']

# ----------------------------------------------------------------------------

# ==============================================================================
# PRACTICAL APPLICATIONS & TRAPS
# ==============================================================================

# Application 1: Quick Data Typecasting
# Instantly convert user string inputs into usable numbers
string_prices = ["1.99", "4.50", "10.25"]
float_prices = [float(p) for p in string_prices]
print("1. Casted Floats:", float_prices)


# Application 2: Text Cleaning & Normalization
raw_cities = ["  new york ", " New delhi", "LONDON  "]
clean_cities = [city.strip().title() for city in raw_cities]
print("2. Cleaned Cities:", clean_cities) # Output: ['New York', 'New Delhi', 'London']


# ------------------------------------------------------------------------------
# THE INTERVIEW TRAP: Over-complicating (Nested Comprehensions)
# ------------------------------------------------------------------------------
# You can technically flatten matrices (lists of lists) inside a comprehension, 
# but it ruins code readability. 

matrix = [[1, 2], [3, 4]]

# Nested List Comprehension (Hard to read, bad style if it stretches too long!)
flattened = [num for row in matrix for num in row]
print("3. Flattened Matrix:", flattened)  # Output: [1, 2, 3, 4]

# Rule of Thumb for clean code: If a list comprehension requires more than 
# two expressions or feels confusing to read, split it back into a standard loop!