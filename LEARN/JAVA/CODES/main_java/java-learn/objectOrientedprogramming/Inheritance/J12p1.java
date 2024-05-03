//Interfaces can also have static methods but u need to provide body since static methods can not be inherited
//in abstract calsses also we have static methods ,but satic methods cannot be made abstract since they can not be inherited
interface MyInterface {
    // Regular abstract method
    void myMethod();

    // Static method in the interface  //need to provide body for static methods
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
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
public class J12p1 {
    public static void J12p1(String[] args) {
        // Call static method without creating an instance of the implementing class
        MyInterface.staticMethod();

        // Create an object of MyClass and call the implemented method
        MyClass myObject = new MyClass();
        myObject.myMethod();
    }
}


