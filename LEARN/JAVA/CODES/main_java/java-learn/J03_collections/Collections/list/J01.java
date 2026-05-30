
package Collections.list;
/*
 * A collection is an object that represents a group of objects (such as the classic Vector class). 
 * A collections framework is a unified architecture for representing and manipulating collections,
 *  enabling collections to be manipulated independently of implementation details. 
 * 
 * Advantages:
 * 
    Reduces programming effort by providing data structures and algorithms so you don't have to write them yourself.
    Increases performance by providing high-performance implementations of data structures and algorithms. Because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.
    Provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth.
    Reduces the effort required to learn APIs by requiring you to learn multiple ad hoc collection APIs.
    Reduces the effort required to design and implement APIs by not requiring you to produce ad hoc collections APIs.
    Fosters software reuse by providing a standard interface for collections and algorithms with which to manipulate them.

    What is a framework in Java

    It provides readymade architecture.
    It represents a set of classes and interfaces.
    It is optional to use.But mostly prefferd and necessary for faster development.

    The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

    The java.util package contains all the classes and interfaces for the Collection framework.
     
    #    both ArrayList and arrays are used for storing elements, but they have several differences in terms of features, 
        behavior, and usage:
    Dynamic vs. Fixed Size:
    Type Safety:
    Methods and Operations:
    Performance:

    following are some of the most common methods provided by the list interface:(The following methods wil be common to all
    the classes which have implemented the list interface)

add(E element): Appends the specified element to the end of the list.
add(int index, E element): Inserts the specified element at the specified position in the list.
get(int index): Returns the element at the specified position in the list.
indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not present.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if the element is not present.
remove(int index): Removes the element at the specified position in the list and shifts any subsequent elements to the left.
remove(Object o): Removes the first occurrence of the specified element from the list, if present.
isEmpty(): Returns true if the list is empty, false otherwise.
size(): Returns the number of elements in the list.
iterator(): Returns an iterator over the elements in the list.
listIterator(): Returns a list iterator over the elements in the list.
set(int index, E element): Replaces the element at the specified position in the list with the specified element.
replaceAll(UnaryOperator<E> operator): Replaces each element of the list with the result of applying the specified operator.
subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified fromIndex, inclusive, and toIndex, exclusive.
sort(Comparator<? super E> c): Sorts the list according to the order induced by the specified comparator.
binarySearch(E key): Searches for the specified element in the list using the binary search algorithm.

/*
 * List Interface

List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :
 */



/*
ArrayList:
 * The ArrayList class implements the List interface.
 *  It uses a dynamic array to store the duplicate element of different data types.(It can store the duplicates ) 
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed. 
 * Internally it is implemented using the arrays
 * 
 * Consider the following example 
 */
/*
 * note:
 * ArrayList class in Java does not have methods named addLast or removeLast. 
 * These methods are specific to the Deque interface and are typically implemented by classes such as 
 * LinkedList and ArrayDeque.
 */

 import java.util.ArrayList;
 import java.util.*;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;
import java.util.function.UnaryOperator;

public class J01 {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList after adding elements: " + numbers);

        // Inserting an element at a specific position
        numbers.add(1, 15);
        System.out.println("ArrayList after inserting element at index 1: " + numbers);

        // Getting an element at a specific position
        int element = numbers.get(2);
        System.out.println("Element at index 2: " + element);

        // Finding the index of an element
        int index = numbers.indexOf(20);
        System.out.println("Index of element 20: " + index);

        // Removing an element by index
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Removing an element by value
        numbers.remove(Integer.valueOf(15));
        System.out.println("ArrayList after removing element 15: " + numbers);

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterating over the elements using an iterator
        Iterator<Integer> iterator = numbers.iterator();  //Iterator method from the iterable interfae is implemented in the every class that has implemented the iterable interface
        System.out.print("ArrayList elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Replacing an element at a specific index
        numbers.set(1, 25);
        System.out.println("ArrayList after replacing element at index 1 with 25: " + numbers);

        // Replacing all elements with a specific value
        numbers.replaceAll(n -> n * 2);
        System.out.println("ArrayList after replacing all elements with double values: " + numbers);

        // Creating a sublist
        List<Integer> sublist = numbers.subList(1, 3);
        System.out.println("Sublist of ArrayList from index 1 to 3: " + sublist);

        // Sorting the ArrayList
        numbers.sort(Comparator.naturalOrder());
        System.out.println("ArrayList after sorting: " + numbers);

        // Performing binary search
        int searchKey = 30;
        //note:binary search is a staic method so u need to call it using the interface name itself
        int searchResult = Collections.binarySearch(numbers, searchKey);;
        if (searchResult >= 0) {
            System.out.println("Element " + searchKey + " found at index " + searchResult);
        } else {
            System.out.println("Element " + searchKey + " not found");
        }
    }
}
