//default methods in java 
/*
 * Implementation:

    Default methods provide a default implementation in the interface itself.
    Implementing classes can choose to override the default method or inherit the default implementation.

Usage:

    Default methods are useful for adding new methods to existing interfaces without 
    forcing all implementing classes to provide an implementation.
 *///note :  if a class is implementing two interfaces ,then if both the innter faces are having default methods,
 //we get an compilation error
 //The primary motivation for interfaces was to solve this problem only which still holds good with interfaces
 //so a calss can not implement 2 interfaces with each having default methods
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
