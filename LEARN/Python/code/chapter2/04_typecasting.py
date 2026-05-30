
# In Python, Type refers to the category of data a variable holds, while Type Casting is the process of converting a value from one type to another. Since Python is "dynamically typed," you don't have to declare the type, but you definitely need to manage it.

# 1. Common Data Types
# Here are the "Big Four" you'll use 90% of the time:

# int (Integer): Whole numbers (e.g., 5, -10, 1000).

# float (Floating point): Numbers with decimals (e.g., 3.14, 2.0).

# str (String): Text wrapped in quotes (e.g., "Hello", '123').

# bool (Boolean): Logical values (True or False).




# 2. Type Casting (Conversion)
# There are two ways Python handles this:

# A. Implicit Type Casting
# Python automatically converts one data type to another to prevent data loss.

# Example: If you add an int (5) and a float (2.5), Python automatically makes the result a float (7.5).

# B. Explicit Type Casting
# This is when you manually convert a type using built-in functions:

# int() - Converts to an integer (truncates decimals).

# float() - Converts to a decimal number.

# str() - Converts any value into a string.

# bool() - Converts to True/False (zero/empty is False, everything else is True). 



# 3. Common Mistakes & "Gotchas"
# Error: Concatenating Strings and Integers
# Python won't let you "add" a number to a sentence directly.

# Wrong: print("Age: " + 25) → TypeError

# Right: print("Age: " + str(25))

# The "Input" Trap
# The input() function always returns a string, even if the user types a number.

# The "Input" Trap
# The input() function always returns a string, even if the user types a number.
# The Fix: Wrap the input in int(): age = int(input("Enter age: "))

# --- Type Checking ---
x = 10.5
print(type(x))  # <class 'float'>

# --- Explicit Casting ---
price = "19.99"
# Convert string to float to do math
discounted_price = float(price) - 5.00 

# --- Boolean Oddity ---
print(bool(0))      # False
print(bool(1))      # True
print(bool(-1))     # True (non-zero integers are True)
print(bool(""))     # False (empty string)
print(bool("No"))   # True (non-empty string)
print(bool())      # False(empty string)

