# ==============================================================================
# THE MASTER BLUEPRINT OF PYTHON DICTIONARIES
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. CORE SYNTAX, ANATOMY, AND SYNTAX CLASHES
# ------------------------------------------------------------------------------
# Dictionaries map unique 'Keys' to variable 'Values' using curly braces {}.
# A colon (:) separates a key from its value, and commas separate each pair.

user_profile = {
    "username": "prathvi09",
    "role": "Admin",
    "login_attempts": 3,
    "is_active": True
}

# THE SYSTEM SYNTAX CLASH: Both dictionaries and sets use curly braces. 
# An empty set of braces ALWAYS defaults to a dictionary in Python, not a set!
empty_collection = {}  
print("1. Empty brace type:", type(empty_collection)) # Output: <class 'dict'>


# ------------------------------------------------------------------------------
# 2. STRUCTURAL ANOMALIES & MUTATION RULES
# ------------------------------------------------------------------------------

# ANOMALY A: Keys MUST Be Unique (The Overwrite Trap)
# If you declare duplicate keys, Python will not throw a compiler error. 
# Instead, the final declaration silently overwrites all previous values!
inventory = {
    "apples": 50,
    "bananas": 20,
    "apples": 100  # Duplicate key overwrites index slot
}
print("\n2a. Overwrite Result:", inventory) # Output: {'apples': 100, 'bananas': 20}


# ANOMALY B: Keys MUST Be Immutable (The Hashable Rule)
# Values can be anything (lists, dicts). Keys, however, MUST be unchangeable data 
# types (strings, integers, floats, tuples). Mutables like lists are forbidden!

# bad_dict = { [1, 2]: "Coordinates" } 
# ❌ CRASHES with: TypeError: unhashable type: 'list'

good_dict = { (1, 2): "Coordinates" } # ✅ VALID: Tuples are immutable and hashable!


# ------------------------------------------------------------------------------
# 3. ALGORITHMIC SUPERPOWERS: TIME COMPLEXITIES
# ------------------------------------------------------------------------------
# Under the hood, a dictionary is built on a Hash Table. 
# Python maps a key through an internal math function directly to its exact 
# memory coordinate, bypassing long search loops entirely.

database_dict = { 101: "Alice", 751: "Bob", 902: "Charlie" }

# Operation: Direct Lookup/Access
# Complexity: O(1) Constant Time. It takes the same microsecond to find a key 
# whether the dictionary contains 3 elements or 30 million elements!
print("\n3a. O(1) Key Lookup:", database_dict[751]) # Output: Bob

# Operation: Insertion / Adding a new pair
# Complexity: O(1) Constant Time
database_dict[440] = "David" 

# Operation: Deletion via 'del' keyword
# Complexity: O(1) Constant Time
del database_dict[101]


# ------------------------------------------------------------------------------
# 4. HISTORICAL ENGINE SHIFTS (The Ordering Mechanics)
# ------------------------------------------------------------------------------
# TRAP: Old tutorials or legacy code resources state that dicts are unordered.
#
# - Pre-Python 3.6: Dictionaries were completely unordered due to memory indexing layout.
# - Modern Python (3.7+ Standard): Dictionaries are strictly INSERTION-ORDERED. 
#   They explicitly remember the chronological sequence in which pairs were created.

ordered_check = {}
ordered_check["First"] = 1
ordered_check["Second"] = 2
ordered_check["Third"] = 3

print("\n4. Modern Sequence Retention:")
for key, value in ordered_check.items():
    print(f"   {key} -> {value}") # Guaranteed to print in chronological order