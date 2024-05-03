/*
 * 
 * In Java, a non-static inner class (also known as an inner class) is 
 * a class declared within another class. Unlike static inner classes, 
 * non-static inner classes have an implicit reference to an instance of the outer class.
 *  This means that they can access both static and non-static members of the outer class directly, and they are 
 * associated with an instance of the outer class.
 */

 /*
  *     Implicit Reference to Outer Class:
        Non-static inner classes have an implicit reference to an instance of the outer class.
         This reference is accessed using OuterClass.this from within the inner class.

    Access to Outer Class Members:
        Non-static inner classes can directly access both static and non-static members of the outer class. 
        They can even access private members of the outer class.

    Instance Creation:
        Instances of a non-static inner class are associated with an instance of the outer class. 
        You need to create an instance of the outer class before creating an instance of the inner class.
  */
            //############Implicit Reference############## //
  /*
   * An implicit reference, in the context of non-static inner classes in Java, refers to an 
   * automatic reference that is created by the Java compiler to the instance of the outer class within 
   * the non-static inner class. 
   * This reference allows the inner class to access members (both static and non-static) of the outer class.
   */
public class J20{
    private static int outerStaticVariable = 10;
    private int outerInstanceVariable = 20;

    class InnerClass {
        private int innerInstanceVariable = 30;

        void printVariables() {
            System.out.println("Outer Static Variable: " + outerStaticVariable);
            System.out.println("Outer Instance Variable: " + outerInstanceVariable);
            System.out.println("Inner Instance Variable: " + innerInstanceVariable);
            System.out.println("Outer Class Reference: " +J20.this); //implicitReerence
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
     J20 outerInstance = new J20();

        // Creating an instance of the non-static inner class
    J20.InnerClass innerInstance = outerInstance.new InnerClass();

        // Calling a method of the inner class
        innerInstance.printVariables();
    }
}

