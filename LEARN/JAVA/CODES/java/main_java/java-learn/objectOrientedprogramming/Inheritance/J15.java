//multi threading
//Multinng threading and multiprocessing both are used to achive multitasking

//Creating a thread by extending the thread class

//check 001keys
//differece between concurrency and paralalism;
//run and check how threads are running one after another
public class J15 {
    public static void main(String[] args) {

        MyThread1 obj1 =new MyThread1();
        MyThread2 obj2 =new MyThread2();
        obj1.start();
        obj2.start();//start() methods is provide in the thread class itself it automatically  start the run method
        
    }
}

class MyThread1 extends Thread
{
    @Override
   public void run()  //we are overriding the  run methods from thread class
   {

    int i=0;
    while(i<100)
    {
        System.out.println("thread 1 is running");
        i++;
    }
   }
}


class MyThread2 extends Thread
{
    @Override
   public void run()
   {

    int i=0;
    while(i<100)
    {
        System.out.println("thread 2 is running");
        i++;
    }
   }
}


