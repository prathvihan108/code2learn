# ==============================================================================
# THE ADVANCED INPUT() GUIDE: POWERS, TRICKS, AND INTERVIEW TRAPS
# ==============================================================================

# ------------------------------------------------------------------------------
# POWER 1: Dynamic Evaluation via split() and map()
# ------------------------------------------------------------------------------
# Interviewers rarely ask you to input just one item. They usually give you a 
# space-separated line of integers (e.g., "10 20 30 40").

# The standard way (creates a list of strings):
# Input: 1 2 3
str_list = input("Enter numbers: ").split()  # Result: ['1', '2', '3']

# The Interview Way (converts them to integers instantly using map()):
# map(function, iterable) applies int() to every item chopped up by split().
int_list = list(map(int, input("Enter numbers: ").split()))
print("Power 1 (Integer List):", int_list)  # Result: [1, 2, 3]


# ------------------------------------------------------------------------------
# TRAP 1: The Splitting / Unpacking ValueError
# ------------------------------------------------------------------------------
# Competitive programming problems often say: "The input contains two integers X and Y."

try:
    # If the user types "5 10", this works perfectly.
    # If the user types "5" (missing one) or "5 10 15" (too many), it crashes!
    x, y = map(int, input("Enter exactly two numbers: ").split())
except ValueError as e:
    print(f"Trap 1 Caught: {e}")  # e.g., "not enough values to unpack"


# ------------------------------------------------------------------------------
# TRAP 2: Reading Multiple Lines of Unknown Length
# ------------------------------------------------------------------------------
# A classic problem: "Read input until there are no lines left."
# Beginners try to use a fixed loop, but interviews require handling EOF (End of File).

import sys

print("Trap 2: Enter multiple lines (Press Ctrl+D or Ctrl+Z to simulate EOF):")
lines = []
while True:
    try:
        line = input()
        lines.append(line)
    except EOFError:
        break  # Safely stops reading when the input stream ends
print("Lines captured:", lines)


# ------------------------------------------------------------------------------
# POWER 2: Massive Speed Optimization (sys.stdin.readline)
# ------------------------------------------------------------------------------
# CRITICAL FOR COMPETITIVE PROGRAMMING: The built-in input() function is very SLOW 
# because it processes the prompt string and strips trailing newlines automatically. 
# If a problem provides $10^5$ lines of data, input() will cause a "Time Limit Exceeded" (TLE) error.

# This is how pro programmers override it at the top of their script:
import sys
input = sys.stdin.readline  # Overwrites the default input function

# WARNING: sys.stdin.readline() keeps the newline character ('\n') at the end!
# If you type "hello", it reads it as "hello\n". You must use .strip() or .rstrip().
username = input().strip()


# ------------------------------------------------------------------------------
# TRAP 3: The Ghost Newline Trap (Mixing input() and sys.stdin.read)
# ------------------------------------------------------------------------------
# If you use sys.stdin.read() to grab the entire remaining input batch at once,
# it leaves your cursor clean. But if you mix single inputs with bulk data,
# a trailing '\n' can break the next string reading.

# Safe bulk reading example:
# data = sys.stdin.read().splitlines() # Reads everything left into a clean list of lines


# ------------------------------------------------------------------------------
# TRAP 4: The Dangerous eval(input()) Anti-Pattern
# ------------------------------------------------------------------------------
# Old tutorials or tricky interview questions might show `eval(input())`.
# eval() runs strings AS ACTUAL PYTHON CODE.

# If a user inputs "5 + 5", it prints 10.
# If a malicious user inputs "__import__('os').system('rm -rf *')", it deletes files!
# Trap: NEVER use eval() with input() in real development due to major security risks.


# ------------------------------------------------------------------------------
# TRAP 5: List Comprehensions inside Input Processing
# ------------------------------------------------------------------------------
# You can process multi-line matrix inputs in a single line of code using 
# list comprehension combined with input().

# Matrix Input Example: Suppose a problem says "Enter a 3x3 grid"
# You can generate a 2D grid like this:
# matrix = [list(map(int, input().split())) for _ in range(3)]


