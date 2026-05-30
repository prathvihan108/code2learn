package CollectionsClass;

/*
 * The java.util.Collections class in Java provides various utility methods for working with collections 
 * (such as lists, sets, and maps). Below is a single code block demonstrating the use of several methods 
 * from the Collections class:
 */

 import java.util.*;

public class J01 {
    public static void main(String[] args) {
        // 1. sort()
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        Collections.sort(list);
        System.out.println("Sorted list: " + list); // Output: [1, 2, 3, 5, 8]

        // 2. binarySearch()
        int index = Collections.binarySearch(list, 3);
        System.out.println("Index of 3: " + index); // Output: Index of 3: 2

        // 3. reverse()
        Collections.reverse(list);
        System.out.println("Reversed list: " + list); // Output: [8, 5, 3, 2, 1]

        // 4. shuffle()
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        // 5. swap()
        Collections.swap(list, 0, 4);
        System.out.println("Swapped list: " + list); // Output: [1, 5, 3, 2, 8]

        // 6. fill()
        Collections.fill(list, 0);
        System.out.println("Filled list: " + list); // Output: [0, 0, 0, 0, 0]

        // 7. copy()
        List<Integer> destList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.copy(destList, list);
        System.out.println("Copied list: " + destList); // Output: [0, 0, 0, 0, 0]

        // 8. min()
        Integer min = Collections.min(list);
        System.out.println("Minimum element: " + min); // Output: Minimum element: 0

        // 9. max()
        Integer max = Collections.max(list);
        System.out.println("Maximum element: " + max); // Output: Maximum element: 0

        // 10. frequency()
        int frequency = Collections.frequency(list, 0);
        System.out.println("Frequency of 0: " + frequency); // Output: Frequency of 0: 5

        // 11. disjoint()
        List<Integer> disjointList = Arrays.asList(9, 10, 11);
        boolean disjoint = Collections.disjoint(list, disjointList);
        System.out.println("Disjoint: " + disjoint); // Output: Disjoint: true

        // 12. addAll()
        Collections.addAll(list, 1, 2, 3);
        System.out.println("Updated list: " + list); // Output: Updated list: [0, 0, 0, 0, 0, 1, 2, 3]

        // 13. checkedList()
        List<String> checkedList = Collections.checkedList(new ArrayList<>(), String.class);
        checkedList.add("Hello");
        System.out.println("Checked list: " + checkedList); // Output: Checked list: [Hello]

        // 14. synchronizedList()
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add(5);
        System.out.println("Synchronized list: " + synchronizedList); // Output: Synchronized list: [5]

        // 15. unmodifiableList()
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        // unmodifiableList.add(6); // UnsupportedOperationException
        System.out.println("Unmodifiable list: " + unmodifiableList); // Output: Unmodifiable list: [0, 0, 0, 0, 0, 1, 2, 3]

        // 16. singletonList()
        List<String> singletonList = Collections.singletonList("Singleton");
        System.out.println("Singleton list: " + singletonList); // Output: Singleton list: [Singleton]

        // 17. emptyList()
        List<Object> emptyList = Collections.emptyList();
        System.out.println("Empty list: " + emptyList); // Output: Empty list: []

        // 18. list()
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " "); // Output: 0 0 0 0 0 1 2 3
        }
        System.out.println();

        // 19. reverseOrder()
        Comparator<Integer> reverseOrder = Collections.reverseOrder();
        Collections.sort(list, reverseOrder);
        System.out.println("Sorted list in reverse order: " + list); // Output: Sorted list in reverse order: [3, 2, 1, 0, 0, 0, 0, 0]

        // 20. synchronizedSet()
        Set<Integer> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
        synchronizedSet.add(5);
        System.out.println("Synchronized set: " + synchronizedSet); // Output: Synchronized set: [5]

        // 21. unmodifiableSet()
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(new HashSet<>(list));
        // unmodifiableSet.add(6); // UnsupportedOperationException
        System.out.println("Unmodifiable set: " + unmodifiableSet); // Output: Unmodifiable set: [0, 1, 2, 3]

        // 22. synchronizedMap()
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        synchronizedMap.put("One", 1);
        System.out.println("Synchronized map: " + synchronizedMap); // Output: Synchronized map: {One=1}

        // 23. unmodifiableMap()
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(new HashMap<>());
        // unmodifiableMap.put("Two", 2); // UnsupportedOperationException
        System.out.println("Unmodifiable map: " + unmodifiableMap); // Output: Unmodifiable map: {}
    }
}
/*

    sort(): Sorts the list in ascending order.
    binarySearch(): Searches for a value in a sorted list.
    reverse(): Reverses the order of elements in the list.
    

4. **shuffle()**: Randomly shuffles the elements in the list.
5. **swap()**: Swaps the elements at the specified positions in the list.
6. **fill()**: Assigns the specified value to each element in the list.
7. **copy()**: Copies all of the elements from one list into another list.
8. **min()**: Returns the minimum element of the list.
9. **max()**: Returns the maximum element of the list.
10. **frequency()**: Returns the frequency of the specified element in the list.
11. **disjoint()**: Checks if two collections have no elements in common.
12. **addAll()**: Adds all of the specified elements to the collection.
13. **checkedList()**: Returns a dynamically typesafe view of the specified list.
14. **synchronizedList()**: Returns a synchronized (thread-safe) list backed by the specified list.
15. **unmodifiableList()**: Returns an unmodifiable view of the specified list.
16. **singletonList()**: Returns an immutable list containing only the specified object.
17. **emptyList()**: Returns an empty immutable list.
18. **list()**: Returns an enumeration over the specified list.
19. **reverseOrder()**: Returns a comparator that imposes the reverse of the natural ordering.
20. **synchronizedSet()**: Returns a synchronized (thread-safe) set backed by the specified set.
21. **unmodifiableSet()**: Returns an unmodifiable view of the specified set.
22. **synchronizedMap()**: Returns a synchronized (thread-safe) map backed by the specified map.
23. **unmodifiableMap()**: Returns an unmodifiable view of the specified map.

These methods provide various functionalities to manipulate and work with collections in Java. Each method serves a specific purpose and can be used according to the requirements of your application.

 */