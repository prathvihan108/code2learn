#include <iostream>
#include <map>

int main() {
    // Declare and initialize a map
    std::map<std::string, int> studentMarks;

    // Insert elements using insert()
    studentMarks.insert(std::make_pair("Alice", 95));
    studentMarks.insert(std::make_pair("Bob", 87));
    studentMarks.insert(std::make_pair("Charlie", 92));
    studentMarks.insert(std::make_pair("David", 78));
    studentMarks.insert(std::make_pair("Emma", 98));

    // Access elements using []
    std::cout << "Bob's marks: " << studentMarks["Bob"] << std::endl;

    // Iterate over the elements using iterators
    std::cout << "Student Marks:\n";
    for (const auto& pair : studentMarks) {
        std::cout << pair.first << ": " << pair.second << std::endl;
    }

    // Check if an element exists using find()
    auto it = studentMarks.find("Alice");
    if (it != studentMarks.end()) {
        std::cout << "Alice's marks: " << it->second << std::endl;
    }

    // Erase an element using erase()
    studentMarks.erase("Charlie");

    // Check the size of the map
    std::cout << "Number of students: " << studentMarks.size() << std::endl;

    // Clear the map using clear()
    studentMarks.clear();

    // Check if the map is empty
    if (studentMarks.empty()) {
        std::cout << "The map is empty" << std::endl;
    }

    return 0;
}
