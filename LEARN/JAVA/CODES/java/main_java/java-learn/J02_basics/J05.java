//arrays utility class present in the utility package provides some good methods 
import java.util.Arrays;

public class J05 {
    public static void main(String[] args) {
        // Sorting
        int[] numbers = {4, 2, 7, 1, 5};
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));

        // Searching
        int searchKey = 3;
        int index = Arrays.binarySearch(numbers, searchKey);
        System.out.println("Index of " + searchKey + ": " + index);

        // Filling
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);//replaces all with 42.
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Equality Testing
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Arrays are equal: " + isEqual);

        // Converting to String
        String arrayString = Arrays.toString(arr1);
        System.out.println("Array as String: " + arrayString);
    }
}
