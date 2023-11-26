//Simple Que
#include <iostream>
#include <queue>

int main() {
    std::queue<int> myQueue;

    // Pushing elements into the queue
    myQueue.push(10);
    myQueue.push(20);
    myQueue.push(30);

    // Accessing and printing the front element
    std::cout << "Front element: " << myQueue.front() << std::endl;

    // Accessing and printing the back element
    std::cout << "Back element: " << myQueue.back() << std::endl;

    // Checking if the queue is empty
    if (myQueue.empty()) {
        std::cout << "Queue is empty" << std::endl;
    } else {
        std::cout << "Queue is not empty" << std::endl;
    }

    // Getting the size of the queue
    std::cout << "Queue size: " << myQueue.size() << std::endl;

    // Removing elements from the queue
    myQueue.pop();

    // Printing the remaining elements in the queue
    while (!myQueue.empty()) {
        std::cout << myQueue.front() << " ";
        myQueue.pop();
    }
    std::cout << std::endl;

    return 0;
}
