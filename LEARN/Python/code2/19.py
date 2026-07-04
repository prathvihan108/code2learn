#  How a python function works

# =====================================================================
# STEP 1: Program Start -> Global Variable Allocation
# =====================================================================
# Python reads this line and allocates a global variable 'f' in memory.
# Global variables live on the main shelf of RAM until the program fully exits.
f = 2  


# =====================================================================
# STEP 2: Function Definition (Blueprint Setup)
# =====================================================================
# Python registers the name 'multiple_factor' and its placeholder 'X'.
# It DOES NOT run the code inside yet. 
# 'X' is empty, and 'y' does not exist in memory at this point.
def multiple_factor(X):
    # STEP 4: Local Variable Creation (Inside the function call)
    # Python looks up local 'X' (3) and outward to global 'f' (2).
    # It calculates 3 * 2 = 6, and creates a private local variable 'y'.
    y = X * f  
    
    # STEP 5: Local Output Execution
    # Python reads 'y' (6) from local memory and displays it.
    print(y)  


# =====================================================================
# STEP 3: Function Call (Execution Jump)
# =====================================================================
# The program hits this line and jumps inside the function frame.
# Python immediately maps the argument value '3' to the parameter placeholder 'X'.
multiple_factor(3)  

# STEP 6: Function End & Scope Cleanup
# As soon as the function block ends above, both parameter 'X' and 
# local variable 'y' are completely wiped out/deleted from RAM.


# =====================================================================
# STEP 7: Back to Main Timeline (Global Access Continues)
# =====================================================================
# We are back on the main timeline. Global variable 'f' is still alive.
print(f)  # Output: 2

# Note: Trying to write `print(y)` or `print(X)` here would crash the 
# program with a NameError because they were destroyed at Step 6.