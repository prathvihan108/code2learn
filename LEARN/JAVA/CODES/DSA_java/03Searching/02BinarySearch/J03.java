//order agnostic binary search
public class J03 {
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[left] < arr[mid]) {
                // The left half is sorted
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[left] > arr[mid]) {
                // The right half is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                // Handling duplicates
                left++;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 6;
        int result = orderAgnosticBinarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
