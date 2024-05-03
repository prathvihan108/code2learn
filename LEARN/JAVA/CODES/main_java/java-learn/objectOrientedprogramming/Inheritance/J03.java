/*
 * Protected Access Modifier:

    Protected members are accessible within the same package and by subclasses, even if they are in a different package.
    Subclasses can inherit and access protected members of the superclass.
 */

 class Superclass {
    protected int protectedField;

    protected void protectedMethod() {
        System.out.println("Protected method in Superclass");
    }
}

public class J03 extends Superclass {
    public static void main(String[] args) {
        J03 J03 = new J03(); 
        J03.protectedField = 42; // Accessing protected field from superclass
        J03.protectedMethod();  // Accessing protected method from superclass
    }
}
