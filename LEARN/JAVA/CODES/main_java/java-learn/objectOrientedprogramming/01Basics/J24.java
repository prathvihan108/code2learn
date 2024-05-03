class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void eat()
    {
        System.out.println("Dog eats");

    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class J24{
    public static void main(String[] args) {

        //Super class reference can call the subclass method only when run time polymorphism as shown below
        Animal animal1 = new Dog(); // Creating Dog object and referencing it by Animal type
        Animal animal2 = new Cat(); // Creating Cat object and referencing it by Animal type

        animal1.sound(); // Output: Dog barks
        animal2.sound(); // Output: Cat meows

        //u can not call the methods from the subclass with super class referene,it can be allowed only when the sub class overides the super class method

       // animal1.eat();
        //animal2.eat();

        Dog dog1=(Dog)animal1;//to call it u need to first cast the super class reference to subcalss object

    }
}
