# ==============================================================================
# THE MASTER BLUEPRINT OF ALL PYTHON 'FOR' LOOP VARIATIONS
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE STANDARD ITERABLE LOOP (Lists, Tuples, Strings, Sets)
# ------------------------------------------------------------------------------
# Directly extracts every item from a collection sequentially from start to finish.

fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print("1a. Item:", fruit)

# You can do the exact same thing with text characters (Strings)
for letter in "Py":
    print("1b. Letter:", letter)


# ------------------------------------------------------------------------------
# 2. THE INDEXED / COUNTER LOOP (Using range())
# ------------------------------------------------------------------------------
# Used when you don't just care about the items, but need to run a loop a specific
# number of times, or need numerical indices.
# Syntax: range(start, stop, step) -> Note: 'stop' is exclusive!

print("\n--- 2. Range Variations ---")
for i in range(3): 
    print(f"Count from 0 to 2: {i}") # Output: 0, 1, 2

for i in range(5, 11, 2): 
    print(f"Skip counting: {i}")    # Output: 5, 7, 9

for i in range(3, 0, -1): 
    print(f"Countdown: {i}")        # Output: 3, 2, 1


# ------------------------------------------------------------------------------
# 3. THE TWO-IN-ONE TRACKER (Using enumerate())
# ------------------------------------------------------------------------------
# INTERVIEW FAVORITE: Beginners use `for i in range(len(list))` to track indices.
# Professionals use enumerate() because it cleanly returns BOTH the index 
# and the item simultaneously using tuple unpacking.

names = ["Alice", "Bob", "Charlie"]
print("\n--- 3. Enumerate Loop ---")

for index, name in enumerate(names):
    print(f"Index {index} belongs to: {name}")


# ------------------------------------------------------------------------------
# 4. PARALLEL ITERATION (Using zip())
# ------------------------------------------------------------------------------
# Used to loop through two or more collections of equal length at the same time.
# Trap: zip() stops at the shortest list unless you use 'itertools.zip_longest()'.

students = ["Prathviraj", "Akshat", "Harshith"]
scores = [95, 88, 92]
print("\n--- 4. Zip Loop ---")

for student, score in zip(students, scores):
    print(f"{student} scored {score}/100")


# ------------------------------------------------------------------------------
# 5. DICTIONARY KEY-VALUE LOOPING
# ------------------------------------------------------------------------------
# When looping over a dictionary, you have three highly optimized options depending 
# on what data you actually need to read.

user_data = {"username": "prathvi09", "role": "Admin"}
print("\n--- 5. Dictionary Loops ---")

# Option A: Looping over keys only (Default behavior)
for key in user_data:
    print("Key:", key)

# Option B: Looping over values only
for value in user_data.values():
    print("Value:", value)

# Option C: Looping over BOTH keys and values simultaneously
for key, value in user_data.items():
    print(f"Pair -> {key}: {value}")


# ------------------------------------------------------------------------------
# 6. NESTED FOR LOOPS (Matrix / Grid Processing)
# ------------------------------------------------------------------------------
# A loop running inside another loop. 
# Warning: Nested loops inherently jump your time complexity to $O(N^2)$.

matrix = [
    [1, 2],
    [3, 4]
]
print("\n--- 6. Nested Loop ---")

for row in matrix:          # Outer loop processes each row
    for element in row:     # Inner loop processes items within that row
        print(f"Matrix item: {element}")


# ------------------------------------------------------------------------------
# 7. THE COMPACT LIST COMPREHENSION LOOP
# ------------------------------------------------------------------------------
# A highly optimized, single-line loop syntax designed to create new lists 
# out of old iterables instantly.

numbers = [1, 2, 3, 4]
squares = [num ** 2 for num in numbers] 
print("\n7. List Comprehension:", squares) # Output: [1, 4, 9, 16]


# ------------------------------------------------------------------------------
# 8. THE EXAM TRAP: The 'for-else' Clause
# ------------------------------------------------------------------------------
# A syntax unique to Python. The 'else' block runs ONLY if the for loop finishes 
# completely without running into a 'break' statement. 
# Think of it as "No break occurred" logic.

print("\n--- 8. For-Else Logic ---")
for num in [1, 3, 5]:
    if num % 2 == 0:
        print("Found an even number!")
        break
else:
    # This runs because the loop finished naturally without finding an even number.
    print("Loop finished: No even numbers were found in the dataset.")