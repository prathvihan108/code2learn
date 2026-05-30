# --- VALID VARIABLES ---
user_name = "Gemini"     # Standard snake_case
_temp_value = 98.6       # Starts with underscore (often used for internal variables)
points2 = 10             # Numbers are fine, just not at the start
TOTAL_PIXELS = 1024      # Constant naming convention

# --- INVALID VARIABLES (Would cause errors) ---
# 2fast = "No"           # Error: Cannot start with a number
# my-var = 5             # Error: Hyphens are not allowed
# user name = "Bob"      # Error: Spaces are not allowed
# class = "Python 101"   # Error: 'class' is a reserved keyword

# --- CASE SENSITIVITY ---
age = 25
Age = 30                 # This is a completely different variable than 'age'

# notes
# The Hard Rules (Legal Requirements)
# If you break these, Python will raise a SyntaxError:

# Characters: Names can only contain alphanumeric characters and underscores (a-z, A-Z, 0-9, and _).

# Start Point: A variable name must start with a letter or an underscore. It cannot start with a number.

# Case Sensitivity: myVar, MyVar, and MYVAR are three different variables.

# Reserved Words: You cannot use Python "Keywords" (like if, else, while, def, class, etc.) as variable names.