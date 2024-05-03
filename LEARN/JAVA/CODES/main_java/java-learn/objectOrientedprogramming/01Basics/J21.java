//SingleTon class
//When we only want to create only one instance of a class and give same object reference to all demanding reference variables
public class J21 {

    // Private static instance variable
    private static J21 instance;

    // Private constructor to prevent instantiation from outside the class
    private J21() {
        // Initialization code, if needed
    }

    // Public static method to get the singleton instance
    public static J21 getInstance() {
        if (instance == null) {
            // Create the instance only if it doesn't exist
            instance = new J21();
        }
        return instance;
    }

    // Other methods and members, as needed
}

class outer{

    //Here obj1 and obj2 are reference variables pointing to same object in the memory
    J21 obj1=J21.getInstance();
    J21 obj2=J21.getInstance();

}

