# ==============================================================================
# PYTHON STRING BASICS CHEAT SHEET
# ==============================================================================

# 1. CREATING STRINGS
# ------------------------------------------------------------------------------
# You can use single, double, or triple quotes. They all create string objects.
str1 = 'Hello'
str2 = "World"
str3 = """This is a multi-line string
that preserves line breaks."""


# 2. STRING CONCATENATION (Gluing strings together)
# ------------------------------------------------------------------------------
# You use the '+' operator to merge strings. You cannot add a number directly 
# to a string without converting it first!

first_name = "Alan"
last_name = "Turing"

# Adding a space string in between
full_name = first_name + " " + last_name
print("Concat:", full_name)  # Output: Alan Turing


# 3. STRING MULTIPLICATION (Repeating text)
# ------------------------------------------------------------------------------
# You can multiply a string by an integer to repeat it.
echo = "Hello! " * 3
print("Multiplication:", echo)  # Output: Hello! Hello! Hello! 


# 4. STRING INDEXING (Grabbing a single character)
# ------------------------------------------------------------------------------
# Python starts counting at 0. 
# Negative numbers count backward from the very end (-1 is the last character).

word = "Python"

#  P   y   t   h   o   n
#  0   1   2   3   4   5  <- Positive Index
# -6  -5  -4  -3  -2  -1  <- Negative Index

print("First char:", word[0])   # Output: P
print("Last char:", word[-1])   # Output: n


# 5. STRING IMMUTABILITY (The biggest interview fact!)
# ------------------------------------------------------------------------------
# Strings are IMMUTABLE. This means once a string is created in memory, 
# you cannot change, alter, or replace an individual letter inside it.

sample = "Jello"

# sample[0] = "H"  
# ❌ THIS WILL CRASH! TypeError: 'str' object does not support item assignment

# To "change" a string, you must overwrite the variable with a brand new string:
sample = "Hello"   # This is allowed because we are replacing the whole thing.


# 6. USEFUL STRING METHODS (Built-in Powers)
# ------------------------------------------------------------------------------
text = "  python code  "

print(text.upper())      # Output: "  PYTHON CODE  " (Converts to uppercase)
print(text.strip())      # Output: "python code" (Removes spaces from start and end)
print(text.replace("code", "programming")) # Output: "  python programming  "

# Checking if a letter or word is inside a string (Returns True/False)
print("python" in text)  # Output: True
print("java" in text)    # Output: False


# 7. FINDING STRING LENGTH
# ------------------------------------------------------------------------------
# The len() function counts every single character, including spaces and punctuation.
message = "A B C"
print("Length:", len(message))  # Output: 5 (3 letters + 2 spaces)