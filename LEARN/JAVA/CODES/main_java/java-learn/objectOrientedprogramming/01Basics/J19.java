
//Satic Inner classes
/*
 * In Java, a static inner class is a nested class that is
 *  declared as static within another outer class. Unlike non-static inner classes
 *  (also known as inner classes), a static inner class does not have an implicit reference to 
 * an instance of the outer class. This means that you can create instances of a static inner 
 * class without having an instance of the outer class.
 */
public class J19 {
    private static int outerStaticVariable = 10;
    private int outerInstanceVariable = 20;

    static class StaticInnerClass {
        private static int innerStaticVariable = 30;

        void printVariables() {
            System.out.println("Outer Static Variable: " + outerStaticVariable);
            // Accessing outer instance variable requires an instance of the outer class
            // System.out.println("Outer Instance Variable: " + outerInstanceVariable); // This would result in a compilation error
            System.out.println("Inner Static Variable: " + innerStaticVariable);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static inner class
        J19.StaticInnerClass innerInstance = new J19.StaticInnerClass();

        // Calling a method of the inner class
        innerInstance.printVariables();
    }
}
