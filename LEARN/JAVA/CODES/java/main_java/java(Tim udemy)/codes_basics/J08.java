/*
 * 
 * "Console cannot be resolved to a type," it likely
 *  means that your Java program is not being run in a console 
 * environment that supports System.console(). This is a common 
 * issue when running Java programs from certain integrated development 
 * environments (IDEs) or non-command line environments.
 */
import java.util.*;
public class J08{
    public static void main(String[] args) {
        try {
            // Attempt to get the Console object
            Console console = System.console(); // can not run

            // Check if the Console object is not null
            if (console != null) {
                // Perform console-based operations
                String input = console.readLine("Enter something: ");
                console.printf("You entered: %s%n", input);
            } else {
                // Handle the case where System.console() returns null
                System.out.println("Console not available. Fallback to alternative input/output methods.");
            }
        } catch (NullPointerException e) {
            // Handle any unexpected NullPointerException
            System.err.println("An unexpected NullPointerException occurred: " + e.getMessage());
        }
    }
}
