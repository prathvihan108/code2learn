#include <iostream>
#include <set>

int main() {
    // Declare a set of integers
    std::set<int> mySet;

    // Insert elements into the set
    mySet.insert(5);
    mySet.insert(2);
    mySet.insert(8);
    mySet.insert(1);
    mySet.insert(8);//This is duplicate element it will be ignored

    // Iterate over the set and print the elements
    for (int element : mySet) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Check the size of the set
    std::cout << "Size: " << mySet.size() << std::endl;

    // Check if the set is empty
    std::cout << "Empty: " << (mySet.empty() ? "Yes" : "No") << std::endl;

    // Find an element in the set
    int searchElement = 8;
    auto it = mySet.find(searchElement);
    if (it != mySet.end()) {
        std::cout << "Element " << searchElement << " found!" << std::endl;
    } else {
        std::cout << "Element " << searchElement << " not found!" << std::endl;
    }

    // Erase an element from the set
    int eraseElement = 2;
    mySet.erase(eraseElement);

    // Print the elements after erasing
    for (int element : mySet) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Clear the set
    mySet.clear();

    // Check the size of the set after clearing
    std::cout << "Size after clearing: " << mySet.size() << std::endl;

    return 0;
}
