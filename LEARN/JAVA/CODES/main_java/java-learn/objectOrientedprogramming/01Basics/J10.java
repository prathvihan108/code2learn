// Custom exception class is created by extending the exception class
//Exception calss also extends the throwwable class which in turn extends the object class
//see at last of this file for hirechy
class MyCustomException extends Exception {
    // Constructor with a custom message
    public MyCustomException(String message) {
        super(message);
    }
}

public class J10{

    // Method that throws a custom exception
    private static void processInput(int value) throws MyCustomException {
        if (value < 0) {
            // Throw the custom exception if the input is negative
            throw new MyCustomException("Input value cannot be negative");
        }
        System.out.println("Processing input: " + value);
    }

    public static void main(String[] args) {
        try {
            // Test the method with different inputs
            processInput(5);  // No exception, valid input
            processInput(-2); // Throws MyCustomException
        } catch (MyCustomException e) {
            // Handle the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}

/*
 *     Object(Top class for all)
        
            Throwable
               
                Error: Represents serious errors that are typically beyond the control of the application. 
                Examples include OutOfMemoryError and StackOverflowError.
           
                    Exception: Represents exceptions that can be caught and handled. 
            
                      Exceptions are further divided into two main types:
                             RuntimeException: Represents exceptions that can occur at runtime and are unchecked. 
                             Examples include NullPointerException and ArrayIndexOutOfBoundsException.
                             IOException, SQLException, and others: Represent exceptions that are checked and
                                typically related to input/output operations, database access, etc.
 */
