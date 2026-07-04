# =============================================
# UNPACKING IN PYTHON
# =============================================

# Unpacking means extracting values from an iterable
# and assigning them to variables in one line

# ---- BASIC UNPACKING ----
a, b, c = [1, 2, 3]
print(a, b, c)   # 1 2 3

a, b, c = (1, 2, 3)   # tuple
print(a, b, c)         # 1 2 3

a, b, c = "abc"        # string
print(a, b, c)         # a b c

# ---- SWAPPING VARIABLES ----
a, b = 10, 20
a, b = b, a            # swap using unpacking
print(a, b)            # 20 10

# ---- UNPACKING WITH * (star/extended unpacking) ----
first, *rest = [1, 2, 3, 4, 5]
print(first)   # 1
print(rest)    # [2, 3, 4, 5]

*rest, last = [1, 2, 3, 4, 5]
print(rest)    # [1, 2, 3, 4]
print(last)    # 5

first, *middle, last = [1, 2, 3, 4, 5]
print(first)   # 1
print(middle)  # [2, 3, 4]
print(last)    # 5

# ---- UNPACKING IN FUNCTIONS ----
def add(a, b, c):
    return a + b + c

nums = [1, 2, 3]
print(add(*nums))       # 6  -> unpacks list into arguments

nums = {"a": 1, "b": 2, "c": 3}
print(add(**nums))      # 6  -> unpacks dict into keyword arguments

# ---- UNPACKING map() ----
a, b = map(int, "3 5".split())
print(a, b)   # 3 5

# =============================================
# ❌ COMMON BEGINNER ERRORS
# =============================================

# ERROR 1: Too few variables
# a, b = [1, 2, 3]
# ValueError: too many values to unpack (expected 2)

# ERROR 2: Too many variables
# a, b, c = [1, 2]
# ValueError: not enough values to unpack (expected 3, got 2)

# ERROR 3: Forgetting * for function unpacking
# add([1, 2, 3])
# TypeError: add() missing 2 required positional arguments

# ERROR 4: Using int() instead of map() for multiple inputs
# a, b = int(input().split())
# TypeError: int() can't convert a list

# ERROR 5: Two starred variables
# *a, *b = [1, 2, 3]
# SyntaxError: multiple starred expressions in assignment

# ERROR 6: Unpacking a non-iterable
# a, b = 10
# TypeError: cannot unpack non-iterable int object

# =============================================
# ✅ QUICK SUMMARY
# =============================================
# a, b = [1, 2]          -> basic unpacking
# a, b = b, a            -> swap
# first, *rest = [...]   -> star unpacking
# add(*list)             -> unpack into function args
# add(**dict)            -> unpack into keyword args
# a, b = map(int, ...)   -> unpack map object


# unpacking with dictionaries 

d = {"x": 1, "y": 2}

# ---- direct unpack -> keys only ----
a, b = d
print(a, b)   # x y  ✅

# ---- same as doing ----
a, b = d.keys()
print(a, b)   # x y

# ---- to get values ----
a, b = d.values()
print(a, b)   # 1 2

# ---- to get key-value pairs ----
a, b = d.items()
print(a)   # ('x', 1)
print(b)   # ('y', 2)