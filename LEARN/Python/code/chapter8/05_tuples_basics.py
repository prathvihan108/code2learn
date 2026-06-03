# ==============================================================================
# TUPLE CREATION AND THE SINGLE-ITEM TRAP
# ==============================================================================

# Standard multi-item tuple
milky_way = ("Earth", "Mars", "Jupiter")

# --- THE EXAM TRAP: The Single-Element Tuple ---
# If you want a tuple with only one item, you MUST include a trailing comma. 
# Without the comma, Python thinks you are just using math parentheses!

trap_tuple = ("Python")   # ❌ WRONG: This creates a standard String variable!
true_tuple = ("Python",)  #  CORRECT: The trailing comma signals it is a tuple.

print("Trap Type:", type(trap_tuple)) # Output: <class 'str'>
print("True Type:", type(true_tuple)) # Output: <class 'tuple'>

# ---------------------------------------------------------------------------------

# ==============================================================================
# TUPLE OPERATIONS & COMPLEXITIES
# ==============================================================================

my_tuple = (10, 20, 30, 20, 40)

# 1. Operation: .count(value)
# Scans the entire tuple to count occurrences of a specific item.
# Complexity: O(N) linear time
print("Count of 20s:", my_tuple.count(20)) # Output: 2


# 2. Operation: .index(value)
# Scans the tuple from index 0 to find the first position where the value lives.
# Complexity: O(N) linear time (Throws ValueError if not found)
print("First Index of 20:", my_tuple.index(20)) # Output: 1


# 3. Operation: Index Lookup & Slicing
# Just like lists, accessing data by position is instantaneous.
# Complexity: O(1) constant time
print("Index 2 Lookup:", my_tuple[2]) # Output: 30
sub_tuple = my_tuple[1:4]             # Complexity: O(K) where K is slice length


# 4. Operation: Tuple Concatenation (+) and Multiplication (*)
# Since tuples are immutable, merging them doesn't alter either tuple. 
# Instead, it creates a brand-new tuple in memory.
# Complexity: O(N + M) linear time
tuple_a = (1, 2)
tuple_b = (3, 4)
combined = tuple_a + tuple_b # Result: (1, 2, 3, 4)

#--

mixed_tuple = ("Data", [1, 2, 3])
# mixed_tuple[0] = "New Data" # ❌ CRASHES! Tuple is immutable.

mixed_tuple[1].append(4) #  VALID! The list expands inside the tuple.
print("Nested list mutation:", mixed_tuple) # Output: ('Data', [1, 2, 3, 4])

# ==============================================================================
# ADVANCED TUPLE UNPACKING
# ==============================================================================

# Basic Unpacking
user_data = ("Prathvi", 22, "Admin")
name, age, role = user_data # Automatically maps variables to positions

print(f"{name} is an {role}.") # Output: Prathvi is an Admin.


# The * (Asterisk) Extended Unpacking
# Used when you want to unpack a few elements and group the rest into a list.
scores = (100, 95, 88, 72, 60)
gold, silver, *bronze_and_others = scores

print("Gold medal score:", gold)             # Output: 100
print("Remaining grouped scores:", bronze_and_others) # Output: [88, 72, 60]



# In Python, dictionary keys must be hashable (meaning they must have a permanent value that never changes during execution). Because lists are mutable, they are unhashable. Because tuples are immutable, they are fully hashable!

# Valid use case: Tracking pixel coordinates on a map dashboard
pixel_map = {}
pixel_map[(10, 20)] = "Player 1" #  VALID! Tuple used as a key.

# pixel_map[[10, 20]] = "Player 1" # ❌ CRASHES! TypeError: unhashable type: 'list'

# ==============================================================================
# OPTIONAL PARENTHESES & TUPLE PACKING
# ==============================================================================

# 1. Parentheses-free Tuple Creation
# Both of these lines create the exact same data type in your computer's RAM.
with_braces = ("Apple", "Banana", "Cherry")
no_braces   = "Apple", "Banana", "Cherry"  # Completely valid!

print("1a. Type of no_braces:", type(no_braces)) # Output: <class 'tuple'>


# 2. Implicit Return Values in Functions
# When you write a function that looks like it returns multiple values, 
# Python silently packs them into a single parenthesless tuple behind the scenes!

def get_coordinates():
    return 10.5, 20.9  # No parentheses here

result = get_coordinates()
print("\n2. Function Return Type:", type(result)) # Output: <class 'tuple'>
print("Result data:", result)                     # Output: (10.5, 20.9)


# ------------------------------------------------------------------------------
# ⚠️ WHEN ARE PARENTHESES MANDATORY? (The 3 Critical Exceptions)
# ------------------------------------------------------------------------------
# Even though they are optional for basic assignments, you MUST use parentheses 
# in the following three syntax situations to prevent syntax errors:

# Exception A: Empty Tuples
# If you don't use parentheses, Python has no way of knowing you want an empty tuple.
empty_tup = () 


# Exception B: Nested Tuples (Tuples inside other Tuples/Lists)
# Parentheses are required here to show where one tuple ends and the next begins.
matrix_tuples = [(1, 2), (3, 4)] 

# bad_matrix = [1, 2, 3, 4] # ❌ This would just be a flat list of 4 integers!


# Exception C: Passing a Tuple directly into a Function Argument
# Look at the difference below:
def check_length(data):
    return len(data)

# Calling it WITHOUT parentheses passes 3 separate arguments (Throws TypeError!)
# check_length("A", "B", "C") 

# Calling it WITH parentheses forces Python to group it as 1 single tuple argument:
print("\n3. Passed as function argument:", check_length(("A", "B", "C"))) # Output: 3


x = ("Python")   # Python sees: a string in grouping parens
y = ("Python",)  # Python sees: a tuple with one element

type(x)  # <class 'str'>
type(y)  # <class 'tuple'>