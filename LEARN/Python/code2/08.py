from collections import OrderedDict

# =============================================================================
# SUMMARY OF DIFFERENCES IN MODERN PYTHON (3.7+)
# =============================================================================
# While standard dicts now preserve insertion order, OrderedDict is still 
# uniquely used for:
#   1. Order-sensitive equality tests (==)
#   2. Shifting items to the front/back on the fly via .move_to_end()
#   3. Popping items from the beginning efficiently via .popitem(last=False)
# =============================================================================

# --- DIFFERENCE 1: EQUALITY TESTING (==) ---
# Standard dicts ONLY check keys and values; they completely ignore the order.
# OrderedDicts check keys, values, AND the exact order.

standard_1 = {'a': 1, 'b': 2}
standard_2 = {'b': 2, 'a': 1}
print("Standard Dict Equality:", standard_1 == standard_2) 
# Output: True

ordered_1 = OrderedDict([('a', 1), ('b', 2)])
ordered_2 = OrderedDict([('b', 2), ('a', 1)])
print("OrderedDict Equality:", ordered_1 == ordered_2)
# Output: False (because the sequence order doesn't match!)


# --- DIFFERENCE 2: REARRANGING ITEMS ON THE FLY ---
# OrderedDict has a unique .move_to_end() method. Standard dicts cannot do this
# without manually deleting and re-inserting elements.

numbers = OrderedDict([('one', 1), ('two', 2), ('three', 3)])

# Move an item to the very end (last=True is the default)
numbers.move_to_end('one')
print("Moved 'one' to end:", list(numbers.keys()))
# Output: ['two', 'three', 'one']

# Move an item to the very front (last=False)
numbers.move_to_end('three', last=False)
print("Moved 'three' to front:", list(numbers.keys()))
# Output: ['three', 'two', 'one']


# --- DIFFERENCE 3: TWO-WAY POPPING (.popitem()) ---
# Standard dicts can only pop from the end (Last-In, First-Out).
# OrderedDict can pop from the front (First-In, First-Out) if you pass last=False.

fifo_tracker = OrderedDict([('task1', 'low'), ('task2', 'medium'), ('task3', 'high')])

# Efficiently grab and remove the oldest/first item added
oldest_task = fifo_tracker.popitem(last=False)
print("Popped from front:", oldest_task)
# Output: ('task1', 'low')
print("Remaining tasks:", list(fifo_tracker.keys()))
# Output: ['task2', 'task3']


# --- UNDER THE HOOD NOTE ---
# Standard dicts are optimized for memory and speed. OrderedDicts use a 
# doubly-linked list under the hood to manage order, which makes them use 
# more memory but makes operations like .move_to_end() highly efficient.