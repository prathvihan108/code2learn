# ==============================================================================
# MAP, FILTER, REDUCE WITH DIFFERENT DATA STRUCTURES
# ==============================================================================

from functools import reduce

# ------------------------------------------------------------------------------
# 1. WORKING WITH TUPLES (Straightforward)
# ------------------------------------------------------------------------------
# Tuples behave exactly like lists. The only catch is that map() and filter() 
# return lazy generator-like objects, so you must explicitly cast them back 
# to a tuple using the tuple() constructor.

immutable_scores = (12, 55, 78, 90, 32)

# Filter out scores below 50 from the tuple
passed_tuple = tuple(filter(lambda x: x >= 50, immutable_scores))
print("1. Filtered Tuple:", passed_tuple) # Output: (55, 78, 90)


# ------------------------------------------------------------------------------
# 2. WORKING WITH DICTIONARIES (The Key-Value Twist)
# ------------------------------------------------------------------------------
# TRAP: If you pass a dictionary directly into map or filter, Python will *only* # feed the KEYS into your lambda function, completely ignoring the values!
#
# FIX: To look at both keys and values, you must pass 'dict.items()', which feeds 
# each pair into the lambda as a temporary (key, value) tuple.

user_balances = {"Prathvi": 500, "Akshat": 150, "Harshith": 1200}

# --- Case A: Using filter() on a Dictionary ---
# Goal: Keep only users who have a balance greater than 200.
# 'item' represents a tuple like ("Prathvi", 500). Therefore, item[1] is the balance.
filtered_items = filter(lambda item: item[1] > 200, user_balances.items())

# Reconstruct the output back into a clean dictionary structure
rich_users = dict(filtered_items)
print("\n2a. Filtered Dict (Balances > 200):", rich_users)
# Output: {'Prathvi': 500, 'Harshith': 1200}


# --- Case B: Using map() on a Dictionary ---
# Goal: Give every single user a $50 bonus reward.
# The lambda takes the item tuple and returns a fresh tuple: (key, updated_value)
bonus_items = map(lambda item: (item[0], item[1] + 50), user_balances.items())

updated_balances = dict(bonus_items)
print("2b. Mapped Dict (With $50 Bonus):  ", updated_balances)
# Output: {'Prathvi': 550, 'Akshat': 200, 'Harshith': 1250}


# ------------------------------------------------------------------------------
# 3. USING REDUCE WITH DICTIONARIES
# ------------------------------------------------------------------------------
# reduce() works by continuously accumulating elements down to a single value.
# When reducing a dictionary's items, it is safest to provide an explicit 
# third argument: the 'initial value' of the accumulator tracker.

# Goal: Sum up the total money across all accounts in the entire dictionary.
# - Accumulator (acc) starts at 0.
# - Item represents each (key, value) tuple as it streams through the dict.
total_money = reduce(lambda acc, item: acc + item[1], user_balances.items(), 0)

print("\n3. Reduced Dict Value (Total Money Sum):", total_money) # Output: 1850