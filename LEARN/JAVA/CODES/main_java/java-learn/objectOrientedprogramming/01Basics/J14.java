//If the parameter name and the instance variable name are different, you can omit t
//he use of this in most programming languages, and it will still compile correctly. 
//The use of this is primarily necessary when there is a
// naming conflict between parameters and instance variables.
public class J14 {
    private int myNumber;

    // Constructor without using "this" when parameter and instance variable names are different
    public J14(int number) {
        myNumber = number; // No naming conflict, and it will compile correctly
    }

    // Getter method to retrieve the value of myNumber
    public int getMyNumber() {
        return myNumber;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of MyClass
        J14 myObject = new J14(42);

        // Retrieving the value of myNumber using the getter method
        int retrievedNumber = myObject.getMyNumber();

        // Printing the retrieved value
        System.out.println("MyNumber value: " + retrievedNumber);
    }
}
