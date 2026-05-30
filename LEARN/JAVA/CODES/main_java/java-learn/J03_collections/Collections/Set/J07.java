/*
 * only few classes in the java collection frame work allow u to acces the elements by index,
 * some are as listed below:
 * ArrayList
 * LinkedList
 * Vector
 * -->All the above classess provide the .get(index) method for accesing the elemenet from the index.
 * -->Even though the linked list does not allow random access we can still use the .get() method because it traverses and then gives the element
 * -->The PrirityQueue and the ArrayDequeue also does not allow the .get() method.But if we want to acces we need to convert it to Arraylist type or array
 *     
*   HashSet: HashSet is implemented using a hash table, and the order of elements is not guaranteed. 
    It does not provide direct access to elements by index because it does not maintain an order based on indices. 
    Elements are stored and accessed based on their hash codes, and the iteration order may vary based on the internal 
    implementation.

    LinkedHashSet: LinkedHashSet is implemented as a hash table with a linked list running through it,
     maintaining the insertion order of elements. While LinkedHashSet preserves the insertion order, 
     it still does not provide direct access to elements by index. You can iterate over the elements in insertion order
      using an iterator or enhanced for-loop, but you cannot access elements by index directly.
 */

 //Note:Eventhough we are calling every method by directly on the classes does not imply that it has the constant time complexity.
//Just go through he various methods and try to guess their time complexities.
//For example :
//The following methods have diffrence in their time complexitys when used by ArrayList vs LinkedList
//Insertion/Removal at the Beginning::(add or remove methods)
//Insertion/Removal at the End:
//Random Access:(.get() method) 


//Note:
//We can even convert the form one class to another class as shown below ,provided that the class to which we want to 
//convert must contain the constructor for the conversion ashown in below example.


import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class J07 {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Convert LinkedHashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedHashSet);

        // Print the elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}

