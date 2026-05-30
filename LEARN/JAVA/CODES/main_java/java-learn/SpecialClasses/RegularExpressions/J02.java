/*
 * 
The Matcher and Pattern classes provide the facility of Java regular expression.
 The java.util.regex package provides following classes and interfaces for regular expressions. 


    MatchResult interface
    Matcher class
    Pattern class
    PatternSyntaxException class
It implements the MatchResult interface. 
It is a regex engine which is used to perform match operations on a character sequence

No.	Method	                Description
1	boolean matches()	    test whether the regular expression matches the pattern.
2	boolean find()	        finds the next expression that matches the pattern.
3	boolean find(int start)	finds the next expression that matches the pattern from the given start number.
4	String group()	        returns the matched subsequence.
5	int start()	            returns the starting index of the matched subsequence.
6	int end()	            returns the ending index of the matched subsequence.
7	int groupCount()	    returns the total number of the matched subseque

 */

 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J02 {
    public static void main(String[] args) {
        // Create a pattern to match
        Pattern pattern = Pattern.compile("[0-9]{2}");  //we can also use "\\d+"// Match one or more digits

        // Create a matcher for the input string
        //For creating the matcher  object we are using the pattern  object.    
        Matcher matcher = pattern.matcher("I have 10 apples and 20 oranges 30 pinaples.");

        // 1. boolean matches()
        // Test whether the entire input string matches the pattern
        boolean isMatch = matcher.matches();
        System.out.println("matches(): " + isMatch); // Output: false (the entire string does not match the pattern)

        // 2. boolean find()
        // Find the next expression that matches the pattern
        boolean found = matcher.find();
        System.out.println("find(): " + found); // Output: true (a match is found)

        // 3. boolean find(int start)
        // Find the next expression that matches the pattern from the given start index
        found = matcher.find(15); // Start searching from index 15
        System.out.println("find(int start): " + found); // Output: true (a match is found)

        // 4. String group()
        // Returns the matched subsequence
        String matchedText = matcher.group();
        System.out.println("group(): " + matchedText); // Output: 10 (the matched subsequence)

        // 5. int start()
        // Returns the starting index of the matched subsequence
        int startIndex = matcher.start();
        System.out.println("start(): " + startIndex); // Output: 7 (the starting index of the matched subsequence)

        // 6. int end()
        // Returns the ending index of the matched subsequence
        int endIndex = matcher.end();
        System.out.println("end(): " + endIndex); // Output: 9 (the ending index of the matched subsequence)

        // 7. int groupCount()
        // Returns the total number of the matched subsequences
        int groupCount = matcher.groupCount();
        System.out.println("groupCount(): " + groupCount); // Output: 1 (one matched subsequence)
    }
}
