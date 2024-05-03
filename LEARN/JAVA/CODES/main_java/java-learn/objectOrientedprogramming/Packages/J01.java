/*
 * 
 */
public class J01 {

    private String name;
    private int id;

    // Constructor
    public J01(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // toString method
    @Override
    public String toString() {
        return "J01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    // equals method
    //if u want to override the mwthod  method signature must be same as in super class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //if pointing to same reference then return true early since valued will be obiviously equal
       // if (obj == null || getClass() != obj.getClass()) return false;

        J01 that = (J01) obj;//Type casting is required since obj  is of type Object
        return this.id == that.id && this.name.equals(that.name); //compares the values and returns true if values are equal
    }

    // hashCode method
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        return result;
    }

    // finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup operations (e.g., closing resources)
            System.out.println("Finalizing object: " + this.toString());
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating instances
        J01 obj1 = new J01("John", 1);
        J01 obj2 = new J01("Jane", 2);

        // toString example
        System.out.println("toString Example:");
        System.out.println(obj1.toString());

        // equals example
        //compares the values and returns true if they are equal
        //If we do not override then this method will return true, if two references are pointing to same object in Memory
        System.out.println("\nEquals Example:");
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));

        // hashCode example
        System.out.println("\nHashCode Example:");
        System.out.println("HashCode of obj1: " + obj1.hashCode());

        // finalize example (Note: Explicitly calling finalize is not recommended; it's for demonstration purposes)
        System.out.println("\nFinalize Example:");
        try {
            obj1.finalize();
            obj2.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
