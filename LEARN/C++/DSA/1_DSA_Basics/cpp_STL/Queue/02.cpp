//priority Queue //By default it oreder element in decending order

#include <iostream>
#include <queue>

int main() {
    std::priority_queue<int> pq;  //Syntax for decalring maximum (decending order p Queue)

    // Inserting elements
    pq.push(10);
    pq.push(30);
    pq.push(20);

    // Accessing the top element
    std::cout << "Top element: " << pq.top() << std::endl;

    // Removing the top element
    pq.pop();

    // Checking if the priority queue is empty
    if (pq.empty()) {
        std::cout << "Priority queue is empty" << std::endl;
    } else {
        std::cout << "Priority queue is not empty" << std::endl;
    }

    // Getting the size of the priority queue
    std::cout << "Priority queue size: " << pq.size() << std::endl;

    // Printing the elements in the priority queue
    while (!pq.empty()) {
        std::cout << pq.top() << " ";
        pq.pop();
    }
    std::cout << std::endl;

    return 0;
}
