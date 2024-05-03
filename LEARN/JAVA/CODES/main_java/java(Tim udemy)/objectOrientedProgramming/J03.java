public class J03{
    public static void main(String[] args) {
        int intValue; // Declaration without initialization

        // The next line would result in a compilation error
        // System.out.println("Default Value: " + intValue);
    }
}
/*
 * 
 * Yes, primitive data types in Java do have default values, but these default 
 * values only come into play if you don't explicitly initialize the variables. 
 * In other words, if you declare a primitive variable but don't assign a value to it,
 *  the compiler won't automatically use the default value.

Here are the default values for primitive data types in Java:

    byte: 0
    short: 0
    int: 0
    long: 0L
    float: 0.0f
    double: 0.0d
    char: '\u0000' (the null character)
    boolean: false

So, if you declare a primitive variable without initializing it, 
it will contain the default value. However, the compiler still requires you to 
explicitly initialize the variable before using it to ensure that you don't 
accidentally use a variable with an unpredictable value.
 */
