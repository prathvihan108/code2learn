# =====================================================
#       CLASS METHODS IN PYTHON
#       (Guide for Java People)
# =====================================================


# =====================================================
#  QUICK RECAP — 3 TYPES OF METHODS
# =====================================================

class Demo:
    class_var = "I am class variable"

    def __init__(self):
        self.instance_var = "I am instance variable"

    def instance_method(self):       # gets self  — access object data
        print(self.instance_var)

    @classmethod
    def class_method(cls):           # gets cls   — access class data
        print(cls.class_var)

    @staticmethod
    def static_method():             # gets nothing — no access
        print("pure utility")


# =====================================================
#  WHAT IS A CLASS METHOD
#  a method that receives the CLASS itself
#  as the first argument (cls) instead of object (self)
#  it works on CLASS LEVEL data — not object level
# =====================================================

class Dog:
    # CLASS VARIABLE — shared by ALL objects
    species  = "Canine"
    count    = 0              # tracks how many dogs created

    def __init__(self, name):
        self.name = Dog.count
        Dog.count += 1        # increment every time object created

    # CLASS METHOD — works on class data
    @classmethod
    def get_species(cls):
        print(f"Species: {cls.species}")   # cls.species = Dog.species

    @classmethod
    def get_count(cls):
        print(f"Total dogs created: {cls.count}")

    @classmethod
    def change_species(cls, new_species):
        cls.species = new_species          # changes for ALL objects!


d1 = Dog("Rex")
d2 = Dog("Bruno")
d3 = Dog("Max")

Dog.get_species()     # Species: Canine
Dog.get_count()       # Total dogs created: 3

Dog.change_species("K9")
Dog.get_species()     # Species: K9  — changed for ALL


# =====================================================
#  cls vs self — the KEY difference
# =====================================================

class Animal:
    category = "Mammal"

    def __init__(self, name):
        self.name = name

    def instance_method(self):
        print(type(self))         # <class '__main__.Animal'>
        print(self)               # the OBJECT itself
        print(self.name)          # ✅ access object data
        print(self.category)      # ✅ can also access class data via self

    @classmethod
    def class_method(cls):
        print(cls)                # <class '__main__.Animal'>  — the CLASS itself
        # print(cls.name)         # ❌ name is instance var — not on class
        print(cls.category)       # ✅ access class data via cls


a = Animal("Rex")
a.instance_method()     # self  = the object a
Animal.class_method()   # cls   = the class Animal


# =====================================================
#  MOST IMPORTANT USE — ALTERNATE CONSTRUCTORS
#  this is the PRIMARY reason classmethod exists
#  Java people — think of it as constructor overloading
# =====================================================

class Person:
    def __init__(self, name, age, email):
        self.name  = name
        self.age   = age
        self.email = email

    # ALTERNATE CONSTRUCTOR 1
    # create Person from a string "John-25-john@gmail.com"
    @classmethod
    def from_string(cls, string):
        name, age, email = string.split("-")
        return cls(name, int(age), email)  # cls() = Person() = calls __init__

    # ALTERNATE CONSTRUCTOR 2
    # create Person from a dictionary
    @classmethod
    def from_dict(cls, data):
        return cls(
            data["name"],
            data["age"],
            data["email"]
        )

    # ALTERNATE CONSTRUCTOR 3
    # create a guest Person with defaults
    @classmethod
    def guest(cls):
        return cls("Guest", 0, "guest@example.com")

    # ALTERNATE CONSTRUCTOR 4
    # create from just name — fill rest with defaults
    @classmethod
    def from_name(cls, name):
        return cls(name, 0, f"{name.lower()}@example.com")

    def info(self):
        print(f"Name: {self.name}, Age: {self.age}, Email: {self.email}")


# main constructor
p1 = Person("John", 25, "john@gmail.com")
p1.info()       # Name: John, Age: 25, Email: john@gmail.com

# alternate constructors
p2 = Person.from_string("Alice-30-alice@gmail.com")
p2.info()       # Name: Alice, Age: 30, Email: alice@gmail.com

p3 = Person.from_dict({"name": "Bob", "age": 22, "email": "bob@gmail.com"})
p3.info()       # Name: Bob, Age: 22, Email: bob@gmail.com

