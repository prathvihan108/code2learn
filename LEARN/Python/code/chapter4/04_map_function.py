# ==============================================================================
# UNDERSTANDING THE PYTHON 'MAP OBJECT' (LAZY EVALUATION)
# ==============================================================================

def double_it(number):
    print(f"-> Processing number: {number}") # This will track when the function actually runs
    return number * 2

numbers = [10, 20, 30]

# ------------------------------------------------------------------------------
# STEP 1: Creating the map object
# ------------------------------------------------------------------------------
# Pay attention to the terminal output here: Notice that NOTHING prints out 
# from inside the 'double_it' function yet! 
my_map_generator = map(double_it, numbers)

print("--- Step 1 Finished ---")
print(my_map_generator) 
# Output: <map object at 0x...> (It's just a lazy manager waiting in memory)


# ------------------------------------------------------------------------------
# STEP 2: Demanding the data (Using a loop)
# ------------------------------------------------------------------------------
print("\n--- Step 2: Extracting data one by one ---")
# The function 'double_it' ONLY fires when the loop explicitly requests the next item.

for processed_item in my_map_generator:
    print(f"Result in loop: {processed_item}")


# ------------------------------------------------------------------------------
# STEP 3: THE INTERVIEW TRAP - The map object is now EMPTY!
# ------------------------------------------------------------------------------
print("\n--- Step 3: Trying to read the map object a second time ---")
# A map object is an iterator. Once you read all the values out of it, 
# it consumes itself. It cannot be reused.

second_attempt_list = list(my_map_generator)
print("Second attempt list:", second_attempt_list) 
# Output: []  <-- It's completely empty now!


# ------------------------------------------------------------------------------
# HOW TO FIX IT PERMANENTLY
# ------------------------------------------------------------------------------
# If you need to use the calculations multiple times, immediately convert the 
# map object into a permanent list upon creation:

permanent_list = list(map(double_it, [100, 200])) 
# The function fires immediately for all items here because list() forces them out.

print("\nPermanent List:", permanent_list) # Output: [200, 400]
print("Can read again:", permanent_list)    # Output: [200, 400] (Works perfectly!)


# ==============================================================================
# TYPECASTING AN ENTIRE LIST AT ONCE USING MAP()
# ==============================================================================

# CASE 1: Converting User Input (Strings to Integers)
# ------------------------------------------------------------------------------
# When you use input().split(), you get a list of strings: ["10", "20", "30"]
string_inputs = ["10", "20", "30"]

# Instead of writing a loop to convert each one, map() typecasts them all at once:
integer_list = list(map(int, string_inputs))

print("Case 1 (Strings to Ints):", integer_list)  
# Output: [10, 20, 30]


# CASE 2: Converting Floats to Integers (Truncating Decimals)
# ------------------------------------------------------------------------------
prices = [4.99, 10.50, 99.95]

# This drops the decimal points of all items simultaneously
whole_numbers = list(map(int, prices))

print("Case 2 (Floats to Ints):", whole_numbers)  
# Output: [4, 10, 99]


# CASE 3: Converting Integers to Strings (Great for Join operations)
# ------------------------------------------------------------------------------
numbers = [1, 2, 3, 4]

# You can't join numbers with dashes directly, so you typecast them to strings first
string_list = list(map(str, numbers))  # Result: ['1', '2', '3', '4']

# Now you can cleanly join them together as text:
phone_number = "-".join(string_list)

print("Case 3 (Ints to Strings):", string_list)  # Output: ['1', '2', '3', '4']
print("Joined Output:", phone_number)            # Output: 1-2-3-4