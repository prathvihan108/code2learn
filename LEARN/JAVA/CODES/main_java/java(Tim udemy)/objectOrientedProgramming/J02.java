public class J02 {

    private int outerData;

    // Constructor for J02
    public J02(int data) {
        this.outerData = data;
    }

    // Public method to interact with the private inner class
    public void usePrivateInnerClass() {
        PrivateInnerClass innerObj = new PrivateInnerClass();
        innerObj.display();
    }

    // Private inner class
    private class PrivateInnerClass {

        // Method in PrivateInnerClass
        public void display() {
            System.out.println("PrivateInnerClass display method. OuterData: " + outerData);
        }
    }
}
