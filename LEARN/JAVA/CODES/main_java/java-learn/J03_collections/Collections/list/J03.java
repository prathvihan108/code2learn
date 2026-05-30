
/*
 * The Iterable and Iterator interfaces in Java are closely related and are often used together, but they serve different purposes:

    Iterable Interface:
        Purpose: The Iterable interface represents a collection of elements that can be iterated over.
        Methods: It declares a single method, iterator(), which returns an Iterator object that can be used to iterate over the elements of the collection.
        Usage: Classes that implement the Iterable interface provide an implementation of the iterator() method, which allows instances of those classes to be used in enhanced for loops (for-each loops) and other contexts where iteration over elements is re
 
    Iterator Interface:

    Purpose: The Iterator interface provides a way to sequentially access elements of a collection, one at a time, without exposing the underlying implementation of the collection.
    Methods: It declares three methods: hasNext(), next(), and remove().
        hasNext(): Returns true if there are more elements in the iteration.
        next(): Returns the next element in the iteration.
        remove(): Removes the last element returned by the iterator from the underlying collection (optional operation).
        */
package Collections.list;

public class J03 {
    
}
