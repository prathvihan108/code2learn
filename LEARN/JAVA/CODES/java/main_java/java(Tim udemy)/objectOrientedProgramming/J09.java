//static methods can access instaance methods by creating the instance of a class
public class J09 {
    
    // Static method in the same class
    public static void staticMethod1() {
        System.out.println("Static method 1");
    }

    // Instance method in the same class
    public void instanceMethod1() {     //the methods which are declared without using static keyword are called instance methods
        System.out.println("Instance method 1");
    }

    // Static method in another class
    public static void staticMethod2() {
        System.out.println("Static method 2");

        // Accessing instance method of the same class
        J09 J09 = new J09();
        J09.instanceMethod1();
    }

    // Instance method in another class
    public void instanceMethod2() {
        System.out.println("Instance method 2");

        // Accessing static method of the same class
        staticMethod1();
    }

    public static void main(String[] args) {
        staticMethod1();     // Call static method directly
        staticMethod2();     // Call static method that accesses an instance method

        J09 J09 = new J09();
        J09.instanceMethod1();  // Call instance method through an instance
        J09.instanceMethod2();  // Call instance method that accesses a static method
    }
}
