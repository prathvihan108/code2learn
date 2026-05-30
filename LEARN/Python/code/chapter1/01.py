# ==============================================================================
# THE ULTIMATE PYTHON PRINT() CHEAT SHEET
# ==============================================================================

# 1. PRINTING LITERALS (Direct Data)
# ------------------------------------------------------------------------------
print(5)          # Numbers (integers) can be printed directly
print(3.14)       # Decimals (floats) also work directly
print("Hello")    # Text (strings) MUST be enclosed in single or double quotes
print(True)       # Booleans (True/False) work directly (Note the capital T)


# 2. PRINTING VARIABLES
# ------------------------------------------------------------------------------
# You must define a variable before you can print it, otherwise you get a NameError.
x = 42
name = "Alice"

print(x)          # Prints the value stored in x (Output: 42)
print(name)       # Prints the value stored in name (Output: Alice)


# 3. PRINTING MULTIPLE ITEMS AT ONCE
# ------------------------------------------------------------------------------
# You can separate items with commas. Python automatically adds a space between them.
age = 25
print("User", name, "is", age, "years old.")  
# Output: User Alice is 25 years old.


# 4. STRING FORMATTING (Combining Text and Variables)
# ------------------------------------------------------------------------------
# Method A: F-Strings (Modern & Best Practice)
# Put an 'f' before the quotes and use curly braces {} for variables.
print(f"Next year, {name} will be {age + 1} years old.")

# Method B: The .format() method (Older but common)
print("Name: {}, Age: {}".format(name, age))


# 5. CHANGING THE SEPARATOR (sep)
# ------------------------------------------------------------------------------
# By default, commas add a space. You can change this using 'sep='.
print("apple", "banana", "cherry")              # Default: apple banana cherry
print("apple", "banana", "cherry", sep=", ")    # Output: apple, banana, cherry
print("1", "2", "3", sep="-")                   # Output: 1-2-3


# 6. CHANGING THE END OF THE LINE (end)
# ------------------------------------------------------------------------------
# By default, print() moves to a new line after running. 'end=' changes this.
print("Hello", end=" ")
print("World")
# Output is on the same line: Hello World

print("Progress: 50%", end="...")
print("Done!")
# Output: Progress: 50%...Done!


# 7. PRINTING SPECIAL CHARACTERS (Escape Characters)
# ------------------------------------------------------------------------------
print("Line 1\nLine 2")    # \n creates a newline
print("Column1\tColumn2")  # \t creates a tab space
print("He said, \"Wow!\"") # \" allows you to use double quotes inside double quotes


# 8. PRINTING COMPLEX OBJECTS (Collections)
# ------------------------------------------------------------------------------
# Python can print entire lists, dictionaries, and tuples directly.
my_list = [1, 2, 3]
my_dict = {"a": 1, "b": 2}

print(my_list)    # Output: [1, 2, 3]
print(my_dict)    # Output: {'a': 1, 'b': 2}


# 9. PRINTING MATHEMATICAL EXPRESSIONS
# ------------------------------------------------------------------------------
# Python evaluates the math first, then prints the result.
print(5 + 5)      # Output: 10
print("Ha" * 3)   # Output: HaHaHa (String multiplication!)