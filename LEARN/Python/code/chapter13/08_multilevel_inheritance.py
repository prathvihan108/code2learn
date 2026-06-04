# ==============================================================================
# MULTILEVEL INHERITANCE IN PYTHON
# ==============================================================================

# Multilevel Inheritance occurs when a child class inherits from a parent class, 
# which in turn inherits from another parent class. This creates a vertical, 
# linear family tree (Grandparent -> Parent -> Child).
#
# Unlike multiple inheritance (horizontal layout), multilevel inheritance is 
# cleanly handled by standard 'super()' calls because the path is perfectly linear.

class Vehicle:
    """The Grandparent Class (Top Level)"""
    def __init__(self, brand):
        self.brand = brand
        print(f"[GRANDPARENT] Vehicle __init__ for {self.brand}")

    def start_engine(self):
        return f"The {self.brand} engine starts humming."


class Car(Vehicle):
    """The Parent Class (Middle Level)"""
    def __init__(self, brand, doors):
        # Pass the brand up to the Grandparent constructor
        super().__init__(brand)
        self.doors = doors
        print(f"[PARENT] Car __init__ with {self.doors} doors")

    def open_trunk(self):
        return "Trunk opened successfully."


class ElectricCar(Car):
    """The Child Class (Bottom Level)"""
    def __init__(self, brand, doors, battery_capacity):
        # super() looks up directly to Car.__init__, which automatically
        # pushes the brand up to Vehicle.__init__. The chain runs cleanly!
        super().__init__(brand, doors)
        self.battery = battery_capacity
        print(f"[CHILD] ElectricCar __init__ with {self.battery}kWh battery")

    # --- POLYMORPHISM / OVERRIDING ANOMALY ---
    def start_engine(self):
        """Overriding the Grandparent's method to provide specialized behavior."""
        # We can still access the Grandparent's logic manually if we want to!
        parent_msg = super().start_engine()
        return f"{parent_msg} (Silently, because it is an Electric EV!)"


# ==============================================================================
# RUNTIME VERIFICATION PLAYGROUND
# ==============================================================================
if __name__ == "__main__":
    
    print("--- 1. Instantiation Chain Reaction ---")
    # Watch the console output closely. Instantiating the bottom child triggers 
    # a cascading execution up to the grandparent and back down!
    my_ev = ElectricCar("Tesla", 4, 75)

    
    print("\n--- 2. Inherited Property & Method Access ---")
    # The Child class has simultaneous access to all properties and methods 
    # defined across the entire evolutionary chain!
    
    print(f"Grandparent property (brand): {my_ev.brand}")
    print(f"Parent property (doors):      {my_ev.doors}")
    print(f"Child property (battery):     {my_ev.battery}kWh")
    
    print(f"Parent action method:         {my_ev.open_trunk()}")


    print("\n--- 3. Overridden Method Resolution ---")
    # When a method is called, Python searches from the bottom up. 
    # It finds 'start_engine' in ElectricCar first and executes it immediately.
    print(my_ev.start_engine())


    print("\n--- 4. Lineage Inspection (MRO) ---")
    # Even though this is linear inheritance, Python still calculates an MRO 
    # sequence to track the lookup direction.
    for idx, cls in enumerate(ElectricCar.mro()):
        print(f"   Level {idx}: {cls.__name__}")