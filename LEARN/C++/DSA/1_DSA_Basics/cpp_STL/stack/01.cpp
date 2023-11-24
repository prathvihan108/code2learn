 #include <iostream>
   #include <stack>

   int main() {
       std::stack<int> myStack;

       // Push elements onto the stack
       myStack.push(10);
       myStack.push(20);
       myStack.push(30);

       // Get the top element
       std::cout << "Top element: " << myStack.top() << std::endl;

       // Pop the top element
       myStack.pop();

       // Check if the stack is empty
       if (myStack.empty()) {
           std::cout << "Stack is empty" << std::endl;
       }

       // Print the size of the stack
       std::cout << "Size of stack: " << myStack.size() << std::endl;

       return 0;
   }