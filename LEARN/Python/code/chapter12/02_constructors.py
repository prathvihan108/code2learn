# ============================================
#        CONSTRUCTOR AND SELF IN PYTHON
# ============================================

# CONSTRUCTOR — special method that runs AUTOMATICALLY
# when an object is created
# its job is to SET UP the object with initial values

class Dog:

    # __init__ IS the constructor
    # 'self' is the FIRST parameter — always!
    # 'self' refers to the object being created RIGHT NOW
    def __init__(self, name, age):

        # self.name means — "THIS object's name"
        # without self, name is just a local variable
        # that dies when __init__ finishes
        self.name = name    # stored ON the object ✅
        self.age = age      # stored ON the object ✅
        local_var = "test"  # NOT stored on object ❌ dies here


# ============================================
#        WHAT HAPPENS WHEN YOU CREATE OBJECT
# ============================================

# Step 1 — Python creates a blank object
# Step 2 — Python calls __init__(that_object, "Rex", 3)
# Step 3 — inside __init__, self = that blank object
# Step 4 — self.name = "Rex" stored on that object
# Step 5 — object is ready, assigned to d1

d1 = Dog("Rex", 3)
d2 = Dog("Bruno", 1)

# d1 and d2 are DIFFERENT objects
# self pointed to d1 when d1 was created
# self pointed to d2 when d2 was created
# that's how each object got its OWN data

print(d1.name)   # Rex
print(d2.name)   # Bruno


# ============================================
#        SELF IN INSTANCE METHODS
# ============================================

class Cat:
    def __init__(self, name, color):
        self.name = name
        self.color = color

    # self is NECESSARY here
    # because we need to access THIS object's data
    def info(self):
        print(f"{self.name} is {self.color}")   # uses self to get data

    # self is NECESSARY here too
    # modifying the object's own data
    def birthday(self):
        self.age += 1    # self needed to modify object's variable

    # WITHOUT self — python throws error
    # because python auto passes the object as first argument
    # if no parameter to receive it — crash!
    def broken_method():      # ❌ no self
        print("i will crash")


c1 = Cat("Whiskers", "white")
c1.info()       # Whiskers is white

# what python does behind the scenes:
c1.info()           # what YOU write
Cat.info(c1)        # what PYTHON actually does — passes c1 as self


# ============================================
#        WHEN IS SELF NOT NEEDED
# ============================================

class MathHelper:

    # STATIC METHOD — doesnt access object OR class data
    # no self needed — its just a utility function inside class
    @staticmethod
    def add(a, b):
        return a + b       # no self, no object data needed

    # CLASS METHOD — accesses CLASS data, not object data
    # uses cls instead of self
    @classmethod
    def description(cls):
        print(f"I am {cls.__name__} class")   # cls = the class itself


MathHelper.add(2, 3)          # 5   — no object needed
MathHelper.description()      # I am MathHelper class


# ============================================
#        SELF IS JUST A CONVENTION
# ============================================

# self is NOT a keyword — just a name convention
# you CAN use any name — but NEVER do this in real code!

class Dog:
    def __init__(anything, name):    # 'anything' works but BAD practice
        anything.name = name

    def bark(me):                    # 'me' works but BAD practice
        print(me.name + " barks")

d = Dog("Rex")
d.bark()    # Rex barks — works but confusing!

# ALWAYS use self — its the universal convention


# ============================================
#        NO CONSTRUCTOR — DEFAULT BEHAVIOR
# ============================================

class Bird:
    pass   # no constructor defined

b = Bird()   # ✅ no error — python provides empty constructor
b.name = "Tweety"   # can still add attributes after creation
print(b.name)       # Tweety


# ============================================
#        CONSTRUCTOR WITH DEFAULT VALUES
# ============================================

class Fish:
    def __init__(self, name, color="gold"):   # color has default value
        self.name = name
        self.color = color

f1 = Fish("Nemo", "orange")   # both provided
f2 = Fish("Dory")             # color not given — uses default "gold"

print(f1.color)   # orange
print(f2.color)   # gold