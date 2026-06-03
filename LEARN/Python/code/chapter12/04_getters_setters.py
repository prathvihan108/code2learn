# Why Do We Need Them — The Problem First

class BankAccount:
    def __init__(self, balance):
        self.balance = balance    # public — no protection


acc = BankAccount(1000)
acc.balance = -5000              # ❌ no validation, anyone can set garbage
acc.balance = "hello"            # ❌ wrong type, no one stops it
print(acc.balance)               # hello — data is corrupted!

# Solution — Private variable + Getter + Setter

class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # private — hidden from outside


    # GETTER — reads the value
    # just returns the private variable
    @property
    def balance(self):
        return self.__balance


    # SETTER — controls what gets stored
    # validates before storing
    @balance.setter
    def balance(self, value):
        if type(value) != int:
            print("Balance must be a number!")
            return
        if value < 0:
            print("Balance cannot be negative!")
            return
        self.__balance = value    # only stores if valid


acc = BankAccount(1000)

# looks like direct access — but actually calls getter/setter!
print(acc.balance)     # 1000        — calls getter
acc.balance = 2000     # ✅ valid    — calls setter, stores it
acc.balance = -500     # ❌ invalid  — calls setter, rejected!
acc.balance = "hello"  # ❌ invalid  — calls setter, rejected!
print(acc.balance)     # 2000        — only valid value stored

# What Happens Internally

print(acc.balance)   # looks like attribute access
# Python sees @property and calls balance(self) method internally

acc.balance = 2000   # looks like attribute assignment
# Python sees @balance.setter and calls balance(self, 2000) internally

# Why __balance and not balance

class BankAccount:
    def __init__(self, balance):
        self.balance = balance    # ❌ CRASH — infinite recursion!

    @property
    def balance(self):
        return self.balance       # calls itself forever!
class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # ✅ different name — no conflict

    @property
    def balance(self):
        return self.__balance     # returns __balance, not itself
# balance and __balance are different variables — no conflict, no recursion.
# Read Only — Getter Without Setter
# 
class Circle:
    def __init__(self, radius):
        self.__radius = radius

    @property
    def radius(self):
        return self.__radius      # can read

    # no setter defined — so its read only!


c = Circle(5)
print(c.radius)    # 5  ✅
c.radius = 10      # ❌ AttributeError — no setter, cant change!

# Write Only — Setter Without Getter

class User:
    def __init__(self):
        self.__password = None

    @property
    def password(self):
        print("Password is not readable!")   # block reading
        return None

    @password.setter
    def password(self, value):
        if len(value) < 6:
            print("Password too short!")
            return
        self.__password = value    # can write, cant read back


u = User()
u.password = "abc"         # Password too short!
u.password = "secure123"   # ✅ stored
print(u.password)          # Password is not readable!

# Root idea: Getters and setters give you a security gate between outside code and your private data — you control exactly what goes in and what comes out.
