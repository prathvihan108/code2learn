# ==============================================================================
# ADVANCED STRING TRAPS & INTERVIEW QUESTIONS
# ==============================================================================

# 1. THE SLICING OUT-OF-BOUNDS TRAP
# ------------------------------------------------------------------------------
# As you know, accessing a single index that doesn't exist crashes your code.
# TRAP: Slicing an out-of-bounds index does NOT crash! It safely returns an empty string.

word = "Python"

# print(word[10])  # ❌ CRASHES! IndexError: string index out of range

print("1a. Out of bounds slice:", word[10:15])  # Output: "" (Empty string!)
print("1b. Partial slice:", word[2:50])          # Output: "thon" (Grabs what it can)


# 2. THE MULTIPLICATION MEMORY TRAP (Shallow vs Deep Copying)
# ------------------------------------------------------------------------------
# Multiplying a string creates a new string sequence. This is safe for strings 
# because they are immutable. 

stars = "*" * 3  # Result: "***"

# INTERVIEW TRAP: Doing this inside a list of lists creates references to the 
# SAME object, leading to unexpected mutation bugs!
bad_matrix = [["-"] * 3] * 3
bad_matrix[0][0] = "X"
print("2a. Unexpected mutation:\n", bad_matrix)
# Output: [['X', '-', '-'], ['X', '-', '-'], ['X', '-', '-']] (All rows changed!)


# 3. STRING TRANSLATION (.maketrans() and .translate())
# ------------------------------------------------------------------------------
# Interview Problem: "Replace multiple specific characters in a single pass 
# (e.g., encryption, or removing vowels)." 
# Using multiple `.replace()` calls is slow and inefficient ($O(N)$ per call). 
# The pro way is using a translation table ($O(N)$ total).

text = "hello world"
# Create a mapping dictionary of characters to replace
vowel_mask = str.maketrans("aeiou", "12345")

encrypted_text = text.translate(vowel_mask)
print("3. Encrypted via translate:", encrypted_text)  # Output: h2ll4 w4rld


# 4. TRICKY SPLITTING BEHAVIOR WITH MAXIMUM SPLITS
# ------------------------------------------------------------------------------
# The `.split()` method accepts an optional second argument called `maxsplit`.

data = "user_name_id_location_ip"
# Split only at the first 2 underscores, leave the rest grouped together
parsed_data = data.split("_", maxsplit=2)

print("4. Maxsplit result:", parsed_data)  
# Output: ['user', 'name', 'id_location_ip']


# 5. STRING REVERSAL METHODS AND COMPLEXITY
# ------------------------------------------------------------------------------
# Interviewers frequently ask you to reverse a string. You should know both ways 
# and their technical trade-offs.

original = "racecar_is_cool"

# Method A: Slicing (Fastest, written in optimized C under the hood)
rev_slice = original[::-1]

# Method B: Looping / Joining (Shows algorithmic understanding)
rev_join = "".join(reversed(original))


# 6. THE ASCII CODE VALUE TRAP (`ord()` and `chr()`)
# ------------------------------------------------------------------------------
# Many string tracking problems require you to sort or manipulate text based on 
# alphabetical numeric positions.

# ord() turns a character into its ASCII integer value
print("6a. ASCII value of 'a':", ord("a"))  # Output: 97
print("6b. ASCII value of 'A':", ord("A"))  # Output: 65

# chr() turns an ASCII integer back into a character string
print("6c. Character at 98:", chr(98))      # Output: b