import java.util.Stack;
//Stack is a class in java collections which extends vector class which again extends A..

/*java.lang.Object
└── java.util.AbstractCollection(interface)
    └── java.util.AbstractList*(inteface)
        └── java.util.Vector*(class)
            └── java.util.Stack*/
/*
 * The Stack class in Java, which extends the Vector class, does not have a predefined capacity limit. 
 * It dynamically resizes itself to accommodate more elements as needed. This means that the stack can grow in size dynamically, and you don't usually
 *  encounter a situation where the stack becomes "full" in the sense of a fixed capacity being reached.
 * 
 * clear() method is used to remove all elements from the stack, making it empty. 
 * After calling clear(), the stack will have no elements, and if you try to pop or peek, you will get 
 * an EmptyStackException because there are no elements left in the stack.
 */
//Stack is again internally a array implemetation at the end
//we bother about stacks and queues and etc only because they differ in their implementation

public class J01 {

    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        stack.pop();//its not compulsary to catch the returning ressult in pop() method

        // Displaying the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // Checking if the stack contains a specific element
        boolean containsElement = stack.contains("Element 2");
        System.out.println("Does the stack contain 'Element 2'? " + containsElement);

        // Copying the stack to a new stack
        Stack<String> copyStack = (Stack<String>) stack.clone();
        System.out.println("Copy of the stack: " + copyStack);

        // Converting the stack to an array
        Object[] stackArray = stack.toArray();
        System.out.print("Stack as an array: ");
        for (Object element : stackArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Removing a specific element from the stack
        boolean removed = stack.remove("Element 2");
        System.out.println("Removed 'Element 2'? " + removed);
        System.out.println("Stack after removal: " + stack);

        // Removing all occurrences of a specific element from the stack
        stack.push("Element 1");
        stack.push("Element 1");
        stack.push("Element 1");
        System.out.println("Stack before removeAll: " + stack);
        stack.removeAllElements();
        System.out.println("Stack after removeAll: " + stack);
    }
}
