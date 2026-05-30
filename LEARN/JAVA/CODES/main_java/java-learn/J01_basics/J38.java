//Note :input in java: The next() reads upto the next token only and the nextLine() reads until it encounters the \n
//if we try to read the input for this problem by entering the values one below other then the string value could not 
//be read since the \n which was added by pressing the enter button is included in the input stream and the nextLine(0)
//Assumes that the \n is encounetered and so it reads the empty string so the to solve this problem u can add another 
//scannner.nextLine() in between the reading of values double and the string.

//And the other function such as nextInt nextDouble etc read from the standard input until the white space characters or \n

//Even we can use the scanner.useDelemeter(",") if we want to read up to the particular character only in the 
//input stream and then we could call the scanner.next()  which will only consume the characters up to the specified delemeter only
import java.util.*;

public class J38 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        //scan.nextLine();  //consume the left over character
        String s=scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}