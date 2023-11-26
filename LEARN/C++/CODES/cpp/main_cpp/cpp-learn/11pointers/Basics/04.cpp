//How size of operator operates different for arrays and pointers
#include <iostream>

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int* ptr = arr; //arr is a constant pointer to first element

    std::cout << "Size of pointer: " << sizeof(ptr) << " bytes" << std::endl;
    std::cout << "Size of array: " << sizeof(arr) << " bytes" << std::endl;
    std::cout << "Size of array address: " << sizeof(&arr[0]) << " bytes" << std::endl;

    return 0;
}
/*
In the above code, sizeof(ptr) returns the size of the pointer itself, which is 8 bytes on a 64-bit system. sizeof(arr) returns the total size occupied by the array, which is 20 bytes (5 elements * 4 bytes each). sizeof(&arr[0]) returns the size of the array address, which is also 8 bytes.

It's important to note that the sizeof operator is resolved at compile-time and does not evaluate the actual content or dynamic allocation of memory. It provides information about the size of the data type or expression used.

*/