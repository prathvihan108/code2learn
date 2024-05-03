//run time polymorphism


//which method to call is determined at run time based on the type of object created
//what ever the type of object created, method from that class will be called (when overriding happens)
//If there is no overriding of methods no runtime polymorphism for that method since only one method will be present in either base or sub class
/*
 * Runtime Polymorphism (Method Overriding):

    Method overriding is a form of runtime polymorphism where a subclass provides a
     specific implementation of a method that is already defined in its superclass.
 */
/*
 * Upcasting is a term used in object-oriented programming to describe the process 
 * of casting an object of a subclass to a reference variable of its superclass. 
 * In other words, when you assign an object of a derived class to a reference variable of its base class, 
 * it is referred to as upcasting.
 */

 //Dynamic method dispatch : A call to a method is resolved at runtime rather than compile time in run time polymorphism
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class J03 {
    public static void main(String[] args) {
        Animal animal1 = new Cat();  // Upcasting
        Animal animal2 = new Dog();  // Upcasting

        // Polymorphism in action
        //which method to call depends on the type of object which is been created
        //the type of reference variable tell what type has access (also sub class of "reference type" can be accessed but supercalss can not be)
        animal1.makeSound();  // Calls the overridden method in Cat class
        animal2.makeSound();  // Calls the overridden method in Dog class
    }
}
