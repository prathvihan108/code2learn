class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is the child class.");
    }
}

public class J01_1 {
    public static void main(String[] args) {
        Parent parentObject = new Child(); // Reference to child class object using parent class reference
        parentObject.display(); // Calls the display() method of the Child class
        // parentObject.displayChild(); // This would result in a compilation error, as displayChild() is not part of the Parent class

        // If you want to access the child-specific methods, you need to cast the reference back to the Child class
        if (parentObject instanceof Child) {
            Child childObject = (Child) parentObject;
            childObject.displayChild();
        }

       // Child childobj1= new parent()  //u can not assign parent type object to child calss reference variable
        //this is because 
        //we know that -->referenctype can access its type mathods and variables
        //-->and so child type reference variable must be able to access its type variables and methods in its class
        //-->but  for that the variables must be initialised before accesing using constructor of child
        //-->and if we create object of parent class ,parent calss constructor can not call child class constructor.
        //Therefor can not have child reference variable and parent class object
        //Above classes donot have idea about below classes ,but below classes are having an idea about above classes
        Child childobj =(Child)new Parent();
        childobj.display();
        childobj.displayChild();
        
    }
}
