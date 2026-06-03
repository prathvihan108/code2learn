# ==============================================================================
# THE FUNCTIONAL TRIO: MAP, FILTER, AND REDUCE SYNTAX WORKFLOW
# ==============================================================================

from functools import reduce  # 'reduce' must be explicitly imported in Python 3

# Baseline data collection to feed into our functional processing pipelines
numbers = [1, 2, 3, 4, 5]


# ------------------------------------------------------------------------------
# 1. MAP(): THE TRANSFORMER
# ------------------------------------------------------------------------------
# Purpose: Applies a function to EVERY item in the iterable and outputs the results.
# Syntax Blueprint: map(function, iterable) -> Returns a lazy map object (cast to list)
# Time Complexity: O(N) linear time

doubled_stream = map(lambda x: x * 2, numbers)

print("1. MAP Output:   ", list(doubled_stream))  # Output: [2, 4, 6, 8, 10]


# ------------------------------------------------------------------------------
# 2. FILTER(): THE GATEKEEPER
# ------------------------------------------------------------------------------
# Purpose: Tests each item against a Boolean condition, keeping ONLY items that return True.
# Syntax Blueprint: filter(function_returning_bool, iterable) -> Returns a lazy filter object
# Time Complexity: O(N) linear time

evens_stream = filter(lambda x: x % 2 == 0, numbers)

print("2. FILTER Output:", list(evens_stream))   # Output: [2, 4]


# ------------------------------------------------------------------------------
# 3. REDUCE(): THE ACCUMULATOR
# ------------------------------------------------------------------------------
# Purpose: Continually applies a 2-argument function rolling left-to-right across the 
#          iterable to compress the entire collection down into ONE single final value.
# Syntax Blueprint: reduce(function_with_2_args, iterable, optional_initial_value)
# Time Complexity: O(N) linear time

# How this lambda works step-by-step under the hood:
# 1st step: acc = 1, curr = 2 -> returns 1 + 2 = 3
# 2nd step: acc = 3, curr = 3 -> returns 3 + 3 = 6
# 3rd step: acc = 6, curr = 4 -> returns 6 + 4 = 10... and so on.
sum_total = reduce(lambda acc, curr: acc + curr, numbers)

print("3. REDUCE Output:", sum_total)            # Output: 15 (1 + 2 + 3 + 4 + 5)