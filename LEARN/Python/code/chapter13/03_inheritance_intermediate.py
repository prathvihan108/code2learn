# =====================================================
#       MULTIPLE CONSTRUCTORS IN PYTHON
#       (Guide for Java People)
# =====================================================


# =====================================================
#  JAVA — allows multiple constructors
#  PYTHON — does NOT
# =====================================================

# JAVA:
# Dog() { }
# Dog(String name) { }
# Dog(String name, int age) { }
# all three exist at same time ✅

# PYTHON — if you try same thing:
class Dog:
    def __init__(self):
        self.name = "Unknown"
        print("constructor 1")

    def __init__(self, name):
        self.name = name
        print("constructor 2")

    def __init__(self, name, age):   # LAST one silently wins!
        self.name = name
        self.age = age
        print("constructor 3")

# d1 = Dog()          # ❌ TypeError — only last __init__ exists
# d2 = Dog("Rex")     # ❌ TypeError — last needs 2 args
d3 = Dog("Rex", 3)    # ✅ only this works
# Python silently OVERWRITES previous __init__ with last one
# no error, no warning — just silent replacement!


# =====================================================
#  SOLUTION 1 — DEFAULT ARGUMENTS
#  simplest solution for optional parameters
# =====================================================

class Cat:
    def __init__(self, name="Unknown", age=0, color="black"):
        self.name  = name
        self.age   = age
        self.color = color

c1 = Cat()                        # all defaults
c2 = Cat("Kitty")                 # only name given
c3 = Cat("Kitty", 2)              # name and age given
c4 = Cat("Kitty", 2, "white")     # all given
c5 = Cat(age=5)                   # only age via keyword argument

print(c1.name, c1.age, c1.color)  # Unknown 0 black
print(c2.name, c2.age, c2.color)  # Kitty   0 black
print(c3.name, c3.age, c3.color)  # Kitty   2 black
print(c4.name, c4.age, c4.color)  # Kitty   2 white
print(c5.name, c5.age, c5.color)  # Unknown 5 black


# =====================================================
#  SOLUTION 2 — *args and **kwargs
#  when you dont know how many arguments will come
# =====================================================

class Bird:
    def __init__(self, **kwargs):         # **kwargs = keyword arguments
        self.name  = kwargs.get("name",  "Unknown")  # get or default
        self.age   = kwargs.get("age",   0)
        self.color = kwargs.get("color", "white")

b1 = Bird(name="Tweety", age=2)          # only name and age
b2 = Bird(color="yellow")                # only color
b3 = Bird()                              # nothing — all defaults

print(b1.name, b1.age, b1.color)   # Tweety 2 white
print(b2.name, b2.age, b2.color)   # Unknown 0 yellow
print(b3.name, b3.age, b3.color)   # Unknown 0 white


# =====================================================
#  SOLUTION 3 — @classmethod as alternate constructor
#  most pythonic and recommended way
#  gives truly different construction logic like Java
# =====================================================

class Dog2:
    # ONE main constructor — the primary way
    def __init__(self, name, age, breed):
        self.name  = name
        self.age   = age
        self.breed = breed

    # ALTERNATE CONSTRUCTOR 1 — create with just a name
    @classmethod
    def from_name(cls, name):
        return cls(name, 0, "Unknown")    # cls() calls main __init__

    # ALTERNATE CONSTRUCTOR 2 — create from a dictionary
    @classmethod
    def from_dict(cls, data):
        return cls(
            data["name"],
            data["age"],
            data["breed"]
        )

    # ALTERNATE CONSTRUCTOR 3 — create a default dog
    @classmethod
    def default(cls):
        return cls("Unknown", 0, "Mixed")

    # ALTERNATE CONSTRUCTOR 4 — create from a string "Rex-3-Labrador"
    @classmethod
    def from_string(cls, string):
        name, age, breed = string.split("-")  # split the string
        return cls(name, int(age), breed)

    def info(self):
        print(f"Name: {self.name}, Age: {self.age}, Breed: {self.breed}")


# main constructor
d1 = Dog2("Rex", 3, "Labrador")
d1.info()     # Name: Rex, Age: 3, Breed: Labrador

# alternate constructor 1
d2 = Dog2.from_name("Bruno")
d2.info()     # Name: Bruno, Age: 0, Breed: Unknown

# alternate constructor 2
d3 = Dog2.from_dict({"name": "Max", "age": 2, "breed": "Pug"})
d3.info()     # Name: Max, Age: 2, Breed: Pug

# alternate constructor 3
d4 = Dog2.default()
d4.info()     # Name: Unknown, Age: 0, Breed: Mixed

# alternate constructor 4
d5 = Dog2.from_string("Rocky-5-Husky")
d5.info()     # Name: Rocky, Age: 5, Breed: Husky


# =====================================================
#  HOW @classmethod CONSTRUCTOR WORKS INTERNALLY
# =====================================================

# cls = the class itself (Dog2)
# cls(name, age, breed) = Dog2(name, age, breed)
# which calls the main __init__ automatically
# so alternate constructors are just
# different ways to PREPARE arguments for main __init__


# =====================================================
#  WHICH SOLUTION TO USE WHEN
# =====================================================

# DEFAULT ARGUMENTS   → when parameters are just optional
#                       simple cases, few parameters

# **kwargs            → when parameters are many and flexible
#                       dont know what will be passed

# @classmethod        → when construction LOGIC is different
#                       like creating from dict, string, file etc
#                       most similar to Java multiple constructors


# =====================================================
#  JAVA VS PYTHON SUMMARY
# =====================================================

# JAVA                              PYTHON
# ----                              ------
# multiple __init__ allowed    →    ❌ last one silently wins
# Dog() { }                    →    default arguments
# Dog(String name) { }         →    def __init__(self, name="Unknown")
# Dog(String name, int age){ } →    @classmethod alternate constructors
# overloading built in         →    manually handled via defaults/@classmethod