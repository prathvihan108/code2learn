# =============================================
# PART 1: TAKING INPUT IN PYTHON
# =============================================

# ---- basic input (always returns STRING) ----
name = input("Enter name: ")
print(name)         # "Alice"
print(type(name))   # <class 'str'>

# ---- single integer input ----
n = int(input("Enter number: "))
print(n)            # 5
print(type(n))      # <class 'int'>

# ---- single float input ----
n = float(input("Enter number: "))
print(n)            # 5.5

# ---- multiple inputs on same line ----
a, b = map(int, input("Enter two numbers: ").split())
print(a, b)         # 3 5

# ---- multiple inputs with specific separator ----
a, b = map(int, input("Enter two numbers: ").split(","))
# input: "3,5"
print(a, b)         # 3 5

# ---- take n inputs in a list ----
n = int(input())
nums = list(map(int, input().split()))
print(nums)         # [1, 2, 3, 4, 5]

# ---- take input line by line ----
n = int(input())    # how many lines
for i in range(n):
    x = int(input())
    print(x)

# =============================================
# PART 2: LIST COMPREHENSION
# =============================================

# List comprehension is a shorter way to create lists
# Syntax: [expression for item in iterable]

# ---- WITHOUT list comprehension ----
nums = []
for i in range(1, 6):
    nums.append(i)
print(nums)   # [1, 2, 3, 4, 5]

# ---- WITH list comprehension ----
nums = [i for i in range(1, 6)]
print(nums)   # [1, 2, 3, 4, 5]

# ---- with expression ----
squares = [i**2 for i in range(1, 6)]
print(squares)   # [1, 4, 9, 16, 25]

doubled = [i*2 for i in range(1, 6)]
print(doubled)   # [2, 4, 6, 8, 10]

# ---- with condition (filter) ----
# Syntax: [expression for item in iterable if condition]

evens = [i for i in range(1, 11) if i % 2 == 0]
print(evens)   # [2, 4, 6, 8, 10]

odds = [i for i in range(1, 11) if i % 2 != 0]
print(odds)    # [1, 3, 5, 7, 9]

# ---- with if-else ----
# Syntax: [value_if_true if condition else value_if_false for item in iterable]

result = ["even" if i % 2 == 0 else "odd" for i in range(1, 6)]
print(result)   # ['odd', 'even', 'odd', 'even', 'odd']

# ---- nested list comprehension ----
matrix = [[j for j in range(1, 4)] for i in range(3)]
print(matrix)   # [[1, 2, 3], [1, 2, 3], [1, 2, 3]]

# ---- flatten a nested list ----
nested = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
flat = [i for sublist in nested for i in sublist]
print(flat)   # [1, 2, 3, 4, 5, 6, 7, 8, 9]

# ---- list comprehension with string ----
words = ["hello", "world", "python"]
upper = [w.upper() for w in words]
print(upper)   # ['HELLO', 'WORLD', 'PYTHON']

lengths = [len(w) for w in words]
print(lengths)   # [5, 5, 6]

# ---- taking list input using list comprehension ----
nums = [int(x) for x in input().split()]
print(nums)   # [1, 2, 3, 4, 5]

# =============================================
# PART 3: SIMILAR COMPREHENSIONS
# =============================================

# ---- set comprehension ----
s = {i**2 for i in range(1, 6)}
print(s)   # {1, 4, 9, 16, 25}  <- no duplicates, no order

# ---- dict comprehension ----
d = {i: i**2 for i in range(1, 6)}
print(d)   # {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}

# ---- generator expression (lazy, memory efficient) ----
g = (i**2 for i in range(1, 6))
print(g)         # <generator object>
print(list(g))   # [1, 4, 9, 16, 25]

# =============================================
# ✅ SUMMARY
# =============================================
# input()                          -> string
# int(input())                     -> integer
# map(int, input().split())        -> multiple ints
# list(map(int, input().split()))  -> list of ints
# [int(x) for x in input().split()] -> same as above

# [expr for i in iterable]            -> basic comprehension
# [expr for i in iterable if cond]    -> with filter
# [x if cond else y for i in iterable] -> with if-else
# {expr for i in iterable}            -> set comprehension
# {k:v for i in iterable}             -> dict comprehension
# (expr for i in iterable)            -> generator