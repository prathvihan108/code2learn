//Vectors
//Common methods
/*
 * Vector:Dicto similar to the arraylist but is synchronised

    The Vector class implements the List interface.
    It uses a dynamic array to store elements of different data types. (It can store duplicates)
    The Vector class maintains the insertion order and is synchronized.
    The elements stored in the Vector class can be randomly accessed.
    Internally, it is implemented using arrays, similar to ArrayList.
 */
/*
 * Using Vectors over ArrayLists in Java has several disadvantages:

    Synchronization Overhead: Vectors are synchronized, meaning they are thread-safe for concurrent access. However, this synchronization comes with overhead. Even if your program doesn't require thread safety, this synchronization can impact performance.

    Performance: Due to the synchronization overhead mentioned above, ArrayList tends to perform better in single-threaded environments. ArrayList is not synchronized by default, which means it's faster for operations in a single-threaded context.

    Flexibility: Vectors are a legacy class and have not been updated since the introduction of the Collections Framework. They do not support the full range of operations provided by ArrayList and other more modern collection classes.

    Enumeration Over Iterator: Vectors use Enumeration, whereas ArrayList uses Iterator. Enumeration has fewer functionalities compared to Iterator. For example, Iterator allows removal of elements during traversal, which Enumeration doesn't.

    Obsolete: Vectors are considered obsolete in modern Java development. The Java Collections Framework, introduced in Java 2, provides more flexible and efficient alternatives. ArrayList is preferred over Vector in most scenarios due to its better performance and flexibility.

    Resize Operations: Like ArrayList, Vectors dynamically resize when needed. However, Vectors use a growth increment, while ArrayList uses a growth factor. The growth factor typically results in less memory overhead compared to the growth increment used by Vectors.
 */
package Collections.list;

import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class J06 {
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

