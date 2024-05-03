import java.util.ArrayList;
import java.util.Arrays;

public class J01{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));//Arrays.asList() is a function of Arrays class which takes n elements as varargs and returns the list

        // Basic ArrayList functions
        myList.add(5);
        myList.addAll(Arrays.asList(6, 7, 8));//u can add multiple items using Arrays.asList()
        myList.remove(Integer.valueOf(3));// removes the value with 3
        myList.remove(1);

        // Sort the ArrayList using its own sort method
        myList.sort(null);//u need to pass null as parameter if u r not soritng based on comparision
        //mylist.sort()  this can't work

        System.out.println("myList: " + myList);
    }
}
