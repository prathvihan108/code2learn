//default methods in java 
/*
 * Implementation:

    Default methods provide a default implementation in the interface itself.
    Implementing classes can choose to override the default method or inherit the default implementation.

Usage:

    Default methods are useful for adding new methods to existing interfaces without 
    forcing all implementing classes to provide an implementation.
 */

interface MyInterface {
    // Abstract method
    void regularMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default implementation in MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void regularMethod() {
        System.out.println("Implementation of regularMethod in MyClass");
    }
}

class CustomClass implements MyInterface {
    @Override
    public void regularMethod() {
        System.out.println("Implementation of regularMethod in CustomClass");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Custom implementation in CustomClass");
    }
}

public class J12 {
    public static void J12(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.regularMethod();     // Output: Implementation of regularMethod in MyClass
        obj1.defaultMethod();     // Output: Default implementation in MyInterface

        CustomClass obj2 = new CustomClass();
        obj2.regularMethod();     // Output: Implementation of regularMethod in CustomClass
        obj2.defaultMethod();     // Output: Custom implementation in CustomClass
    }
}
