// Method overloading in Java cannot be performed solely by changing the return type of methods. Overloading requires methods to have different parameter lists, but the return type alone does not differentiate between methods during compilation.
/* 
In Java, method overloading allows you to define multiple methods with the same name but
 different parameter lists. The parameter lists must differ in terms of the number of 
 parameters, their types, or their order.*/

 /* 
 //For example following code shows errors
public class J29
{

     public static int sum (int a,int b)  //can not have same no of arguments and also same type at the same time for method over loading
        {
            return a+b;
        }

        
     public static float sum (int a,int b)
        {
            return a+b;
        }
    public static void main(String[] args) {//main
       int res=sum(2,4);
       float res2=sum(3.5f,6.7f); //Dont forget to put f infront of numbers to make tell that they are flaot or else it will  show an error that
        System.out.println(res);
        System.out.println(res2);                                    //"u can not pass double type to float in sum function"
                                                //Here u can pass float to double type but not vise versa ,becoz java performs implicit type conversions from low to high type only based on precedence    


    }
}*/