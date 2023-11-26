//priority Queue //By default it oreder element in ascending  order
#include <iostream>
#include <queue>

// Custom comparison function for minimum element order
struct Compare {
    bool operator()(const int& a, const int& b) const {
        return a > b; // Returns true if 'a' has higher priority (lower value) than 'b'
    }
};

int main() {
    std::priority_queue<int, std::vector<int>, Compare> pq;  //Syntax  for ordering in descendng order

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
