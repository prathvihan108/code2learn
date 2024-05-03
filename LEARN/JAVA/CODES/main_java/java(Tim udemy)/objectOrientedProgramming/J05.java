//Getterrs and setters
//Getters and setters in java mainly used to deal with the private members of a class ,since they can
//be only accessed by using public methods of the same class
//these can alos be static based on use case(when u want to share with entire class),but generally declared as only public si
//if a method is static means that its shared all over the class ,and changes will be affected all over

public class J05 {
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name; //we can not do : make=make ,so we use  "this" keyword
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        // You can add validation logic here if needed
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a non-negative value.");
        }
    }

    // Other methods can be added as needed
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday! Age is now: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of the J05 class
        J05 J05 = new J05();

        // Using setter methods to set values
        J05.setName("John Doe");
        J05.setAge(30);

        // Using getter methods to retrieve values
        System.out.println("Name: " + J05.getName());
        System.out.println("Age: " + J05.getAge());

        // Example of calling another method
        J05.celebrateBirthday();
        System.out.println("New Age: " + J05.getAge());
    }
}
