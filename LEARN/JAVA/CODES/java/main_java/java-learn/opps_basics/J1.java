
//opps
//u can only have one public class/static class in one java code
  class Employee{ //A newly created class
    int id; /// id ,name, salary are in global scope of class employee and are having default modifire
    int salary;
    String name;
    public void printDetails(){  
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary; //The variable will be different for different objects created
    }
}

public class J1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12; //Directly accessible by using objects only eith dot operator following var name as variables are in default scope:which is available within a same package only
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
