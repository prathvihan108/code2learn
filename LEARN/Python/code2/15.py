# =====================================================================
# THE OMNIBUS GUIDE TO ASTERISKS (*) AND UNDERSCORES (_) IN UNPACKING
# =====================================================================

# 1. THE ASTERISK (*) - "Grab everything else into a list"
numbers = [1, 2, 3, 4, 5]

# Case A: Catching the tail
first, second, *rest = numbers
print("1A:", first, second, rest)  # Output: 1 2 [3, 4, 5]

# Case B: Catching the front
*beginning, last = numbers
print("1B:", beginning, last)      # Output: [1, 2, 3, 4] 5

# Case C: Catching the middle
first, *middle, last = numbers
print("1C:", first, middle, last)  # Output: 1 [2, 3, 4] 5


# 2. THE UNDERSCORE (_) - "I need to assign this, but I'll never use it"
user_data = ["Alice", 30, "Software Engineer", "New York"]

# We only care about the name (index 0) and role (index 2)
name, _, role, _ = user_data
print("2:", name, "|", role)       # Output: Alice | Software Engineer


# 3. THE COMBINATION (*_) - "Gather the rest of the items, then throw them away"
record = ["ID_1042", "2026-07-04", 98.6, "Logged out", "System Node B"]

# Scenario A: You only want the very first item
record_id, *_ = record
print("3A:", record_id)            # Output: ID_1042

# Scenario B: You only want the first and the last items
db_id, *_, location = record
print("3B:", db_id, "at", location) # Output: ID_1042 at System Node B


# 4. NESTED UNPACKING - Using both tools inside inner structures
player_data = ("Alex", [95, 88, 100, 92])

# Unpack the tuple, and simultaneously unpack the inner list's ends
name, (first_score, *_, last_score) = player_data
print("4:", name, "scored between", first_score, "and", last_score) 
# Output: Alex scored between 95 and 92