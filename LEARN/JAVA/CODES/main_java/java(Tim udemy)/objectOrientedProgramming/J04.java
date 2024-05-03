//In this program u will get null as a result since the variables of type "String"  are not initialised.
//primitive datatypes could not have given null as a result since they have pre assigned values

//Null is a special key word in java ,meaning that a vatiable or method has a type but do not have an reference

public class J04 {


    private String make;
    private String mode;
    private String colour;
    public static void main(String[] args) {

      //  describeCar();    even though u r trying to access the method in the classs itself,it shows error becoz its not allowed
    J04 car=new J04(); //You need tocreate an object to access the non static method how ever
    car.describeCar(); 
    }

    public void describeCar()
    {
        System.out.println(make+" ,"+mode+" ,"+colour+" ,");
    }
}

/*
 * note:
 */
