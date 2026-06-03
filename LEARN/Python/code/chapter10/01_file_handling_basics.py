# ==============================================================================
# THE FOUNDATIONAL BLUEPRINT OF PYTHON FILE HANDLING
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. THE ARCHITECTURE OF OPENING AND CLOSING (The OS Handshake)
# ------------------------------------------------------------------------------
# To interact with a file, Python must request a "File Handle" from your Operating System.
# Syntax: file_object = open(file_path, mode)

# WARNING: Every file you open consumes a system resource link. If you forget to close 
# it manually using .close(), your system can run out of file handles, or data sitting 
# in the temporary buffer might get corrupted and fail to save!

# Traditional approach (Manual Management):
file_handle = open("sample.txt", "w") # Requests the file with 'write' mode
# ... (writing code would go here) ...
file_handle.close()                  # Safely releases the file handle back to the OS


# ------------------------------------------------------------------------------
# 2. UNDERSTANDING ACCESS MODES (Permissions Matrix)
# ------------------------------------------------------------------------------
# The second argument in open() defines your access rights. Choosing the wrong mode 
# can accidentally wipe out your entire dataset! Here are the core modes:

# Mode 'r' (Read Only - Default):
# - Opens a file to look at its contents. 
# - TRAP: If the file does not exist on your computer, your code instantly crashes!

# Mode 'w' (Write Only):
# - Opens a file for writing.
# - ANOMALY: If the file already exists, it completely ERASES (truncates) everything 
#   inside it to start fresh. If the file does not exist, it creates a new empty one!

# Mode 'a' (Append Only):
# - Opens a file to add data to the end.
# - SAFE TRICK: Unlike 'w', it does NOT delete existing data. It places the file 
#   cursor at the very bottom. If the file doesn't exist, it creates a new one.

# Mode 'x' (Exclusive Creation):
# - Creates a brand-new file.
# - TRAP: If the file already exists, it throws a FileExistsError. Great for 
#   preventing your script from accidentally overwriting important data.


# ------------------------------------------------------------------------------
# 3. THE TEXT VS BINARY ANOMALY
# ------------------------------------------------------------------------------
# By default, Python reads files as plain text ('r', 'w', 'a'). 
# If you are dealing with images, audio files, PDFs, or compressed zip files, 
# you must append a 'b' to the mode string to tell Python to process raw bytes.

# text_mode   = open("data.txt", "r")  # Processes standard human-readable text
# binary_mode = open("photo.jpg", "rb") # Processes raw hexadecimal bytes: \xff\xd8...


# ------------------------------------------------------------------------------
# 4. THE CONTEXT MANAGER ANOMALY: 'WITH' BLOCKS (The Production Standard)
# ------------------------------------------------------------------------------
# Because human developers constantly forget to call `.close()`, or because unexpected 
# crashes happen halfway through a script preventing a close step from ever being reached, 
# Python created the Context Manager using the **`with`** keyword.
#
# SUPERPOWER: The moment your code exits the indented 'with' block, Python guarantees 
# to automatically snap the file shut behind the scenes, even if your code crashed 
# inside the block!

with open("secure_log.txt", "a") as file:
    # Inside this indented block, the file handle connection is wide open.
    print("4a. Inside the block, checking file closed state:", file.closed) # Output: False

# We have stepped completely out of the indentation block:
print("4b. Outside the block, checking file closed state:", file.closed) # Output: True
# The resource was safely released without ever explicitly typing file.close()!