/*
 * Deque Interface

Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. 
Deque stands for a double-ended queue(Not remobing the element) which enables us to perform the operations at both the ends.

Deque can be instantiated as:

    Deque d = new ArrayDeque();  //Array Dequeue implemets the Dequeue interface.
   
    The Deque (Double Ended Queue) interface represents a queue where you can insert and remove elements from both ends.
    It can function as a FIFO (queue) or a LIFO (stack).
    It extends the Queue interface, adding methods to support insertion and removal at both ends.
    Some common implementations of the Deque interface are ArrayDeque and LinkedList.
 */
/*
 * ArrayDeque

ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.

ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

    ArrayDeque is implemented using a resizable array.
    It maintains a circular array internally, where elements can be inserted and removed from both ends efficiently.
    Like ArrayList, it dynamically resizes the underlying array as needed when elements are added or removed.
    ArrayDequeue is not synchronized. It is not thread-safe for concurrent access

Consider the following example.
 */
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class J03 {
    public static void main(String[] args) throws InterruptedException {
        // Creating a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front and end of the deque
        deque.addFirst("First");
        deque.offerLast("Last");

        // Printing the deque
        System.out.println("Deque: " + deque);

        // Retrieving and removing the first and last elements
        String firstElement = deque.pollFirst();//poll() also acts same as the pollfirst fot the ArrayDequeue,poll is prom the Dequeue
        String lastElement = deque.removeLast();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Deque after removal: " + deque);

        // Adding elements at the front and end of the deque
        deque.offerFirst("New First");
        deque.addLast("New Last");

        System.out.println("Deque after adding new elements: " + deque);

        // Retrieving, but not removing, the first and last elements
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();

        System.out.println("Peek First: " + peekFirst);
        System.out.println("Peek Last: " + peekLast);

        // Iterating over the deque using iterator
        System.out.println("Iterating over the deque:");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}

