# ==============================================================================
# PYTHON SLICING DEFAULTS CHEAT SHEET
# Syntax: list[start:stop:step]
# ==============================================================================

fruits = ["apple", "banana", "cherry", "date"]


# 1. THE FORWARD DEFAULTS (When step is positive or not written)
# ------------------------------------------------------------------------------
# Default Start = 0
# Default Stop  = len(fruits) (the very end)
# Default Step  = 1

# Your original code:
slice1 = fruits[-2:]

# What Python secretly executes behind the scenes:
slice1_explicit = fruits[-2:4:1]  # 4 is the length of the list

print(slice1)           # Output: ['cherry', 'date']
print(slice1_explicit)  # Output: ['cherry', 'date'] (Exactly the same!)


# 2. MISSING THE 'START' PARAMETER
# ------------------------------------------------------------------------------
# If you leave start blank, it automatically defaults to 0.
slice_from_start = fruits[:3]
slice_from_start_explicit = fruits[0:3:1]

print(slice_from_start)  # Output: ['apple', 'banana', 'cherry']


# 3. MISSING THE 'START' AND 'STOP' WITH A CUSTOM STEP
# ------------------------------------------------------------------------------
# This grabs every 2nd item from the very beginning to the very end.
every_other = fruits[::2]
every_other_explicit = fruits[0:4:2]

print(every_other)  # Output: ['apple', 'cherry']


# ==============================================================================
# 4. THE BACKWARD DEFAULTS (When step is negative)
# ==============================================================================
# Default Start = -1 (The last item)
# Default Stop  = The position before the first item (to include index 0)
# Default Step  = -1

# The famous list reversal trick:
reversed_fruits = fruits[::-1]

print(reversed_fruits)  # Output: ['date', 'cherry', 'banana', 'apple']