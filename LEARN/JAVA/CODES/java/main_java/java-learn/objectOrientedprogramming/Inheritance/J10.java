//abstract methods
//A method which is declared without an implementation
//A Concreate methods need to implement all the abstract methods or else u have to make the subclass itself as Abstract

public class J10 {
    public static void main(String[] args) {

       // Parent2 obj=new Parent2(); we can not create object of a Abstract classs  ,,ha Reference variables of abstract classes can be made
            
        Parent2 obj= new Child1(); //this is ok since the object is of type Child1 and reference variable of Parent2
        
    }

}

 abstract class Parent2
{
    Parent2(){

        System.out.println("I am Parent 2 Constructor");

    }

    public void Say()
    {
        System.out.println("Hello");

    }
    
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
