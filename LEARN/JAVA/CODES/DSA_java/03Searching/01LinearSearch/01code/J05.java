public class J05 {
    public static int[] linearSearch2D(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {//arr[i].length gives the no of cols in each rows
                if (array[i][j] == target) {
                    return new int[]{i, j};//you can return ans array in this form  "return new int[]{i,j}"
                }
            }
        }
        return null;  // Return null if the target is not found in the array
    }

    public static void main(String[] args) {
        int[][] my2DArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int targetElement = 5;
        int[] result = linearSearch2D(my2DArray, targetElement);//result will now refer to the newly created returned arrray

        if (result != null) {
            System.out.println("Element " + targetElement + " found at indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
