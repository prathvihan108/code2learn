//Calling one constructor inside another constructor  constructor chaining
//this keyword is the current instance of a class
public class J07 {

    public int id;
 public static void main(String[] args) {

    Car.fun();

    
 }   

 public J07()  //empty constructor calling parameteraised constructor
 {
    this(1008);  //this keyword can also be used to pass object to other methods 
    //if we are calling one constructor inside another constructor ,the call should be first line itself.
    System.out.println("Empty contructor called\n");
 }

 public J07(int id)
 {
    System.out.println("Parameterised constructor called\n");
    this.id=id;
 }
}

class Car{
    public static void fun()
    {
    J07 obj =new J07();
    System.out.println(obj.id);
    }
}
