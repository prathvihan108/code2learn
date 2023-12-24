//Interface is where 2 systems met and communicate
//In java interface is a group of related methods with empty bodies
//we can use multiple interfaces to create a class unlike inhereitance in java
//Implements key word is used to create a implemented class
/*
 * Interface methods are by default abstract and public. 
 * Interface attributes are by default public , static and final.
 *  An interface cannot contain a constructor (as it cannot be used to create objects)
 */
//Its only necessary to implement the methods of interfaces not the fields
//There can also be private methods in interface but the classes can not implement that method,Then why do we need private methods

interface Bicycle{

    int a=45; //You can create properties in interfaces,also these are already final (u can not change)//variables are already final

    void applyBreak(int decreament);
  
    void speedUp(int increament);
 

}

interface Bike
{
    void applyBreak(int decreament);
    void speedUp(int increament);
}

class TriCycle implements Bicycle,Bike //implemeting 2 interfaces
{
    void blowHorn()
    {
        System.out.println("Poo poo poo");

     
    }

       public void applyBreak(int decreament)  //u need tomake the implemented methods as public compulsary
        {
            System.out.println("Breaks");

        }

        public void speedUp(int increament)
        {
            System.out.println("Speeding up");
        }

}


public class J11 {

    public static void main(String[] args) {
        TriCycle obj1= new TriCycle(); //this is ok
        Bicycle obj2 =new TriCycle();  //u can also assign the object of a implemented class of interface to reference the interface
     //   Bicycle obj3 =new Bicycle();  //this is not allowed ,u can not create object of the interface
        obj1.applyBreak(4); 
        obj1.speedUp(3);

        obj2.applyBreak(5);


       // obj1.a=5;//this is not allowed

        
    }
    
}
