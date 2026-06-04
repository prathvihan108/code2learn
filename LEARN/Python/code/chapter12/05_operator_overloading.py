# ==============================================================================
# THE ULTIMATE MASTER BLUEPRINT OF OPERATOR OVERLOADING IN PYTHON
# ==============================================================================

# Operator overloading allows custom user-defined objects to interface directly 
# with Python's native operators (+, -, *, ==, <, len(), print()). 
# Python maps every symbol to a specific hidden dunder (double underscore) method.

class Vector2D:
    """A 2D Coordinate Vector object demonstrating Arithmetic, Comparison, 
    Unary, and Container operator overloading structures."""

    def __init__(self, x, y):
        self.x = x
        self.y = y

    # --------------------------------------------------------------------------
    # 1. STRING REPRESENTATION OPERATORS
    # --------------------------------------------------------------------------
    def __str__(self):
        # Overloads str() and print(). Changes ugly hex address to clean text.
        return f"({self.x}, {self.y})"

    def __repr__(self):
        # Overloads repr(). Used for debugging logs and developer tracking.
        return f"Vector2D({self.x}, {self.y})"


    # --------------------------------------------------------------------------
    # 2. ARITHMETIC OPERATORS (Binary Operations)
    # --------------------------------------------------------------------------
    def __add__(self, other):
        # Overloads the '+' operator: vector1 + vector2
        if not isinstance(other, Vector2D):
            raise TypeError("Can only add another Vector2D instance.")
        return Vector2D(self.x + other.x, self.y + other.y)

    def __sub__(self, other):
        # Overloads the '-' operator: vector1 - vector2
        return Vector2D(self.x - other.x, self.y - other.y)

    def __mul__(self, scalar):
        # Overloads the '*' operator: vector1 * scalar
        # Handles multiplying vector by a standalone number (e.g., v1 * 3)
        return Vector2D(self.x * scalar, self.y * scalar)


    # --------------------------------------------------------------------------
    # 3. COMPARISON OPERATORS (Boolean Evaluations)
    # --------------------------------------------------------------------------
    def __eq__(self, other):
        # Overloads '==' operator. Checks if coordinate payloads match exactly.
        if not isinstance(other, Vector2D):
            return False
        return self.x == other.x and self.y == other.y

    def __lt__(self, other):
        # Overloads '<' operator (Less Than) based on raw length from origin.
        # Python uses this to automatically unlock sorting sequences!
        self_magnitude = (self.x**2 + self.y**2)**0.5
        other_magnitude = (other.x**2 + other.y**2)**0.5
        return self_magnitude < other_magnitude


    # --------------------------------------------------------------------------
    # 4. UNARY AND TYPE CASTING OPERATORS
    # --------------------------------------------------------------------------
    def __neg__(self):
        # Overloads the unary negative operator: -vector1
        return Vector2D(-self.x, -self.y)

    def __bool__(self):
        # Overloads bool() checking: if vector1:
        # Returns False if vector is exactly at the origin coordinate (0,0)
        return self.x != 0 or self.y != 0


    # --------------------------------------------------------------------------
    # 5. CONTAINER & EMULATION OPERATORS
    # --------------------------------------------------------------------------
    def __len__(self):
        # Overloads len() function. Returns dimension depth count.
        return 2

    def __getitem__(self, index):
        # Overloads array bracket indexing layout: vector[0] or vector[1]
        if index == 0: return self.x
        if index == 1: return self.y
        raise IndexError("Vector index out of bounds. Use 0 for X, 1 for Y.")


# ==============================================================================
# RUNTIME OPERATOR EXECUTION TRACE
# ==============================================================================
if __name__ == "__main__":
    v1 = Vector2D(3, 4)
    v2 = Vector2D(1, 2)
    v3 = Vector2D(3, 4)

    print("--- 1. String Presentation Overloading ---")
    print(f"v1 Coordinates via print(): {v1}")       # Triggers __str__ -> (3, 4)
    print(f"v1 Raw Object Evaluation:   {repr(v1)}")  # Triggers __repr__ -> Vector2D(3, 4)

    print("\n--- 2. Arithmetic Symbol Overloading ---")
    print(f"Addition (v1 + v2):        {v1 + v2}")   # Triggers __add__ -> (4, 6)
    print(f"Subtraction (v1 - v2):     {v1 - v2}")   # Triggers __sub__ -> (2, 2)
    print(f"Scalar Multiplication (v1*3): {v1 * 3}")  # Triggers __mul__ -> (9, 12)

    print("\n--- 3. Comparison Symbol Overloading ---")
    print(f"Value Check True (v1 == v3):  {v1 == v3}") # Triggers __eq__ -> True
    print(f"Value Check False (v1 == v2): {v1 == v2}") # Triggers __eq__ -> False
    print(f"Less Than Check (v2 < v1):    {v2 < v1}") # Triggers __lt__ -> True

    print("\n--- 4. Unary / Truthiness Overloading ---")
    print(f"Inverting Vector sign (-v1):  {-v1}")     # Triggers __neg__ -> (-3, -4)
    print(f"Is v1 a non-zero vector?:     {bool(v1)}") # Triggers __bool__ -> True

    print("\n--- 5. Native Container Simulation ---")
    print(f"Vector structural dimensions: {len(v1)}")  # Triggers __len__ -> 2
    print(f"Index access [0] for X axis:  {v1[0]}")     # Triggers __getitem__ -> 3
    print(f"Index access [1] for Y axis:  {v1[1]}")     # Triggers __getitem__ -> 4
    
    print("\n--- 6. Advanced Sorting Side-Effect ---")
    # Because we overloaded the Less Than (<) operator via __lt__, 
    # Python can now sort an array of vectors perfectly without any extra key setups!
    vector_list = [v1, v2, v3]
    vector_list.sort()
    print("Sorted Vectors list:", vector_list) # Output puts smaller magnitude (v2) first!