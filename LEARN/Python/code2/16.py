import copy

# =====================================================================
# VISUAL MECHANICS: HOW NESTED UNPACKING/COPYING WORKS IN MEMORY
# =====================================================================
#
#  ORIGINAL LIST:
#  original = [ 1,   2,   [3, 4] ]
#               |    |      |
#               v    v      v
#  SHALLOW COPY (.copy()):
#  shallow  = [ 1,   2,   [3, 4] ]  <-- Points to the EXACT SAME inner list!
#
#  DEEP COPY (copy.deepcopy()):
#  deep     = [ 1,   2,   [5, 6] ]  <-- Creates a completely NEW inner list!
#
# =====================================================================

# 1. SETUP A NESTED LIST
# The outer list has integers, but index 2 is a NESTED list.
original = [1, 2, [3, 4]]

# 2. CREATE THE COPIES
shallow_copied = original.copy()        # Shallow copy (or using original[:])
deep_copied = copy.deepcopy(original)   # Deep copy (requires importing 'copy')

# 3. THE LITMUS TEST: Modify the nested list inside the shallow copy
# We change the 3 to a 99 inside the inner list of 'shallow_copied'
shallow_copied[2][0] = 99

# 4. OBSERVE THE RESULTS
print("Original:      ", original)        # Output: [1, 2, [99, 4]] -> CHANGED!
print("Shallow Copied:", shallow_copied) # Output: [1, 2, [99, 4]] -> CHANGED!
print("Deep Copied:   ", deep_copied)    # Output: [1, 2, [3, 4]]   -> UNTOUCHED!

# WHY DID THIS HAPPEN?
# Because original[2] and shallow_copied[2] share the exact same ID (memory address):
print("\nAre the nested lists the same object?")
print("Original vs Shallow:", original[2] is shallow_copied[2])  # Output: True
print("Original vs Deep:   ", original[2] is deep_copied[2])     # Output: False

# 5. WHAT ABOUT THE OUTER LIST?
# If you modify a top-level element, a shallow copy behaves independently.
shallow_copied[0] = 777

print("\nAfter modifying top-level element:")
print("Original:      ", original)        # Output: [1, 2, [99, 4]] -> Unchanged at index 0
print("Shallow Copied:", shallow_copied) # Output: [777, 2, [99, 4]] -> Changed at index 0


#  copy.copy() vs .copy() - A Quick Comparison

import copy

# 1. THE DIFFERENCE IN A NUTSHELL
# - .copy() is a METHOD built into specific data types (lists, dicts, sets).
# - copy.copy() is a FUNCTION inside the 'copy' module that works on ANY object.

original_list = [1, 2, [3, 4]]

# Method 1: Using the built-in data-type method (No imports needed)
shallow_1 = original_list.copy()

# Method 2: Using the module function (Requires 'import copy')
shallow_2 = copy.copy(original_list)

# Both achieve identical results (shallow copies):
print("Built-in method ID:", id(shallow_1))
print("Module function ID:", id(shallow_2))
print("Do they share the same nested list?", shallow_1[2] is shallow_2[2]) # Output: True


# =====================================================================
# WHY DO BOTH EXIST? (WHEN TO USE WHICH)
# =====================================================================

# Scenario A: You are working with a basic List, Dict, or Set.
# -> Use the built-in `.copy()` method. It's faster and more "Pythonic".
my_dict = {"a": 1}
dict_copy = my_dict.copy() 


# Scenario B: You are copying a custom object/class instance, or generic data.
# -> Built-in `.copy()` does NOT exist for custom classes. You MUST use the module.
class UserProfile:
    def __init__(self, name):
        self.name = name

user = UserProfile("Alice")

# user.copy()  <-- ❌ This throws an AttributeError! Classes don't have a built-in .copy()

# copy.copy(user) <--  This works perfectly!
user_copy = copy.copy(user)
print("\nSuccessfully copied custom class object using module:", user_copy.name)