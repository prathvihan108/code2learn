//use the sorting and searching methods as shown here using collections framework for easy
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class J04 {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(1,2,3,4));//this is how u can initlise arrays list
        //for initilising u neeed to provide it a a list only so we use Arrays.asList()  method

        arr.add(2);

    }
    
}//important things to remember for arrays lists
/*
 * Certainly! When working with ArrayList in DSA problem-solving, here are some important notes to keep in mind:

    Dynamic Sizing:
        ArrayList dynamically resizes itself as elements are added or removed. It automatically handles the resizing of the underlying array.

    Random Access:
        ArrayList provides fast random access to elements using their index. Retrieving, setting, and iterating through elements is efficient.

    Contiguous Memory:
        Elements in an ArrayList are stored in contiguous memory locations. This allows for efficient access but can lead to performance issues when inserting or removing elements in the middle of the list.

    Autoboxing and Unboxing:
        ArrayList stores elements as objects, so primitive types are automatically converted to their corresponding wrapper classes (autoboxing) and vice versa (unboxing).

    Resizing Overhead:
        Resizing an ArrayList involves creating a new array and copying elements from the old array. This operation has a time complexity of O(n), where n is the number of elements.

    Use Generics:
        Always use generics to specify the type of elements the ArrayList will hold (e.g., ArrayList<Integer>). This ensures type safety and avoids casting issues.

    Capacity Management:
        ArrayList has an initial capacity, and it grows as needed. You can specify an initial capacity when creating an ArrayList to reduce the number of resizing operations.

    Iteration and Removal:
        Be cautious when removing elements from an ArrayList during iteration. Use an iterator or loop carefully to avoid ConcurrentModificationException.

    Use Appropriate Data Structure:
        While ArrayList is useful for random access and dynamic sizing, it might not be the best choice for frequent insertions or removals in the middle of the list. In such cases, consider other data structures like LinkedList.

    Sorting:
        ArrayList provides a sort method, but keep in mind that it modifies the existing list. If you need to preserve the original order, consider creating a copy of the list before sorting.

    Concurrent Access:
        ArrayList is not synchronized, so if multiple threads are accessing and modifying an ArrayList concurrently, external synchronization is needed (e.g., using Collections.synchronizedList).

    Memory Efficiency:
        If memory efficiency is a concern, consider using the trimToSize method to reduce the ArrayList capacity to the actual size of the list.
 */
