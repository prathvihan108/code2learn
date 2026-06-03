# ==============================================================================
# HOW IMPORTS AND "IF __NAME__ == '__main__'" WORK TOGETHER
# ==============================================================================

# ------------------------------------------------------------------------------
# PART 1: THE CORE IMPORT MECHANISM
# ------------------------------------------------------------------------------
# When you import a file, Python doesn't just look at it—it RUNS it entirely 
# from top to bottom behind the scenes to load its variables and functions.

# Let's say this file is named "helper.py". 
# If another script writes `import helper`, this global code runs instantly:
print("1. This print fires EVERY TIME this file is run OR imported!")

def calculate_tax(amount):
    """A reusable function that can be safely imported anywhere."""
    return amount * 0.18


# ------------------------------------------------------------------------------
# PART 2: THE "__name__" VARIABLE ANOMALY
# ------------------------------------------------------------------------------
# Python secretly tracks how every file is executed using a hidden variable 
# named `__name__`. It can only ever have two values:
#
# Case A: If you click "Run" on this file directly:
#         __name__ becomes "__main__"
#
# Case B: If this file is brought into another script via `import helper`:
#         __name__ becomes "helper" (the actual filename)


# ------------------------------------------------------------------------------
# PART 3: THE IF __NAME__ == "__MAIN__" GUARD
# ------------------------------------------------------------------------------
# We use this conditional block to separate our reusable module tools from 
# code that should only run during active, direct testing.

if __name__ == "__main__":
    # This block executes ONLY if you run this file directly.
    # It is completely IGNORED and hidden when this file is imported!
    print("\n2. --- DIRECT EXECUTION MODE ---")
    print("   You ran this file directly. Running developer tests...")
    
    # Testing our function without polluting other files that import us
    test_run = calculate_tax(100)
    print(f"   Test Tax Calculation Result: {test_run}")
    print(f"   The hidden variable __name__ is currently: '{__name__}'")

else:
    # This optional block runs ONLY if this file was imported.
    # (Usually left out in production, but great for understanding the flow)
    print(f"\n3. --- IMPORT MODE ---")
    print(f"   This file was imported safely. Its __name__ shifted to: '{__name__}'")