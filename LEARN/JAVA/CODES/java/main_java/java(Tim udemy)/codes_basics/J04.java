
//methids in java can be only overloaded by means of difference in the return type of parameter,number of parameters or oreder of parameters
public class J04{
    public static void main(String[] hello){ //instead of "args" it can be anything // we use it for command line arguments only so
        System.out.println("Hello World");
    }


}
//In Java, there can be multiple classes in a single source file, but only one of them can be declared as public, and the name of the public class must match the name of the file. The public class is the one that can be accessed from outside the package.
 class Classname{  
  

    public static void fun1(int a){

    }

    public static int fun1(float a) //valid for methodoberloading bexoz the return type is different for paameter.
    {
            return 0;
    } 

    public static int fun1(float a,float b) //this is also valid method overloading sisnce number of paraeters differ
    {
        return 1;
    }

    public static int fun1(double b,int a)   //valid
    {
        return 1;
    }

    public static int fun1(int a ,double b)//valid methods can be overloaded based on order of pass
    {
        return 1;
    }

    public static void fun1(int a,double b) //this is invalid method can not be over loaded based on the return type of the function
    {

    }

    public static int fun1(int ss,double ff)//this is not valid ,becoz the methods can not be over loaded based onthe parameter name
    {
return 1;
    }




}


    

    
