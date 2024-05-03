
//Note Strings are immutable in java,u can not channge string at original position
//8.2f>>8 spaces and prints floalt value up to 2 decimal places
import java.util.Scanner;  //Necessary for taking input from user

public class J10 {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);  //will cause an error
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);// note here we have used printf which is also used in c/c++
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

    }
}

    
