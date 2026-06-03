# ==============================================================================
# THE MASTER BLUEPRINT OF PYTHON 'WHILE' LOOPS
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE STANDARD COUNTER WHILE LOOP
# ------------------------------------------------------------------------------
# Requires three critical phases: 
#   - Initialization (Setting up the tracker variable)
#   - Condition Check (The entry boundary)
#   - State Update (Incrementing/Decrementing to prevent infinite loops)

count = 1  # 1. Initialization

while count <= 3:  # 2. Condition Check
    print(f"1. Loop iteration: {count}")
    count += 1  # 3. State Update (Crucial! If omitted, this loop runs forever)


# ------------------------------------------------------------------------------
# 2. THE INFINITE SENTINEL LOOP (The Event/Game Loop)
# ------------------------------------------------------------------------------
# In real production software, we often don't know ahead of time how many loops 
# are needed. We use `while True` to create an intentional infinite loop and 
# use the `break` keyword to exit when a "sentinel value" or flag triggers.

print("\n--- 2. Sentinel Loop Simulation ---")
# Let's simulate processing instructions until a "QUIT" command is found.
commands = ["MOVE_FORWARD", "TAKE_DAMAGE", "QUIT", "ATTACK"]
command_index = 0

while True:
    current_action = commands[command_index]
    print(f"Executing system action: {current_action}")
    
    if current_action == "QUIT":
        print("Exit trigger detected. Breaking out of loop!")
        break  # Instantly terminates the loop and jumps outside
        
    command_index += 1


# ------------------------------------------------------------------------------
# 3. THE SNEAKY 'CONTINUE' LOOP AND THE INFINITE BUG TRAP
# ------------------------------------------------------------------------------
# The `continue` keyword skips the *remainder* of the current loop iteration 
# and jumps straight back to the top to check the condition again.
#
# INTERVIEW TRAP: If you place your update step (+= 1) AFTER a continue block, 
# your code will freeze into an accidental infinite loop!

print("\n--- 3. Continue Loop (Printing Odd Numbers) ---")
number = 0

while number < 6:
    number += 1  # MUST UPDATE HERE before hitting 'continue'
    
    if number % 2 == 0:
        continue  # Skips the print statement below for even numbers
        
    print(f"Odd Number: {number}")


# ------------------------------------------------------------------------------
# 4. NESTED WHILE LOOPS (Algorithmic Multi-Pointer Patterns)
# ------------------------------------------------------------------------------
# Used frequently in sorting and pointer alignment algorithms (e.g., Two-Pointer technique).

i = 1
print("\n--- 4. Nested Grid ---")
while i <= 2:
    j = 1
    while j <= 2:
        print(f"Coordinate (i={i}, j={j})")
        j += 1
    i += 1


# ------------------------------------------------------------------------------
# 5. POINTER REVERSALS (Classic Linked List / Array Problem Engine)
# ------------------------------------------------------------------------------
# A favorite interview layout: Shrinking a space boundary from both ends inward 
# until the two pointers crash or cross each other ($O(N)$ time, $O(1)$ space).

word = "radar"
left_pointer = 0
right_pointer = len(word) - 1
is_palindrome = True

while left_pointer < right_pointer:
    if word[left_pointer] != word[right_pointer]:
        is_palindrome = False
        break
    left_pointer += 1   # Left moves forward
    right_pointer -= 1  # Right moves backward

print(f"\n5. Is '{word}' a palindrome?:", is_palindrome)


# ------------------------------------------------------------------------------
# 6. THE 'WHILE-ELSE' CLAUSE
# ------------------------------------------------------------------------------
# Just like the 'for-else' construct, the 'else' block runs ONLY if the while 
# loop completes its condition naturally by hitting False. 
# If the loop gets killed early via a 'break', the else block is bypassed entirely.

print("\n--- 6. While-Else Execution ---")
energy_level = 3

while energy_level > 0:
    print("Working...")
    energy_level -= 1
else:
    # Runs because energy hit 0, breaking the 'while' condition naturally
    print("Battery flat. Shutting down safely.")