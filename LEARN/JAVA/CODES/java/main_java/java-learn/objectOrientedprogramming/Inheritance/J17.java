//there are many constructors in thread class of java,such as :Thread(string name):Thread(Runnable r)

//using name constructor
//there are many other thread methods u can learn from java documentation

public class J17
{
    public static void main(String[] args)
    {

        MyThread3 obj1 =new MyThread3("rahul");
        System.out.println(obj1.getName()); //name of thread 

    }
   
}

class MyThread3 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread 1");
    }

    MyThread3(String name)
    {
        super(name); //constructor of the Thread class is invoked and name is assigned o the thread
    }
}

