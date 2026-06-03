# ==============================================================================
# MASTERING BREAK AND CONTINUE IN PYTHON LOOPS
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE BREAK STATEMENT (The Complete Stop)
# ------------------------------------------------------------------------------
# As soon as 'break' is executed, the entire loop terminates immediately. 
# Any items left in the collection are completely ignored.

print("--- 1. Testing BREAK (Stop at 5) ---")
for num in range(1, 10):
    if num == 5:
        print("-> Target 5 found! Breaking loop entirely.")
        break
    print(f"Processing number: {num}")

print("Loop is dead. Execution continues out here.")


# ------------------------------------------------------------------------------
# 2. THE CONTINUE STATEMENT (The Skip Step)
# ------------------------------------------------------------------------------
# 'continue' cuts the current round short. Python skips any code sitting *below* # the continue statement and jumps straight back to the top for the next round.

print("\n--- 2. Testing CONTINUE (Skip even numbers) ---")
for num in range(1, 6):
    if num % 2 == 0:
        print(f"-> {num} is Even. Skipping!")
        continue
    # This print statement is bypassed whenever 'continue' fires!
    print(f"Odd Number: {num}")


# ------------------------------------------------------------------------------
# 3. THE SNEAKY INTERVIEW TRAP: While Loops + Continue = Infinite Hang
# ------------------------------------------------------------------------------
# Interviewers love to see if you catch this bug. In a 'while' loop, if your 
# loop counter update (+= 1) sits AFTER a 'continue' statement, it gets skipped!
# The variable freezes at that number, creating a catastrophic infinite loop.

print("\n--- 3. The Sneaky Continue Bug Example ---")
x = 0
while x < 4:
    x += 1 # SAFE: Counter updated at the top BEFORE the continue check
    if x == 2:
        print("Skipping 2...")
        continue
    print(f"Value of x: {x}")

# TRAP CODE LAYOUT (Do not do this!):
# while x < 4:
#     if x == 2:
#         continue   # Jumps back to 'while x < 4' immediately
#     x += 1         # This never runs! x stays 2 forever, freezing your program.


# ------------------------------------------------------------------------------
# 4. NESTED LOOPS BREAK TRAP (Breaking out of Inner Loops Only)
# ------------------------------------------------------------------------------
# CRITICAL INTERVIEW FACT: A 'break' or 'continue' statement ONLY affects the 
# individual loop block it is nested inside. It cannot kill an outer loop!

print("\n--- 4. Nested Loop Break Behavior ---")
for letter in ["A", "B"]:
    for number in [1, 2, 3]:
        if number == 2:
            print(f"   Inner break at number {number}")
            break # This ONLY kills the inner numbers loop!
        print(f"Grid: {letter}{number}")
    # Execution returns right back out here to the outer loop!