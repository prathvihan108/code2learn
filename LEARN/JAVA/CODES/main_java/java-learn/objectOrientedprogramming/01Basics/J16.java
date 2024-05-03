//Finalise method is present in object class which can be overriden by any class
/*
 * you can use the finalize method. The finalize method is a method of the Object class, and any class can override it.
 *  The finalize method is called by the garbage collector before the object is reclaimed.
 */
public class J16 {

    public static void main(String[] args) {
        // Creating an object
        MyClass obj = new MyClass();

        // Assigning null to the reference variable, making the object eligible for garbage collection
        obj = null;

        // Explicitly triggering garbage collection (not recommended in normal scenarios)
        System.gc();
    }
}

class MyClass {

    // Finalize method - called before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup or finalization code here
            System.out.println("Finalizing the object...");

        } finally {
            // Calling the finalize method of the superclass (Object)
            super.finalize();
        }
    }
}
