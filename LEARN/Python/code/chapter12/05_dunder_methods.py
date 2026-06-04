# ==============================================================================
# THE ARCHITECTURAL COMPREHENSIVE BLUEPRINT OF DUNDER (MAGIC) METHODS
# ==============================================================================

# Dunder methods (short for "Double Underscore") are special hooks built into 
# Python. They are not meant to be called directly like `obj.__init__()`. 
# Instead, Python triggers them automatically behind the scenes when you use 
# standard operators or native operations (like +, print(), len(), or loops).

class SmartCart:
    """A custom shopping cart class demonstrating the 4 core pillars of 
    dunder methods: Initialization, Representation, Mathematics, and Emulation."""

    # --------------------------------------------------------------------------
    # PILLAR 1: INITIALIZATION & CONSTRUCTION HOOKS
    # --------------------------------------------------------------------------
    def __init__(self, customer_name):
        """Triggered automatically when creating a new object instance: Cart()."""
        self.customer = customer_name
        self.items = []     # Stores dictionaries of items, e.g., {"name": "Laptop", "price": 1200}
        print(f"[HOOK] __init__ executed! Cart allocated for {self.customer}.")


    # --------------------------------------------------------------------------
    # PILLAR 2: STRING REPRESENTATION HOOKS (The Diagnostic Suite)
    # --------------------------------------------------------------------------
    # TRAP: If you don't define these, printing your object yields an ugly 
    # memory address like `<__main__.SmartCart object at 0x7f98>`.

    def __str__(self):
        """User-focused representation. Triggered by print() or str(). 
        Must return a clean, human-readable string description."""
        return f"{self.customer}'s Shopping Cart ({len(self.items)} items)"

    def __repr__(self):
        """Developer-focused representation. Triggered by debugging consoles or repr(). 
        Must look like the valid Python code required to recreate the object."""
        return f"SmartCart('{self.customer}')"


    # --------------------------------------------------------------------------
    # PILLAR 3: MATHEMATICAL OPERATOR OVERLOADING
    # --------------------------------------------------------------------------
    # These methods give custom user-defined objects the legal ability to use 
    # math symbols (+, -, *, <, >) instead of clunky class methods.

    def __add__(self, new_item):
        """Overloads the '+' operator. Allows syntax: cart + {"name": "x", "price": y}"""
        if not isinstance(new_item, dict) or "price" not in new_item:
            raise TypeError("Can only add item dictionaries containing a 'price' key.")
        
        self.items.append(new_item)
        print(f"[HOOK] __add__ added {new_item['name']}.")
        return self # Returning self allows method chaining (e.g., cart + item1 + item2)

    def __eq__(self, other_cart):
        """Overloads the '==' operator. Defines what makes two carts equal."""
        if not isinstance(other_cart, SmartCart):
            return False
        # Carts are equal if they contain the exact same number of items
        return len(self.items) == len(other_cart.items)


    # --------------------------------------------------------------------------
    # PILLAR 4: CONTAINER EMULATION TYPE HOOKS
    # --------------------------------------------------------------------------
    # These methods trick Python into treating your custom object exactly like 
    # a native List, Dictionary, or Tuple!

    def __len__(self):
        """Overloads the native len() function. Tells Python how to count the object."""
        return len(self.items)

    def __getitem__(self, index):
        """Overloads direct bracket lookup: cart[index]. Makes the object indexable!"""
        return self.items[index]


# ==============================================================================
# EXECUTION TRACE & VERIFICATION PLAYGROUND
# ==============================================================================
if __name__ == "__main__":
    print("--- Execution Step 1: Instantiation ---")
    cart_1 = SmartCart("Prathvi")
    cart_2 = SmartCart("Akshat")

    print("\n--- Execution Step 2: Math Operator Overloading (+) ---")
    # Using the '+' operator calls __add__ behind the scenes!
    cart_1 + {"name": "MacBook", "price": 1500}
    cart_1 + {"name": "Coffee Mug", "price": 20}
    cart_2 + {"name": "Gaming PC", "price": 2000}

    print("\n--- Execution Step 3: String Presentations ---")
    print(str(cart_1))   # Triggers __str__ -> Prathvi's Shopping Cart (2 items)
    print(repr(cart_1))  # Triggers __repr__ -> SmartCart('Prathvi')

    print("\n--- Execution Step 4: Container Emulation (len and brackets) ---")
    # Triggers __len__ under the hood
    print(f"Total item items count: {len(cart_1)}") 
    
    # Triggers __getitem__ under the hood! 
    # We can read individual indexes without explicitly writing cart_1.items[0]
    print(f"First item in Prathvi's cart: {cart_1[0]}") 

    print("\n--- Execution Step 5: Equality Comparison (==) ---")
    # Triggers __eq__. Since both carts have items inside, they evaluate as Equal!
    print("Are the carts equal in size?:", cart_1 == cart_2) # Output: False (2 items vs 1 item)