#include <iostream>
#include <stack>

int main() {
    std::stack<int> myStack;

    // Push elements onto the stack
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);

    // Emplace an element into the stack
    myStack.emplace(40);

    //Display //you can not simpli use range based for loop to iterate over element of stack
 /*   for(int i :myStack)
    {
            cout<<i<<" ";
    }*/

    // Swap contents with another stack
    std::stack<int> otherStack;
    otherStack.push(50);
    otherStack.push(60);
    myStack.swap(otherStack);

    // Check if stacks are equal
    if (myStack == otherStack) {
        std::cout << "Stacks are equal" << std::endl;
    } else {
        std::cout << "Stacks are not equal" << std::endl;
    }

    // Print the elements of the stack
    while (!myStack.empty()) {
        std::cout << myStack.top() << " ";
        myStack.pop();
    }
    std::cout << std::endl;

    return 0;
}