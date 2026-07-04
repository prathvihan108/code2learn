# Bankers rounding(rounds to the nearest EVEN integer)

# Rounding numbers ending in exactly .5 
# Python rounds to the nearest EVEN integer
# rount is inbuilt function in Python that implements this behavior.
print(round(1.5))  # Output: 2  (2 is the nearest even number)
print(round(2.5))  # Output: 2  (2 is the nearest even number)
print(round(3.5))  # Output: 4  (4 is the nearest even number)
print(round(4.5))  # Output: 4  (4 is the nearest even number)

# Standard rounding still applies when it's not exactly halfway
print(round(2.51)) # Output: 3  (Closer to 3 than 2)
print(round(2.49)) # Output: 2  (Closer to 2 than 3)

## floor and ceil functions in Python are imported from the math module.
import math

# math.ceil() rounds UP to the nearest integer
ceil_result = math.ceil(0.5)
print(ceil_result)  # Output: 1

# math.floor() rounds DOWN to the nearest integer
floor_result = math.floor(0.5)
print(floor_result) # Output: 0


# --- Additional examples with negative numbers to show the direction ---

# Rounding UP towards positive infinity
print(math.ceil(-0.5))   # Output: 0  (since 0 is greater than -0.5)

# Rounding DOWN towards negative infinity
print(math.floor(-0.5))  # Output: -1 (since -1 is smaller than -0.5)