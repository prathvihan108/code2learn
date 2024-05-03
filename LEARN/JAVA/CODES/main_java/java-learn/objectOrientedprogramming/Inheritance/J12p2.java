 //interfaces can also have private methods which also need too provide a body since they cn not be overriden
 /*
  *  Private methods in interfaces are useful for organizing and encapsulating code within the 
  interface without exposing it to the outside world. These private methods are not part of the
   interface's public API and cannot be accessed outside the interface.
  */
 interface MyInterface {
    // Public abstract method  since by default public
    void myMethod();

    // Public default method
    default void anotherMethod() {
        System.out.println("This is a default method.");
        privateMethod(); // Call private method
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        //privateMethod(); // Cannot call private method from a static method directly ,but id private method was also static then it is ok
    }

    // Private method
    private  void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// Implementing class
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");
    }

}

// Example usage
public class J12p2 {
    public static void main(String[] args) {
        MyInterface.staticMethod();//using interface name we can call static methods directly

        MyClass myObject = new MyClass();
        myObject.myMethod();
        myObject.anotherMethod();//default methods
    }
}
