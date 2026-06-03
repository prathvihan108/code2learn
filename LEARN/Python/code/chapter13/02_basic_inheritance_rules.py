# =====================================================
#     INHERITANCE CONSTRUCTOR RULES & CONFUSIONS
# =====================================================


# =====================================================
#  RULE 1 — if child has NO __init__
#  parent __init__ is AUTO called
# =====================================================

class Animal:
    def __init__(self, name):
        self.name = name
        print(f"Animal __init__ called — name set to {name}")

class Dog(Animal):
    pass                         # no __init__ at all

d = Dog("Rex")                   # ✅ Animal __init__ auto called
print(d.name)                    # Rex ✅


# =====================================================
#  RULE 2 — if child HAS its own __init__
#  parent __init__ is NOT auto called
#  YOU must call it manually with super().__init__()
# =====================================================

class Cat(Animal):
    def __init__(self, name, color):
        # parent __init__ NOT called automatically here!
        self.color = color

c = Cat("Kitty", "white")
print(c.color)       # white ✅
# print(c.name)      # ❌ AttributeError — name never set!
                     # because Animal __init__ never ran


# =====================================================
#  RULE 3 — calling super().__init__() fixes it
#  MUST be called FIRST before child sets its own stuff
# =====================================================

class Rabbit(Animal):
    def __init__(self, name, color):
        super().__init__(name)   # ✅ call parent first
        self.color = color       # then set child attributes

r = Rabbit("Bunny", "brown")
print(r.name)        # Bunny ✅  — parent set it
print(r.color)       # brown ✅  — child set it


# =====================================================
#  WHAT HAPPENS IF YOU CALL super().__init__() LAST
#  not wrong but can cause bugs if parent
#  overwrites child attributes
# =====================================================

class Fish(Animal):
    def __init__(self, name, color):
        self.name = "fish"       # child sets name first
        self.color = color
        super().__init__(name)   # parent runs AFTER and overwrites name!

f = Fish("Nemo", "orange")
print(f.name)        # Nemo  — parent overwrote childs self.name = "fish"
print(f.color)       # orange
                     # no bug here but can cause confusion
                     # always call super().__init__() FIRST — safe habit


# =====================================================
#  RULE 4 — MULTI LEVEL INHERITANCE
#  does each level need to call super().__init__()?
# =====================================================

class LivingThing:
    def __init__(self, alive):
        self.alive = alive
        print(f"LivingThing __init__ called")

class Animal2(LivingThing):
    def __init__(self, name, alive):
        super().__init__(alive)  # calls LivingThing __init__
        self.name = name
        print(f"Animal2 __init__ called")

class Dog2(Animal2):
    def __init__(self, name, alive, breed):
        super().__init__(name, alive)  # calls Animal2 __init__
                                       # which internally calls LivingThing
        self.breed = breed
        print(f"Dog2 __init__ called")

d2 = Dog2("Rex", True, "Labrador")
# LivingThing __init__ called   — chain goes all the way up!
# Animal2 __init__ called
# Dog2 __init__ called

print(d2.alive)      # True     — from LivingThing ✅
print(d2.name)       # Rex      — from Animal2 ✅
print(d2.breed)      # Labrador — from Dog2 ✅

# KEY POINT — you dont call ALL parent constructors manually
# super().__init__() in each level chains them automatically
# Dog2 → calls Animal2 → Animal2 calls LivingThing
# one super().__init__() per level is enough!


# =====================================================
#  RULE 5 — MULTIPLE INHERITANCE
#  two parents — do you call both constructors?
# =====================================================

class Flyable:
    def __init__(self, speed):
        self.speed = speed
        print(f"Flyable __init__ called")

class Swimmable:
    def __init__(self, depth):
        self.depth = depth
        print(f"Swimmable __init__ called")

class Duck(Flyable, Swimmable):
    def __init__(self, speed, depth):
        Flyable.__init__(self, speed)    # call first parent explicitly
        Swimmable.__init__(self, depth)  # call second parent explicitly
        # NOTE — with multiple parents super().__init__() only
        # calls the FIRST parent (Flyable) not both!
        # so call each parent constructor explicitly by name

duck = Duck(100, 50)
# Flyable __init__ called
# Swimmable __init__ called

print(duck.speed)    # 100 ✅  — from Flyable
print(duck.depth)    # 50  ✅  — from Swimmable


# =====================================================
#  RULE 6 — WHAT IF PARENT HAS NO __init__
#  do you still need to call super().__init__()?
# =====================================================

class Base:
    pass                         # no __init__ defined

class Child(Base):
    def __init__(self, name):
        super().__init__()       # fine to call — just calls object.__init__()
        self.name = name         # no harm, no error

# OR you can just skip it — both work
class Child2(Base):
    def __init__(self, name):
        self.name = name         # ✅ also fine — no parent __init__ to call

c = Child("John")
print(c.name)        # John ✅


# =====================================================
#  SUMMARY OF ALL RULES
# =====================================================

# RULE 1 — child has no __init__     → parent __init__ AUTO called ✅
# RULE 2 — child has its own __init__ → parent __init__ NOT auto called ❌
# RULE 3 — always call super().__init__() FIRST in child __init__
# RULE 4 — multi level: one super().__init__() per level chains all the way up
# RULE 5 — multiple parents: call each parent __init__ explicitly by name
# RULE 6 — parent has no __init__: safe to call or skip super().__init__()