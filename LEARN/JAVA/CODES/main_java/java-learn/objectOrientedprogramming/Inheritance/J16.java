//Creating a thread by implementing runnable interface
public class J16 {

    public static void main(String[] args) {
        // Create an instance of a class that implements Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread and pass the Runnable instance to it
        Thread myThread = new Thread(myRunnable); //constructor of thread class in invoked which takes a runnable instance as an argument

        // Start the thread
        myThread.start();

        // Main thread continues to execute concurrently with the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

// Class implementing the Runnable interface
class MyRunnable implements Runnable {

    @Override
    public void run() {
        // Code to be executed in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable Thread: " + i);
        }
    }
}
