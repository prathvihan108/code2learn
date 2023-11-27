public class J02 {
    public static void main(String[] args) {
        byte age = 34;
        int age2 = 56;
        short age3 = 87;
        long ageDino = 5666666666666L;  //Mention L or l for long //Stores only whole numbers 
        char ch = 'A';
        float f1 = 5.6f;  //Mention f or F for float
        double d1 = 4.66;//similar to float //can also store fractional numbers/long numbers, u can consider it similar to float but can store more numbers
                            //No need to mention any thing for double type on RHS ,its already considered superior//

        boolean a = true; //Must be "true" and not "True" or "0"also
        System.out.println(age);
         System.out.print(f1); //Print will no add new line
          
        String str = "Harry";
        System.out.println(str); //Println will add new line

        float gg= 2.4;//this will give u mismatch errror
        float gh=2.4f; //this will not give u an error

    }
}
/*
 * 
 * 
 * double is a 64-bit floating-point data type. It is used to represent fractional numbers or numbers with decimal places. It provides higher precision and a wider range of values compared to long. double 
 * long is a 64-bit signed integer data type. It can store whole numbers ranging from approximately -9.2 quintillion (-9,223,372,036,854,775,808) to 9.2 quintillion 
 */
