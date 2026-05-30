/*
 * LinkedHashSet

LinkedHashSet class represents the LinkedList implementation of Set Interface. 
It extends the HashSet class and implements Set interface. 
Like HashSet, It also contains unique elements. 
It maintains the insertion order and permits null elements.
The internal implentation is the doubley linkedllist,and not the hashtable.(The 'Hash'in the name of the class represent that the class is extending the HashSet class)
This is also not ThreadSafe.
Since it's internal implementation is not hash table so it is little slow.
 */
/*
 * The main difference between HashSet and LinkedHashSet lies in their iteration order:

    HashSet:
        Does not guarantee any specific iteration order. 
        The order of elements in a HashSet is not defined, and it may vary over time or between different JVM implementations.
        Uses hashing to store elements, which provides constant-time performance for add, remove, and contains operations (on average).

    LinkedHashSet:
        Maintains the insertion order of elements. 
        The order of elements in a LinkedHashSet is the same as the order in which they were inserted.
        Achieves this by maintaining a doubly-linked list running through all of its entries.
        Slower insertion, deletion, and lookup operations compared to HashSet because it needs to maintain the linked list.
 */


 import java.util.LinkedHashSet;
import java.util.Iterator;

public class J03 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Display size of the set
        System.out.println("Size of set: " + set.size());

        // Check if set contains a specific element
        System.out.println("Set contains 'Apple': " + set.contains("Apple"));

        // Add another element
        set.add("Grapes");

        // Check if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // Create a new LinkedHashSet and add elements for testing containsAll
        LinkedHashSet<String> otherSet = new LinkedHashSet<>();
        otherSet.add("Apple");
        otherSet.add("Banana");

        // Check if set contains all elements of another set
        System.out.println("Set contains all elements of otherSet: " + set.containsAll(otherSet));

        // Remove an element from the set
        set.remove("Orange");

        // Display size of the set after removal
        System.out.println("Size of set after removal: " + set.size());

        // Iterate over the elements of the set
        //iterates in the order of insertion
        System.out.println("Elements of set:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear the set
        set.clear();

        // Check if set is empty after clearing
        System.out.println("Is set empty after clearing? " + set.isEmpty());
    }
}

