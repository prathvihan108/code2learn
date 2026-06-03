# ============================================
#         INHERITANCE IN PYTHON
#         (Guide for Java People)
# ============================================


# JAVA  →  class Dog extends Animal
# PYTHON →  class Dog(Animal) — parent goes inside ()

class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def speak(self):
        print(f"{self.name} makes a sound")

    def info(self):
        print(f"Name: {self.name}, Age: {self.age}")


# ============================================
#  BASIC INHERITANCE — child gets all parent
#  attributes and methods automatically
# ============================================

class Dog(Animal):                   # Dog inherits Animal
    def __init__(self, name, age, breed):
        super().__init__(name, age)  # JAVA  → super(name, age)
                                     # PYTHON → super().__init__(name, age)
                                     # always empty () in super
        self.breed = breed           # child's own attribute

    # OVERRIDING — no @Override keyword like java
    # just redefine the same method name
    def speak(self):
        print(f"{self.name} barks!")

    def bark(self):                  # child's own method
        print(f"{self.name} is a {self.breed}")


# ============================================
#  WHAT HAPPENS IF YOU FORGET super().__init__
#  MOST COMMON MISTAKE FOR JAVA PEOPLE
# ============================================

class Cat(Animal):
    def __init__(self, name, age, color):
        # super().__init__(name, age)  ← forgot this!
        self.color = color

    def speak(self):
        print(f"{self.name} meows!")  # ❌ self.name doesn't exist!
                                      # parent __init__ never ran
                                      # so name was never set!


# ============================================
#  WHAT IF CHILD HAS NO __init__ AT ALL
# ============================================

class Bird(Animal):
    pass                             # no __init__ defined

b = Bird("Tweety", 2)               # ✅ parent __init__ auto called
print(b.name)                        # Tweety — inherited ✅
b.speak()                            # Tweety makes a sound ✅


# ============================================
#  CALLING PARENT METHOD FROM CHILD
#  using super()
# ============================================

class Horse(Animal):
    def __init__(self, name, age):
        super().__init__(name, age)

    def speak(self):
        super().speak()              # JAVA  → super.speak()
                                     # PYTHON → super().speak()
        print(f"{self.name} also neighs!")


# ============================================
#  USING THE CLASSES
# ============================================

print("---------- Dog ----------")
d = Dog("Rex", 3, "Labrador")
d.speak()        # Rex barks!        — overridden method
d.info()         # Name: Rex, Age: 3 — inherited from Animal
d.bark()         # Rex is a Labrador — own method

print("---------- Bird ----------")
b = Bird("Tweety", 2)
b.speak()        # Tweety makes a sound — inherited, no override
b.info()         # Name: Tweety, Age: 2

print("---------- Horse ----------")
h = Horse("Spirit", 5)
h.speak()        # Animal sound first, then neighs
                 # Animal sound — from super().speak()
                 # Spirit also neighs!

print("---------- Cat (mistake demo) ----------")
c = Cat("Kitty", 1, "white")
# c.speak()      # ❌ AttributeError — self.name doesnt exist
                 # because super().__init__ was never called


# ============================================
#  CHECKING INHERITANCE
# ============================================

print(isinstance(d, Dog))       # True  — d is a Dog
print(isinstance(d, Animal))    # True  — d is also an Animal
print(issubclass(Dog, Animal))  # True  — Dog is child of Animal
print(issubclass(Bird, Animal)) # True


# ============================================
#  JAVA VS PYTHON QUICK REMINDER
# ============================================

# JAVA                          PYTHON
# ----                          ------
# extends Animal                (Animal)
# super(name)                   super().__init__(name)
# super.speak()                 super().speak()
# @Override needed              just redefine method
# no multiple inheritance       multiple inheritance allowed