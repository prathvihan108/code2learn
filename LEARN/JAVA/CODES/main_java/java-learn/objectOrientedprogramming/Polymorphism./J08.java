//lambda functions
/*
 * Lambda expressions, often referred to as lambda functions or simply lambdas, were introduced 
 * in Java 8 as a feature to facilitate the adoption of functional programming concepts. 
 * Lambda expressions provide a concise way to express instances of single-method interfaces (functional interfaces). They are particularly useful when dealing with functional interfaces, 
 * which have only one abstract method.
 */


 

 // Functional interface with one abstract method
interface MyFunctionalInterface {
    void myMethod(String ses,int aea); 
}

public class J08 {
    public static void main(String[] args) {
        // Lambda expression implementing the abstract method
        
        MyFunctionalInterface myLambda = (s,a) -> System.out.println(s); 
        
        //s and a are just variables which are 
       
        //going to hold value of parameters ses  and aes when passed from function call
        ///it will be like s=ses; a=aea;

        // Using the lambda expression
        
        myLambda.myMethod("Hello, Lambda!",4);
    }
}

