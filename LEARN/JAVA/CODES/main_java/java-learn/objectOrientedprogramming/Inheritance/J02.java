 /*
  * 
      Public members (fields and methods) are accessible from any class, including subclasses.
    Inheritance allows the subclass to inherit and access public members of the superclass.
  */
 class Superclass {
    public int publicField;

    public void publicMethod() {
        System.out.println("Public method in Superclass");
    }
}
//Main class start from sub class itself
public class J02 extends Superclass {
    public static void main(String[] args) {
        J02 J02 = new J02();
        J02.publicField = 42; // Accessing public field from superclass
        J02.publicMethod();  // Accessing public method from superclass
    }
}