p4 = Person.guest()
p4.info()       # Name: Guest, Age: 0, Email: guest@example.com

p5 = Person.from_name("Charlie")
p5.info()       # Name: Charlie, Age: 0, Email: charlie@example.com


# =====================================================
#  CLASS METHOD IN INHERITANCE — the SUPERPOWER
#  cls knows WHICH class called it
#  this is what makes classmethod special over staticmethod
# =====================================================

class Animal:
    category = "Animal"

    def __init__(self, name):
        self.name = name

    @classmethod
    def create(cls, name):
        print(f"cls is: {cls}")        # shows which class called it
        return cls(name)               # creates instance of THAT class
                                       # not hardcoded to Animal!

    @classmethod
    def describe(cls):
        print(f"I am {cls.__name__} and category is {cls.category}")


class Dog(Animal):
    category = "Canine"               # overrides parent class variable


class Cat(Animal):
    category = "Feline"


# cls automatically knows which class is calling
a = Animal.create("Generic")   # cls = Animal — creates Animal object
d = Dog.create("Rex")          # cls = Dog    — creates Dog object ✅
c = Cat.create("Kitty")        # cls = Cat    — creates Cat object ✅

print(type(a))   # <class 'Animal'>
print(type(d))   # <class 'Dog'>    — NOT Animal! cls was Dog
print(type(c))   # <class 'Cat'>    — NOT Animal! cls was Cat

Animal.describe()   # I am Animal and category is Animal
Dog.describe()      # I am Dog    and category is Canine
Cat.describe()      # I am Cat    and category is Feline

# if this were a static method — it would be hardcoded to Animal
# classmethod is dynamic — cls changes based on WHO calls it
# THIS is the main difference between classmethod and staticmethod


# =====================================================
#  CLASS METHOD TO MODIFY CLASS VARIABLE
#  affects ALL objects since class variable is shared
# =====================================================

class Employee:
    company  = "TechCorp"
    headcount = 0

    def __init__(self, name):
        self.name = name
        Employee.headcount += 1

    @classmethod
    def change_company(cls, name):
        cls.company = name             # changes for ALL employees

    @classmethod
    def get_headcount(cls):
        return cls.headcount


e1 = Employee("John")
e2 = Employee("Alice")
e3 = Employee("Bob")

print(Employee.get_headcount())    # 3
print(e1.company)                  # TechCorp
print(e2.company)                  # TechCorp

Employee.change_company("NewCorp")

print(e1.company)                  # NewCorp — changed for ALL ✅
print(e2.company)                  # NewCorp — changed for ALL ✅
print(e3.company)                  # NewCorp — changed for ALL ✅


# =====================================================
#  JAVA VS PYTHON CLASS METHOD
# =====================================================

# JAVA has no direct equivalent of @classmethod
# closest thing in Java is static method
# BUT Java static cant be overridden in child classes
# Python @classmethod CAN be overridden and cls changes

# JAVA static:
# static void describe() {
#     System.out.println("Animal");   // hardcoded
# }

# PYTHON classmethod:
# @classmethod
# def describe(cls):
#     print(cls.__name__)             // dynamic — knows which class!


# =====================================================
#  WHEN TO USE WHAT — FINAL RULES
# =====================================================

# INSTANCE METHOD  → use when you need object data (self.name etc)
#                    most common — regular behavior of object

# CLASS METHOD     → use when you need class data (cls.count etc)
#                    OR as alternate constructors
#                    OR when behavior changes per subclass

# STATIC METHOD    → use when you need neither object nor class data
#                    pure utility/helper logic that belongs in class


# =====================================================
#  SUMMARY TABLE
# =====================================================

#                  instance_method   class_method    static_method
# decorator        none              @classmethod    @staticmethod
# first param      self (object)     cls (class)     nothing
# access object    ✅ yes            ❌ no           ❌ no
# access class     ✅ via self       ✅ via cls      ❌ no
# call via object  ✅ d.method()     ✅ d.method()   ✅ d.method()
# call via class   ❌ no             ✅ Dog.method()  ✅ Dog.method()
# inheritance cls  ❌ fixed self     ✅ cls changes  ❌ no cls
# use case         object behavior   alt constructor  utility/helper