import java.util.ArrayList;

public class J06 {
    public static void main(String[] args) {
        // Create a two-dimensional ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();

        // Add elements to the two-dimensional ArrayList
        twoDList.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        twoDList.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        twoDList.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));

        // Access elements in the two-dimensional ArrayList
        int element = twoDList.get(1).get(2);
        System.out.println("Element at row 1, column 2: " + element);

        // Modify an element in the two-dimensional ArrayList
        twoDList.get(0).set(1, 99);

        // Display the two-dimensional ArrayList
        System.out.println("Two-Dimensional ArrayList:");
        for (ArrayList<Integer> row : twoDList) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
