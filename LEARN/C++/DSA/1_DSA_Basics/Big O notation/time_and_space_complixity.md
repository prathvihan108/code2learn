//>>// Must Watch : https://youtu.be/rq_rwnveh8s

Time Complexity:(Big on notation) nothing but worst case scenario
Time complexity refers to the amount of time an algorithm takes to run, based on the input size. It measures the growth rate of the algorithm's running time as the input size increases.

There are different categories of time complexity, such as constant time (O(1)), logarithmic time (O(log n)), linear time (O(n)), quadratic time (O(n^2)), and more. Here are some examples and their time complexities:

1. Constant Time Complexity (O(1)):
   - Example: Accessing an element in an array by index.
   - Explanation: The time taken to access an element in an array is constant because it doesn't depend on the size of the array. Regardless of the array's size, accessing an element by index takes the same amount of time.

2. Linear Time Complexity (O(n)):
   - Example: Finding the maximum element in an unsorted array.
   - Explanation: In this example, you need to iterate through the entire array to find the maximum element. As the size of the array increases, the time taken to find the maximum element increases linearly.

3. Logarithmic Time Complexity (O(log n)):
   - Example: Binary search on a sorted array.
   - Explanation: In binary search, you divide the search space in half at each step. As a result, the number of elements to search decreases exponentially with each iteration. This logarithmic behavior leads to a time complexity of O(log n).

4. Quadratic Time Complexity (O(n^2)):
   - Example: Selection Sort.
   - Explanation: Selection Sort compares each element with every other element in the array, resulting in nested loops. As the size of the array increases, the number of comparisons grows quadratically, leading to a time complexity of O(n^2).

To calculate the time complexity, you analyze the algorithm's code and identify the dominant operations that contribute the most to the running time. Then, express the running time in terms of the input size (usually denoted as 'n'). Finally, simplify the expression and remove any constants or lower-order terms, focusing on the highest-order term. This highest-order term represents the time complexity using Big O notation.

Space Complexity:
Space complexity refers to the amount of memory or space required by an algorithm to run, based on the input size. It measures the growth rate of the algorithm's memory usage as the input size increases.

Similar to time complexity, space complexity is also expressed using Big O notation. Here are some examples:

1. Constant Space Complexity (O(1)):
   - Example: Swapping two variables.
   - Explanation: Swapping two variables only requires a constant amount of memory, regardless of the input size. Therefore, the space complexity is O(1).

2. Linear Space Complexity (O(n)):
   - Example: Creating a new array to store the elements of the input array.
   - Explanation: In this example, the space required to store the elements grows linearly with the input size. Therefore, the space complexity is O(n).

3. Quadratic Space Complexity (O(n^2)):
   - Example: Creating a matrix of size n x n.
   - Explanation: In this example, the space required grows quadratically with the input size because the matrix size depends on n^2. Hence, the space complexity is O(n^2).

To calculate the space complexity, you analyze the algorithm's memory usage and identify the variables, data structures, or arrays that consume space. Determine how the space requirements grow with the input size and express it using Big O notation.

Remember, Big O notation provides an upper bound on the algorithm's

 time or space complexity. It describes the worst-case scenario. If an algorithm has a time complexity of O(n), it means the algorithm's running time grows linearly with the input size or can be less than that.

I hope this explanation helps you understand time and space complexity better.

//**********************************//*******************************//*************************************
 
 time and space complexity, listed in increasing order of complexity:

1. O(1) - Constant time complexity.
   Example: Accessing an element in an array by index.

2. O(log n) - Logarithmic time complexity.
   Example: Binary search on a sorted array.

3. O(n) - Linear time complexity.
   Example: Finding the maximum element in an unsorted array.

4. O(n log n) - Linearithmic time complexity.
   Example: Sorting algorithms like Merge Sort and Heap Sort.

5. O(n^2) - Quadratic time complexity.
   Example: Selection Sort, Bubble Sort.

6. O(n^3) - Cubic time complexity.
   Example: Matrix multiplication algorithms like Strassen's algorithm.

7. O(2^n) - Exponential time complexity.
   Example: Recursive algorithms with exponential branching, like the Fibonacci sequence calculation using naive recursion.

8. O(n!) - Factorial time complexity.
   Example: Permutation or combination-based algorithms that explore all possible permutations.

For space complexity, the order is as follows:

1. O(1) - Constant space complexity.
   Example: Swapping two variables.

2. O(n) - Linear space complexity.
   Example: Creating a new array to store the elements of the input array.

3. O(n^2) - Quadratic space complexity.
   Example: Creating a matrix of size n x n.

It's important to note that these notations represent the worst-case complexity of an algorithm. There are other notations as well, such as O(sqrt(n)), O(2^sqrt(log n)), etc., which represent less common complexity scenarios. The choice of the most appropriate algorithm depends on the specific problem and the expected input size.

U can manually put values of n and check which will give more time complexity