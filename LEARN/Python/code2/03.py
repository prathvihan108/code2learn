# =============================================
# *args AND **kwargs UNPACKING IN DETAIL
# =============================================

# =============================================
# PART 1: *args  (single star)
# =============================================

# *args is used when you don't know how many
# positional arguments will be passed

def add(*args):
    print(args)        # args is a TUPLE
    return sum(args)

print(add(1, 2))           # (1, 2)  ->  3
print(add(1, 2, 3))        # (1, 2, 3)  ->  6
print(add(1, 2, 3, 4, 5))  # (1, 2, 3, 4, 5)  ->  15

# ---- Looping over *args ----
def greet(*args):
    for name in args:
        print("Hello", name)

greet("Alice", "Bob", "Charlie")
# Hello Alice
# Hello Bob
# Hello Charlie

# ---- *args with fixed parameters ----
def info(title, *args):
    print("Title:", title)
    print("Items:", args)

info("Fruits", "apple", "banana", "mango")
# Title: Fruits
# Items: ('apple', 'banana', 'mango')

# ---- Unpacking a list into *args ----
def add(a, b, c):
    return a + b + c

nums = [1, 2, 3]
print(add(*nums))   # 6
# * unpacks the list -> add(1, 2, 3)

# =============================================
# PART 2: **kwargs  (double star)
# =============================================

# **kwargs is used when you don't know how many
# keyword arguments will be passed

def display(**kwargs):
    print(kwargs)       # kwargs is a DICT

display(name="Alice", age=25)
# {'name': 'Alice', 'age': 25}

# ---- Looping over **kwargs ----
def display(**kwargs):
    for key, value in kwargs.items():
        print(key, ":", value)

display(name="Alice", age=25, city="Mumbai")
# name : Alice
# age  : 25
# city : Mumbai

# ---- **kwargs with fixed parameters ----
def info(title, **kwargs):
    print("Title:", title)
    print("Details:", kwargs)

info("Person", name="Alice", age=25)
# Title: Person
# Details: {'name': 'Alice', 'age': 25}

# ---- Unpacking a dict into **kwargs ----
def add(a, b, c):
    return a + b + c

nums = {"a": 1, "b": 2, "c": 3}
print(add(**nums))   # 6
# ** unpacks the dict -> add(a=1, b=2, c=3)

# =============================================
# PART 3: *args AND **kwargs TOGETHER
# =============================================

def info(*args, **kwargs):
    print("args   :", args)    # tuple
    print("kwargs :", kwargs)  # dict

info(1, 2, 3, name="Alice", age=25)
# args   : (1, 2, 3)
# kwargs : {'name': 'Alice', 'age': 25}

# ---- Order rule: *args must come before **kwargs ----
# def info(**kwargs, *args):  # ❌ SyntaxError
# def info(*args, **kwargs):  # ✅ Correct

# =============================================
# PART 4: COMBINING FIXED + *args + **kwargs
# =============================================

def info(title, *args, **kwargs):
    print("Title  :", title)   # fixed
    print("args   :", args)    # extra positional
    print("kwargs :", kwargs)  # extra keyword

info("Data", 1, 2, 3, name="Alice", age=25)
# Title  : Data
# args   : (1, 2, 3)
# kwargs : {'name': 'Alice', 'age': 25}

# =============================================
# ❌ COMMON BEGINNER ERRORS
# =============================================

# ERROR 1: Wrong order
# def info(**kwargs, *args):
# SyntaxError: invalid syntax
# Rule: fixed -> *args -> **kwargs

# ERROR 2: Passing keyword arg as positional
# def add(a, b): return a + b
# add(**{"x": 1, "y": 2})
# TypeError: got unexpected keyword argument 'x'
# keys must match parameter names exactly

# ERROR 3: Mixing up * and **
# nums = [1, 2, 3]
# add(**nums)   # ❌ TypeError: ** requires a dict
# add(*nums)    # ✅ correct for list

# nums = {"a": 1, "b": 2, "c": 3}
# add(*nums)    # ❌ unpacks only KEYS -> add("a", "b", "c")
# add(**nums)   # ✅ correct for dict

# =============================================
# ✅ QUICK SUMMARY
# =============================================
# *args   -> extra positional args  -> stored as TUPLE
# **kwargs -> extra keyword args    -> stored as DICT
# * also unpacks a list into positional arguments
# ** also unpacks a dict into keyword arguments
# Order: fixed params -> *args -> **kwargs