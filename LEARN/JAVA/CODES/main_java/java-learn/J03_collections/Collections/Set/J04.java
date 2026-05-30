/*SortedSet:Interface which extends the Set.
 * In Java's Collections Framework, SortedSet is an interface that extends the Set interface and provides a 
 * collection of elements sorted in a specific order defined by the natural ordering of its elements or by 
 * a specified comparator.

Here are some key points about SortedSet:

    Ordering: Elements in a SortedSet are maintained in a sorted order. 
    This order can either be the natural ordering of the elements or an order defined by a comparator provided 
    during set creation.

    No Duplicates: Like other set implementations, a SortedSet does not allow duplicate elements.

    Navigable Operations: In addition to the basic set operations, SortedSet provides navigation methods for 
    accessing elements based on their position in the sorted order. These methods include first(), last(), headSet(), 
    tailSet(), and subSet().

     SortedSet in Java include TreeSet, which uses a self-balancing binary search tree (red-black tree) 
     to maintain the sorted order of elements.

     Not threadSafe.

     The internal implementation of TreeSet in Java typically involves a self-balancing binary search tree (BST),
      specifically a red-black tree.


 */
/*
 * SortedSet Interface

SortedSet is the alternate of Set interface that provides a total ordering on its elements.
 The elements of the SortedSet are arranged in the increasing (ascending) order. 
 The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

The SortedSet can be instantiated as:

    SortedSet<data-type> set = new TreeSet();  
 */
/*
 * TreeSet

Java TreeSet class implements the Set interface that uses a tree for storage.
Like HashSet, TreeSet also contains unique elements.
However, the access and retrieval time of TreeSet is quite fast.(May be because of the sorted order,and many reasons)
The elements in TreeSet stored in ascending order.
Not thread Safe.
   
 */

 /*The below code demonstrate the following methods.
  *  add(): Adds elements to the TreeSet.
    contains(): Checks if an element is present in the TreeSet.
    remove(): Removes an element from the TreeSet.
    first(): Returns the first element in the TreeSet.
    last(): Returns the last element in the TreeSet.
    isEmpty(): Checks if the TreeSet is empty.
    size(): Returns the size of the TreeSet.
    subSet(): Returns a subset of elements within a specified range.
    headSet(): Returns a subset of elements less than a specified element.
    tailSet(): Returns a subset of elements greater than or equal to a specified element.
    pollFirst(): Removes and returns the first element in the TreeSet.
    pollLast(): Removes and returns the last element in the TreeSet.
    clear(): Clears all elements from the TreeSet.
  */

 import java.util.*;

public class J04 {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(4);

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element is present in the TreeSet
        System.out.println("Contains 5: " + treeSet.contains(5));

        // Removing an element from the TreeSet
        treeSet.remove(4);
        System.out.println("After removing 4: " + treeSet);

        // Finding the first and last elements in the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Checking if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Getting the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Creating a subset of the TreeSet
        SortedSet<Integer> subset = treeSet.subSet(2, 8);
        System.out.println("Subset (2, 8): " + subset);

        // Creating a headSet of the TreeSet
        SortedSet<Integer> headSet = treeSet.headSet(5);
        System.out.println("HeadSet (less than 5): " + headSet);

        // Creating a tailSet of the TreeSet
        SortedSet<Integer> tailSet = treeSet.tailSet(5);
        System.out.println("TailSet (greater than or equal to 5): " + tailSet);

        // Polling the first and last elements from the TreeSet
        System.out.println("Polled first element: " + treeSet.pollFirst());
        System.out.println("Polled last element: " + treeSet.pollLast());

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("Cleared TreeSet: " + treeSet);
    }
}

