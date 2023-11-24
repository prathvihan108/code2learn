//String pool: when comparing any two string values it is always adviced to use equals() method to avoid any wrong results during
public class J08 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2 ="Hello";//s2 is referencing to s1 since "Hello" is same ,>>string pool concept

        String m1 =new String("Hello");
        String m2 =new String("Hello");//m1 and m2 are two different string objects ,"==" compares wether objects are referring to ssame memory location or not 

        //String pool concept 
            System.out.println(s1==s2); //this will print true because both s1 and s2 are objecst whichh are referenceing to same string "Hello"in string constant pool
   

        //String pool concept
        System.out.println(m1==m2); //this will print false  because both s1 and s2 are  different objects whichh are referenceing to different strings "Hello"in heap memory
        
    }
}
