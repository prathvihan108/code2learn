#include <iostream>
#include <deque>

int main() {
    std::deque<int> myDeque;

    // Insert elements at both ends
    myDeque.push_back(10);
    myDeque.push_front(20);
    myDeque.push_back(30);
    myDeque.push_front(40);

    // Print the elements of the deque
    for (const auto& element : myDeque) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Accessing elements
    std::cout << "First element: " << myDeque.front() << std::endl;
    std::cout << "Last element: " << myDeque.back() << std::endl;

    // Insert an element at a specific position
    auto it = std::next(myDeque.begin()); // Iterator pointing to the second element
    myDeque.insert(it, 25);

    // Remove an element from the deque
    myDeque.pop_front();

    // Print the elements of the deque after modifications
    for (const auto& element : myDeque) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Clear the deque
    myDeque.clear();

    // Check if the deque is empty
    if (myDeque.empty()) {
        std::cout << "Deque is empty" << std::endl;
    }

    return 0;
}
