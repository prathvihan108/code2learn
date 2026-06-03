# ==============================================================================
# UNDERSTANDING LAZY ITERATORS AND VIEW OBJECTS IN PYTHON
# ==============================================================================

# ------------------------------------------------------------------------------
# PART 1: LAZY ITERATORS (On-Demand Data Processing)
# ------------------------------------------------------------------------------
# A "Lazy Iterator" is an object that does NOT calculate or store its values 
# in memory all at once. Instead, it computes each value ONE AT A TIME, 
# only when you explicitly ask it for the next item.
# Examples: map(), filter(), zip(), open('file.txt'), and generators.

numbers = [1, 2, 3]

# This creates a lazy map object. 
# It hasn't multiplied anything yet! It is just sitting there holding the plan.
lazy_multiplier = map(lambda x: x * 10, numbers)

print("--- 1. Lazy Iterator Behavior ---")
print(lazy_multiplier)  # Output: <map object at 0x...> (No list data visible!)

# To get the data, you must "consume" it (e.g., via a loop or casting to list).
# As it yields values, it moves a cursor forward. Once consumed, it is spent!
print("First pass conversion:", list(lazy_multiplier))  # Output: [10, 20, 30]
print("Second pass conversion:", list(lazy_multiplier)) # Output: [] (It's completely empty now!)


# ------------------------------------------------------------------------------
# PART 2: VIEW OBJECTS (Dynamic Windows into Live Memory)
# ------------------------------------------------------------------------------
# When you call .keys(), .values(), or .items() on a dictionary, Python does 
# NOT create a copy or a standalone list of that data. 
# Instead, it returns a "View Object" (`dict_keys`, `dict_values`, `dict_items`).
#
# CRITICAL INTERVIEW FACT: A view object is a dynamic, live window. If the 
# underlying dictionary changes, the view object instantly updates automatically!

user_profile = {"name": "Prathvi", "role": "Developer"}

# Create the view objects
my_keys = user_profile.keys()
my_items = user_profile.items()

print("\n--- 2. View Object Live Behavior ---")
print("Initial Keys View:", my_keys)   # Output: dict_keys(['name', 'role'])
print("Initial Items View:", my_items) # Output: dict_items([('name', 'Prathvi'), ...])

# Now, let's mutate the original dictionary by adding a brand new key-value pair:
user_profile["location"] = "India"

# Watch closely: We never told 'my_keys' or 'my_items' to update!
# Because they are live views looking directly at 'user_profile', they reflect the change.
print("\nAfter dictionary mutation:")
print("Updated Keys View:", my_keys)   # Output: dict_keys(['name', 'role', 'location'])
print("Updated Items View:", my_items) # Output: dict_items([... ('location', 'India')])


# ------------------------------------------------------------------------------
# PART 3: KEY INTERVIEW DIFFERENCES & COMPARING BOTH
# ------------------------------------------------------------------------------
# Interviewers love to ask: "What are the main differences between them?"

# Difference A: Reusability
# - Lazy Iterators are consumed and expire after one full loop read.
# - View Objects NEVER expire. You can loop over a dict_view 100 times, and it 
#   will simply read the current live dictionary state every single time.

# Difference B: Set-Like Operations
# - `dict_keys` and `dict_items` objects support fast set operations like 
#   unions (|) and intersections (&). Lazy iterators absolutely cannot do this.

admin_keys = {"role", "access_level", "token"}
# We can find common keys between our view object and a standard set instantly:
common_fields = my_keys & admin_keys 
print("\nSet intersection with view object:", common_fields) # Output: {'role'}


# ------------------------------------------------------------------------------
# HOW TO FREEZE A VIEW OR AN ITERATOR
# ------------------------------------------------------------------------------
# If you want a safe, independent, static snapshot of the keys or calculations 
# that won't change when the dictionary updates, cast it to a list or set immediately:

frozen_snapshot_list = list(user_profile.keys())