from collections import defaultdict

# Built-in types
d1 = defaultdict(list)    # default: []
d2 = defaultdict(int)     # default: 0
d3 = defaultdict(float)   # default: 0.0
d4 = defaultdict(str)     # default: ""
d5 = defaultdict(set)     # default: set()

d1[1].append(10)
print(d1[1])   # [10]
print(d1[2])   # []  <- key didn't exist, got default []

d2[1] += 5
print(d2[1])   # 5
print(d2[2])   # 0   <- key didn't exist, got default 0

# Custom default using lambda
d6 = defaultdict(lambda: 100)
d6[1] += 50
print(d6[1])   # 150
print(d6[2])   # 100 <- key didn't exist, got default 100

# Default as a specific list
d7 = defaultdict(lambda: [1, 2, 3])
d7[1].append(4)
print(d7[1])   # [1, 2, 3, 4]
print(d7[2])   # [1, 2, 3] <- key didn't exist, got default [1, 2, 3]

# Nested defaultdict
d8 = defaultdict(lambda: defaultdict(int))
d8["a"]["x"] += 1
print(d8["a"]["x"])  # 1
print(d8["b"]["y"])  # 0 <- both keys didn't exist, got default 0