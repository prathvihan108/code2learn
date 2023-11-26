//Method over loading in java
/* 
In Java, method overloading can be performed by two ways listed below :

By changing the return type of the different methods
By changing the number of arguments accepted by the method
Now, let's have an example to understand the above ways of method overloading :*/

//By changing the return type

class J27{
     int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
         return  a*b;
    }

public static void main(String[] args) {

        J27 obj = new J27();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

}
}
