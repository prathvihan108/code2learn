# In Python, a String is a sequence of characters wrapped in quotes. Because strings are "objects," they come with a massive toolbox of built-in operations.

# 1. Basic Anatomy & Access
# Strings are ordered sequences, meaning every character has a specific number (index) starting from 0.

# Indexing: Accessing a single character. name[0]

# Slicing: Grabbing a "chunk" of a string. name[start:stop:step]

# Immutability: You cannot change a string once it's created. To "change" it, you must create a new one.



# 2. Common String Operations
# A. Manipulation (Changing the look)
# These methods return a new string; they don't modify the original.

# .upper() / .lower(): Changes case.

# .strip(): Removes whitespace from the start and end.

# .replace("old", "new"): Swaps characters or words.

# .split(): Turns a string into a List (default is by space).

# "".join(list): The opposite of split; joins a list into a string.


# B. Searching & Counting
# .find("x"): Returns the index of the first "x" found (returns -1 if not found).

# .count("x"): Tells you how many times "x" appears.

# "x" in my_string: A fast way to get a True/False if a character exists.

# C. Validation (The "Is" family)
# These always return a Boolean (True/False).

# .isdigit(): Is the string only numbers?

# .isalpha(): Is the string only letters?

# .isspace(): Is the string only whitespace?

# 4. Common Mistakes & Confusion
# Off-by-one Error: Remember that my_string[0:3] gives you characters at index 0, 1, and 2. It excludes the "stop" index.

# Concatenation Trap: You cannot do "Number: " + 10. You must cast it: "Number: " + str(10).

# The "Empty" String: "" is a valid string with a length of 0. It is considered False in logic.

text = "  python is fun  "

# 1. Clean and Capitalize
clean_text = text.strip().capitalize() # "Python is fun"

# 2. Slicing (The first 6 chars)
print(clean_text[:6]) # "Python"

# 3. Step Slicing (Reverse a string)
reversed_text = clean_text[::-1] # "nuf si nohtyP"

# 4. Splitting into a list
words = clean_text.split() # ["Python", "is", "fun"]

# notes
# In many other languages (like JavaScript), you use a method like .slice(). But in Python, we use the square brackets [].

# The reason comes down to a core Python philosophy: Consistency across data types.

# 1. The "Subscript" Operator
# In Python, [] is known as the indexing or subscript operator. It isn't just for strings; it is the universal way to access "parts" of a collection.

# By using [] instead of a function like .slice(), Python ensures that the syntax is identical whether you are working with:

# Strings: "Python"[0:2]

# Lists: [10, 20, 30][0:2]

# Tuples: (1, 2, 3)[0:2]