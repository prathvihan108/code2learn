# list in python can server the purpose of stack and queue but they are not efficient for both.
# so deque is a better choice for both stack and queue as it is optimized for fast fixed-time appends and pops from both ends.
from collections import deque

# =============================================================================
# 1. INITIALIZATION: WHAT IS ["middle"]?
# =============================================================================
# When you create a deque, you can optionally pass an "iterable" (like a list) 
# to pre-populate it with starting data. 
#
# If you pass ["middle"], you are starting the deque with that single item 
# right in the center of the box.

dq = deque(["middle"])
print("Step 1 (Initial):", list(dq))
# Output: ['middle']


# =============================================================================
# 2. APPENDING TO THE RIGHT
# =============================================================================
# .append() works exactly like a regular Python list. It glues the new element 
# to the standard, far-right side of the sequence.

dq.append("right")
print("Step 2 (After append):", list(dq))
# Output: ['middle', 'right']


# =============================================================================
# 3. APPENDING TO THE LEFT
# =============================================================================
# .appendleft() is the special superpower of a deque. Because a deque is a 
# Doubly Linked List under the hood, it can insert an item at the very front 
# (left side) instantly in O(1) time without shifting other elements in memory.

dq.appendleft("left")
print("Step 3 (After appendleft):", list(dq))
# Output: ['left', 'middle', 'right']


# =============================================================================
# 4. OTHER SCENARIOS: EMPTY AND MULTI-ITEM INITIALIZATION
# =============================================================================

# Scenario A: Starting completely empty
empty_dq = deque()
print("\nEmpty Deque:", list(empty_dq))
# Output: []

# Scenario B: Pre-populating with multiple items
numbers_dq = deque([2, 3, 4])
numbers_dq.appendleft(1)
numbers_dq.append(5)
print("Multi-item Deque:", list(numbers_dq))
# Output: [1, 2, 3, 4, 5]


# =============================================================================
# 5. REMOVING ITEMS FROM BOTH ENDS
# =============================================================================
# Just like adding, you can cleanly pop from both directions in O(1) time.

print("\nPopping from right:", numbers_dq.pop())      # Removes and returns 5
print("Popping from left:", numbers_dq.popleft())  # Removes and returns 1
print("Final remaining state:", list(numbers_dq))
# Output: [2, 3, 4]