//Binary search using Recurrision

#include <iostream>
using namespace std;

int binarySearch(int arr[], int low, int high, int target) {
    // Base case: target not found
    if (low > high) //Condition similar to what u put in while loop
    {
        return -1;
    }

    int mid = (low + high) / 2;

    // Base case: target found
    if (arr[mid] == target) {
        return mid;
    }
    // Recursive case: search in the left half
    else if (arr[mid] > target) {
        return binarySearch(arr, low, mid - 1, target);
    }
    // Recursive case: search in the right half
    else {
        return binarySearch(arr, mid + 1, high, target);
    }
}

int main() {
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 10;

    int index = binarySearch(arr, 0, n - 1, target);

    if (index != -1) {
        cout << "Element found at index: " << index << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
