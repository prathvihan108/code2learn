//use the sorting and searching methods as shown here using collections framework for easy
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J03{
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> myList = new ArrayList<>();

        // Basic Operations
        myList.add(1);                  // add
        myList.add(2);
        myList.add(3);
        System.out.println("Original List: " + myList);

        myList.add(1, 10);              // add at specific index
        System.out.println("List after adding at index 1: " + myList);

        myList.remove(2);               // remove at index
        System.out.println("List after removing at index 2: " + myList);

        int elementAtIndex1 = myList.get(1);  // get element at index
        System.out.println("Element at index 1: " + elementAtIndex1);

        myList.set(0, 100);             // set element at index
        System.out.println("List after setting element at index 0: " + myList);

        // Search and Check
        boolean containsElement = myList.contains(100);  // contains
        System.out.println("List contains 100: " + containsElement);

        int indexOfElement = myList.indexOf(10);       // index of
        System.out.println("Index of 10: " + indexOfElement);

        boolean isEmpty = myList.isEmpty();             // is empty
        System.out.println("Is list empty: " + isEmpty);

        // Iteration
        System.out.print("List elements using forEach: ");
        myList.forEach(element -> System.out.print(element + " "));
        System.out.println();

        System.out.print("List elements using iterator: ");
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sorting and Reversing
        Collections.sort(myList);                       // sort
        System.out.println("Sorted List: " + myList);

        Collections.reverse(myList);                    // reverse
        System.out.println("Reversed List: " + myList);

        // Sublist Operations
        List<Integer> sublist = myList.subList(1, 3);    // sublist
        System.out.println("Sublist from index 1 to 3: " + sublist);

        // Conversion to Array
        Integer[] array = myList.toArray(new Integer[0]); // to array
        System.out.print("Array from List: ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Size and Capacity
        int size = myList.size();                        // size
        System.out.println("Size of the List: " + size);

        ((ArrayList<Integer>) myList).trimToSize();      // trim to size

        // Bulk Operations
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(5);
        anotherList.add(6);

        myList.addAll(anotherList);                     // addAll //adds arrays list
        System.out.println("List after adding all elements from anotherList: " + myList);

        myList.removeAll(anotherList);                  // removeAll
        System.out.println("List after removing all elements from anotherList: " + myList);
    }
}
