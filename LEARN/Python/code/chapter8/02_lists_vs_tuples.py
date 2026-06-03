# ==============================================================================
# UNDER THE HOOD: LIST MUTABILITY VS TUPLE IMMUTABILITY
# ==============================================================================

# 1. UNDERSTANDING MEMORY BLOCKS
# ------------------------------------------------------------------------------
# - A List is a Dynamic Array. It acts as an open box that can expand.
# - A Tuple is a Fixed Array. It is locked and sealed the millisecond it is born.

# Let's look at how Python allocates bytes in your computer RAM:
import sys

empty_list = []
empty_tuple = ()

print("1a. Bytes for empty list:", sys.getsizeof(empty_list))   # Output: 56 bytes
print("1b. Bytes for empty tuple:", sys.getsizeof(empty_tuple)) # Output: 40 bytes


# ------------------------------------------------------------------------------
# 2. THE OVER-ALLOCATION PRINCIPLE (Why Lists are heavy)
# ------------------------------------------------------------------------------
# When you create a list, Python anticipates that you will append items later.
# To avoid requesting memory from the Operating System on every single .append(), 
# Python "over-allocates" extra empty slots in advance.

my_list = [1, 2]
print("\n2a. Size of [1, 2]:", sys.getsizeof(my_list)) # e.g., 72 bytes

my_list.append(3)
print("2b. Size after adding 3:", sys.getsizeof(my_list)) # Stays 72 bytes!
# Why? Because slot #3 was already pre-reserved in memory.


# ------------------------------------------------------------------------------
# 3. TUPLES ARE STREAMLINED (Fixed Structs)
# ------------------------------------------------------------------------------
# Because tuples cannot change, Python allocates the exact minimum bytes required 
# to hold the data. No backup slots, no overhead for resizing logic.

my_tuple = (1, 2, 3)
# It has no .append(), .extend(), .pop(), or .remove() methods!


# ------------------------------------------------------------------------------
# 4. THE DEEP INTERVIEW TRAP: The "Mutable Tuple" Illusion
# ------------------------------------------------------------------------------
# Interview Question: "Can a tuple ever change its internal values?"
# Answer: The tuple itself cannot change, but if it contains a mutable object 
# (like a list), that nested object CAN be modified!

crazy_tuple = (10, [20, 30])

# crazy_tuple[0] = 99  # ❌ CRASHES! TypeError: 'tuple' object does not support item assignment

# However, accessing the list inside the tuple and mutating it works:
crazy_tuple[1].append(40) 

print("\n4. The Trap Output:", crazy_tuple) # Output: (10, [20, 30, 40])
# Explanation: The tuple's structure didn't change. It still points to the exact 
# same memory address of that list. Only the interior of the list expanded.