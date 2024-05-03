/*
 * In Java, the Queue interface is part of the java.util package and is a subinterface of the Collection interface. 
 * It represents a collection of elements that follows the First-In-First-Out (FIFO) order. 
 * Here are some of the basic methods provided by the Queue interface:
 */

import java.util.LinkedList;
import java.util.Queue;

public class J01 {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>(); //note hete u can not create a object of queue since it is a interface.

        // Enqueue elements using offer
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Display the queue
        System.out.println("Queue after offer: " + queue);

        // Dequeue elements using poll
        String polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after poll: " + queue);

        // Try removing an element using remove
        try {
            String removedElement = queue.remove();
            System.out.println("Removed element: " + removedElement);
        } catch (Exception e) {
            System.out.println("Queue is empty. Exception caught: " + e);
        }

        // Peek at the front element using peek
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        // Check if the queue contains an element
        boolean containsElement = queue.contains("Element 2");
        System.out.println("Does the queue contain 'Element 2'? " + containsElement);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Enqueue more elements using offer
        queue.offer("Element 4");
        queue.offer("Element 5");

        // Display the queue
        System.out.println("Queue after offer: " + queue);

        // Demonstrate the element() method
        try {
            String front = queue.element();
            System.out.println("Front element (element): " + front);
        } catch (Exception e) {
            System.out.println("Queue is empty. Exception caught: " + e);
        }

        // Demonstrate the clear() method
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}
