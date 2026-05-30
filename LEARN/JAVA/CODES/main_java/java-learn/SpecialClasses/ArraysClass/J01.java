package ArraysClass;

import java.util.Arrays;
import java.util.List;

public class J01 {
    public static void main(String[] args) {
        // 1. sort()
        int[] array = {5, 3, 8, 1, 2};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array)); // Output: [1, 2, 3, 5, 8]

        // 2. binarySearch()
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Index of 3: " + index); // Output: Index of 3: 2

        // 3. equals()
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + areEqual); // Output: Arrays are equal: true

        // 4. fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 9);
        System.out.println("Filled array: " + Arrays.toString(filledArray)); // Output: [9, 9, 9, 9, 9]

        // 5. copyOf()
        int[] copiedArray = Arrays.copyOf(array1, array1.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray)); // Output: [1, 2, 3]

        // 6. copyOfRange()
        int[] copiedRangeArray = Arrays.copyOfRange(array, 1, 4);
        System.out.println("Copied range array: " + Arrays.toString(copiedRangeArray)); // Output: [2, 3, 5]

        // 7. asList()
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Array as List: " + arrayList); // Output: [1, 2, 3, 4, 5]

        // 8. toString()
        System.out.println("Array to String: " + Arrays.toString(array)); // Output: [1, 2, 3, 5, 8]

        // 9. deepEquals()
        Integer[][] deepArray1 = {{1, 2}, {3, 4}};
        Integer[][] deepArray2 = {{1, 2}, {3, 4}};
        boolean deepEqual = Arrays.deepEquals(deepArray1, deepArray2);
        System.out.println("Deep arrays are equal: " + deepEqual); // Output: Deep arrays are equal: true

        // 10. deepToString()
        System.out.println("Deep array to String: " + Arrays.deepToString(deepArray1)); // Output: [[1, 2], [3, 4]]

        // 11. hashCode()
        int hashCode = Arrays.hashCode(array);
        System.out.println("Array hash code: " + hashCode);

        // 12. deepHashCode()
        int deepHashCode = Arrays.deepHashCode(deepArray1);
        System.out.println("Deep array hash code: " + deepHashCode);

        // 13. parallelSort()
        int[] parallelArray = {5, 3, 8, 1, 2};
        Arrays.parallelSort(parallelArray);
        System.out.println("Parallel sorted array: " + Arrays.toString(parallelArray)); // Output: [1, 2, 3, 5, 8]

     

        // 15. stream()
        Arrays.stream(array).forEach(System.out::print); // Output: 12358

        // 16. setAll()
        int[] setAllArray = new int[5];
        Arrays.setAll(setAllArray, i -> i + 1);
        System.out.println("Set all array: " + Arrays.toString(setAllArray)); // Output: [1, 2, 3, 4, 5]

        // 17. parallelSetAll()
        int[] parallelSetAllArray = new int[5];
        Arrays.parallelSetAll(parallelSetAllArray, i -> i * 2);
        System.out.println("Parallel set all array: " + Arrays.toString(parallelSetAllArray)); // Output: [0, 2, 4, 6, 8]
    }
}
/*
 *     sort(): Sorts the array in ascending order.
    binarySearch(): Searches for a value in a sorted array.
    equals(): Compares two arrays for equality.
    fill(): Fills an array with a specified value.
    copyOf(): Copies an array to a new array.
    copyOfRange(): Copies a range from an array to a new array.
    asList(): Converts an array to a list.
    toString(): Returns a string representation of the array.
    deepEquals(): Compares two multi-dimensional arrays for equality.
    deepToString(): Returns a string representation of a multi-dimensional array.
    hashCode(): Returns the hash code of an array.
    deepHashCode(): Returns the hash code of a multi-dimensional array.
    parallelSort(): Sorts the array using parallel sort.
    spliterator(): Creates a Spliterator for the array.
    stream(): Creates a Stream for the array.
    setAll(): Sets all elements of an array using a generator function.
    parallelSetAll(): Sets all elements of an array in parallel using a generator function.(Only implementation is different from the normal sort method)

These methods cover a wide range of operations you can perform on arrays in Java.
 */
