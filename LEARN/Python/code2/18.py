# =====================================================================
# 1. DICTIONARY COMPREHENSION
# Syntax: {key_expr: value_expr for item in iterable}
# =====================================================================
numbers = [1, 2, 3, 4]
squares_dict = {x: x**2 for x in numbers}

print("Dict Comprehension:")
print(squares_dict)  # Output: {1: 1, 2: 4, 3: 9, 4: 16}
print(type(squares_dict))  # Output: <class 'dict'>
print("-" * 40)


# =====================================================================
# 2. SET COMPREHENSION
# Syntax: {expr for item in iterable} (Automatically filters duplicates)
# =====================================================================
duplicates = [1, 1, 2, 2, 3, 3]
unique_set = {x * 10 for x in duplicates}

print("Set Comprehension:")
print(unique_set)  # Output: {10, 20, 30}
print(type(unique_set))  # Output: <class 'set'>
print("-" * 40)


# =====================================================================
# 3. TUPLE "COMPREHENSION" (THE CATCH)
# Parentheses () create a GENERATOR EXPRESSION, not a tuple.
# To get a tuple, you must pass that generator into tuple().
# =====================================================================
# This creates a lazy-loading generator object, NOT a tuple:
generator_expr = (x for x in range(3))
print("Parentheses alone:")
print(generator_expr)  # Output: <generator object <genexpr> at ...>
print(type(generator_expr))  # Output: <class 'generator'>

# This is the correct workaround to create a tuple:
my_tuple = tuple(x for x in range(3))
print("\nActual Tuple via constructor:")
print(my_tuple)  # Output: (0, 1, 2)
print(type(my_tuple))  # Output: <class 'tuple'>