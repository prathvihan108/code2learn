//Vectors Specific methods
//There will be more
package Collections.list;

import java.util.Vector;

public class J07 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // addElement(E obj): Adds the specified component to the end of this vector, increasing its size by one.
        vector.addElement(1);
        vector.addElement(2);
        System.out.println("Vector after addElement: " + vector);

        // capacity(): Returns the current capacity of this vector.
        int capacity = vector.capacity();
        System.out.println("Capacity of Vector: " + capacity);

        // clone(): Returns a clone of this vector.
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // copyInto(Object[] anArray): Copies the components of this vector into the specified array.
        Integer[] array = new Integer[vector.size()];
        vector.copyInto(array);
        System.out.print("Copied Vector into array: ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // elementAt(int index): Returns the component at the specified index.
        Integer elementAt1 = vector.elementAt(1);
        System.out.println("Element at index 1 of Vector: " + elementAt1);

        // elements(): Returns an enumeration of the components of this vector.
        System.out.print("Enumeration of Vector elements: ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.elementAt(i) + " ");
        }
        System.out.println();

        // ensureCapacity(int minCapacity): Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.
        vector.ensureCapacity(10);
        System.out.println("Vector after ensuring capacity: " + vector);

        // firstElement(): Returns the first component (the item at index 0) of this vector.
        Integer firstElement = vector.firstElement();
        System.out.println("First element of Vector: " + firstElement);

        // insertElementAt(E obj, int index): Inserts the specified object as a component in this vector at the specified index.
        vector.insertElementAt(3, 1);
        System.out.println("Vector after inserting element at index 1: " + vector);

        // lastElement(): Returns the last component of the vector.
        Integer lastElement = vector.lastElement();
        System.out.println("Last element of Vector: " + lastElement);
    }
}

