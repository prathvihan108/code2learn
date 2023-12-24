
public class J08{
    public static void main(String[] args) {
        int[][] myArray = { //it is also reference or object variable initilisation //
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calling a method and passing the 2D array
        print2DArray(myArray);//
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] array) {//array is pointing to same array
        // Determine the number of rows
        int numRows = array.length;//gives number of rows//rows is not manadatory for calculating the adress for compiler  but column size is necessary

        // Determine the number of columns (assuming a rectangular array)
        int numCols = array[0].length;

        // Print the elements of the 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

