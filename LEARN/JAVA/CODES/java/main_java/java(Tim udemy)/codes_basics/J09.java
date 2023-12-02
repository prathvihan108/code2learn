import java.util.Scanner;

public class J09{
    public static void main(String[] args) {
        // Method 1: next() - Reads the next token (a word) from the input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();  //we do not use keyword nextString as java always reads the input ass strings
        System.out.println("You entered: " + word);

        // Method 2: nextLine() - Reads the entire line of input.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Method 3: nextInt() - Reads an integer from the input.
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Method 4: nextDouble() - Reads a double from the input.
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Method 5: nextBoolean() - Reads a boolean from the input.
        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered: " + boolValue);

        // Method 6: hasNext() - Checks if there is another token in the input.
        /*
         * 
         *  hasNext() is called on a Scanner object with the input "Hello World.
         * " The default whitespace delimiter is used. Since there is at least one whitespace
         *  character between "Hello" and "World," hasNext() returns true.
         */

        System.out.print("Enter multiple tokens: ");
        while (scanner.hasNext("Hello World")) {

            
            String token = scanner.next();

            if (token.equals("exit")) {
                break;
            }
            System.out.println("Token: " + token);
        }

        // Method 7: hasNextLine() - Checks if there is another line in the input.
        System.out.print("Enter multiple lines: ");
        while (scanner.hasNextLine()) {


         
            String line = scanner.nextLine();


                 if (line.equals("exit")) {
                break;
            }
            System.out.println("Line: " + line);
        }

        // Method 8: useDelimiter(String pattern) - Sets the delimiter pattern.
        scanner.useDelimiter(",");
        System.out.print("Enter comma-separated values: ");
        while (scanner.hasNext()) {
            String value = scanner.next();
            System.out.println("Value: " + value);
        }

        // Method 9: skip(String pattern) - Skips input that matches the pattern.
        scanner = new Scanner("Skip 123 This");
        scanner.skip("\\d+"); // Skips one or more digits
        String remaining = scanner.nextLine();
        System.out.println("Remaining: " + remaining);

        // Close the Scanner when done to prevent resource leaks
        scanner.close();
    }
}
