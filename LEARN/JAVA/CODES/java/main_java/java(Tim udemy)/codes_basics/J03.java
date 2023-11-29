
//static methods can be more than one too
import java.util.Scanner;

public class J03{
    public static void main ( String[] args){

        System.out.println("hello world");
        int  a=3;
        int b=4;

        int sum=add(a,b);
        add(a,b);  //Even though we are not catching the return variable c here but too no error will hapens
        System.out.println(sum);

    }

    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
}