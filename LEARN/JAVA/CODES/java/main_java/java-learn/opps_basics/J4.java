//Getters and setters:are helpul when we want to modify or perform action on private variables of clss
class Employee {

    private int id;
    private  String name;

    public String getName(){   //getter
        return name;
    }
    public void setName(String n){ //setter
        name = n;
    }
    public void setId(int i){//setter
        id = i;    //here also variable "id" is different for different objects calling it
    }
    public int getId(){
        return id;
    }
}

public  class J4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); //create a instance of a class

        emp1.setName("Shubham");//we are able to access "name" which is private varible in another class by using the public methos of a class
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}
