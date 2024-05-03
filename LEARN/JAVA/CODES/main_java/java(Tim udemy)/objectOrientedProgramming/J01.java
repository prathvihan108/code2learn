//nested classes can be defines as shown below

public class J01 {
    
    private int outerData;

    // Constructor for OuterClass
    public J01(int data) {
        this.outerData = data;
    }

    // Method in OuterClass that uses InnerClass
    public void displayInner() {
        InnerClass innerObj = new InnerClass();
        innerObj.display();
    }

    // InnerClass (nested class)
    public class InnerClass {
        
        // Method in InnerClass
        public void display() {
            System.out.println("InnerClass display method. OuterData: " + outerData);
        }
    }

    // Main method to demonstrate nested class usage
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        System.out.println("Hello");
        J01 outerObj = new J01(42);

        // Invoking the displayInner method, which, in turn, uses InnerClass
        outerObj.displayInner();
    }
}
