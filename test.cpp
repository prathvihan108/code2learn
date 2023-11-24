#include <iostream>
#include <string>

int main() {
    std::string str = "Hello,World!";
    std::string substr = str.substr(7, 5); // Starting index: 7, length: 5

    std::cout << "Substring: " << substr << std::endl;

    return 0;
}
