//LinkedList Specific methods
//There will be more

/*
 * Note:
 * LinkedList is implemented as a doubly linked list, where each element is stored in a separate Node object,
 *  linked to its previous and next elements.This structure allows for efficient insertions and removals at both ends 
 * of the list, making it suitable for implementing a deque.
 */
package Collections.list;

import java.util.LinkedList;

public class J05 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // addFirst(E e): Inserts the specified element at the beginning of this list.
        list.addFirst(1);
        list.addFirst(2);
        System.out.println("LinkedList after addFirst: " + list);

        // addLast(E e): Appends the specified element to the end of this list.
        list.addLast(3);
        list.addLast(4);
        System.out.println("LinkedList after addLast: " + list);

        // getFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        Integer first = list.getFirst();
        System.out.println("First element of LinkedList: " + first);

        // getLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
        Integer last = list.getLast();
        System.out.println("Last element of LinkedList: " + last);

        // removeFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty.
        Integer removedFirst = list.removeFirst();
        System.out.println("Removed first element of LinkedList: " + removedFirst);
        System.out.println("LinkedList after removeFirst: " + list);

        // removeLast(): Retrieves and removes the last element of this list, or returns null if this list is empty.
        Integer removedLast = list.removeLast();
        System.out.println("Removed last element of LinkedList: " + removedLast);
        System.out.println("LinkedList after removeLast: " + list);

        // offerFirst(E e): Inserts the specified element at the front of this list.
        list.offerFirst(5);
        System.out.println("LinkedList after offerFirst: " + list);

        // offerLast(E e): Inserts the specified element at the end of this list.
        list.offerLast(6);
        System.out.println("LinkedList after offerLast: " + list);

        // pollFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty.
        Integer polledFirst = list.pollFirst();
        System.out.println("Polled first element of LinkedList: " + polledFirst);
        System.out.println("LinkedList after pollFirst: " + list);

        // pollLast(): Retrieves and removes the last element of this list, or returns null if this list is empty.
        Integer polledLast = list.pollLast();
        System.out.println("Polled last element of LinkedList: " + polledLast);
        System.out.println("LinkedList after pollLast: " + list);
    }
}

