/*
 * Default/Package-Private Access Modifier:

    Default (package-private) members are accessible only within the same package.
    Subclasses outside the package cannot access default members of the superclass.
 */

 class Superclass {
    int defaultField; // Package-private

    void defaultMethod() {
        System.out.println("Default method in Superclass");
    }
}

class J04 extends Superclass {
    public static void main(String[] args) {
        J04 subclass = new J04();
        subclass.defaultField = 42; // Accessing default field from superclass
        subclass.defaultMethod();  // Accessing default method from superclass
    }
}

// In a different package
// public class SubclassInDifferentPackage extends Superclass {
//     // Cannot access default members from superclass
// }
