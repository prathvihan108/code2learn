#include <iostream>
#include <list>

int main() {
    std::list<int> myList;

    // Insert elements into the list
    myList.push_back(10);
    myList.push_front(20);
    myList.push_back(30);
    myList.push_front(40);

    // Print the elements of the list
    for (const auto& element : myList) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Remove an element from the list
    myList.pop_front();

    // Insert an element at a specified position
    auto it = std::next(myList.begin()); // Iterator pointing to the second element
    myList.insert(it, 25);

    // Print the elements of the list after modifications
    for (const auto& element : myList) {
        std::cout << element << " ";
    }
    std::cout << std::endl;
    return 0;
}
