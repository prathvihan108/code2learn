//java is strictly typed language:Enforces type safety — no automatic/incompatible type conversions.
//No, not all statically typed languages are strictly typed.


public class J07 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;//if u only give 7/4 * 9/2 then answer will be 4.0 even though type is float on LHS,it doesnot matter//this is becoz java is strictly typed language
       System.out.println(7/4.0); //is also ok when used singly or when we r assigning to double data tupe on RHS ("Gives float answer"),but custion while using this type in expression like above statement where u r assigning result to float,so if u follw this step then it will show typw mismatch error
        System.out.println(a);



        char grade = 'B';
        grade = (char)(grade + 8); //Explicit type casting //note:java generally does not convert implicitly
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}


// 7/4f --->>is also same as 7/4.0f
// 