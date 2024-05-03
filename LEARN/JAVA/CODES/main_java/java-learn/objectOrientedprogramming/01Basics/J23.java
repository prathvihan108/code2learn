/*In Java, you can cast a subclass object to its superclass but not vice versa
however u can convert the super class reference variable to subclass object as shown in below example
without any issues because every subclass is also an instance of its superclass. 
*/
 class Animal {
    // Animal class
}

class Dog extends Animal {
    // Dog class, which extends Animal
}

public class J23 {
    public static void main(String[] args) {
        // Casting a subclass object to its superclass
        //use:after converting to super class type u can only access the methods from the animal class and the overriden methods from the subclass
        Dog dog = new Dog();
        Animal animal = (Animal) dog; // This is valid 

        //note:u can not convert the superclasss object to its subclass object since the sub class may also have its own fields

        // Casting a superclass reference to its subclass reference
       
       //case 1:
        //u have referenced the subclass object with the super class,so in future u can reference it with the subclass too 
        //u have references the dog as animal so in future u can reference it as dog too(classCasting)
        //use:u can now acces only the methods from the dog class.

        Animal animal1 = new Dog(); 
        Dog dog1 = (Dog) animal1; // This will  not throw a ClassCastException at runtime
       

        //case 2;
          //u have referenced the superclass object with the super class,so in future u cannot reference it with the subclass 
        //u have references the animal as animal so in future u can reference it as dog  since u dont know wether the animal is a dog

        Animal animal2 = new Animal();
        Dog dog2 = (Dog) animal2; // This will throw a ClassCastException at runtime
    }
}

