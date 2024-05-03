//Dynamic method dispatch(Run time polymorphism)

//  Most basic  things are covered here
//the reference type in inherietance can be able to access its type variables and methods
//the method of object calss type will be called if the sub class overrides the method
//,if the methods is not overriden in sub class then only the reference type method called



class Phone  //Base Class
{
    public void greet()
    {
        System.out.println("Grreting phone");
    }

    public void On()
    {
        System.out.println("phone is on");
    }
}

class SmartPhone extends Phone  //subClass
{
    public void greet()
    {
        System.out.println("Grreting Smartphone");
    }

  public void On()  //you can check by changing this function to off
    {
       System.out.println("Smartphone is on");
    }
}

public class J09 {
    public static void main(String[] args) {

        Phone obj1=new Phone(); ///This ok as we know
        obj1.greet();
        obj1.On();
        
        SmartPhone obj2=new SmartPhone(); //this is also ok as we know
        obj2.greet();
        obj1.On();

        Phone obj3= new SmartPhone();  //Note:we can also  assign object of subclass to super classs  reference 
        obj3.greet();
        obj3.On(); //here the On() method is present in both the classes but in this case the On() method of subClass will run
                    //Easy to remember:The Method in the class of object created will run(object type )
                    //note:Reference type can access its type variables and methods
       
                    // SmartPhone obj4=new Phone();  this is  not possible

        
    }

}



