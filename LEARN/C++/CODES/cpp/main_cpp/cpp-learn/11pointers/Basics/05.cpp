//Pointers and array indexing are commutative
//arr[i] = *(arr+i) as we know ,is same as i[arr]=*(i+arr)

#include <iostream>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int* ptr = arr;

    std::cout << "Using arr[i]: ";
    for (int i = 0; i < 5; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    std::cout << "Using *(arr + i): ";
    for (int i = 0; i < 5; i++) {
        std::cout << *(arr + i) << " ";
    }
    std::cout << std::endl;

    std::cout << "Using i[arr]: ";
    for (int i = 0; i < 5; i++) {
        std::cout << i[arr] << " ";
    }
    std::cout << std::endl;

    std::cout << "Using *(i + arr): ";
    for (int i = 0; i < 5; i++) {
        std::cout << *(i + arr) << " ";
    }
    std::cout << std::endl;

    return 0;
}
