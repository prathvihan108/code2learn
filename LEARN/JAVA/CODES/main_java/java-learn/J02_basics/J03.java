//call by reference and passing objects in java concept {
    
public class J03{
    static void modifyValue(int x) {  
        x = x * 2;
    }
    
    public static void main(String[] args) {
        int value = 10;
        modifyValue(value);
        System.out.println(value); // Prints 10, not 20 becoz /*Primitive types (int, float, double, etc.): 
        //When you pass a primitive type to a method, you are passing the actual value. 
        //      Changes to the parameter inside the method do not affect the original value. */
    }
    
}
