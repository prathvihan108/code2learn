//polymorphism in java
/*
 * Polymorphism in Java refers to the ability of a class or method to take on multiple forms. 
 * There are two main types of polymorphism in Java:
 * 
 *  compile-time (or static) polymorphism 
 * and runtime (or dynamic) polymorphism.
 */
/*
 * Compile-time Polymorphism (Method Overloading):

    Method overloading is a form of compile-time polymorphism where a class can have multiple methods
     with the same name but different parameter lists (number, type, or order of parameters).
    The compiler determines which method to call based on the method signature during compilation.

    Method overloading can also happen through inheritance(more than one sub classes extend same super class)
 */

 //Compile time polymorphism using simply overloading of methods

 public class J01 {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        J01 math = new J01();

        // Calling different versions of the add method based on parameters
        int sum1 = math.add(5, 10);
        int sum2 = math.add(3, 7, 15);
        double sum3 = math.add(2.5, 3.7);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}

