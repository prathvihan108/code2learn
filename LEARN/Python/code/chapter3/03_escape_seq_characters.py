# A. Layout: Newlines and Tabs
# Use these to format how text looks in the console without using multiple print() statements.

# \n creates a line break; \t creates a tab space
print("Shopping List:\n\t- Milk\n\t- Bread\n\t- Eggs")

# Output:
# Shopping List:
# 	- Milk
# 	- Bread
# 	- Eggs



# B. Quotes: Avoiding Syntax Errors
# If your string is wrapped in double quotes, you must escape any double quotes inside it.


# Without the backslash, Python thinks the string ends at "He"
speech = "He said, \"Python is great,\" then left."
print(speech) 

# Same applies to single quotes
contraction = 'It\'s a sunny day.'
print(contraction)

# C. File Paths: The Backslash Problem
# Because \ is the escape character, you have to use two of them to print one.

# One \ tells Python "I'm escaping!" - Two \\ tells Python "I want a slash!"
folder_path = "C:\\Users\\Documents\\Project"
print(folder_path) # Output: C:\Users\Documents\Project

# D. The "Raw String" (The Escape Bypass)
# If you have a lot of backslashes (like a long Windows path), you can put an r before the quotes to ignore all escape sequences.

# The 'r' stands for 'Raw'. Everything inside is treated literally.
raw_path = r"C:\Users\Name\New_Folder\test"
print(raw_path)

# Think of the backslash as a "Ignore my usual meaning" signal. It tells Python that the character immediately following it should be treated as part of the text, not as part of the code structure.