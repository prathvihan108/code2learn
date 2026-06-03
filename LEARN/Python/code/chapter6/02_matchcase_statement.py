# ==============================================================================
# THE MASTER GUIDE TO PYTHON MATCH-CASE (STRUCTURAL PATTERN MATCHING)
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE BASIC VALUE MATCH (Replacing long if-elif chains)
# ------------------------------------------------------------------------------
# In its simplest form, it evaluates an expression and matches it against values.
# The underscore (_) acts as the 'default' fallback case (like 'else').

def check_status(status_code):
    match status_code:
        case 200:
            return "Success"
        case 404:
            return "Not Found"
        case 500:
            return "Server Error"
        case _: # Wildcard case: matches absolutely anything if no previous case did.
            return "Unknown Status Code"

print("1. Basic Match:", check_status(404))  # Output: Not Found


# ------------------------------------------------------------------------------
# 2. COMBINING MULTIPLE VALUES USING THE PIPE (|) OPERATOR
# ------------------------------------------------------------------------------
# You can use the OR operator (|) to group multiple values that share the same logic.

def get_day_type(day):
    match day.title():
        case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday":
            return "Weekday"
        case "Saturday" | "Sunday":
            return "Weekend"
        case _:
            return "Invalid day"

print("2. Grouped Match:", get_day_type("Sunday"))  # Output: Weekend


# ------------------------------------------------------------------------------
# 3. STRUCTURAL MATCHING & UNPACKING (The Real Power!)
# ------------------------------------------------------------------------------
# You can match against the shape of sequences (lists/tuples) and safely unpack 
# variables inside the case pattern automatically.

def process_command(command_list):
    match command_list:
        case ["quit"]:
            print("System shutting down...")
            
        case ["go", direction]: 
            # Matches any 2-item list starting with "go". 
            # The second item is instantly assigned to the variable 'direction'!
            print(f"Moving the player toward the {direction}.")
            
        case ["teleport", x, y]:
            # Matches a 3-item list and captures both coordinate integers.
            print(f"Teleporting to coordinates X={x}, Y={y}")
            
        case ["say", *words]:
            # Matches a list starting with "say" followed by ANY number of elements.
            # *words collects everything else into a sub-list.
            print(f"Character says: {' '.join(words)}")
            
        case _:
            print("Command not recognized.")

process_command(["go", "North"])        # Output: Moving the player toward the North.
process_command(["say", "Hello", "World", "Code"]) # Output: Character says: Hello World Code


# ------------------------------------------------------------------------------
# 4. MATCHING WITH CONSTRAINTS (Adding 'if' Guards)
# ------------------------------------------------------------------------------
# You can attach an 'if' conditional statement to a case pattern. This case will 
# only run if the pattern matches AND the 'if' condition is True.

def evaluate_coordinate(point):
    match point:
        case (x, y) if x == y:
            print(f"The point lies perfectly on the diagonal at {x}.")
        case (x, y):
            print(f"Just a regular point at X={x}, Y={y}")

evaluate_coordinate((5, 5))  # Output: The point lies perfectly on the diagonal at 5.


# ------------------------------------------------------------------------------
# 5. DICTIONARY MATCHING TRAPS
# ------------------------------------------------------------------------------
# When matching dictionaries, Python checks if the keys exist. 
# EXTRA KEYS IN THE DICTIONARY ARE IGNORED! (Unlike lists, which must match length exactly).

user_profile = {"name": "Alice", "role": "Admin", "ip": "192.168.1.1"}

match user_profile:
    # This pattern matches because 'name' and 'role' exist. 
    # Python doesn't mind that 'ip' is also in the dictionary!
    case {"name": name, "role": "Admin"}:
        print(f"Access granted to Administrator: {name}")
    case _:
        print("Standard access denied.")