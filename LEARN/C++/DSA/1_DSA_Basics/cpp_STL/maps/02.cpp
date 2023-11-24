#include <iostream>
#include <map>

int main() {
    std::map<std::string, int> studentMarks;

    // Insert elements without using make_pair
    studentMarks["Alice"] = 95;
    studentMarks["Bob"] = 87;
    studentMarks["Charlie"] = 92;
    studentMarks["David"] = 78;
    studentMarks["Emma"] = 98;

    // Access and modify elements
    studentMarks["Alice"] = 90;

    // Iterate over the elements
    for (const auto& pair : studentMarks) {
        std::cout << pair.first << ": " << pair.second << std::endl;
    }

    return 0;
}
