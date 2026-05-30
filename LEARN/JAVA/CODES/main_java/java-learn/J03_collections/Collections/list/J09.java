//Stack Specific Methods
//There will be more
package Collections.list;
import java.util.Stack;

public class J09 {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Printing the stack
        System.out.println("Stack: " + stack);

        // Example implementation of size() method
        System.out.println("Size of stack: " + stack.size());

        // Example implementation of empty() method
        System.out.println("Is stack empty? " + stack.empty());

        // Example implementation of search(Object o) method
        int position = stack.search(20);
        if (position != -1) {
            System.out.println("Element 20 is at position " + position + " from the top of the stack.");
        } else {
            System.out.println("Element 20 not found in the stack.");
        }

        // Example implementation of push(E item) method
        stack.push(40);
        System.out.println("Stack after pushing 40: " + stack);

        // Example implementation of pop() method
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Example implementation of peek() method
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
    }
}
