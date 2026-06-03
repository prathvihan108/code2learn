# ==============================================================================
# THE ULTIMATE PYTHON LIST OPERATIONS & COMPLEXITIES CHEAT SHEET
# ==============================================================================

import sys

# Let's initialize a base list to use for our operations
my_list = [10, 20, 30, 40, 50]


# ------------------------------------------------------------------------------
# 1. THE FAST TRACKS: O(1) Constant Time Operations
# ------------------------------------------------------------------------------
# These operations take the exact same fraction of a second to execute whether 
# the list has 5 items or 50 million items because no shifting is required.

# Operation: Lookup by Index
val = my_list[2]            # Complexity: O(1)

# Operation: Update by Index
my_list[2] = 99             # Complexity: O(1)

# Operation: Append to the very end
my_list.append(60)          # Complexity: O(1)

# Operation: Pop from the very end
my_list.pop()               # Complexity: O(1)

# Operation: Length check
total_items = len(my_list)  # Complexity: O(1) -> Python tracks this value in an internal counter


# ------------------------------------------------------------------------------
# 2. THE HEAVY LIFTERS: O(N) Linear Time Operations
# ------------------------------------------------------------------------------
# These operations depend entirely on the size of the list ($N$). If the list grows 
# 10x larger, these operations take 10x longer because Python must either scan 
# through the list or shift items in memory.

# Operation: Pop from the front or middle
my_list.pop(0)              # Complexity: O(N) 
# CONFUSION: Why? Python removes index 0, then must physically slide every 
# single remaining item one slot to the left in memory to close the gap.

# Operation: Insert anywhere except the end
my_list.insert(1, 15)       # Complexity: O(N) -> Must shift elements right to make room

# Operation: Value-based deletion
my_list.remove(40)          # Complexity: O(N) -> Scans list to find "40", then shifts elements

# Operation: Membership testing (The 'in' operator)
if 30 in my_list:           # Complexity: O(N)
    pass                    # CONFUSION: 'in' forces a linear search from index 0 to the end!

# Operation: Copying a list
list_copy = my_list[:]      # Complexity: O(N) -> Must read and duplicate every element


# ------------------------------------------------------------------------------
# 3. THE HEAVYWEIGHTS: O(N log N) Log-Linear Operations
# ------------------------------------------------------------------------------
# Operation: Sorting
my_list.sort()              # Complexity: O(N log N)
# Python uses an extremely efficient sorting engine called "Timsort". 
# While optimized, it is still computationally expensive for giant datasets.


# ==============================================================================
# 🧠 THE FIVE CRITICAL LIST TRAPS & CONFUSIONS DETAILED
# ==============================================================================

# CONFUSION TRAP 1: Lookups (Value vs Index)
# ------------------------------------------------------------------------------
# Grabbing an item by its position is instantaneous: O(1).
# But searching for where a value lives requires a full scan: O(N).
idx = my_list.index(50)     # Complexity: O(N) (Not O(1)!)


# CONFUSION TRAP 2: The 'in' operator (List vs Set)
# ------------------------------------------------------------------------------
# Checking if an item exists in a list takes O(N) time. If you do this inside 
# a loop, your program hits $O(N^2)$ time complexity (terrible performance).
# FIX: Convert the list to a `set` first if you need to perform multiple lookups!
my_set = set(my_list)
if 30 in my_set:
    print(0)            # Complexity: O(1) constant time on sets!


# CONFUSION TRAP 3: Appending vs Extending (Adding collections)
# ------------------------------------------------------------------------------
list_a = [1, 2]
list_b = [1, 2]

list_a.append([3, 4])       # Result: [1, 2, [3, 4]] -> Adds the list as a single object.
list_b.extend([3, 4])       # Result: [1, 2, 3, 4]   -> Unpacks and adds elements individually.


# CONFUSION TRAP 4: The Shared Memory reference (Shallow Copy Bug)
# ------------------------------------------------------------------------------
original = [1, 2, 3]
copied_wrong = original     # This does NOT copy the data! It just copies the pointer.

copied_wrong[0] = 99
print("Trap 4 (Original changed!):", original) # Output: [99, 2, 3]

# FIX: Use .copy() or slicing [:] to create a true independent duplicate
copied_right = original.copy()


# CONFUSION TRAP 5: Modifying a List WHILE looping over it
# ------------------------------------------------------------------------------
# Never remove elements from a list while iterating over it using a standard loop. 
# It throws off Python's index counter, causing it to skip elements silently!

numbers = [1, 2, 3, 4, 5]
for num in numbers:
    if num % 2 == 0:
        numbers.remove(num) # ❌ BUG! This skips elements.
        
# FIX: Loop over a copy of the list instead: `for num in numbers.copy():`