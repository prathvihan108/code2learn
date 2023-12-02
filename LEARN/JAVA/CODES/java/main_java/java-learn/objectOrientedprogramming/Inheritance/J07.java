//Mrthods overriding

/*
 * 
 * Method overriding in Java is specific to instance methods, not static methods.
 *  When you override a method in a subclass, the method in the subclass should have the same s
 * ignature (name, return type, and parameter types) as the method in the superclass.
 *  Method overriding allows a subclass to provide a specific implementation of a method that is already provided by its superclass.

Here's an example demonstrating method overriding with instance methods:


 */


public class J07 {
    public static void main(String[] args) {
        
    }
}

class ClassA extends J07 {
    public void met1() {               //MRTHOD overriding can be done only for instaance methods
        System.out.println("Method 1");
    }
}

class ClassB extends ClassA {
    @Override
       public void met1() {
        System.out.println("Method 1 overridden");
    }

    static void met2() {
        System.out.println("Method 2");
    }
}
