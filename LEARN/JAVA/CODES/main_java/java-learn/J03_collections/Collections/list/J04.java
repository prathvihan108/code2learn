
//LinkedList
//Common methods which are implemeted from the list interface
/*
 * LinkedList:

    The LinkedList class implements the List interface and also Deque interface.
    It uses a doubly linked list to store elements of different data types. (It can store duplicates).
    The LinkedList class maintains the insertion order and is non-synchronized.
    The elements stored in the LinkedList class can be accessed sequentially only.(no constant time searching avalable similar to the arrays)
    Internally, it is implemented using nodes with references to the previous and next elements.
    In LinkedList, the manipulation is fast because no shifting is required.
 */
package Collections.list;

import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class J04 {
    public static void main(String[] args) {
        // Creating a Vector
        List<Integer> numbers = new Vector<>();

        // Adding elements to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector after adding elements: " + numbers);

        // Inserting an element at a specific position
        numbers.add(1, 15);
        System.out.println("Vector after inserting element at index 1: " + numbers);

        // Getting an element at a specific position
        int element = numbers.get(2);
        System.out.println("Element at index 2: " + element);

        // Finding the index of an element
        int index = numbers.indexOf(20);
        System.out.println("Index of element 20: " + index);

        // Removing an element by index
        numbers.remove(3);
        System.out.println("Vector after removing element at index 3: " + numbers);

        // Removing an element by value
        numbers.remove(Integer.valueOf(15));
        System.out.println("Vector after removing element 15: " + numbers);

        // Checking if the Vector is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);

        // Getting the size of the Vector
        int size = numbers.size();
        System.out.println("Size of Vector: " + size);

        // Iterating over the elements using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Vector elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Replacing an element at a specific index
        numbers.set(1, 25);
        System.out.println("Vector after replacing element at index 1 with 25: " + numbers);

        // Replacing all elements with a specific value
        numbers.replaceAll(n -> n * 2);
        System.out.println("Vector after replacing all elements with double values: " + numbers);

        // Creating a sublist
        List<Integer> sublist = numbers.subList(1, 3);
        System.out.println("Sublist of Vector from index 1 to 3: " + sublist);

        // Sorting the Vector
        Collections.sort(numbers);
        System.out.println("Vector after sorting: " + numbers);

  

        // Performing binary search
        int searchKey = 30;
        int searchResult = Collections.binarySearch(numbers, searchKey);
        if (searchResult >= 0) {
            System.out.println("Element " + searchKey + " found at index " + searchResult);
        } else {
            System.out.println("Element " + searchKey + " not found");
        }
    }
}

