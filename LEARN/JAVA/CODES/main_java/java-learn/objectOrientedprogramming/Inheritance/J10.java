//abstract methods
//A method which is declared without an implementation
//A Concreate methods need to implement all the abstract methods or else u have to make the subclass itself as Abstract
//we can not have final abstract class since final classes can not be overriden
//an abstract class can extend  other class es too
public class J10 {
    public static void main(String[] args) {

       // Parent2 obj=new Parent2(); we can not create object of a Abstract classs  ,,ha Reference variables of abstract classes can be made
            
        Parent2 obj= new Child1(); //this is ok since the object is of type Child1 and reference variable of Parent2
        
    }

}

 abstract class Parent2
{
    Parent2(){ //w can create a constructor in abstract class. ,,,but but abstract type constructor  can not be created

        System.out.println("I am Parent 2 Constructor");

    }// abstract class constructor can be instantiated through sub classes only using super() keyword

    public void Say() //we can alos have other methods other than abstract methods which can be overriden by subclasses if they wish
    {
        System.out.println("Hello");

    }

    public static void hello() // also we  can have static methods in side the abstract classes sincce they can be directly called by using class name(and thereis no need of creating objects)
    {
        System.out.println("Hello");
    }
    // abstract  static void hi(); you can not have abstract static methods since static methods can not be overriden
    
    
    abstract void greet();  //if there is at leasst one abstract method also in the class then entire classs needs to be abstract
    //no body for abstract method //also do not forget semicolon

    
}

class Child1 extends Parent2
{   
    @Override
    void greet()
    {
        System.out.println("Say what u wish");
    }
}

class Child2 extends Parent2  //If any  class inherits a abstract class ,then the sub class must implemrnt all the abstract methods the super class
{
    void fun1()  //U can implement extra methods too
    {

    }

    void greet()
    {

    }
}
