# pop() in list vs set vs dict
# =====================================================================
# 1. LIST .pop() -> TARGETS BY INDEX
# =====================================================================
print("--- LIST POP ---")
my_list = ["apple", "banana", "cherry", "date"]

# By default, popping with no arguments removes and returns the LAST item
last_item = my_list.pop()
print(f"Popped last item: {last_item}")      # Output: 'date'
print(f"Remaining list: {my_list}\n")        # Output: ['apple', 'banana', 'cherry']

# You can also pass a specific index to pop from anywhere in the list
first_item = my_list.pop(0)
print(f"Popped index 0: {first_item}")        # Output: 'apple'
print(f"Remaining list: {my_list}\n")        # Output: ['banana', 'cherry']

# Note: my_list.pop(99) would raise an IndexError (out of bounds)


# =====================================================================
# 2. DICTIONARY .pop() -> TARGETS BY KEY
# =====================================================================
print("--- DICTIONARY POP ---")
my_dict = {"name": "Alice", "role": "Admin", "status": "Active"}

# You MUST provide a specific key. It removes the pair and returns the VALUE.
role_value = my_dict.pop("role")
print(f"Popped value for key 'role': {role_value}")  # Output: 'Admin'
print(f"Remaining dict: {my_dict}\n")               # Output: {'name': 'Alice', 'status': 'Active'}

# If the key doesn't exist, you can provide a default fallback to prevent a crash
fallback_value = my_dict.pop("age", "Not Found")
print(f"Popped missing key with fallback: {fallback_value}\n") # Output: 'Not Found'

# Note: my_dict.pop("age") without a default fallback would raise a KeyError


# =====================================================================
# 3. SET .pop() -> TARGETS ARBITRARILY (NO ARGUMENTS ALLOWED)
# =====================================================================
print("--- SET POP ---")
my_set = {"Red", "Green", "Blue", "Yellow"}

# Sets are unordered, so pop() takes NO arguments and removes an arbitrary element
# The item removed depends entirely on internal hash table bucket positions
arbitrary_item = my_set.pop()
print(f"Popped arbitrary item: {arbitrary_item}")
print(f"Remaining set: {my_set}\n")

# Note: my_set.pop(0) would raise a TypeError (arguments are not allowed)
# Note: Calling pop() on an empty set ({}) would raise a KeyError

#  popitem() in dict
# 1. Create a dictionary with three items
inventory = {"apples": 10, "bananas": 5, "cherries": 20}

# 2. Add a new item to the end
inventory["dates"] = 15 
# Current state: {"apples": 10, "bananas": 5, "cherries": 20, "dates": 15}

# 3. Pop the last item using popitem()
last_key, last_value = inventory.popitem()

print(f"Removed Key: {last_key}")      # Output: 'dates'
print(f"Removed Value: {last_value}")  # Output: 15
print(f"Remaining Dict: {inventory}")  # Output: {'apples': 10, 'bananas': 5, 'cherries': 20}