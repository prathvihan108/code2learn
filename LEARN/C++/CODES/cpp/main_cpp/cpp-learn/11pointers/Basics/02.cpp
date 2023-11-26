#include <iostream>

int main() {
    int num = 10; // an integer variable
    int* p;      // a pointer to an integer

    p = &num;    // assign the address of 'num' to the pointer 'p'

    std::cout << "Value of num: " << num << std::endl;
    std::cout << "Address of num: " << &num << std::endl;
    std::cout << "Value of p: " << p << std::endl;
    std::cout << "Value pointed by p: " << *p << std::endl;

    *p = 20;     // changing the value of 'num' indirectly using the pointer 'p'

    std::cout << "Updated value of num: " << num << std::endl;

    return 0;
}
