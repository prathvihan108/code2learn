# When we say .keys(), .values(), and .items() return a real-time view (technically called a dictionary view object), it means Python is giving you a direct window looking straight into the dictionary's actual memory.


# 1. Setup our starting dictionary
user_status = {"Alice": "online", "Bob": "offline"}

# 2. Grab a Real-Time View (Security Camera) vs. a Hard Copy (Polaroid Snapshot)
real_time_view = user_status.keys()
hard_copy_list = list(user_status.keys())

print("--- INITIAL STATE ---")
print(f"Original Dictionary: {user_status}")
print(f"Real-Time View:      {real_time_view}")
print(f"Hard Copy List:      {hard_copy_list}\n")

# 3. Modify the original dictionary
print("--- MODIFYING DICTIONARY (Adding 'Charlie') ---")
user_status["Charlie"] = "online"
print(f"Original Dictionary: {user_status}\n")

# 4. Watch how the two variables respond to the change
print("--- THE RESULTS ---")
print(f"Real-Time View:      {real_time_view}")  
# Automatically updated! Output: dict_keys(['Alice', 'Bob', 'Charlie'])

print(f"Hard Copy List:      {hard_copy_list}")  
# Unchanged!            Output: ['Alice', 'Bob']