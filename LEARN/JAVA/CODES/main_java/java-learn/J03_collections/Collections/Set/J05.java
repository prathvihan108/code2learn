//The TreeSet is ordered which means that theit is a particular order meintained for the traversal (or has a fixes logic for the traversal)
//unlike HashSet which does not have the order which means it depends on the system or jvm for the order of traversal or (meaning that the output of the iteration may even change when u compile the same program again)

import java.util.*;

public class J05 {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(4);

        // Getting an iterator for the TreeSet
        Iterator<Integer> iterator = treeSet.iterator();

        // Traversing the TreeSet using the iterator
        System.out.println("Elements of TreeSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

