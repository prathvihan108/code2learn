
//If we have not implemented the tostring methods by default java will print object code,ckeck out put:

public class J19 {

    public static void main(String[] args) {

        Student s1=new Student("prathvi", 3);
        System.out.println(s1.toString()); //explecitly calling
        System.out.println(s1);//Java automatically calls tostring method present in String class  for us, to convert object to a a string
        
    }
}


class Student
{
    int age;
    String name;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

   // public String toString()
   // {
    //    return "Name: "+name+",age:"+age;
   // }
} 
    

