/*
 * 
 * 
 * In Java, the parseInt method of the Integer class is used to convert a 
 * String representation of an integer into its numeric value. This is useful when
 *  you have user input or data in the form of strings and need to perform numerical
 *  operations on them.
 *  The parseInt method is a static method, so you call it directly on the Integer class.
 * You can not type cast String to an integer directly
 */

public class J07{
    public static void main(String[] args) {
        // String representation of an integer
        String strNumber = "123";

        // Using parseInt to convert the string to an integer
        try {
            int intValue = Integer.parseInt(strNumber);
            System.out.println("Parsed integer value: " + intValue);

            // You can now use intValue in numerical operations
            int result = intValue * 2;
            System.out.println("Result after multiplication: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the string as an integer.");
        }
    }
}
