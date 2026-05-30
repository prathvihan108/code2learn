//important points

/*Difference between the array list and the priority queue
 *ArrayList:
 
 Internally, an ArrayList typically uses an array to store elements.
 *  When the array reaches its capacity, it is resized to accommodate more elements, usually by doubling its size. 
 * Adding an element to an ArrayList might require resizing the underlying array, which can have a performance cost, 
 * particularly for large collections. ArrayList provides constant time access to elements by index, but inserting or
 *  deleting elements at arbitrary positions might require shifting subsequent elements, resulting in a time complexity 
 * of O(n) where n is the number of elements in the list.

 PriorityQueue: 
PriorityQueue, on the other hand, is typically implemented using a data structure like a heap.
     A heap is a binary tree-based data structure where the key at each node is either greater than or equal to (max heap)
     or less than or equal to (min heap) the keys of its children. PriorityQueues are used when you want to retrieve elements in a specific order defined by their priority. The priority is typically defined by a Comparator or by the natural ordering of the elements. Inserting elements into a PriorityQueue is generally faster than an ArrayList because the internal structure automatically maintains the order based on the priority. PriorityQueues have O(log n) time complexity for insertion and removal of elements, where n is the number of elements in the queue.


 */
/*
 * No, ArrayDeque is not implemented using a heap.

ArrayDeque is a resizable-array implementation of the Deque interface. It is similar to ArrayList,
 but it allows for efficient insertion and removal of elements at both ends of the deque (i.e., the beginning and the end).
 */

 /*
  * Arrays vs linkedlsit Implementation:
  The performance of an array versus a linked list depends on the specific operations you are performing and the size of the collection. Here's a comparison:

    Accessing Elements by Index:
        Array: Accessing elements by index in an array is typically faster because arrays provide direct access to elements based on their indices. The time complexity for accessing an element in an array is O(1).
        Linked List: Accessing elements by index in a linked list involves traversing the list from the head (or tail, for doubly linked lists) until reaching the desired index. This operation has a time complexity of O(n), where n is the index of the element.

    Insertion and Deletion:
        Array: Insertion and deletion in an array can be slower, especially if you need to insert or delete elements in the middle of the array. In such cases, you might need to shift elements to make space or fill gaps, resulting in a time complexity of O(n), where n is the number of elements in the array.
        Linked List: Insertion and deletion in a linked list can be faster, particularly for operations at the beginning or end of the list. Insertion and deletion at the beginning or end of a linked list have a time complexity of O(1). However, for operations in the middle of the list, you still need to traverse the list to find the insertion or deletion point, resulting in a time complexity of O(n/2), which is effectively O(n) in big O notation.

    Dynamic Resizing:
        Array: Dynamic resizing of an array can be expensive because it involves allocating a new array and copying elements from the old array to the new one. However, this resizing typically occurs infrequently, and most array operations have amortized constant-time complexity.
        Linked List: Linked lists do not require resizing because each element is dynamically allocated. Therefore, there's no overhead for resizing, but memory allocation and deallocation for each node can add some overhead.
  */

  //Java legacy classes:
  /*
   *In Java, "legacy classes" generally refers to classes that were part of the original Java API,
    introduced in the early versions of Java, and have since been replaced or supplemented by newer, more efficient
     classes and APIs.
    Here are some examples of legacy classes in Java:

    Vector: Vector is a synchronized resizable-array implementation of the List interface.
     It was one of the original collections classes in Java and was introduced in Java 1.0. 
     It has since been largely replaced by the more efficient ArrayList, which is not synchronized by default.

    Hashtable: Hashtable is a synchronized key-value pair dictionary data structure. 
    It predates the Java Collections Framework and was introduced in Java 1.0. 
    It has been largely replaced by the more flexible and efficient HashMap, which is not synchronized by default.

    Enumeration: Enumeration was the original interface for iterating over collections, introduced in Java 1.0. 
    It has been largely superseded by the more versatile Iterator interface, introduced in Java 1.2, and the 
    enhanced for loop introduced in Java 5.

    Stack: Stack is a subclass of Vector that represents a last-in, first-out (LIFO) stack of objects. 
    It was part of the original Java API but has been largely replaced by the Deque interface and its 
    implementations like ArrayDeque.

    Dictionary: Dictionary is an abstract class that represents a key-value pair dictionary data structure.
     It was part of the original Java API but has been largely replaced by the Map interface and its implementations
      like HashMap.

    Enumeration: Enumeration is an interface that was part of the original Java API for iterating over collections.
     It has been largely replaced by the Iterator interface, which provides a more flexible and efficient way to 
     iterate over collections.

These classes are considered legacy because they have been largely superseded by newer and more efficient
 alternatives introduced in later versions of Java. While they are still supported for backward compatibility, 
 it is generally recommended to use the newer classes and APIs whenever possible for improved performance and functionality. 
   */