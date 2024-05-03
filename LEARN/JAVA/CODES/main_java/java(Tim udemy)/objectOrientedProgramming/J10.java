
/*
 * The static final combination is used to create class-level constants
 *  that are shared among all instances of the class. Here are the key uses of 
 * static final in Java:
 */

 public class J10 {
    public static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        J10 instance1 = new J10();
        J10 instance2 = new J10();

        System.out.println("Instance 1: " + instance1.MAX_VALUE);
        System.out.println("Instance 2: " + instance2.MAX_VALUE);

        // Attempting to change the value (will result in a compilation error)
        // instance1.MAX_VALUE = 200;
        // instance2.MAX_VALUE = 300;
    }
}
