//every class in java extends the class callled object which is present in java lang.pacakage

public class J18 {

    public static void main(String[] args) {

        Student s1=new Student("prathvi", 3);
        System.out.println(s1.toString()); //explecitly calling
        System.out.println(s1);//Java automatically calls tostring method present in String class  for us, to convert object to a a string
        
    }
}

//If we have not implemented the toString method by default java will print object code by calling its own toString

class Student
{
    int age;
    String name;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String toString()
    {
        return "Name: "+name+",age:"+age;
    }
}