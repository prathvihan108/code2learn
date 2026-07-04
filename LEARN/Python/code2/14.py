# any() and all() are builtin functions in Python that are used to evaluate iterables (like lists, tuples, sets, etc.) for truthiness.

# 1. Using a Tuple
tuple_data = (0, 0, 5)
print(any(tuple_data))  # Output: True (because 5 is truthy/non-zero)

# 2. Using a Set
set_data = {True, True}
print(all(set_data))    # Output: True

# 3. Using a Dictionary (Evaluates the KEYS, not values)
dict_data = {0: "hello", 1: "world"} 
print(any(dict_data))   # Output: True (evaluates the keys: 0 and 1. 1 is truthy)

# 4. Using a Generator Expression (Very common for performance)
nums = [2, 4, 6, 8]
# Checks if ALL numbers in the list are even
print(all(x % 2 == 0 for x in nums))  # Output: True