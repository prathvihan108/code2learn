# ==============================================================================
# MULTIPLE INHERITANCE AND METHOD RESOLUTION ORDER (MRO)
# ==============================================================================

# Multiple Inheritance occurs when a child class inherits directly from more than 
# one parent class. 
#
# MRO (Method Resolution Order) is the strict, deterministic path Python uses 
# to search for a method or attribute across a complex class hierarchy. Python 
# calculates this path using an algorithm called the C3 Linearization Algorithm.

class A:
    def execute(self):
        print("-> Executing inside Class A")

class B(A):
    def execute(self):
        print("-> Executing inside Class B")
        # super() looks up the NEXT class in the MRO chain, NOT necessarily the parent!
        super().execute() 

class C(A):
    def execute(self):
        print("-> Executing inside Class C")
        super().execute()


# ------------------------------------------------------------------------------
# THE DIAMOND PROBLEM STRUCTURAL ANOMALY
# ------------------------------------------------------------------------------
#        [ A ]          <-- Base Parent Class
#       /     \
#    [ B ]   [ C ]      <-- Intermediate Parents
#       \     /
#        [ D ]          <-- Multiple Inheritance Child
#
# If Class D calls 'execute()', which version runs first? B or C? 
# Python resolves this ambiguity strictly by the left-to-right order you define 
# in the inheritance tuple: class D(B, C) means check B before C.

class D(B, C):
    def execute(self):
        print("-> Executing inside Class D")
        super().execute()


# ==============================================================================
# RUNTIME VERIFICATION PLAYGROUND
# ==============================================================================
if __name__ == "__main__":
    
    print("--- 1. Inspecting the True MRO Chain ---")
    # You can view any class's calculated lookup path by printing its .__mro__ attribute 
    # or calling the .mro() method.
    
    for idx, cls in enumerate(D.mro()):
        print(f"   Step {idx}: {cls.__name__}")
        
    # Official MRO Output Path Chain:
    # Step 0: D (The class itself)
    # Step 1: B (First listed parent on the left)
    # Step 2: C (Second listed parent on the right)
    # Step 3: A (The common top base parent)
    # Step 4: object (The ultimate root of all Python classes)


    print("\n--- 2. Executing the MRO Super Stream ---")
    # Watch how super() moves horizontally through the MRO chain!
    # When D calls super(), it jumps to B.
    # When B calls super(), it jumps horizontally to C (NOT up to A)!
    # When C calls super(), it finally jumps up to A.
    
    instance_d = D()
    instance_d.execute()
    
    # Execution Flow Output:
    # -> Executing inside Class D
    # -> Executing inside Class B
    # -> Executing inside Class C
    # -> Executing inside Class A