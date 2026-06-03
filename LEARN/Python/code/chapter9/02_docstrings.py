# A docstring (short for documentation string) is a special type of string literal used in Python to document a specific block of code, such as a function, class, module, or method. It serves as an official explanation of what the code does, its parameters, return values, and any other relevant information. Docstrings are essential for code readability and maintainability, as they provide clear guidance to other developers (or your future self) about how to use the code effectively.

# Docstrings are written using triple double quotes ("""...""") and must be placed as the very first line directly beneath the definition of a function, class, or module.

# Here is the blueprint to copy into your code editor:

# ==============================================================================
# THE BASIC SYNTAX OF A DOCSTRING
# ==============================================================================

def calculate_square(number):
    """Calculates and returns the square of a given integer or float."""
    return number ** 2

# Look closely: The docstring isn't assigned to any variable, and it isn't a comment.
# Because of its special placement, Python binds it directly to the function object!

# Because docstrings are formally attached to objects, Python allows you to read a function's documentation programmatically at runtime. This is how modern code editors (like VS Code or PyCharm) generate those helpful pop-up tooltips when you hover your mouse over a function name!

# ==============================================================================
# HOW TO ACCESS DOCSTRINGS AT RUNTIME
# ==============================================================================

# Method A: The __doc__ Attribute
# Every documented object in Python has a hidden '__doc__' string attribute.
print("--- Method A: __doc__ attribute ---")
print(calculate_square.__doc__) 
# Output: Calculates and returns the square of a given integer or float.


# Method B: The Built-in help() Function
# This opens an interactive documentation viewer in your terminal console.
print("\n--- Method B: help() function ---")
help(calculate_square)


# Interviewers love to ask: "Can I just use triple quotes as multi-line comments anywhere in my file?"

# The Answer: Technically yes, but conceptually no.
# If you place a triple-quoted string anywhere else in your file (not right under a definition block), Python treats it as an unassigned string literal. It works like a comment because Python ignores it during execution, but it wastes tiny fractions of memory because Python still builds the string object before discarding it. Real comments should always use #.


#  locations where all i can place docstrings

# ==============================================================================
# LOCATION 1: THE MODULE LEVEL DOCSTRING (The top of the file)
# ==============================================================================
"""Data Processing Module.

This module provides high-level automated cleanup tools for reading 
and converting incoming customer records into structured matrices.
"""

# RULE FOR MODULE DOCSTRINGS: It MUST be the absolute first thing in the file! 
# It can only appear after empty lines or encoding declarations, but BEFORE 
# any import statements or variable assignments.

import sys


# ==============================================================================
# LOCATION 2: THE CLASS LEVEL DOCSTRING
# ==============================================================================
class CustomerAccount:
    """Represents a premium corporate banking customer profile.

    Tracks baseline credit evaluations, transaction lifecycles, and holds 
    validation pathways for secure balance transactions.
    """

    # RULE FOR CLASS DOCSTRINGS: It must sit as the very first indented line 
    # directly below the 'class Name:' declaration block.

    def __init__(self, name, balance):
        self.name = name
        self.balance = balance


    # ==============================================================================
    # LOCATION 3: THE METHOD LEVEL DOCSTRING (Inside a Class)
    # ==============================================================================
    def deposit_funds(self, amount):
        """Executes a secure financial credit operation against the account.

        Args:
            amount (float): The monetary value to add to the ledger.
        """
        # RULE FOR METHOD DOCSTRINGS: Sits as the first indented line directly 
        # beneath the method signature inside the class structure.
        self.balance += amount


# ==============================================================================
# LOCATION 4: THE INDEPENDENT FUNCTION LEVEL DOCSTRING
# ==============================================================================
def parse_raw_input(data_stream):
    """Cleans up raw data streams by removing spaces and trailing markers.

    Returns:
        list: Filtered and typecasted input sequences.
    """
    # RULE FOR FUNCTION DOCSTRINGS: Sits as the first indented line directly 
    # beneath the standalone function's def signature statement.
    return [item.strip() for item in data_stream]