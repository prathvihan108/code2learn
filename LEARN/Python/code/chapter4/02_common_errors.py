# =====================================================================
# PYTHON EXCEPTIONS 101: THE CRASH COURSE FOR INTERVIEWS
# This single file demonstrates the most common Python errors, 
# why they happen, and how they look when they break.
# =====================================================================

# ---------------------------------------------------------------------
# 1. SYNTAX ERROR & INDENTATION ERROR (The Grammatical Flaws)
# Concept: The code breaks BEFORE running because it violates Python's rules.
# ---------------------------------------------------------------------
# if True
#     print("Missing colon!") # SyntaxError: expected ':'
#
#   print("Bad spacing!")     # IndentationError: unexpected indent


# ---------------------------------------------------------------------
# 2. TYPE ERROR (The Mismatched Data Types)
# Concept: You are trying to combine two data types that do not mix.
# Why it happens: Adding a string directly to an integer without converting.
# ---------------------------------------------------------------------
try:
    total = "Price: " + 19.99 
except TypeError as error:
    print(f"❌ TYPE ERROR: {error}")
    # Output: can only concatenate str (not "float") to str


# ---------------------------------------------------------------------
# 3. VALUE ERROR (The Right Type, But Wrong Content)
# Concept: The data type is technically allowed, but the data inside is invalid.
# Why it happens: Asking int() to convert "apple" into a number.
# ---------------------------------------------------------------------
try:
    user_age = int("twenty") 
except ValueError as error:
    print(f"❌ VALUE ERROR: {error}")
    # Output: invalid literal for int() with base 10: 'twenty'


# ---------------------------------------------------------------------
# 4. INDEX ERROR (The Out-of-Bounds Request)
# Concept: You are asking to look at a seat position that does not exist in a list.
# Why it happens: The list has 3 items (0, 1, 2), but you asked for index 5.
# ---------------------------------------------------------------------
try:
    colors = ["red", "green", "blue"]
    my_color = colors[5] 
except IndexError as error:
    print(f"❌ INDEX ERROR: {error}")
    # Output: list index out of range


# ---------------------------------------------------------------------
# 5. KEY ERROR (The Missing Dictionary Label)
# Concept: Searching a dictionary (map) for a key/label that was never made.
# Why it happens: You asked for 'email', but only 'name' and 'id' exist.
# ---------------------------------------------------------------------
try:
    user_profile = {"name": "Alex", "id": 101}
    user_email = user_profile["email"] 
except KeyError as error:
    print(f"❌ KEY ERROR: Missing key -> {error}")
    # Output: Missing key -> 'email'


# ---------------------------------------------------------------------
# 6. ATTRIBUTE ERROR (The Missing Feature/Skill)
# Concept: Asking an object to perform a trick or function it doesn't possess.
# Why it happens: Strings can be lowercased, but numbers or None types cannot.
# ---------------------------------------------------------------------
try:
    lucky_number = 7
    lucky_number.lower() # Numbers don't have text formatting tools!
except AttributeError as error:
    print(f"❌ ATTRIBUTE ERROR: {error}")
    # Output: 'int' object has no attribute 'lower'


# ---------------------------------------------------------------------
# 7. ZERO DIVISION ERROR (The Math Impossibility)
# Concept: Dividing any number by absolute zero.
# Why it happens: Computer math logic completely breaks down at zero denominators.
# ---------------------------------------------------------------------
try:
    score = 100 / 0 
except ZeroDivisionError as error:
    print(f"❌ ZERO DIVISION ERROR: {error}")
    # Output: division by zero


# ---------------------------------------------------------------------
# 8. NAME ERROR (The Ghost Variable)
# Concept: Calling a variable or function that you never created anywhere.
# Why it happens: Typo in the name, or forgetting to initialize the variable.
# ---------------------------------------------------------------------
# try:
#     print(mystery_variable) 
# except NameError as error:
#     print(f"❌ NAME ERROR: {error}")
    # Output: name 'mystery_variable' is not defined

# type error vs value error

# =====================================================================
# INTERVIEW STUDY GUIDE: TYPE ERROR VS VALUE ERROR
# =====================================================================

# ---------------------------------------------------------------------
# CASE 1: TYPE ERROR (The data type itself is fundamentally banned)
# ---------------------------------------------------------------------
try:
    # int() expects a string, a number, or a bytes-like object.
    # A list ([]) is completely incompatible with integer conversion.
    result = int([1, 2, 3]) 
    
except TypeError as e:
    print(f"❌ TYPE ERROR TRIGGERED: {e}")
    # Reason: The function looks at the data type 'list' and instantly rejects it.


# ---------------------------------------------------------------------
# CASE 2: VALUE ERROR (The data type is allowed, but the contents fail)
# ---------------------------------------------------------------------
try:
    # int() perfectly accepts strings! The data TYPE is correct.
    # However, the string VALUE ("hello") cannot be parsed into a base-10 number.
    result = int("hello")   
    
except ValueError as e:
    print(f"❌ VALUE ERROR TRIGGERED: {e}")
    # Reason: The function accepts strings, but the actual content inside is garbage math.
