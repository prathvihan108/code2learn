//pointers and uninitialised char and int arrays

#include <iostream>

int main() {
    int intArray[5];       // Uninitialized integer array //prints total size
    char charArray[5];     // Uninitialized character array //prints total size

    std::cout << "Size of intArray: " << sizeof(intArray) << " bytes" << std::endl;
    std::cout << "Size of charArray: " << sizeof(charArray) << " bytes" << std::endl;

    return 0;
}
