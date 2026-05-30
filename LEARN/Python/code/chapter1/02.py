# ==============================================================================
# ALL THE KEYWORD ARGUMENTS OF THE PRINT() FUNCTION
# ==============================================================================

# Behind the scenes, the complete signature of the print function looks like this:
# print(*objects, sep=' ', end='\n', file=sys.stdout, flush=False)


# 1. 'sep' (The Separator)
# ------------------------------------------------------------------------------
# Defines what character goes BETWEEN multiple items passed into a single print.
# Default: A single space ' '

print("05", "10", "2026", sep="-")  
# Output: 05-10-2026


# 2. 'end' (The Line Terminator)
# ------------------------------------------------------------------------------
# Defines what character gets printed at the very END of the line.
# Default: A newline character '\n' (which pushes the next print down)

print("Loading", end="... ")
print("Complete!")
# Output: Loading... Complete!


# 3. 'file' (The Target Output Stream)
# ------------------------------------------------------------------------------
# By default, print() sends text directly to your screen (sys.stdout). 
# However, you can use 'file' to redirect the printed text straight into a text document!

# This creates a file called 'log.txt' and writes inside it instead of the screen:
with open("log.txt", "w") as my_file:
    print("This message is printed directly into the file!", file=my_file)


# 4. 'flush' (The Buffer Overrider)
# ------------------------------------------------------------------------------
# To make programs run faster, Python normally "buffers" text. This means it collects 
# characters in temporary memory and only dumps them onto your screen all at once 
# when it sees a newline character (\n).
#
# If you set flush=True, Python skips the waiting room and forces the screen to 
# display the characters the exact millisecond they are printed.
# Default: False

import time

print("Downloading", end="", flush=True)
for _ in range(3):
    time.sleep(0.5) # Pauses for half a second
    print(".", end="", flush=True) # Forces each dot to display instantly one-by-one

# Without flush=True, all 3 dots might lag and pop up on your screen at the exact same time.