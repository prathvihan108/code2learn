//let's try to access private modifiers outside the class :
/* 
class Employee {

  protected    int id; //Even protected can be accessed directly within the packge,
  private  String name;

}

public  class J3{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 3;// >>>will not throw error becoz protected can be accessed within the package,and also out side the package but by only subclasses not all
    
        emp1.name = "Shubham";// >>>will throw error  //u can access private variables of other class by public methods in that class

    }
}
*/