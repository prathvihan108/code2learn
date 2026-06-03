# a decorator is a function that
# WRAPS another function
# to ADD extra behavior
# WITHOUT modifying the original function

# lets build one manually first

def my_decorator(func):          # takes a function as input
    def wrapper():               # creates a new wrapper function
        print("BEFORE")          # extra behavior before
        func()                   # calls the original function
        print("AFTER")           # extra behavior after
    return wrapper               # returns the wrapper


def greet():
    print("Hello!")


# manually wrapping
greet = my_decorator(greet)   # greet is now the wrapper!
greet() #greet referes to wrapper which is called here

# Output:
# BEFORE
# Hello!
# AFTER

# The @ Syntax — Shortcut for Same Thing

def my_decorator(func):
    def wrapper():
        print("BEFORE")
        func()
        print("AFTER")
    return wrapper


# @my_decorator is EXACTLY same as greet = my_decorator(greet)
@my_decorator
def greet():
    print("Hello!")


greet()

# Output:
# BEFORE
# Hello!
# AFTER

# What Happens Internally Step by Step

@my_decorator
def greet():
    print("Hello!")

# Python reads this as:
# Step 1 — define greet() normally
# Step 2 — pass greet to my_decorator(greet)
# Step 3 — my_decorator returns wrapper function
# Step 4 — greet name now points to wrapper
# Step 5 — when you call greet() you are calling wrapper()

# PROOF — greet is now wrapper
print(greet.__name__)    # wrapper  — original name is gone!

# Decorator with Arguments — Need *args, **kwargs

def my_decorator(func):
    def wrapper(*args, **kwargs):    # accept ANY arguments
        print("BEFORE")
        result = func(*args, **kwargs)  # pass them to original
        print("AFTER")
        return result                # return original result
    return wrapper


@my_decorator
def add(a, b):
    return a + b


print(add(2, 3))

# Output:
# BEFORE
# AFTER
# 5

# functools.wraps — Fix the Lost Name(original name u can preserve)

import functools

def my_decorator(func):
    @functools.wraps(func)      # preserves original function name
    def wrapper(*args, **kwargs):
        print("BEFORE")
        result = func(*args, **kwargs)
        print("AFTER")
        return result
    return wrapper


@my_decorator
def greet():
    print("Hello!")


print(greet.__name__)   # greet ✅  — name preserved now


# Real World Use Cases

import functools
import time

# ✅ USE CASE 1 — TIMER decorator
def timer(func):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        start = time.time()             # before
        result = func(*args, **kwargs)  # run original
        end = time.time()               # after
        print(f"{func.__name__} took {end - start:.4f} seconds")
        return result
    return wrapper


@timer
def slow_function():
    time.sleep(1)
    print("done!")

slow_function()
# done!
# slow_function took 1.0012 seconds


# ✅ USE CASE 2 — LOGIN CHECK decorator
def login_required(func):
    @functools.wraps(func)
    def wrapper(user, *args, **kwargs):
        if not user.get("logged_in"):       # check before running
            print("Please login first!")
            return
        return func(user, *args, **kwargs)  # only runs if logged in
    return wrapper


@login_required
def dashboard(user):
    print(f"Welcome {user['name']}!")


dashboard({"name": "John", "logged_in": False})  # Please login first!
dashboard({"name": "John", "logged_in": True})   # Welcome John!


# ✅ USE CASE 3 — REPEAT decorator
def repeat(times):                    # outer function takes argument
    def decorator(func):              # middle — receives function
        @functools.wraps(func)
        def wrapper(*args, **kwargs): # inner — runs the logic
            for _ in range(times):
                func(*args, **kwargs)
        return wrapper
    return decorator


@repeat(3)                 # decorator with argument
def hello():
    print("Hello!")

hello()
# Hello!
# Hello!
# Hello!

# Stacking Multiple Decorators

def bold(func):
    def wrapper():
        print("<b>", end="")
        func()
        print("</b>", end="")
    return wrapper

def italic(func):
    def wrapper():
        print("<i>", end="")
        func()
        print("</i>", end="")
    return wrapper


# applied BOTTOM UP — italic first, then bold
@bold
@italic
def text():
    print("Hello", end="")

text()   # <b><i>Hello</i></b>

# internally same as:
# text = bold(italic(text))

# Class Decorators — @staticmethod @classmethod @property are all examples of class decorators

# these are all BUILT-IN decorators you already know!

class Dog:
    species = "Canine"

    def __init__(self, name):
        self.__name = name

    @property                  # decorator — makes method act like attribute
    def name(self):
        return self.__name

    @classmethod               # decorator — passes class as first arg
    def get_species(cls):
        return cls.species

    @staticmethod              # decorator — no self or cls passed
    def is_dog(animal):
        return animal == "dog"