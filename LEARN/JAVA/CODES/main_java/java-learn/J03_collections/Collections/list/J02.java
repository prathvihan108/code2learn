
//Some of the ArrayList specific methods are as given below 
package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class J02 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList after adding elements: " + numbers);

        // Ensuring capacity
        numbers.ensureCapacity(10);

        // Trimming capacity
        numbers.trimToSize();

        // Cloning the ArrayList
        ArrayList<Integer> cloneList = (ArrayList<Integer>) numbers.clone();
        System.out.println("Clone of ArrayList: " + cloneList);

        // Converting ArrayList to an array
        Object[] array = numbers.toArray();
        System.out.println("Array representation of ArrayList: " + Arrays.toString(array));

        // Removing elements in a range
        //numbers.removeRange(1, 3);  note: here we can not access the removeRange() method since it is protected in the arraylist classs
        System.out.println("ArrayList after removing elements in range: " + numbers);
    }
}

