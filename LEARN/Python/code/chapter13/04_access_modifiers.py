# =====================================================
#       ACCESS MODIFIERS IN PYTHON
#       (Guide for Java People)
# =====================================================


# =====================================================
#  JAVA HAS STRICT ACCESS MODIFIERS
#  public, private, protected — enforced by compiler
#
#  PYTHON HAS NO STRICT ACCESS MODIFIERS
#  everything is public by default
#  privacy is achieved by CONVENTIONS using _ and __
# =====================================================


# =====================================================
#  1. PUBLIC — no underscore
#  accessible from anywhere
#  same as Java public
# =====================================================

class Dog:
    def __init__(self, name, age):
        self.name = name        # public — no underscore
        self.age  = age         # public — no underscore

    def bark(self):             # public method
        print(f"{self.name} barks!")


d = Dog("Rex", 3)
print(d.name)       # ✅ accessible outside class
print(d.age)        # ✅ accessible outside class
d.bark()            # ✅ accessible outside class
d.name = "Bruno"    # ✅ can modify directly


# =====================================================
#  2. PROTECTED — single underscore _
#  convention: "dont access outside class or subclass"
#  but Python does NOT enforce it — still accessible
#  same concept as Java protected but NOT enforced
# =====================================================

class Animal:
    def __init__(self, name):
        self._name = name       # protected — single underscore
        self._age  = 0          # protected — single underscore

    def _run(self):             # protected method
        print(f"{self._name} is running")


class Cat(Animal):
    def __init__(self, name, color):
        super().__init__(name)
        self.color = color

    def info(self):
        print(self._name)       # ✅ child class accessing protected — OK
        self._run()             # ✅ child class calling protected method — OK


c = Cat("Kitty", "white")
c.info()                        # Kitty — works fine

# technically still accessible outside — Python doesnt block it
print(c._name)                  # ✅ no error — just a convention warning
c._run()                        # ✅ no error — but you SHOULDNT do this
# single _ means "hey developer, dont touch this outside class/subclass"
# its a gentleman's agreement, not a hard rule


# =====================================================
#  3. PRIVATE — double underscore __
#  name mangling applied — _ClassName__var
#  NOT accessible directly outside class
#  child class also cannot access directly
#  closest to Java private — but still bypassable
# =====================================================

class BankAccount:
    def __init__(self, owner, balance):
        self.owner    = owner           # public
        self._bank    = "SBI"           # protected
        self.__balance = balance        # private — name mangled to
                                        # _BankAccount__balance

    def __validate(self):               # private method
        return self.__balance > 0       # only accessible inside class

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount    # ✅ inside class — allowed
            print(f"Deposited {amount}")

    def get_balance(self):
        return self.__balance           # ✅ inside class — allowed


acc = BankAccount("John", 1000)

print(acc.owner)            # ✅ John       — public
print(acc._bank)            # ✅ SBI        — protected, accessible but shouldn't
# print(acc.__balance)      # ❌ AttributeError — private, blocked
# print(acc.__validate())   # ❌ AttributeError — private method, blocked
print(acc.get_balance())    # ✅ 1000       — via public method
acc.deposit(500)            # ✅ Deposited 500

# BUT — can still access via mangled name (Python's backdoor)
print(acc._BankAccount__balance)   # ✅ 1500 — bypassed! not recommended


# =====================================================
#  PRIVATE IN CHILD CLASS — cannot access parent private
#  same as Java
# =====================================================

class SavingsAccount(BankAccount):
    def __init__(self, owner, balance, interest):
        super().__init__(owner, balance)
        self.interest = interest

    def show(self):
        print(self.owner)           # ✅ public — accessible
        print(self._bank)           # ✅ protected — accessible in child
        # print(self.__balance)     # ❌ AttributeError — private, blocked
                                    # same as Java — child cant access parent private
        print(self.get_balance())   # ✅ via public method — correct way


s = SavingsAccount("John", 2000, 5)
s.show()


# =====================================================
#  PYTHON VS JAVA COMPARISON
# =====================================================

# JAVA                          PYTHON
# ----                          ------
# public int name               self.name       — no underscore
# protected int name            self._name      — single underscore
# private int name              self.__name     — double underscore
# enforced by compiler          convention only (except __ name mangling)
# child cant access private     same ✅
# truly private                 not truly private — backdoor via _Class__var


# =====================================================
#  FULL CLASS SHOWING ALL THREE TOGETHER
# =====================================================

class Employee:
    company = "TechCorp"            # public class variable

    def __init__(self, name, salary, ssn):
        self.name      = name       # public   — accessible anywhere
        self._salary   = salary     # protected — accessible in class/subclass
        self.__ssn     = ssn        # private   — accessible only in this class

    def get_ssn(self):              # public method to access private
        return self.__ssn

    def _calculate_tax(self):       # protected method
        return self._salary * 0.2

    def __encrypt(self):            # private method
        return f"***{self.__ssn[-4:]}"

    def info(self):
        print(f"Name   : {self.name}")
        print(f"Salary : {self._salary}")
        print(f"SSN    : {self.__encrypt()}")   # private method inside class ✅
        print(f"Tax    : {self._calculate_tax()}")


class Manager(Employee):
    def __init__(self, name, salary, ssn, department):
        super().__init__(name, salary, ssn)
        self.department = department

    def manager_info(self):
        print(self.name)            # ✅ public
        print(self._salary)         # ✅ protected — child can access
        print(self._calculate_tax()) # ✅ protected method — child can access
        # print(self.__ssn)         # ❌ private — child cannot access
        print(self.get_ssn())       # ✅ via public method — correct way


print("---------- Employee ----------")
e = Employee("John", 50000, "123-45-6789")
e.info()

print("---------- Manager ----------")
m = Manager("Alice", 80000, "987-65-4321", "Engineering")
m.manager_info()


# =====================================================
#  SUMMARY
# =====================================================

# self.name    → PUBLIC    → anywhere ✅
# self._name   → PROTECTED → class + subclass (convention only)
# self.__name  → PRIVATE   → same class only (name mangling enforced)
#
# KEY DIFFERENCE FROM JAVA:
# Python does not have a compiler enforcing access
# _ is just a convention — "please dont touch"
# __ is name mangled — harder to access but not impossible
# true encapsulation in Python relies on developer discipline