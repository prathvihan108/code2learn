public class J15 {

    //ususage of fnal keyword in various scenarios
    /*
     * Final Variable:

    When applied to a variable, it means that the variable's value cannot be changed 
    once it has been assigned a value. It creates a constant.
    
    Final Method:

    When applied to a method, it means that the method cannot be overridden by subclasses. 
    This is often used to ensure that the behavior of a method in a class remains constant
     and cannot be altered by subclasses.

     Final Class:

    When applied to a class, it means that the class cannot be subclassed. 
    You cannot create subclasses of a final class.
    
    
    Final object reference variable:
    
    When the final keyword is applied to an object reference variable in Java,
     it means that the reference variable cannot be reassigned to a different object after it 
     has been initialized. However, it's important to note that the state of
      the object (i.e., the content of the object it points to) 
    can still be modified unless the object itself is immutable.
    
     */
    
    // Final variable
    private final int finalVariable = 42;

    // Final method
    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }

    // Final class
    public final class FinalClass {
        // Class content
    }

    // Final object reference variable
    private final MyClass finalObject;

    // Constructor initializes the final reference variable
    public J15(MyClass finalObject) {
        this.finalObject = finalObject;
    }

    // A method that can modify the state of the object
    public void modifyObjectState() {
        // It is allowed to modify the state of the object
        finalObject.modifyState();
    }

    public static void main(String[] args) {
        // Creating an instance of the FinalKeywordExample class
        MyClass initialObject = new MyClass();
        J15 example = new J15(initialObject);

        // Accessing the final variable
        System.out.println("Final Variable: " + example.finalVariable);

        // Calling the final method
        example.finalMethod();

        // Creating an instance of the FinalClass (final class)
        J15.FinalClass finalInstance = example.new FinalClass();

        // The final reference variable cannot be reassigned
        // example.finalObject = new MyClass(); // This would result in a compilation error

        // But the state of the object it points to can be modified
        example.modifyObjectState();
    }
}

class MyClass {
    public void modifyState() {
        System.out.println("Modifying the state of the object.");
    }
}
