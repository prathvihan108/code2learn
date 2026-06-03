# ==============================================================================
# THE MASTER FILE HANDLING OPERATIONS COMPREHENSIVE BLUEPRINT
# ==============================================================================

# Setup: Let's create a mockup multi-line file to perform operations on
with open("dev_log.txt", "w") as file:
    file.write("Line 1: Server initiated.\n")
    file.write("Line 2: Authentication successful.\n")
    file.write("Line 3: High memory load detected.\n")


# ------------------------------------------------------------------------------
# 1. THE THREE READING STRATEGIES
# ------------------------------------------------------------------------------

# Strategy A: file.read() -> Pulls EVERYTHING at once
# Time Complexity: O(N) where N is file size. 
# TRAP: If the file is 50 GB, this will attempt to load all 50 GB directly into 
# your system RAM, instantly crashing your computer! Use only for small text files.
with open("dev_log.txt", "r") as file:
    content = file.read()
    print("1a. Whole Read Output:\n" + content)


# Strategy B: file.readline() -> Pulls line-by-line sequentially
# Memory friendly! Reads from the current cursor location down to the next '\n'.
with open("dev_log.txt", "r") as file:
    first_line = file.readline()
    second_line = file.readline()
    print(f"1b. Readline 1: {first_line.strip()}")
    print(f"    Readline 2: {second_line.strip()}")


# Strategy C: file.readlines() -> Converts file into a List of strings
# Time Complexity: O(N). Splices lines automatically into an array structure.
with open("dev_log.txt", "r") as file:
    lines_list = file.readlines()
    print(f"\n1c. Readlines List structure: {lines_list}")


# ------------------------------------------------------------------------------
# 2. THE ULTIMATE PRODUCTION PATTERN: ITERATOR STREAMING
# ------------------------------------------------------------------------------
# In professional code, if you need to read a massive file line-by-line, you 
# treat the file object as a live streaming iterator. Python loops through it 
# lazily, keeping only one single line in memory at any given millisecond.

print("\n2. Streaming large files efficiently:")
with open("dev_log.txt", "r") as file:
    for line in file:  # Continuous O(1) memory footprint lookup stream!
        print(f"   Streamed line: {line.strip()}")


# ------------------------------------------------------------------------------
# 3. WRITING AND SAVING OPERATIONS
# ------------------------------------------------------------------------------

# Operation A: file.write(string)
# Injects a plain string directly onto the disk. 
# WARNING: It does NOT append a newline (\n) automatically! You must add it manually.
with open("output.txt", "w") as file:
    file.write("Hello World")  # Stays on the same line
    file.write("Python Operations\n")


# Operation B: file.writelines(list_of_strings)
# Takes an array/list of text items and dumps them sequentially into the file.
log_dump = ["Error Code: 404\n", "Status: Failed\n", "Retrying link...\n"]
with open("output.txt", "a") as file:
    file.writelines(log_dump)


# ------------------------------------------------------------------------------
# 4. CURSOR NAVIGATION: CHRONOLOGICAL SEEK & TELL
# ------------------------------------------------------------------------------
# As Python reads or writes a file, a hidden cursor keeps track of its location.
# You can see and manually warp this cursor anywhere on the timeline using tell() and seek().

with open("dev_log.txt", "r") as file:
    print("\n4a. Fresh file cursor position:", file.tell()) # Output: 0 (The absolute top)
    
    file.readline() 
    print("4b. Cursor position after line 1:", file.tell()) # Output: Position matches byte count
    
    # THE SEEK WARP ANOMALY: file.seek(offset)
    # This physically rewinds or forwards the cursor to a specific byte location!
    file.seek(0) # Warp completely back to the top of the file!
    print("4c. Re-reading line 1 after explicit seek(0):", file.readline().strip())