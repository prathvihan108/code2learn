class J32 {
    public static void main(String[] args) {
        // Example 1: Widening (Implicit) Conversion
        int intValue = 42;
        long longValue = intValue; // Implicit widening from int to long
        System.out.println("Widening Conversion (int to long): " + longValue);

        // Example 2: Narrowing (Explicit) Conversion
        double doubleValue = 3.14;
        int intFromDouble = (int) doubleValue; // Explicit narrowing from double to int
        System.out.println("Narrowing Conversion (double to int): " + intFromDouble);

        // Example 3: Automatic Type Promotion in Expressions
        int x = 5;
        double y = 2.5;
        double result = x + y; // Implicit promotion of 'x' to double before addition
        System.out.println("Automatic Type Promotion in Expressions: " + result);

        // Example 4: Mixing Floating-Point and Integer Literals
        float floatLiteral = 4.5f;  // 'f' suffix needed for float literal
        long longLiteral = 123L;    // 'L' suffix needed for long literal
        float sum = floatLiteral + longLiteral; // Implicit conversion to float
        System.out.println("Mixing Floating-Point and Integer Literals: " + sum);

        // Example 5: String to Number Conversion
        String numberAsString = "123";
        int parsedNumber = Integer.parseInt(numberAsString); // String to int can be done using parseInt
        System.out.println("String to Number Conversion: " + parsedNumber);

        // Example 6: Char to Int Conversion
        char charValue = 'A';
        int intValueFromChar = charValue; // Implicit widening from char to int
        System.out.println("Char to Int Conversion: " + intValueFromChar);

        // Example 7: Adding a float literal, long literal, and string to int conversion
        int intFromStr = Integer.parseInt("456"); // String to int conversion
        float finalResult = floatLiteral + longLiteral + intFromStr; // Implicit conversion to float
        System.out.println("Adding a float literal, long literal, and string to int conversion: " + finalResult);

        // Example 8: Explicit Narrowing Conversion
        double largeDoubleValue = 123456789.987654321;
        float narrowedValue = (float) largeDoubleValue; // Explicit narrowing from double to float
        System.out.println("Explicit Narrowing Conversion (double to float): " + narrowedValue);




    }
}
/*
 * 
 * public class StringToIntExample {
    public static void main(String[] args) {
        // Attempting to assign a String directly to an int (compilation error)
        String numberAsString = "123";
        int directAssignment = numberAsString; // Compilation error
    }
}


class HelloWorld {
    public static void main(String[] args) {
    
        float a=4/3;
    System.out.println(a);  //integer output
    
    float b=4f/3;
    System.out.println(b);  //floaat output
      
    double c=4f/2;
    System.out.println(c);  //double output
    
    float d=4d/2;
    System.outprintln(d); //this will raise an error
    
    }
}

 */
