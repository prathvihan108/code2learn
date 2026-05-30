/*
 *     Hierarchical Placement:
        Map is a separate interface from Collection. It is not a subtype of Collection.

        Java Map Interface

        A map contains values on the basis of key, i.e. key and value pair.
         Each key and value pair is known as an entry. A Map contains unique keys.

         Java Map Hierarchy

        There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap,
         LinkedHashMap, and TreeMap.

    Types of Maps:
        HashMap: A hash table-based implementation of the Map interface.
        LinkedHashMap: A hash table and linked list implementation that maintains the insertion order of keys.
        TreeMap: A Red-Black tree-based implementation, which orders keys based on their natural ordering or a specified comparator.
        


    A Map doesn't allow duplicate keys, but you can have duplicate values. 
    HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

    A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

        Class	                       Description
       
        HashMap	      ------->        HashMap is the implementation of Map, but it doesn't maintain any order.(InternalImplementation:HashTable)
        
        LinkedHashMap ------->         LinkedHashMap is the implementation of Map. It inherits HashMap class. 
                                        It maintains insertion order.InternalImplementation:Doubly LL)
        
        TreeMap	      -------->         TreeMap is the implementation of Map and SortedMap. 
                                            It maintains ascending order.(Red Black tree)

    Common Methods:
        put(K key, V value): Associates the specified value with the specified key in the map.
        get(Object key): Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
        remove(Object key): Removes the mapping for a key from the map if it is present.
        containsKey(Object key): Returns true if the map contains a mapping for the specified key.
        containsValue(Object value): Returns true if the map maps one or more keys to the specified value.
        keySet(): Returns a set view of the keys contained in the map.
        values(): Returns a collection view of the values contained in the map.
        entrySet(): Returns a set view of the mappings contained in the map.

    Use Cases:
        Use Map when you need to associate keys with values, such as storing user information where user IDs are keys and user details are values, or looking up data by unique identifiers.
 */

 //Hash Map
 /*
  * 
  */
  import java.util.Hashtable; // Importing the Hashtable class
import java.util.Map; // Importing the Map interface
import java.util.Enumeration; // Importing the Enumeration interface

public class J01<K, V> {
    private Hashtable<K, V> hashtable; // Creating an instance of Hashtable

    public J01() {
        hashtable = new Hashtable<>();
    }

    // Method to add a key-value pair to the Hashtable
    public void put(K key, V value) {
        hashtable.put(key, value);
    }

    // Method to get the value associated with a key
    public V get(K key) {
        return hashtable.get(key);
    }

    // Method to remove a key-value pair by key
    public V remove(K key) {
        return hashtable.remove(key);
    }

    // Method to check if a key is present in the Hashtable
    public boolean containsKey(K key) {
        return hashtable.containsKey(key);
    }

    // Method to check if a value is present in the Hashtable
    public boolean containsValue(V value) {
        return hashtable.containsValue(value);
    }

    // Method to get the size of the Hashtable
    public int size() {
        return hashtable.size();
    }

    // Method to check if the Hashtable is empty
    public boolean isEmpty() {
        return hashtable.isEmpty();
    }

    // Method to clear all key-value pairs from the Hashtable
    public void clear() {
        hashtable.clear();
    }

    // Method to get a set view of the keys contained in the Hashtable
    public Enumeration<K> keys() {
        return hashtable.keys();
    }

    // Method to get a collection view of the values contained in the Hashtable
    public Enumeration<V> elements() {
        return hashtable.elements();
    }

    // Method to iterate through the map using keySet
    public void iterateUsingKeySet() {
        for (K key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }

    // Method to iterate through the map using entrySet
    public void iterateUsingEntrySet() {
        for (Map.Entry<K, V> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Method to iterate through the map using keys enumeration
    public void iterateUsingKeysEnumeration() {
        Enumeration<K> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            K key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }

    // Method to iterate through the map using elements enumeration
    public void iterateUsingElementsEnumeration() {
        Enumeration<V> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            V value = elements.nextElement();
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        J01<String, Integer> example = new J01<>();

        // Adding key-value pairs
        example.put("One", 1);
        example.put("Two", 2);
        example.put("Three", 3);

        // Retrieving a value
        System.out.println("Value for 'One': " + example.get("One"));

        // Removing a key-value pair
        example.remove("Two");

        // Checking if a key exists
        System.out.println("Contains 'Two': " + example.containsKey("Two"));

        // Checking if a value exists
        System.out.println("Contains value 3: " + example.containsValue(3));

        // Getting the size of the Hashtable
        System.out.println("Size: " + example.size());

        // Checking if the Hashtable is empty
        System.out.println("Is empty: " + example.isEmpty());

        // Iterating using keySet
        System.out.println("Iteration using keySet:");
        example.iterateUsingKeySet();

        // Iterating using entrySet
        System.out.println("Iteration using entrySet:");
        example.iterateUsingEntrySet();

        // Iterating using keys enumeration
        System.out.println("Iteration using keys enumeration:");
        example.iterateUsingKeysEnumeration();

        // Iterating using elements enumeration
        System.out.println("Iteration using elements enumeration:");
        example.iterateUsingElementsEnumeration();

        // Clearing the Hashtable
        example.clear();
        System.out.println("Size after clear: " + example.size());
    }
}
