# =============================================================
#   HIERARCHICAL vs HYBRID INHERITANCE IN PYTHON
# =============================================================


# ─────────────────────────────────────────────────────────────
# HIERARCHICAL INHERITANCE
# One parent class → multiple child classes
# Each child inherits from the SAME single parent
# Structure:
#           Animal
#          /   |   \
#        Dog  Cat  Bird
# ─────────────────────────────────────────────────────────────

class Animal:                         # single parent class
    def __init__(self, name):
        self.name = name

    def eat(self):
        return f"{self.name} is eating"

    def breathe(self):
        return f"{self.name} is breathing"


class Dog(Animal):                    # child 1 — inherits Animal
    def speak(self):
        return f"{self.name} says: Woof!"


class Cat(Animal):                    # child 2 — inherits Animal
    def speak(self):
        return f"{self.name} says: Meow!"


class Bird(Animal):                   # child 3 — inherits Animal
    def speak(self):
        return f"{self.name} says: Tweet!"


# All children share the same parent (Animal)
# but each adds its own unique behaviour

dog  = Dog("Rex")
cat  = Cat("Whiskers")
bird = Bird("Tweety")

print(dog.eat())      # Rex is eating      → inherited from Animal
print(dog.speak())    # Rex says: Woof!    → Dog's own method
print(cat.eat())      # Whiskers is eating → inherited from Animal
print(cat.speak())    # Whiskers says: Meow!
print(bird.breathe()) # Tweety is breathing → inherited from Animal
print(bird.speak())   # Tweety says: Tweet!


# ─────────────────────────────────────────────────────────────
# HYBRID INHERITANCE
# Combination of two or more types of inheritance
# e.g. Hierarchical + Multiple inheritance together
# Structure:
#           Animal
#          /       \
#       Flyable  Swimmable
#          \       /
#            Duck         ← inherits from BOTH (multiple)
# This diamond shape is the classic hybrid pattern
# ─────────────────────────────────────────────────────────────

class Animal:                         # root / grandparent
    def __init__(self, name):
        self.name = name

    def breathe(self):
        return f"{self.name} breathes air"


class Flyable(Animal):                # parent 1 (hierarchical from Animal)
    def fly(self):
        return f"{self.name} is flying"


class Swimmable(Animal):              # parent 2 (hierarchical from Animal)
    def swim(self):
        return f"{self.name} is swimming"


# Duck uses MULTIPLE inheritance → inherits from both Flyable AND Swimmable
# This combination (hierarchical + multiple) is what makes it HYBRID
class Duck(Flyable, Swimmable):
    def quack(self):
        return f"{self.name} says: Quack!"


duck = Duck("Donald")

print(duck.breathe())  # Donald breathes air  → from Animal (via MRO)
print(duck.fly())      # Donald is flying      → from Flyable
print(duck.swim())     # Donald is swimming    → from Swimmable
print(duck.quack())    # Donald says: Quack!   → Duck's own method


# ─────────────────────────────────────────────────────────────
# MRO — Method Resolution Order
# Python uses the C3 Linearization algorithm to decide
# which parent's method to call in case of conflict.
# ─────────────────────────────────────────────────────────────

print(Duck.__mro__)
# (<class 'Duck'>, <class 'Flyable'>, <class 'Swimmable'>,
#  <class 'Animal'>, <class 'object'>)
# Python searches left → right along this chain


# Conflict example: both parents define the SAME method
class Flyable(Animal):
    def move(self):
        return f"{self.name} moves by FLYING"   # Flyable's version


class Swimmable(Animal):
    def move(self):
        return f"{self.name} moves by SWIMMING"  # Swimmable's version


class Duck(Flyable, Swimmable):      # Flyable listed FIRST
    pass


d = Duck("Donald")
print(d.move())
# Donald moves by FLYING   ← Flyable wins because it's listed first
# MRO: Duck → Flyable → Swimmable → Animal


# Swap order to change which wins:
class Duck2(Swimmable, Flyable):     # Swimmable listed FIRST
    pass

d2 = Duck2("Daffy")
print(d2.move())
# Daffy moves by SWIMMING  ← Swimmable wins now


# ─────────────────────────────────────────────────────────────
# QUICK COMPARISON TABLE
# ─────────────────────────────────────────────────────────────
#
#  Feature               Hierarchical          Hybrid
#  ─────────────────────────────────────────────────────────
#  Structure             One parent,           Mix of 2+ types
#                        many children         (hier + multiple, etc.)
#
#  Parents per child     1                     1 or more
#
#  Complexity            Low                   Medium–High
#
#  Diamond problem       No                    Possible — solved by MRO
#
#  Use case              Shared base           Combine unrelated
#                        behaviour             capabilities
#
#  Example               Animal → Dog,         Animal → Flyable,
#                        Cat, Bird             Swimmable → Duck
#
#  Python keyword        class Dog(Animal)     class Duck(Flyable, Swimmable)
# ─────────────────────────────────────────────────────────────