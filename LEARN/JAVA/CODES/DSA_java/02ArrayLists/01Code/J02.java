import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(4, 2, 1, 3));

        // Basic ArrayList functions
        myList.add(5);
        myList.addAll(Arrays.asList(6, 7, 8));
        myList.remove(Integer.valueOf(3));
        myList.remove(1);

        // Sort the ArrayList using a custom comparator (descending order)
        myList.sort(Comparator.reverseOrder());  //comparator is an interface whose  specially created object we are passing to sort function
//although we can not create objects of interfaces in java
        System.out.println("myList: " + myList);

        List<String> myStrings = Arrays.asList("Apple", "Orange", "kivi");
        myStrings.sort(Comparator.comparingInt(String::length));//sorts based on length
        System.out.println(myStrings);

    }
}

