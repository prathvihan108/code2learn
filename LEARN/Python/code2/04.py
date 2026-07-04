# =============================================
# * OUTSIDE FUNCTIONS
# =============================================

# ---- * in assignment unpacking ----
first, *rest = [1, 2, 3, 4, 5]
print(first)   # 1
print(rest)    # [2, 3, 4, 5]

*rest, last = [1, 2, 3, 4, 5]
print(rest)    # [1, 2, 3, 4]
print(last)    # 5

# ---- * to merge lists ----
a = [1, 2, 3]
b = [4, 5, 6]
merged = [*a, *b]
print(merged)   # [1, 2, 3, 4, 5, 6]

# ---- * to merge tuples ----
a = (1, 2, 3)
b = (4, 5, 6)
merged = (*a, *b)
print(merged)   # (1, 2, 3, 4, 5, 6)

# ---- * in print ----
nums = [1, 2, 3]
print(*nums)    # 1 2 3

# =============================================
# ** OUTSIDE FUNCTIONS
# =============================================

# ---- ** to merge dictionaries ----
a = {"x": 1, "y": 2}
b = {"z": 3, "w": 4}
merged = {**a, **b}
print(merged)   # {'x': 1, 'y': 2, 'z': 3, 'w': 4}

# ---- ** to copy and update a dict ----
original = {"x": 1, "y": 2}
updated = {**original, "z": 3}
print(updated)   # {'x': 1, 'y': 2, 'z': 3}

# ---- ** to override a value ----
original = {"x": 1, "y": 2}
updated = {**original, "x": 100}  # overrides x
print(updated)   # {'x': 100, 'y': 2}

# =============================================
# ❌ ** CANNOT be used outside dict literal {} 
# =============================================

# a, b = **{"x": 1, "y": 2}   # ❌ SyntaxError
# print(**{"x": 1, "y": 2})   # ❌ TypeError
# x = **{"x": 1, "y": 2}      # ❌ SyntaxError

# =============================================
# ✅ SUMMARY
# =============================================
# *  in assignment    -> first, *rest = [...]       ✅
# *  in list/tuple    -> [*a, *b]                   ✅
# *  in print         -> print(*list)               ✅
# *  in function call -> add(*list)                 ✅
# ** in dict literal  -> {**a, **b}                 ✅
# ** in function call -> add(**dict)                ✅
# ** in assignment    -> a, b = **dict              ❌
# ** in print         -> print(**dict)              ❌