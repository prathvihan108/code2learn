# =====================================================
#       STATIC METHODS IN PYTHON
#       (Guide for Java People)
# =====================================================


# =====================================================
#  FIRST — UNDERSTAND THE 3 TYPES OF METHODS
#  before diving into static
# =====================================================

class Dog:

    species = "Canine"              # class variable

    def __init__(self, name):
        self.name = name            # instance variable

    def bark(self):                 # INSTANCE METHOD
        print(self.name)            # needs self — accesses object data

    @classmethod
    def get_species(cls):           # CLASS METHOD
        print(cls.species)          # needs cls — accesses class data

    @staticmethod
    def utility():                  # STATIC METHOD
        print("I dont need")        # no self, no cls — accesses NOTHING
                                    # from the class or object


# =====================================================
#  WHAT IS A STATIC METHOD
#  a regular function that lives INSIDE a class
#  but has NO connection to the object or class
#  no self — so cant access instance variables
#  no cls  — so cant access class variables
#  just a utility function grouped inside a class
# =====================================================

class MathHelper:

    @staticmethod
    def add(a, b):
        return a + b               # no self, no cls needed
                                   # just pure logic

    @staticmethod
    def multiply(a, b):
        return a * b

    @staticmethod
    def is_even(n):
        return n % 2 == 0


# call via class — no object needed!
print(MathHelper.add(2, 3))        # 5
print(MathHelper.multiply(4, 5))   # 20
print(MathHelper.is_even(4))       # True

# can also call via object — but pointless
m = MathHelper()
print(m.add(2, 3))                 # 5 — works but bad practice
                                   # static methods dont need objects


# =====================================================
#  WHY PUT IT INSIDE A CLASS
#  if it doesnt use class or object data?
#  ANSWER — for logical grouping and organization
# =====================================================

# WITHOUT static method — function floating outside
def validate_age(age):             # where does this belong?
    return 0 < age < 150           # hard to find, no organization


# WITH static method — logically grouped inside class
class Person:
    def __init__(self, name, age):
        if Person.validate_age(age):    # reuse validation here
            self.age = age
        else:
            raise ValueError("Invalid age!")
        self.name = name

    @staticmethod
    def validate_age(age):              # belongs here logically ✅
        return 0 < age < 150

    @staticmethod
    def validate_name(name):
        return bool(name) and name.isalpha()


print(Person.validate_age(25))     # True  — call without object
print(Person.validate_age(200))    # False
print(Person.validate_name("John")) # True
print(Person.validate_name(""))    # False


# =====================================================
#  STATIC METHOD CANNOT ACCESS INSTANCE OR CLASS DATA
# =====================================================

class Dog2:
    species = "Canine"

    def __init__(self, name):
        self.name = name

    @staticmethod
    def broken():
        # print(self.name)       # ❌ NameError — no self available
        # print(cls.species)     # ❌ NameError — no cls available
        # print(Dog2.species)    # ✅ but this is hardcoding class name
        print("no access to self or cls")

    @classmethod
    def class_method(cls):
        print(cls.species)       # ✅ cls available here

    def instance_method(self):
        print(self.name)         # ✅ self available here


# =====================================================
#  STATIC METHOD IN INHERITANCE
#  child inherits static methods from parent
#  but static method doesnt know WHICH class called it
# =====================================================

class Animal:
    @staticmethod
    def breathe():
        print("breathing...")

    @classmethod
    def describe(cls):
        print(f"I am {cls.__name__}")   # cls knows which class


class Cat(Animal):
    pass


# static method inherited ✅
Cat.breathe()              # breathing... — inherited from Animal
Animal.breathe()           # breathing... — same output, no difference

# classmethod knows which class called it
Cat.describe()             # I am Cat    — cls = Cat
Animal.describe()          # I am Animal — cls = Animal

# KEY POINT — static method has no cls
# so it doesnt know if Cat or Animal called it
# classmethod DOES know — thats the difference


