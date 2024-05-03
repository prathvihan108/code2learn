//important ####### points

// Satic methods work opposite to instance methods in case of object and reference type resolving
//Reference type :determines which class method to call at compile time only not runtime
/*
 * n Java, static methods cannot be overridden in the same way that instance methods are overridden. 
 * When a subclass declares a static method with the same signature as a static method in its superclass, 
 * it's not considered overriding, but rather hiding.
 */



 /*
 * Static methods are associated with the class itself, not with instances of the class.
 *  Therefore, they are resolved at compile-time based on the 
 * reference type (the declared type of the variable), not at runtime based on the actual type of the object.
 *  This is different from instance methods, which are resolved dynamically at runtime based on the actual 
 * type of the object.
 */

 //satic methods can not take part in runtime polymorhism
 //staic methods can be inherited (hiding happens when we inherit)but can not be overriden
 //final methods can not be overriden also
class Animal {
    public static void printType() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    public static void printType() {  //this method is hided
        System.out.println("Cat");
    }
}

public class J04 {
    public static void main(String[] args) {
        Animal.printType();  // Calls Animal's static method
        Cat.printType();     // Calls Cat's static method

        // However, it's important to note that the type of the reference variable determines which method is called
        Animal animal = new Cat();
        animal.printType();  // Calls Animal's static method, not Cat's (hiding, not overriding)//because static methods are associated with class itself 
    }
}
