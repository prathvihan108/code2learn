//Binary search for 2d arrays or matrix

import java.util.Arrays;

public class J05 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30, 40},
                {50, 65, 75, 85},
                {98, 102, 124, 130}
        };

        int[] ans = search(arr, 85);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearch(int[][] arr, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (target > arr[row][mid]) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        while (rstart <rend-1) {
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }

            if (target < arr[mid][cmid]) {
                rend = mid - 1;
            } else {
                rstart = mid + 1;
            }
        }

        // Check whether the element is in the column of the remaining rows
        if (rstart < rows && arr[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        } else if (rstart + 1 < rows && arr[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // Search in the appropriate halves
        if (target < arr[rstart][cmid]) {
            return binarySearch(arr, rstart, 0, cmid - 1, target);
        } else if (target > arr[rstart][cmid] && target <= arr[rstart][cols - 1]) {
            return binarySearch(arr, rstart, cmid + 1, cols - 1, target);
        } else if (target < arr[rstart + 1][0]) {
            return binarySearch(arr, rstart + 1, 0, cmid - 1, target);
        } else {
            return binarySearch(arr, rstart + 1, cmid + 1, cols - 1, target);
        }
    }
}
