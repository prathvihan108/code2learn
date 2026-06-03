# ==============================================================================
# THE MASTER ARCHITECTURAL BLUEPRINT: '==' VS 'IS'
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. MUTABLE OBJECTS: NO MEMORY SHARING
# ------------------------------------------------------------------------------
# Because lists, dictionaries, and sets are mutable (changeable), Python always 
# allocates a brand-new, isolated memory block whenever you declare one.

list_a = [1, 2, 3]
list_b = [1, 2, 3]

print("1a. Mutable Equality (==):", list_a == list_b) # True  (The numbers match)
print("1b. Mutable Identity (is):", list_a is list_b) # False (They live at different memory IDs)

# Let's verify by printing their actual RAM location addresses
print(f"    Memory Addresses -> list_a: {id(list_a)} | list_b: {id(list_b)}")


# ------------------------------------------------------------------------------
# 2. IMMUTABLE ANOMALY A: THE SMALL INTEGER INTERNING TRAP
# ------------------------------------------------------------------------------
# Optimization Strategy: To save performance overhead, Python automatically boots 
# up with a global array of integers pre-allocated in memory from -5 to 256. 
# Any variable declared in this range automatically points to the exact same shared object!

x = 256
y = 256
print("\n2a. Small Int Identity (is):", x is y) # True (Shared global integer object pool!)

# However, the moment you cross that boundary (257 or higher):
x_large = 257
y_large = 257
print("2b. Large Int Identity (is):", x_large is y_large) # False! (New memory blocks allocated)


# ------------------------------------------------------------------------------
# 3. IMMUTABLE ANOMALY B: STRING INTERNING & COMPILER OPTIMIZATION
# ------------------------------------------------------------------------------
# Python automatically hashes and caches short, clean, alphanumeric text strings 
# at compile time to reuse memory efficiently.

str_a = "hello"
str_b = "hello"
print("\n3a. Static String Identity (is):", str_a is str_b) # True (Interned by the engine)

# TRAP: Dynamic runtime modifications break string interning because the final 
# string value isn't calculated until the code executes!
str_dynamic = "".join(["h", "e", "l", "l", "o"])
print("3b. Dynamic String Identity (is):", str_a is str_dynamic) # False! 
print("3c. Dynamic String Equality (==):", str_a == str_dynamic) # True! (Values still match)


# ------------------------------------------------------------------------------
# 4. IMMUTABLE ANOMALY C: TUPLES ARE UNPREDICTABLE
# ------------------------------------------------------------------------------
# Tuples are immutable containers. If a tuple contains purely immutable elements, 
# Python's compiler might optimize and pool them. If it has mutables, it won't!

tuple_a = (1, 2)
tuple_b = (1, 2)
print("\n4a. Pure Tuple Identity (is):", tuple_a is tuple_b) # True (Optimized memory pooling)

tuple_mutable_a = (1, [2])
tuple_mutable_b = (1, [2])
print("4b. Mixed Tuple Identity (is):", tuple_mutable_a is tuple_mutable_b) # False!


# ------------------------------------------------------------------------------
# 5. THE PRODUCTION STANDARD RULES
# ------------------------------------------------------------------------------
# Rule 1: Never use 'is' to compare numbers or strings. Always use '=='.
# Rule 2: The 'is' operator is strictly reserved for comparing Singletons—objects 
#         that are guaranteed to exist only once in your entire application memory space.

current_user = None

if current_user is None: # Industry Standard! None is a global singleton object.
    print("\n5. Singleton verified via 'is'")