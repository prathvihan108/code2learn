# ============================================
#           CLASS AND OBJECT IN PYTHON
# ============================================

# CLASS — blueprint/template to create objects
class Dog:

    # CLASS VARIABLE — shared by ALL objects of this class
    species = "Canine"

    # CONSTRUCTOR — runs automatically when object is created
    def __init__(self, name, breed, age):
        # INSTANCE VARIABLES — unique to each object
        self.name = name
        self.breed = breed
        self.age = age

    # INSTANCE METHOD — behavior of the object
    def bark(self):
        print(f"{self.name} says: Woof!")

    def info(self):
        print(f"Name: {self.name}, Breed: {self.breed}, Age: {self.age}")

    # CLASS METHOD — works on class itself, not object
    @classmethod
    def get_species(cls):
        print(f"Species: {cls.species}")

    # STATIC METHOD — no access to class or object, just utility
    @staticmethod
    def is_adult(age):
        return age >= 2


# ============================================
#           CREATING OBJECTS
# ============================================

# OBJECT — actual instance created from the class blueprint
d1 = Dog("Rex", "Labrador", 3)     # object 1
d2 = Dog("Bruno", "Pug", 1)        # object 2

# each object has its OWN instance variables
print(d1.name)    # Rex
print(d2.name)    # Bruno


# ============================================
#           ACCESSING ATTRIBUTES
# ============================================

# access instance variable
print(d1.breed)   # Labrador

# access class variable — same for all objects
print(d1.species)         # Canine
print(d2.species)         # Canine
print(Dog.species)        # Canine — can access via class directly too


# ============================================
#           CALLING METHODS
# ============================================

d1.bark()         # Rex says: Woof!
d1.info()         # Name: Rex, Breed: Labrador, Age: 3

Dog.get_species()           # Species: Canine  — class method
print(Dog.is_adult(3))      # True             — static method
print(Dog.is_adult(1))      # False


# ============================================
#           MODIFYING ATTRIBUTES
# ============================================

d1.name = "Rocky"       # change instance variable
print(d1.name)          # Rocky

Dog.species = "K9"      # change class variable
print(d1.species)       # K9 — affects ALL objects
print(d2.species)       # K9


# ============================================
#           EACH OBJECT IS INDEPENDENT
# ============================================

print(d1.name)    # Rocky  — d1's own data
print(d2.name)    # Bruno  — d2's own data, unaffected


# ============================================
#           CHECKING OBJECT INFO
# ============================================

print(type(d1))             # <class '__main__.Dog'>
print(isinstance(d1, Dog))  # True
print(d1.__dict__)          # {'name': 'Rocky', 'breed': 'Labrador', 'age': 3}