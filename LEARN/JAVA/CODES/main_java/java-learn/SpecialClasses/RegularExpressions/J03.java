/*Pattern class
 *
 * It is the compiled version of a regular expression. It is used to define a pattern for the regex engine.
No.	Method	                                                     Description
1	static Pattern compile(String regex)	                    compiles the given regex and returns the instance of the Pattern.
2	Matcher matcher(CharSequence input)	                        Creates a matcher that matches the given input with the pattern.
3	static boolean matches(String regex, CharSequence input)	It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern.
4	String[] split(CharSequence input)	                        splits the given input string around matches of given pattern.
5	String pattern()	                                        returns the regex pattern.
 */

 /*
 * 
No.	Character Class	                                Description
1	[abc]
	a, b, or c                                  (simple class)
2	[^abc]	                                    Any character except a, b, or c (negation)
3	[a-zA-Z]	                                a through z or A through Z, inclusive (range)
4	[a-d[m-p]]                                 	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	                            d, e, or f (intersection)
6	[a-z&&[^bc]]	                            a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	                            a through z, and not m through p: [a-lq-z](subtraction)
 */

/*
 *     import java.util.regex.*;  
    class RegexExample3{  
    public static void main(String args[]){  
    System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
    System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
    System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
    }}   
 */

 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class J03{
    public static void main(String args[]){
        Pattern input= Pattern.compile(",\\s+");//This regular expressio represents the comma fllowed by one or more spaces
        Matcher matcher=input.matcher("Apples,  Banana, orange"); //The Matcher accepts the input String
       
        boolean isMatch =matcher.matches();

        //following demonstrates the another way for calling the matches.
        //boolean b2=Pattern.compile(".s").matcher("as").matches();  
        String[] str = input.split("Apples,  Banana, orange,juice"); //The split() method from the Pattern also accepts the input_sting

        for (int i=0; i<str.length; i++)
        System.out.println(str[i]);
}


    }
 
