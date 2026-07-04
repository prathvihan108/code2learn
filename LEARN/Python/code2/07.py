"""
===============================================================================
PROBLEM STATEMENT: "HackerRank - Namedtuple Challenge"
===============================================================================
Dr. John Wesley has a spreadsheet containing a list of student data: ID, MARKS, 
CLASS, and NAME. The column headers can be in any order (e.g., ID first, or 
MARKS first). 

Your task is to calculate the average marks of all students, rounded to two 
decimal places. You must solve this using Python's 'collections.namedtuple'.

-------------------------------------------------------------------------------
INPUT FORMAT EXPECTED BY THIS CODE:
-------------------------------------------------------------------------------
Line 1: An integer N, the total number of students.
Line 2: The column headers in any order (separated by spaces).
Next N lines: The data for each student corresponding to the headers.

Example Input:
3
ID MARKS CLASS NAME
1  97    7     Raymond
2  50    4     Steven
3  91    9     Adrian
===============================================================================
"""

from collections import namedtuple

# 1. Read the total number of students
n = int(input())

# 2. Dynamically create the NamedTuple using the column headers from the input
# [col for col in input().split()] extracts the headers as a list of strings
Student = namedtuple('Student', [col for col in input().split()])

marks = 0

# 3. Loop through each student row
for i in range(1, n + 1):
    # The '*' operator unpacks the list of values directly into the namedtuple
    st = Student(*[val for val in input().split()])
    
    # Access the MARKS field dynamically (Assumes header is exactly 'MARKS')
    marks = marks + int(st.MARKS)
    
# 4. Print the average formatted to exactly 2 decimal places
# FIXED: Changed '2f' to '.2f' so it correctly displays as a decimal float
print(f"{marks / n:.2f}")