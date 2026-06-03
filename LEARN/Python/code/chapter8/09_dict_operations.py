# ==============================================================================
# THE MASTER OPERATIONS BLUEPRINT FOR PYTHON DICTIONARIES
# ==============================================================================

# Let's initialize a baseline dictionary profile for our operations
user_data = {"name": "Prathvi", "role": "Admin", "id": 751}


# ------------------------------------------------------------------------------
# 1. RETRIEVING DATA & THE CRASH TRAP
# ------------------------------------------------------------------------------
# There are two main ways to extract values from a key. 

# Method A: Direct Bracket Lookup -> O(1) Constant Time
# TRAP: If the key does not exist, your code instantly crashes with a KeyError!
print("1a. Bracket Access:", user_data["name"])  # Output: Prathvi

# Method B: The Safe .get(key, default) Method -> O(1) Constant Time
# If the key is missing, it returns 'None' (or a custom fallback value) instead of crashing!
print("1b. Safe Missing Lookup:", user_data.get("email"))         # Output: None
print("1c. Safe Custom Fallback:", user_data.get("email", "N/A")) # Output: N/A


# ------------------------------------------------------------------------------
# 2. INSERTING, UPDATING, AND MERGING
# ------------------------------------------------------------------------------

# Operation: Adding a new pair or Updating an existing one -> O(1) Constant Time
user_data["location"] = "India"  # Injects a new key-value pair
user_data["role"] = "SuperAdmin" # Overwrites the existing value for 'role'

# Operation: Merging with .update() -> O(M) where M is size of the incoming dict
# This adds new keys and overwrites matching keys simultaneously.
user_data.update({"status": "Active", "login_count": 5})


# ------------------------------------------------------------------------------
# 3. DELETION AND EXTRACTION METHODS
# ------------------------------------------------------------------------------

# Method A: The 'del' Keyword -> O(1) Constant Time
# Permanently erases the key-value pair. Crashes if the key is missing.
del user_data["login_count"]

# Method B: The .pop(key) Method -> O(1) Constant Time
# Removes the key-value pair AND returns the value so you can store it.
# Pro-Tip: Add a default fallback value inside pop() to prevent missing-key crashes!
removed_role = user_data.pop("role", "Unknown")
print(f"\n3. Popped Role: {removed_role}")


# ------------------------------------------------------------------------------
# 4. VIEW OBJECTS & UNPACKING LOOPS
# ------------------------------------------------------------------------------
# These methods return live, memory-efficient "View Objects" (not hard copies).

# Operation: .keys() -> Returns a live view of all dictionary keys
print("4a. Keys View:", user_data.keys())   # Output: dict_keys(['name', 'id', ...])

# Operation: .values() -> Returns a live view of all dictionary values
print("4b. Values View:", user_data.values()) # Output: dict_values(['Prathvi', 751, ...])

# Operation: .items() & Unpacking Loop -> O(N) Linear Time
# Returns key-value tuple pairs. Extremely popular for clean layout looping.
print("\n4c. Iterating through Items:")
for key, value in user_data.items():
    print(f"    Key: {key:<10} | Value: {value}")


# ------------------------------------------------------------------------------
# 5. DICTIONARY COMPREHENSIONS (Single-Line Transformations)
# ------------------------------------------------------------------------------
# A highly optimized way to construct new dictionaries dynamically.
# Syntax: { new_key: new_value for item in iterable }

prices = {"apple": 1.5, "banana": 0.8, "cherry": 2.5}

# Create a new dictionary where prices are doubled, but only for items over $1.00
expensive_doubled = {k: v * 2 for k, v in prices.items() if v > 1.0}
print("\n5. Dictionary Comprehension:", expensive_doubled) 
# Output: {'apple': 3.0, 'cherry': 5.0}


# ------------------------------------------------------------------------------
# 6. MEMBERSHIP TESTING (The 'in' Operator)
# ------------------------------------------------------------------------------
# Checking if a KEY exists inside a dictionary is lightning fast because it 
# checks the underlying hash table map directly without reading the whole dataset.
# Complexity: O(1) Constant Time (Unlike lists which take O(N) time!)

if "name" in user_data:
    print("\n6. Membership Check: 'name' key found instantly!")