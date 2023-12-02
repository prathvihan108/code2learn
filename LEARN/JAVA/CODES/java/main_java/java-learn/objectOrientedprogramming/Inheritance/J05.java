/*
 * 
 * Private Access Modifier:

    Private members are only accessible within the same class.
    Subclasses cannot directly access private members of the superclass.
 */
class Superclass {
    private int privateField;

    private void privateMethod() {
        System.out.println("Private method in Superclass");
    }
}

public class J05 extends Superclass {
    public static void main(String[] args) {
        J05 J05 = new J05();
        System.out.println("Check");
        // Cannot access private members from superclass
        // J05.privateField = 42;
        // J05.privateMethod();
    }
}
