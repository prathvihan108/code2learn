# isinstance(variable, type)
# isinstance() is a built-in function in Python.
x = 5
y = 5.0

print(isinstance(x, int))    # Output: True  (x is structurally an integer)
print(isinstance(y, int))    # Output: False (y is structurally a float)
print(isinstance(y, float))  # Output: True  (y is a float)

# You can also check against multiple types
print(isinstance(y, (int, float))) # Output: True (y is either an int or a float)

#  
#is_integer()is method of float

# float.is_integer()

a = 5.0
b = 5.5

print(a.is_integer())  # Output: True  (5.0 has no fractional part)
print(b.is_integer())  # Output: False (5.5 has a fractional part of 0.5)

# CRITICAL ERROR WARNING:
# You cannot call this directly on an integer type!
# 5.is_integer() will raise a SyntaxError, and x = 5; x.is_integer() raises an AttributeError.