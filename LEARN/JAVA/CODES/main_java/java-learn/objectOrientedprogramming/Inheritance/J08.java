/*In Java, static methods cannot be overridden in the same way that 
instance methods are overridden. 

When a subclass declares a static 
method with the same signature as a static method in its superclass,
 it is said to "hide" the superclass method rather than overriding it. This concept is known as method hiding. */

 //see the rules in "01key1"
 class Animal {
    static void staticMethod() {
        System.out.println("Static method in Animal");
    }
}

class Dog extends Animal {
    static void staticMethod() {
        System.out.println("Static method in Dog");
    }
}

public class J08 {
    public static void main(String[] args) {
        Animal.staticMethod(); // Calls the static method in Animal
        Dog.staticMethod();    // Calls the static method in Dog
    }
}
