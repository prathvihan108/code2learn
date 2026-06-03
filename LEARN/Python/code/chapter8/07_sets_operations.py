# ==============================================================================
# MASTERING PYTHON SET OPERATIONS (OPERATORS VS METHODS)
# ==============================================================================

set_a = {1, 2, 3}
set_b = {3, 4, 5}


# ------------------------------------------------------------------------------
# 1. THE FOUR CORE VENN MATHEMATICS OPERATIONS
# ------------------------------------------------------------------------------

# --- A. UNION (Combine everything from both sets, discarding duplicates) ---
# Time Complexity: O(N + M)
print("1a. Union (Operator):", set_a | set_b)       # Output: {1, 2, 3, 4, 5}
print("    Union (Method):  ", set_a.union(set_b))  # Same output


# --- B. INTERSECTION (Keep ONLY items present in BOTH sets) ---
# Time Complexity: O(min(len(set_a), len(set_b)))
print("\n1b. Intersection (Operator):", set_a & set_b)              # Output: {3}
print("    Intersection (Method):  ", set_a.intersection(set_b))    # Same output


# --- C. DIFFERENCE (Keep items in set_a that do NOT exist in set_b) ---
# Time Complexity: O(len(set_a))
print("\n1c. Difference (Operator):", set_a - set_b)            # Output: {1, 2}
print("    Difference (Method):  ", set_a.difference(set_b))    # Same output


# --- D. SYMMETRIC DIFFERENCE (Keep items unique to each set; discards the overlap) ---
# Time Complexity: O(len(set_a))
print("\n1d. Sym. Diff (Operator):", set_a ^ set_b)                      # Output: {1, 2, 4, 5}
print("    Sym. Diff (Method):  ", set_a.symmetric_difference(set_b))    # Same output


# ------------------------------------------------------------------------------
# 🧠 THE SNEAKY INTERVIEW TRAP: OPERATORS VS METHODS
# ------------------------------------------------------------------------------
# Interview Question: "What is the difference between writing 'set_a | list_a' 
# versus writing 'set_a.union(list_a)'?"
#
# ANSWER: 
# - Set OPERATORS (| , & , - , ^) STRICTLY require BOTH sides to be actual sets.
# - Set METHODS (.union(), etc.) accept ANY iterable (lists, tuples, strings) 
#   and will automatically convert them to a set on the fly!

my_list = [5, 6, 7]

# print(set_a | my_list)       # ❌ CRASHES! TypeError: unsupported operand type(s)
print("\n2. Method Flexibility:", set_a.union(my_list)) #  VALID! Output: {1, 2, 3, 5, 6, 7}


# ------------------------------------------------------------------------------
# 2. EVALUATION & BOUNDARY CHECKS (Boolean Outputs)
# ------------------------------------------------------------------------------
small_set = {1, 2}
large_set = {1, 2, 3, 4}
weird_set = {8, 9}

# --- SUBSET (Is everything in small_set inside large_set?) ---
print("\n3a. Is subset?:", small_set.issubset(large_set)) # Output: True
# Operator equivalent: small_set <= large_set

# --- SUPERSET (Does large_set contain everything that is in small_set?) ---
print("3b. Is superset?:", large_set.issuperset(small_set)) # Output: True
# Operator equivalent: large_set >= small_set

# --- DISJOINT (Do the sets have absolutely ZERO elements in common?) ---
print("3c. Are disjoint?:", small_set.isdisjoint(weird_set)) # Output: True (No overlap)


# ------------------------------------------------------------------------------
# 3. MUTABILITY OPERATIONS (Modifying In Place)
# ------------------------------------------------------------------------------
# All of the core Venn operations above create a BRAND NEW set in memory. 
# If you want to mutate the original set directly to save memory space, use these:

target_set = {1, 2, 3}

# Add a single element
target_set.add(4) # Complexity: O(1)

# Add multiple elements from any collection
target_set.update([5, 6, 4]) # Acts like an in-place union


# ------------------------------------------------------------------------------
# 4. REMOVAL OPERATIONS & THE DISCARD CONFUSION
# ------------------------------------------------------------------------------
# Interviewers love to ask about the subtle behavioral difference between 
# .remove() and .discard() when an element doesn't exist.

# Case A: .remove(value) -> Aggressive
# If the value is missing, it crashes your program with a KeyError!
# target_set.remove(99) # ❌ Crashes!

# Case B: .discard(value) -> Safe / Passive
# If the value is missing, it silently ignores it and moves on.
target_set.discard(99) #  Safe execution.

# Case C: .pop() -> Unpredictable
# Removes and returns an ARBITRARY element. Because sets are unordered, 
# you cannot predict which item it will grab!
popped_val = target_set.pop() 

# Empty the entire set out
target_set.clear()