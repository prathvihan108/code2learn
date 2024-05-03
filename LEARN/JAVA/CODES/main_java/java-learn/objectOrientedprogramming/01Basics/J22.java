//Class cast Exception :Reasons and Concept

class Animal {
    // Animal class
}

class Dog extends Animal {
    // Dog class, which extends Animal
}

class Cat extends Animal {
    // Cat class, which extends Animal
}

public class J22 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        
        // Trying to cast animal to Cat, which is not compatible
        Cat cat = (Cat) animal; // This line will throw a ClassCastException
    }
}
/*In this example, we have an Animal class and two subclasses Dog and Cat. 
When we try to cast an instance of Dog (which is an Animal) to a Cat, it's not possible because a Dog is not a Cat, 
hence a ClassCastException will occur at runtime */
