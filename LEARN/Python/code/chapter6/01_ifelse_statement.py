
# ==============================================================================
# THE ULTIMATE PYTHON IF-ELIF-ELSE MASTER GUIDE
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. CORE SYNTAX, INDENTATION, AND THE REASON FOR THE COLON
# ------------------------------------------------------------------------------
# The colon (:) tells Python that a code block is beginning. 
# The mandatory 4-space indentation defines what code belongs inside that block.

temperature = 25

if temperature > 30:
    print("It is a hot day.")       # Runs only if condition is True
    print("Stay hydrated!")         # Also part of the 'if' block
else:
    print("The weather is nice.")   # Runs only if condition is False
    print("Enjoy your day!")        # Also part of the 'else' block

print("This prints regardless.")    # Unindented code runs completely outside the block


# ------------------------------------------------------------------------------
# 2. THE MULTI-PATH CHAIN (IF-ELIF-ELSE) WITH EXCLUSIVITY TRAPS
# ------------------------------------------------------------------------------
# Python evaluates this chain from top to bottom. The MOMENT it finds a True 
# condition, it executes that block and exits the ENTIRE chain.

age = 22

if age < 13:
    ticket_price = 5
elif age < 20:
    ticket_price = 10
elif age < 65:
    ticket_price = 15  # 22 matches here! Python sets price and skips the rest.
else:
    ticket_price = 12

print(f"Ticket Price: ${ticket_price}") # Output: $15

# INTERVIEW TRAP: Independent 'if' statements vs 'elif'
# If you used independent 'if' statements instead of 'elif' here, an age of 10 
# would match 'age < 13' AND 'age < 20', causing multiple blocks to fire!


# ------------------------------------------------------------------------------
# 3. LOGICAL OPERATORS & SHORT-CIRCUIT EVALUATION
# ------------------------------------------------------------------------------
# You can combine multiple boolean conditions using 'and', 'or', and 'not'.

has_passport = True
has_visa = False
is_diplomat = True

# 'and' requires BOTH sides to be True
if has_passport and has_visa:
    print("Border clearance granted via standard documents.")
else:
    print("Standard clearance denied.") # Fires because has_visa is False

# 'or' requires AT LEAST ONE side to be True
# SHORT-CIRCUIT TRICK: If 'is_diplomat' is True, Python stops evaluating immediately 
# and runs the block. It won't even look at 'has_passport' because the outcome is guaranteed!
if is_diplomat or has_passport:
    print("Special entry granted.") # Fires because is_diplomat is True

# 'not' completely inverts a Boolean value
is_locked = False
if not is_locked:
    print("The system is accessible.")


# ------------------------------------------------------------------------------
# 4. NESTED CONDITIONS (Conditions Inside Conditions)
# ------------------------------------------------------------------------------
# Used when a secondary condition is completely dependent on a primary condition.

is_member = True
points = 120

if is_member:
    # This inner block is evaluated ONLY if is_member is True
    if points >= 100:
        discount = 20
    else:
        discount = 10
else:
    discount = 0

print(f"Your discount is: {discount}%")


# ------------------------------------------------------------------------------
# 5. TRUTHY VS FALSY (Inherent Object Truth Evaluation)
# ------------------------------------------------------------------------------
# In Python, you don't always need an explicit comparison operator (like ==). 
# Every data type has an inherent true or false state.
# FALSY items: False, None, 0, 0.0, empty collections ("", [], {}, set())
# TRUTHY items: Anything that isn't empty or zero.

username_input = "" # Empty string is Falsy

if username_input:
    print(f"Welcome, {username_input}!")
else:
    print("Error: Username field cannot be empty.") # Fires because empty string is Falsy

cart_items = ["apple", "banana"] # Populated list is Truthy

if cart_items:
    print(f"Proceeding to checkout with {len(cart_items)} items.") # Fires!


# ------------------------------------------------------------------------------
# 6. THE CONDITIONAL EXPRESSION (Python's Ternary Operator Shortcut)
# ------------------------------------------------------------------------------
# Syntax pattern: result = <value_if_true> if <condition> else <value_if_false>
# Ideal for clean, single-line variable assignments based on a basic check.

number = 7
parity = "Even" if number % 2 == 0 else "Odd"

print(f"The number {number} is {parity}.") # Output: The number 7 is Odd.
