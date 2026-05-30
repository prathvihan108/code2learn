# ==============================================================================
# INTERMEDIATE & ADVANCED PYTHON STRING MASTERY
# ==============================================================================

# 1. STRING INTERPOLATION / FORMATTING (The Modern Way)
# ------------------------------------------------------------------------------
# f-strings (formatted string literals) allow you to embed variables, expressions,
# and even call functions right inside your strings using curly braces {}.

item = "laptop"
price = 899.99
quantity = 2

# You can do arithmetic directly inside an f-string!
invoice = f"Total for {quantity} {item}s: ${price * quantity}"
print("1. F-String:", invoice)  # Output: Total for 2 laptops: $1799.98

# You can also format decimals (e.g., locking a float to 2 decimal places):
pi = 3.14159265
print(f"Pi rounded: {pi:.2f}")  # Output: 3.14


# 2. MEMBERSHIP OPERATOR WITH SUBSTRINGS
# ------------------------------------------------------------------------------
# The 'in' and 'not in' operators check if a specific pattern exists inside 
# a larger string. This is case-sensitive!

email = "student123@college.edu"

print("2a. Is college?", "college" in email)      # Output: True
print("2b. Is Gmail?", "gmail" not in email)       # Output: True
print("2c. Case Check:", "College" in email)      # Output: False (lowercase 'c' in email)


# 3. ADVANCED SPLITTING AND JOINING (Data Cleaning)
# ------------------------------------------------------------------------------
# .split() and .join() are the ultimate tag-team for text manipulation.

# Scenario: Cleaning up messy user input with extra spaces
raw_input = "  apple   banana    cherry  "

# Calling .split() without arguments automatically handles ANY amount of whitespace
words = raw_input.split() 
print("3a. Clean Split:", words)  # Output: ['apple', 'banana', 'cherry']

# .join() puts a list of strings back together using a specific separator string
clean_csv = ", ".join(words)
print("3b. Clean CSV:", clean_csv)  # Output: apple, banana, cherry


# 4. TRICKY BOOLEAN CHECK METHODS
# ------------------------------------------------------------------------------
# Python has built-in methods to analyze what kind of characters make up a string.
# These are incredibly common in password validation interview questions.

pass1 = "Python3"
pass2 = "12345"
pass3 = "   "

print("4a. Is Alphanumeric?", pass1.isalnum()) # True (Contains letters AND numbers, no symbols)
print("4b. Is purely Digits?", pass2.isdigit()) # True (Contains only numbers)
print("4c. Is completely empty/whitespace?", pass3.isspace()) # True


# 5. STRING MEMORY IDENTITY (The 'is' vs '==' Gotcha)
# ------------------------------------------------------------------------------
# Just like small integers, Python optimizes memory by reusing memory addresses 
# for short, simple strings without spaces. This is called "String Interning".

str_a = "hello"
str_b = "hello"
print("5a. Value Equal?", str_a == str_b)  # True (They look the same)
print("5b. Memory Equal?", str_a is str_b)  # True (Python pointed them to the exact same object)

# However, compile-time strings with spaces or dynamically generated strings 
# bypass this optimization!
str_x = "hello world"
str_y = "".join(["hello", " ", "world"])

print("5c. Value Equal?", str_x == str_y)  # True (The text is identical)
print("5d. Memory Equal?", str_x is str_y)  # False! (They are two different objects in RAM)

# ==============================================================================
# IMPLICIT STRING CONCATENATION (THE NO-COMMA TRICK)
# ==============================================================================

# 1. How Python sees your code:
# Because there are NO commas, Python merges these three lines into one long string.
print(
    "This looks like "
    "it might print on "
    "multiple lines..."
)
# Output: This looks like it might print on multiple lines...


# 2. Why do programmers do this?
# It is an excellent clean-code trick for breaking up extremely long sentences 
# so they don't stretch way off the right side of your computer screen.
long_message = (
    "Click the link below to verify your email address and activate your "
    "account. If you did not request this email, please ignore it."
)
print(long_message)


# ------------------------------------------------------------------------------
# THE INTERVIEW TRAP: What happens if you DO add a comma?
# ------------------------------------------------------------------------------
# If you add commas, you are no longer making one string. Instead, you are passing 
# MULTIPLE separate arguments to the print() function. 
# As we saw earlier, print() automatically separates comma items with a space!

print(
    "This looks like",
    "it might print on",
    "multiple lines..."
)
# Output: This looks like it might print on multiple lines...
# (Notice the double spaces in the output! "like  it" and "on  multiple")
# Why? Because Python prints "This looks like ", then adds its own default space, 
# then prints "it might print on ", and so on.