# =====================================================
#  REAL WORLD USE CASES OF STATIC METHODS
# =====================================================

# USE CASE 1 — VALIDATION UTILITIES
class BankAccount:
    def __init__(self, owner, balance):
        if not BankAccount.validate_balance(balance):
            raise ValueError("Invalid balance!")
        self.owner   = owner
        self.balance = balance

    @staticmethod
    def validate_balance(amount):
        return isinstance(amount, (int, float)) and amount >= 0

    @staticmethod
    def validate_owner(name):
        return bool(name) and len(name) > 2


acc = BankAccount("John", 1000)     # ✅
print(BankAccount.validate_balance(-500))  # False
print(BankAccount.validate_owner("Jo"))    # False


# USE CASE 2 — CONVERSION UTILITIES
class Temperature:
    def __init__(self, celsius):
        self.celsius = celsius

    @staticmethod
    def celsius_to_fahrenheit(c):
        return (c * 9/5) + 32

    @staticmethod
    def fahrenheit_to_celsius(f):
        return (f - 32) * 5/9

    @staticmethod
    def celsius_to_kelvin(c):
        return c + 273.15

    def display(self):
        f = Temperature.celsius_to_fahrenheit(self.celsius)
        print(f"{self.celsius}C = {f}F")


t = Temperature(100)
t.display()                                      # 100C = 212.0F
print(Temperature.celsius_to_kelvin(100))        # 373.15
print(Temperature.fahrenheit_to_celsius(212))    # 100.0


# USE CASE 3 — FACTORY HELPER (works alongside classmethod)
class Date:
    def __init__(self, day, month, year):
        self.day   = day
        self.month = month
        self.year  = year

    @staticmethod
    def is_valid_date(day, month, year):      # validate first
        if month < 1 or month > 12: return False
        if day < 1 or day > 31:     return False
        if year < 1:                return False
        return True

    @classmethod
    def from_string(cls, date_string):        # alternate constructor
        day, month, year = map(int, date_string.split("-"))
        if not Date.is_valid_date(day, month, year):
            raise ValueError("Invalid date!")
        return cls(day, month, year)

    def display(self):
        print(f"{self.day}-{self.month}-{self.year}")


d = Date.from_string("15-6-2024")
d.display()                                   # 15-6-2024
print(Date.is_valid_date(31, 13, 2024))       # False — month 13 invalid


# =====================================================
#  STATIC vs INSTANCE vs CLASS METHOD SUMMARY
# =====================================================

class Summary:

    class_var = "I am class"

    def __init__(self):
        self.instance_var = "I am instance"

    def instance_method(self):
        print(self.instance_var)    # ✅ access instance data via self
        print(self.class_var)       # ✅ access class data via self too

    @classmethod
    def class_method(cls):
        # print(self.instance_var)  # ❌ no self — cant access instance
        print(cls.class_var)        # ✅ access class data via cls

    @staticmethod
    def static_method():
        # print(self.instance_var)  # ❌ no self
        # print(cls.class_var)      # ❌ no cls
        print("no access to anything") # just pure logic


# =====================================================
#  JAVA VS PYTHON STATIC METHOD
# =====================================================

# JAVA                              PYTHON
# ----                              ------
# static void method() { }    →    @staticmethod def method():
# ClassName.method()           →    ClassName.method()
# cant access instance vars    →    same ✅
# cant access class vars       →    same ✅ (without hardcoding)
# inherited by child           →    same ✅
# called via object (warning)  →    called via object works, no warning


# =====================================================
#  FINAL SUMMARY — WHEN TO USE WHAT
# =====================================================

# INSTANCE METHOD  → needs self  → works with object data
#                    use when method reads or changes object state

# CLASS METHOD     → needs cls   → works with class data
#                    use when method works on class level
#                    or as alternate constructor

# STATIC METHOD    → no self, no cls → pure utility logic
#                    use when method logically belongs to class
#                    but doesnt need object or class data
#                    like validators, converters, helpers