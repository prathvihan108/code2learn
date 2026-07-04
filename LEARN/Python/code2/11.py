# compilation phase in python only check for syntax errors
# ==============================================================================
# PHASE 1: COMPILE TIME (Bytecode Generation)
# ==============================================================================
# When you run this file, Python's compiler scans the code below for SYNTAX errors.
# It checks if the parentheses match and if the keywords are spelled correctly.
#
# Even though passing an integer to len() is logically wrong, the SYNTAX is valid.
# Therefore, compilation succeeds, and bytecode is generated successfully!
# ==============================================================================

# 1. Variable Assignment (Types are determined dynamically at runtime)
text = "hi"       # Python registers this as a string at runtime
number = 10       # Python registers this as an integer at runtime

# 2. This line has perfect syntax and perfect types
print(len(text))  
# RUNTIME OUTCOME: Successfully executes and prints: 2

# 3. This line has perfect syntax, but a BAD data type combination
print(len(number)) 
# RUNTIME OUTCOME: The program crashes HERE because Python only discovers 
# that 'number' is an integer when it physically reaches this line.

# ==============================================================================
# PHASE 2: RUNTIME EXECUTION (The Python Virtual Machine)
# ==============================================================================
# Because code is executed line-by-line:
# Line 23 runs perfectly -> Prints 2
# Line 27 attempts to run -> Throws TypeError and halts the entire program.
# ==============================================================================