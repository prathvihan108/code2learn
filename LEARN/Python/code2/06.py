from collections import namedtuple

# ==========================================
# 1. SYNTAX: HOW TO DEFINE A NAMEDTUPLE
# ==========================================
# Syntax: typename = namedtuple('typename', ['field1', 'field2', ...])

# Method A: Using a list of strings (Most common)
Point = namedtuple('Point', ['x', 'y'])

# Method B: Using a single space-separated string
User = namedtuple('User', 'id name email')


# ==========================================
# 2. CREATION AND BASIC USAGE
# ==========================================

# Instantiate just like a normal class
p1 = Point(10, 20)
u1 = User(id=101, name="Alice", email="alice@example.com")

# Accessing data: You can use dot notation OR standard tuple indexing
print(f"Point coordinates: x={p1.x}, y={p1.y}")  # Clear and readable!
print(f"First element by index: {p1[0]}")        # Still works like a normal tuple

# Unpacking still works perfectly
x_coord, y_coord = p1 


# ==========================================
# 3. MOST COMMON USE CASES
# ==========================================

# --- Use Case A: Cleaning up Coordinate / Spatial Data ---
# Instead of tracking raw tuples where you forget if width or height comes first.
Dimensions = namedtuple('Dimensions', ['width', 'height', 'depth'])
room = Dimensions(width=12, height=9, depth=15)
volume = room.width * room.height * room.depth


# --- Use Case B: Returning Multiple Values from Functions ---
# Far better than returning a dictionary or a plain tuple.
def get_db_status():
    # Doing some mock database checks...
    Status = namedtuple('DBStatus', ['connected', 'latency_ms', 'cluster'])
    return Status(connected=True, latency_ms=14.5, cluster="us-east")

db = get_db_status()
if db.connected:  # Self-documenting code
    print(f"Connected to {db.cluster} in {db.latency_ms}ms")


# --- Use Case C: Lightweight Data Containers (Alternative to Classes) ---
# If you just need to group data together without complex methods,
# namedtuples are faster and use significantly less memory than a custom class.
Car = namedtuple('Car', ['make', 'model', 'year'])
my_car = Car(make="Tesla", model="Model 3", year=2024)


# --- Use Case D: Handling CSV or Database Rows ---
# Easily map tabular rows into readable objects.
employee_row = ("E404", "Bob", "Engineering")
Employee = namedtuple('Employee', ['emp_id', 'name', 'department'])

# The _make() method lets you instantiate from an existing iterable/list/tuple
emp = Employee._make(employee_row)
print(f"Employee {emp.name} works in {emp.department}")


# ==========================================
# 4. KEY CHARACTERISTICS TO REMEMBER
# ==========================================
# 1. Immutability: Like regular tuples, you cannot change values after creation.
#    e.g., p1.x = 50  --> Will raise an AttributeError.
# 2. Memory Efficient: They don't have a per-instance __dict__, making them lightweight.




# The variable name is 'Account', but the internal typename string is 'Person'
Account = namedtuple('Person', ['id', 'name'])

# You use the variable name 'Account' to create the object
user1 = Account(id=101, name="Alice")

# But when you print it, Python uses the internal 'Person' name!
print(user1)  
# Output: Person(id=101, name='Alice')

# It also shows up as 'Person' if you check its type
print(type(user1))  
# Output: <class '__main__.Person'>