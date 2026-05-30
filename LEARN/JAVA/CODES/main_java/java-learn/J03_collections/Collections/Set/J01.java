/*
 * Set Interface

Set Interface in Java is present in java.util package. 
It extends the Collection interface. 
It represents the unordered/ordered set of elements which doesn't allow us to store the duplicate items.
 We can store at most one null value in Set. 
 Set is implemented by HashSet, LinkedHashSet, and TreeSet.

Set can be instantiated as:

    Set<data-type> s1 = new HashSet<data-type>();  
    Set<data-type> s2 = new LinkedHashSet<data-type>();  
    Set<data-type> s3 = new TreeSet<data-type>();  
 */
/*
 * Hashing refers to the process of generating a fixed-size output from an input of variable size using the
 *  mathematical formulas known as hash functions. This technique determines an index or location for the storage 
 * of an item in a data structure
 * 
 * if Array was already there, what was the need for a new data structure! 
 * The answer to this is in the word “efficiency“. Though storing in Array takes O(1) time, 
 * searching in it takes at least O(log n) time. This time appears to be small, but for a large data set, 
 * it can cause a lot of problems and this, in turn, makes the Array data structure inefficient.
 * 
 * Here are majorly three components of hashing:

    Key: A Key can be anything string or integer which is fed as input in the hash function the technique 
    that determines an index or location for storage of an item in a data structure. 
    
    Hash Function: The hash function receives the input key and returns the index of an element in an array 
    called a hash table. The index is known as the hash index.
    
    Hash Table: Hash table is a data structure that maps keys to values using a special function called a hash function.
     Hash stores the data in an associative manner in an array where each data value has its own unique index

What is Collision?

The hashing process generates a small number for a big key, so there is a possibility that two keys could 
produce the same value. The situation where the newly inserted key maps to an already occupied, and it must 
be handled using some collision handling technology.

Advantages of the HashFunction

Advantages of Hashing in Data Structures

    Key-value support: Hashing is ideal for implementing key-value data structures.
    Fast data retrieval: Hashing allows for quick access to elements with constant-time complexity.
    Efficiency: Insertion, deletion, and searching operations are highly efficient.
    Memory usage reduction: Hashing requires less memory as it allocates a fixed space for storing elements.
    Scalability: Hashing performs well with large data sets, maintaining constant access time.
    Security and encryption: Hashing is essential for secure data storage and integrity verification.


 */
/*
 * HashSet

HashSet class implements Set Interface. 
It represents the collection that uses a hash table for storage. 
Hashing is used to store the elements in the HashSet. 
HashSet class in Java is not thread-safe. 
It is not synchronized,meaning it does not provide implicit protection against concurrent access by multiple threads.
It contains unique items.
 */
/*
 * Here are some of the most commonly used methods of the HashSet class in Java:

    add(E e): Adds the specified element to the set if it is not already present.

    addAll(Collection<? extends E> c): Adds all the elements of the specified collection to the set if they are not already present.

    clear(): Removes all the elements from the set.

    contains(Object o): Returns true if the set contains the specified element.

    containsAll(Collection<?> c): Returns true if the set contains all the elements of the specified collection.

    isEmpty(): Returns true if the set contains no elements.

    iterator(): Returns an iterator over the elements in the set.

    remove(Object o): Removes the specified element from the set if it is present.

    removeAll(Collection<?> c): Removes all the elements from the set that are present in the specified collection.

    retainAll(Collection<?> c): Retains only the elements in the set that are present in the specified collection.

    size(): Returns the number of elements in the set.

    toArray(): Returns an array containing all the elements in the set.

    toArray(T[] a): Returns an array containing all the elements in the set; the runtime type of the returned array is that of the specified array.
 */

 import java.util.HashSet;
 import java.util.Iterator;
 
 public class J01 {
     public static void main(String[] args) {
         // Create a HashSet of strings
         HashSet<String> set = new HashSet<>();
 
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
 
         // Create a new HashSet and add elements for testing containsAll
         HashSet<String> otherSet = new HashSet<>();
         otherSet.add("Apple");
         otherSet.add("Banana");
 
         // Check if set contains all elements of another set
         System.out.println("Set contains all elements of otherSet: " + set.containsAll(otherSet));
 
         // Remove an element from the set
         set.remove("Orange");
 
         // Display size of the set after removal
         System.out.println("Size of set after removal: " + set.size());
 
         // Iterate over the elements of the set
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
 