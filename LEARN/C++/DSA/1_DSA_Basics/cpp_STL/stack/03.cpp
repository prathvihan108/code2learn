//To display the elements in a stack without modifying or removing them, you can create a temporary copy of the stack and iterate over that copy. 
#include <iostream>
#include <stack>

int main() {
    std::stack<int> myStack;

    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);

    // Create a temporary copy of the stack
    std::stack<int> tempStack = myStack;

    // Display the elements in the stack
    while (!tempStack.empty()) {
        int element = tempStack.top();
        std::cout << element << " ";
        tempStack.pop();
    }
    std::cout << std::endl;

    return 0;
}
