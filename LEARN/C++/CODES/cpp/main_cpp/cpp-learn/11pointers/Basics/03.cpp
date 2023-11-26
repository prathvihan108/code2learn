//pinter concepts using integer arrays
#include <iostream>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};  // an integer array

    int* ptr = arr;  // pointer to the first element of the array

    // Accessing array elements using pointers
    std::cout << "Array elements: ";
    for (int i = 0; i < 5; i++) {
        std::cout << *(ptr + i) << " ";  // using pointer arithmetic to access elements
    }
    std::cout << std::endl;

    // Modifying array elements using pointers
    *(ptr + 2) = 35;  // changing the value of the third element

    // Printing modified array
    std::cout << "Modified array: ";
    for (int i = 0; i < 5; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    // Finding the sum of array elements using pointers
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += *(ptr + i);
    }
    std::cout << "Sum of array elements: " << sum << std::endl;

    return 0;
}
