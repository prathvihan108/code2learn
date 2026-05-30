/*
 * demonstrating HashsSet does not follow any oder .
 */

import java.util.HashSet;
import java.util.Iterator;

public class J06 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(4);

        // Creating an iterator for the HashSet
        Iterator<Integer> iterator = hashSet.iterator();

        // Traversing the HashSet using the iterator
        System.out.println("Elements of HashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

