import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc= new Scanner(System.in);

         //     int a = sc.nextInt(); //if u five floating point number it will show error""input mismatch exception" unlike c++
        //        float a = sc.nextFloat(); //here u can give integer
        //        System.out.println("Enter number 2");
        //        int b = sc.nextInt();// Reading the variable  "b" using object "sc"of class""Scanner"
        //        float b = sc.nextFloat();
        
        //        int sum = a +b;
        //        float sum = a +b;
        //        System.out.println("The sum of these numbers is");
        //        System.out.println(sum);
                  boolean b1 = sc.hasNextInt(); //will check wether a given number is integer, 
        //        System.out.println(b1);
        //        String str = sc.next(); //can only read one word ,will not read spaces
                System.out.println(b1);
                String str = sc.nextLine();//can read entire string along with spaces
                System.out.println(str);
    }
}
