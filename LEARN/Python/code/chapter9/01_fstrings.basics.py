# ==============================================================================
# THE EVOLUTION OF PYTHON STRING FORMATTING
# ==============================================================================

name = "Prathvi"
score = 95

# Method 1: The Old % Style (Deprecated / Avoid)
old_way = "Hello %s, your score is %d" % (name, score)

# Method 2: The .format() Style (Python 3.0 / Readable but verbose)
dot_format = "Hello {}, your score is {}".format(name, score)

# Method 3: The Modern F-String (Fastest, cleanest, and standard)
# Notice the 'f' prefix before the first quote!
f_string = f"Hello {name}, your score is {score}"

print("1. Modern F-String:", f_string) # Output: Hello Prathvi, your score is 95

# F-strings don't just print out variables; they can actually execute live Python code inside the curly braces at runtime!

# ==============================================================================
# ADVANCED F-STRING CAPABILITIES
# ==============================================================================

# 1. Inline Arithmetic & Calculations
# ------------------------------------------------------------------------------
price = 19.99
quantity = 3

print(f"Total Bill: ${price * quantity}") 
# Output: Total Bill: $59.97


# 2. Executing Methods & Functions
# ------------------------------------------------------------------------------
user = "  akshat  "

# You can call any string method or independent function instantly
print(f"Welcome, {user.strip().upper()}!") 
# Output: Welcome, AKSHAT!


# 3. Reading Dictionary Values Safely
# ------------------------------------------------------------------------------
# INTERVIEW TRAP: If your f-string uses double quotes outside, you MUST use 
# single quotes for your dictionary keys inside the braces (or vice versa). 
# Mixing them up breaks Python's quote-tracking engine!

profile = {"title": "Admin", "id": 751}

# Correct layout:
print(f"Logged in as: {profile['title']}") # Outer is ", inner is '

# Incorrect layout (Will crash!):
# print(f"Logged in as: {profile["title"]}")


# F-strings have a built-in formatting sub-language. By placing a colon (:) after your variable inside the braces, you unlock incredible layout controls for numbers and dates.

# ==============================================================================
# NUMBER FORMATTING AND SPECIFIERS
# ==============================================================================

# 1. Rounding Floating-Point Decimals
# ------------------------------------------------------------------------------
# Syntax: {variable:.Nf} where N is the number of decimal places you want to lock
pi = 3.1415926535

print(f"Pi rounded to 2 places: {pi:.2f}") # Output: 3.14
print(f"Pi rounded to 4 places: {pi:.4f}") # Output: 3.1416 (Auto-rounds up!)


# 2. Injecting Financial/Large Number Commas
# ------------------------------------------------------------------------------
# Syntax: {variable:,} automatically adds commas for readability
views = 50000000

print(f"Video views: {views:,}") # Output: Video views: 50,000,000


# 3. Converting Numbers to Percentages Instantly
# ------------------------------------------------------------------------------
# Syntax: {variable:.N%} multiplies by 100 and adds the '%' sign
success_rate = 0.8756

print(f"Success: {success_rate:.1%}") # Output: Success: 87.6%