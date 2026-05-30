# ==============================================================================
# PYTHON ARITHMETIC GOTCHAS, TRICKS, AND INTERVIEW TRAPS
# ==============================================================================

# ------------------------------------------------------------------------------
# TRAP 1: The Operator Precedence Trick (PEMDAS / BODMAS)
# ------------------------------------------------------------------------------
# Interviewers love checking if you know that multiplication/division happen 
# before addition/subtraction, and exponentiation happens before multiplication.

result1 = 2 + 3 * 4     # Trap: Many think (2+3)*4 = 20. 
# Real Math: 2 + (3 * 4) = 14
print("Trap 1a:", result1)  # Output: 14

result2 = 2 ** 3 * 2    # Trap: Exponentiation (**) has higher priority than (*)
# Real Math: (2 ** 3) * 2 = 8 * 2 = 16
print("Trap 1b:", result2)  # Output: 16


# ------------------------------------------------------------------------------
# TRAP 2: Exponentiation Associativity (Right-to-Left!)
# ------------------------------------------------------------------------------
# Most operators evaluate left-to-right. Exponentiation (**) goes RIGHT-TO-LEFT.

result3 = 2 ** 3 ** 2  
# Trap: Many read left-to-right: (2 ** 3) ** 2 = 8 ** 2 = 64
# Real Math: 2 ** (3 ** 2) = 2 ** 9 = 512
print("Trap 2:", result3)  # Output: 512


# ------------------------------------------------------------------------------
# TRAP 3: Floor Division (//) with Negative Numbers
# ------------------------------------------------------------------------------
# Floor division rounds down toward negative infinity, NOT toward zero.

print("Trap 3a:", 5 // 2)    # Output: 2  (2.5 rounds down to 2)
print("Trap 3b:", -5 // 2)   # Output: -3 (-2.5 rounds DOWN to -3, not -2!)


# ------------------------------------------------------------------------------
# TRAP 4: The Modulo (%) Operator with Negative Numbers
# ------------------------------------------------------------------------------
# Formula used by Python: a % b = a - (a // b) * b
# Because floor division goes downward, modulo with negative numbers is tricky.
# In Python, the modulo operator (%) always returns a result with the same sign as the divisor.

print("Trap 4a:", 5 % 2)     # 5 - (2 * 2) = 1
print("Trap 4b:", -5 % 2)    # -5 - (-5 // 2) * 2 -> -5 - (-3 * 2) -> -5 - (-6) = 1
print("Trap 4c:", 5 % -2)    # 5 - (5 // -2) * -2 -> 5 - (-3 * -2) -> 5 - 6 = -1


# ------------------------------------------------------------------------------
# TRAP 5: Floating Point Imprecision (The Famous 0.1 + 0.2 Bug)
# ------------------------------------------------------------------------------
# Computers store floating-point numbers in binary, which cannot perfectly 
# represent certain decimals like 0.1 or 0.2.

print("Trap 5a:", 0.1 + 0.2)  # Output: 0.30000000000000004
print("Trap 5b:", 0.1 + 0.2 == 0.3)  # Output: False (Classic exam true/false trap!)

# How to fix it in real code: Use math.isclose() or the Decimal module.


# ------------------------------------------------------------------------------
# TRAP 6: String Concatenation vs Multiplication Errors
# ------------------------------------------------------------------------------
# Python supports string multiplication, but adding strings and numbers crashes.

# print("Python" + 3)   # CRASHES: TypeError: can only concatenate str to str
print("Trap 6:", "Python" * 3)  # Output: PythonPythonPython


# ------------------------------------------------------------------------------
# TRAP 7: Augmented Assignment Gotcha (+=, *=) with Operations
# ------------------------------------------------------------------------------
# The right side of an augmented assignment is ALWAYS evaluated first, 
# as if it had implicit parentheses around it.

x = 5
x *= 2 + 3  # Trap: Many think (x * 2) + 3 = 10 + 3 = 13
# Real Math: x = x * (2 + 3) -> 5 * 5 = 25
print("Trap 7:", x)  # Output: 25


# ------------------------------------------------------------------------------
# TRAP 8: The ZeroDivisionError
# ------------------------------------------------------------------------------
# You cannot divide by zero in any programming language. 
# This includes true division, floor division, and modulo.

# print(5 / 0)   # ZeroDivisionError
# print(5 // 0)  # ZeroDivisionError
# print(5 % 0)   # ZeroDivisionError



# few more complexes

# ==============================================================================
# PYTHON ARITHMETIC GOTCHAS, TRICKS, AND INTERVIEW TRAPS (PART 2)
# ==============================================================================

# ------------------------------------------------------------------------------
# TRAP 9: Boolean Arithmetic (Booleans are secretly Integers!)
# ------------------------------------------------------------------------------
# In Python, the `bool` class is a subclass of `int`. 
# True is secretly 1, and False is secretly 0.

print("Trap 9a:", True + True)   # Output: 2  (1 + 1)
print("Trap 9b:", True * 5)      # Output: 5  (1 * 5)
print("Trap 9c:", False - 1)     # Output: -1 (0 - 1)

# Combined with lists, this leads to crazy interview questions:
mixed_list = [1, True, 2, False]
print("Trap 9d:", sum(mixed_list))  # Output: 4 (1 + 1 + 2 + 0)


# ------------------------------------------------------------------------------
# TRAP 10: Integer Caching (The 'is' vs '==' Identity Trap)
# ------------------------------------------------------------------------------
# To save memory, Python automatically pre-loads and caches small integers 
# in memory from -5 to 256. 
# '==' checks if values are equal. 'is' checks if they point to the exact same memory.

a = 250
b = 250
print("Trap 10a:", a == b)  # Output: True
print("Trap 10b:", a is b)  # Output: True (Both point to the pre-loaded 250)

x = 300
y = 300
print("Trap 10c:", x == y)  # Output: True (The values are still the same)
print("Trap 10d:", x is y)  # Output: False (300 is outside the cache, so Python created two separate objects!)


# ------------------------------------------------------------------------------
# TRAP 11: No Integer Overflow (Infinite Precision)
# ------------------------------------------------------------------------------
# In languages like C++ or Java, if a number gets too big, it "overflows" and crashes 
# or becomes a negative number. Python automatically allocates more memory for 
# massive numbers so they NEVER overflow.

huge_number = 10**100  # A googol (1 followed by 100 zeros)
print("Trap 11:", huge_number + 1)  # Works flawlessly without a crash!


# ------------------------------------------------------------------------------
# TRAP 12: Float Infinity behavior
# ------------------------------------------------------------------------------
# While integers can grow infinitely, Floats have a distinct representation for 
# infinity (`inf`). Math operations on infinity behave uniquely.

infinity = float('inf')

print("Trap 12a:", infinity + 1000)  # Output: inf
print("Trap 12b:", infinity * 2)     # Output: inf
print("Trap 12c:", infinity - infinity) # Output: nan (Not a Number - classic trap!)


# ------------------------------------------------------------------------------
# TRAP 13: Absolute values and `abs()` performance trick
# ------------------------------------------------------------------------------
# Calculating distance using absolute values is simple, but passing complex numbers
# calculates their magnitude automatically.

print("Trap 13a:", abs(-10))       # Output: 10
print("Trap 13b:", abs(3 + 4j))    # Output: 5.0 (Calculates complex magnitude: sqrt(3^2 + 4^2))