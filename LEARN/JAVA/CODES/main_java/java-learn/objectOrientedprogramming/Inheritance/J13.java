//Inheritance in java

/*
 * 
 * Certainly, here are important notes on inheritance of interfaces in Java:

    Interface Inheritance:
        Interfaces can extend one or more interfaces.
        The extends keyword is used for interface inheritance.

    Multiple Interface Inheritance:
        A class can implement multiple interfaces.
        This enables a form of multiple inheritance for types with no state.

    Abstract Methods Inheritance:
        If an interface extends another interface, it inherits all the abstract methods from the parent interface(s).
        Implementing classes must provide concrete implementations for all inherited abstract methods.

    Default Methods:
        If an interface extends another interface, and both have default methods with the same signature, implementing classes must provide an implementation, resolving the conflict.

    Method Resolution Rules:
        Conflicting default methods require the implementing class to provide its own implementation, and the rule is that the implementing class's method takes precedence.

    Diamond Problem:
        Interfaces help prevent the "diamond problem" by requiring explicit implementations in case of conflicting default methods.

    Interface Chaining:
        Interfaces can create chains of inheritance, where one interface extends another, and another extends the former.

    Covariant Return Types:
        Interfaces support covariant return types, allowing a subclass interface to return a more specific type.

    Extending Multiple Interfaces:
        A class can extend a class and implement multiple interfaces simultaneously.

Understanding interface inheritance is crucial for creating modular and flexible systems in Java.
 */

public class J13 {
    public static void main(String[] args) {
        
    }
}

interface sampleinterface
{
    void met1();
    void met2();
}

interface childInterface extends sampleinterface //one interface can inherit another interface same as classes
{
    void met3();
    void met4();
}

class My implements childInterface
{ 
   public void met3()  //u need to make these public becoz ,in interfaces methods are by default public
    {

    }
    public void met4()
    {

    }

    //we also need to implement the met1 and met2 also

    public void met1()
    {

    }
    public void met2()
    {

    }



}