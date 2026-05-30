/*
 * In Java and many other programming languages, the "\" character is used as an escape character.
 *  It serves several purposes:

    Escaping special characters: 
    Certain characters, like double quotes (") and backslashes themselves,
     have special meanings in strings. To include these characters as literals in a string, 
     you need to escape them with a backslash. For example, to include a double quote in a string literal, 
     you would write \".

    Representing non-printable characters: 
    Backslash followed by certain characters represents non-printable c
    haracters like newline (\n), tab (\t), carriage return (\r), etc. These sequences are interpreted specially by the
     compiler or runtime.

    Unicode characters: Backslash followed by a "u" (e.g., \\uXXXX) is used to represent Unicode characters in string literals.

In regular expressions specifically, the backslash is used to escape special characters with special meanings, 
allowing you to match them literally. For example, \. matches a literal dot (.) rather than any character, and
 \\ matches a literal backslash rather than any escape sequence.
 */

 /*
  * Whitespace characters are characters that are used for spacing and formatting text but are not visible when printed. 
    In Java and many other programming languages, common whitespace characters include:

    Space: The regular space character, often represented by a space bar on a keyboard.
     In Java, it's represented by the escape sequence \u0020.

    Tab: Represents horizontal spacing. In Java, it's represented by the escape sequence \t.

    Newline: Represents a line break. In Java, it's represented by the escape sequence \n.

    Carriage Return: Represents a return to the beginning of the line. In Java, it's represented by the escape sequence \r.

    Form Feed: Represents a page break. In Java, it's represented by the escape sequence \f.

    Vertical Tab: Represents vertical spacing. In Java, it's represented by the escape sequence \u000B.

    So, if you want to match any whitespace character in a regular expression pattern, you can use \s. 
    This simplifies the pattern and makes it more readable compared to listing each whitespace character individually.
  */

  /*
   * Note:The syntax for the regular expression for every language differs by a little change:
   * //Learn the Syntax from the Geeks for Geeks Website For RegularExpressions in java
   */
  /*
   * 
    Advantages or uses of the Pattern Class
    -->We create a pattern object by calling Pattern.compile(), there is no constructor. compile() is a static method in the Pattern class.
    -->Like above, we create a Matcher object using matcher() on objects of the Pattern class.
    -->Pattern.matches() is also a static method that is used to check if a given text as a whole matches the pattern or not.
    -->find() is used to find multiple occurrences of patterns in the text.
    -->We can split a text based on a delimiter pattern using the split() method

   */

   //Note: the reason  for using the double slash inside the printstream is to ignore the special function of "\" (escape character)
import java.util.*;
import java.util.regex.Pattern;

public class J01{
    public static void main(String args[]){
        System.out.println("Enter the usn in the format of (1CR22IS109)");

        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

//the below demonstrate the syntax for the regular expression in java ,its's very easy to understand just analyse.
        String pattern_regEx="^\\d{1}[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}$"; //instead of following alll the above things we can directly use this syntax for getting the result
       Boolean isMatch=Pattern.matches(pattern_regEx, input);
         
       System.out.println("Is match? " + isMatch);


    }
}