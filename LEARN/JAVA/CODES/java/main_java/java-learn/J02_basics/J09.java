import java.util.*;
public class J09 {
    public static void main(String[] args) {
        // Mutable array
        int[] mutableArray = {1, 2, 3};
        System.out.println("Mutable Array Before: " + Arrays.toString(mutableArray));

        // Modifying the array
        mutableArray[1] = 99;
        System.out.println("Mutable Array After: " + Arrays.toString(mutableArray));

        // Immutable string
        String immutableString = "Hello";
        System.out.println("Immutable String Before: " + immutableString);
        //immutableString[2]='e'; u can not do it

        // Creating a new string with modifications
        immutableString = immutableString + " World";//The original string object which was created is now available for garbage collection sincce we uses same reference var again
        System.out.println("Immutable String After: " + immutableString);
    }
}
