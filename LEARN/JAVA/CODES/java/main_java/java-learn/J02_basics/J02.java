//Varargs
//vargs is used for n number of arguments are to be passed for the function
//varargs is basically an array of specified type 
//we can also add other multiple arguments with args
import java.util.Arrays;

public class J02 {
    public static void main(String[] args) {
        fun(1,2,3,4);
        
    }

    public static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));//
    }
    
}
