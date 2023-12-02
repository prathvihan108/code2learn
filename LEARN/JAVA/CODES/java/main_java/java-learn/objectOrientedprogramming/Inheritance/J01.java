//Check out how the constructor class work in the Inheritance
//Refer Harry notes
//note:multiple inheretanc is not allowed in java:that means one subclass can not have more than one super class
public class J01 {

    public int x;
    public static void main(String[] args) {

        Derived2 obj2=new Derived2(); //constructor of derived2 class invokes the derived class constructor,the derived class constructor in
                                        //turn invokes default constructor of J01(Base class)
                                        //Execution order :base class->>Derivedclasss1-->Derivedclass2
                                        //You can use "super()" to invoke required parameterised constructor in subclasses
}
        
    

    public J01()
    {
        System.out.println("I am a base class constructor");
    }

    public void J01(int a)
    {
        System.out.println("i am a base class parametarised constructor");

    }
}


class Derived extends J01{
    int y;

    public Derived()
    {
        System.out.println("I am a derived class constructor");
    }

    public Derived(int a,int b)
    {
        System.out.println("I ama derived class paramerised constructor");
    }



}

class Derived2 extends Derived
{
    int z;

    public Derived2()

    {
        super(2,3);//invoking parametarised constructor of its base class 
                        //it will show error if there is no constructor in the base class which takes 2 arguments
        System.out.println("I am a derived2 class constructor");
    }

}
