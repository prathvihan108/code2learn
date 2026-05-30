
# 2. The Golden Rule of input()
# Everything is a String.

# No matter what the user types (a number, a decimal, or text), Python treats it as a string (str). If you need to do math with a user's input, you must use type casting.

# --- Basic Usage ---
name = input("Enter your name: ")
print("Hello, " + name + "!")

# --- The Common Error (Math with input) ---
age = input("How old are you? ")
# print(age + 5)  <-- This would CRASH because age is a string "25"

# --- The Correct Way (With Type Casting) ---
age_int = int(input("How old are you? ")) # Convert string to integer immediately
print("In five years, you will be", age_int + 5)

# --- Taking Multiple Inputs ---
# Using .split() to get two values at once
first, last = input("Enter first and last name: ").split()
print(f"Initials: {first[0]}.{last[0]}.")