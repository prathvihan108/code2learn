# ==============================================================================
# PYTHON SETS: ANOMALIES, CONFUSIONS, AND TIME COMPLEXITIES
# ==============================================================================

# ------------------------------------------------------------------------------
# CONFUSION 1: THE EMPTY SET CREATION TRAP (Syntax Clash)
# ------------------------------------------------------------------------------
# Both sets and dictionaries use curly braces {}. This creates a massive trap 
# when you try to initialize an empty set.

trap_collection = {}  # ❌ TRAP: This creates an empty DICTIONARY, not a set!
true_set = set()      #  CORRECT: You must use the set() constructor.

print("1. Trap type:", type(trap_collection)) # Output: <class 'dict'>
print("   True type:", type(true_set))          # Output: <class 'set'>


# ------------------------------------------------------------------------------
# ANOMALY 2: THE "HASHABLE ONLY" RULE (Sets inside Sets)
# ------------------------------------------------------------------------------
# Rule: A set can only hold elements that are IMMUTABLE (hashable). 
# Because a set itself is mutable, you can never put a set inside another set!

# bad_set = {1, 2, {3, 4}} 
# ❌ CRASHES! TypeError: unhashable type: 'set' (Same goes for lists inside sets)

# THE ANOMALY FIX: If you need a set inside a set, use a 'frozenset'.
# A frozenset is a completely immutable, locked version of a set.
good_nested_set = {1, 2, frozenset([3, 4])} #  VALID!


# ------------------------------------------------------------------------------
# ANOMALY 3: TRUE AND 1 ARE THE SAME THING? (Inherent Duplication Logic)
# ------------------------------------------------------------------------------
# In Python, the Boolean 'True' has an underlying integer value of 1, and 'False' 
# has a value of 0. Because sets enforce absolute uniqueness, they treat them 
# as duplicates and keep whichever one was declared first!

weird_set_1 = {1, True, "Hello"}
weird_set_2 = {True, 1, "Hello"}

print("\n3. Weird Set 1:", weird_set_1) # Output: {1, 'Hello'} (True was eaten!)
print("   Weird Set 2:", weird_set_2) # Output: {True, 'Hello'} (1 was eaten!)


# ------------------------------------------------------------------------------
# CONFUSION 4: THE "UNORDERED" ILLUSION (Why it looks sorted but isn't)
# ------------------------------------------------------------------------------
# If you create a set of small integers, it often looks perfectly sorted when printed.
ordered_looking_set = {3, 1, 4, 2}
print("\n4. Illusion print:", ordered_looking_set) # Might print: {1, 2, 3, 4}

# TRAP WARNING: Do not rely on this! This is a side-effect of how Python hashes 
# small integers directly to their own values. If you use strings or larger numbers, 
# the ordering immediately becomes unpredictable and volatile.


# ------------------------------------------------------------------------------
# TIME COMPLEXITY ANALYSIS: THE SUPERPOWER OF SETS
# ------------------------------------------------------------------------------
# Why do we use sets? Under the hood, a set is built on a Hash Table. 
# It calculates a math index for every item, allowing it to bypass loops completely.

names_list = ["Prathvi", "Akshat", "Harshith"]
names_set  = {"Prathvi", "Akshat", "Harshith"}

# Operation: Membership Lookup ("Is Akshat in the group?")
# - In a list: O(N) Linear Time. Python must scan item-by-item from start to finish.
# - In a set:  O(1) Constant Time. Python instantly hashes "Akshat" and goes right 
#              to its memory slot. It takes the same microsecond on 1 billion items!

if "Akshat" in names_set:  # Complexity: O(1) -> Instantaneous
    pass