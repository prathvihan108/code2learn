//Type casting
public class J21 {
    public static void main(String[] args) {
        
/*Casting
Casting in java is the assigning values of one type to another. The types being considered here are compatible i.e. we can only assign values of a number type to another type storing numbers (vice-versa is not allowed i.e. floating values cannot be assigned to boolean data types).
Casting in Java is of 2 types:
Implicit casting
This casting is done by java implicitly i.e. on its own. It is assigning smaller values to larger data types.
*/float price = 100.00F;
int gst = 18;
float finalPrice = price + gst;
/* 
Explicit casting
This casting is done by the programmer. It is assigning larger values to smaller data types.*/
int m = 100;
float l = 18.00F;
int n = m + (int)l;

    }
}
