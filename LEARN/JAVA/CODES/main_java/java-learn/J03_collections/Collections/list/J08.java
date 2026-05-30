//Stacks
//Stacks common methods
/*
 * Stack:  note:Stack Extents the Vector not implement but however it can still access all the methods present in the list

    The Stack class extends the Vector class and implements the List interface.
    It uses a dynamic array to store elements of different data types. (It can store duplicates)
    The Stack class maintains the Last-In-First-Out (LIFO) order and is synchronized.
    The elements stored in the Stack class can be accessed sequentially or through indexed access.
    Internally, it is implemented using arrays, similar to ArrayList and Vector.
    Even though the stack extends from the vector class but it does not inherit the synchronisation property.
     
    It is similar to ArrayList. However, 
     It is synchronized and contains many methods that are not the part of Collection framework.

    Disadvantages will be same as that of the  Vector .
     
    it throws an UnsupportedOperationException when called the unsupported methods which are implemented by the Stack class but we are not supposed to use those methods or not applicable

 */
package Collections.list;

import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class J08 {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> numbers = new Stack<>();

        // Adding elements to the Stack
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("Stack after adding elements: " + numbers);

        // Inserting an element at a specific position (not applicable for Stack)

        // Getting the top element of the Stack
        int element = numbers.peek();
        System.out.println("Top element of the Stack: " + element);

        // Finding the index of an element (not applicable for Stack)

        // Removing the top element
        int removedElement = numbers.pop();
        System.out.println("Removed element from the Stack: " + removedElement);

        // Checking if the Stack is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is Stack empty? " + isEmpty);

        // Getting the size of the Stack
        int size = numbers.size();
        System.out.println("Size of Stack: " + size);

        // Iterating over the elements using an iterator (not recommended for Stack)

        // Replacing an element at a specific index (not applicable for Stack)

        // Replacing all elements with a specific value (not applicable for Stack)

        // Creating a sublist (not applicable for Stack)

        // Sorting the Stack (not applicable for Stack)

        // Performing binary search (not applicable for Stack)

        // it throws an UnsupportedOperationException when called the unsupported methods which are implemented by the Stack class but we are not supposed to use those methods or not applicable
    }
}

