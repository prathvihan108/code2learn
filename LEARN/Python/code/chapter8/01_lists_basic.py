# ==============================================================================
# THE COMPLETE PYTHON LIST BLUEPRINT
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. CREATION AND DATA TYPES
# ------------------------------------------------------------------------------
# Lists are defined by placing items inside square brackets [], separated by commas.

empty_list = []
numbers = [10, 20, 30, 40]
mixed_list = ["Python", 3.14, True, [1, 2]] # Can hold integers, strings, booleans, even other lists!


# ------------------------------------------------------------------------------
# 2. INDEXING AND SLICING (Accessing Data)
# ------------------------------------------------------------------------------
# Like strings, lists use zero-based indexing. 
# Syntax for slicing: list[start : stop : step] -> 'stop' is exclusive!

fruits = ["apple", "banana", "cherry", "date"]

print("2a. First item:", fruits[0])    # Output: apple
print("2b. Last item:", fruits[-1])    # Output: date

# Slicing returns a brand new sub-list
print("2c. Slice (1 to 3):", fruits[1:3])   # Output: ['banana', 'cherry']
print("2d. Reverse list:", fruits[::-1])    # Output: ['date', 'cherry', 'banana', 'apple']


# ------------------------------------------------------------------------------
# 3. MUTABILITY: ADDING & MODIFYING ELEMENTS
# ------------------------------------------------------------------------------
# Because lists are mutable, you can alter them directly in place.

tech = ["Google", "Apple"]

# Changing an element directly via index
tech[1] = "Microsoft" 

# Adding elements:
tech.append("Netflix")       # .append() adds an item to the very END of the list
tech.insert(1, "Meta")       # .insert(index, item) injects an item at a specific position
tech.extend(["Amazon", "Uber"]) # .extend() merges an entire iterable to the end

print("\n3. Modified List:", tech) 
# Output: ['Google', 'Meta', 'Microsoft', 'Netflix', 'Amazon', 'Uber']


# ------------------------------------------------------------------------------
# 4. REMOVING ELEMENTS
# ------------------------------------------------------------------------------
languages = ["Python", "Java", "C++", "JavaScript", "Java"]

languages.remove("Java")  # Removes the FIRST occurrence of the value
print("4a. After remove:", languages) # Output: ['Python', 'C++', 'JavaScript', 'Java']

popped_item = languages.pop(1) # Removes and RETURNS the item at index 1
print(f"4b. Popped: {popped_item} | List now: {languages}") 

del languages[0] # The 'del' keyword permanently deletes an item by index
# languages.clear() # Completely empties the list


# ------------------------------------------------------------------------------
# 5. SEARCHING, COUNTING, AND SORTING
# ------------------------------------------------------------------------------
nums = [40, 10, 20, 10, 30]

print("\n5a. Total 10s in list:", nums.count(10)) # Output: 2
print("5b. Index of 20:", nums.index(20))       # Output: 2 (Throws error if not found)

# Sorting:
nums.sort() # Sorts the original list IN PLACE (Modifies it permanently)
print("5c. Sorted in place:", nums) # Output: [10, 10, 20, 30, 40]

# Alternative: sorted(list) returns a fresh sorted copy without altering the original
# items_copy = sorted(nums, reverse=True) 


# ------------------------------------------------------------------------------
# 6. THE ALGORITHMIC TRAP: POP(0) VS POP() COMPLEXITY
# ------------------------------------------------------------------------------
# This is a very common performance question in technical interviews.

data_list = [i for i in range(100000)]

# O(1) Time - Instantaneous. Python just drops the last item.
data_list.pop() 

# O(N) Time - Slow! Python removes index 0, then must shift ALL remaining 
# 99,999 items one slot to the left in memory. 
data_list.pop(0) 

# Pro-Tip: If you need to add/remove items frequently from the front, 
# use 'collections.deque' (Double-Ended Queue) instead of a list!