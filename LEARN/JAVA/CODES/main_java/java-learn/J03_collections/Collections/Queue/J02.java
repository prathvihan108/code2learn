//Custom Comparator for the Priority queue
/*
 *   /*
   * Comaprator vs Comparable
   * 
   *     Purpose:
        Comparable: This interface is used to define the natural ordering of a class. It is implemented by the class whose instances are meant to be compared for natural ordering.
        Comparator: This interface is used to define custom orderings for classes that may not implement Comparable, or to define alternative orderings for classes that do implement Comparable.

    Usage:
        Comparable: Objects that implement Comparable provide their own natural ordering by implementing the compareTo method. This method defines how an object should be compared to another object of the same type.
        Comparator: Instances of Comparator are used to compare objects of a particular type. They define a comparison strategy by implementing the compare method. These comparators can be used to sort collections of objects or to order objects in other ways.
   */
  /*
   * note:
   * PriorityQueue is implemented using a priority heap, which is a binary heap.
    Internally, it uses an array-based data structure to store elements, where elements are arranged based on their priority.
    The array is dynamically resized as needed to accommodate more elements.
    PriorityQueue is not synchronized. It is not thread-safe for concurrent access
    
   */

package Collections.Queue;

import java.util.*;

public class J02 {
    public static void main(String args[]) {
        // Create a custom comparator that prioritizes higher integer values
       
        Comparator<Integer> customComparator = new Comparator<Integer>() {//this is a anonymous class which implements the comparator interface(functional interface)
            @Override
            public int compare(Integer o1, Integer o2) {
                // Higher integer values have higher priority
                return Integer.compare(o2, o1);//by reversing the order of comparison we can also reverse the priority too.s
            }
        };

        // Create a PriorityQueue with the custom comparator
        PriorityQueue<Integer> queue = new PriorityQueue<>(customComparator);

        // Add elements to the queue
        queue.add(5);
        queue.add(10);
        queue.add(3);
        queue.add(8);

        // Print the elements in the queue
        System.out.println("Elements in the queue: " + queue);

        // Iterate through the queue (Note: The iteration order may not reflect the priority order)
        System.out.println("Iterating the queue elements:");
        for (Integer element : queue) {
            System.out.println(element);
        }
    }
}

