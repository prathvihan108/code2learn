public class J37 {
    public static void main(String[] args) {

        //int res=fun();  
        Greet obj1=new Greet();//not required
   
        System.out.println(Greet.fun());//u can directly call a static method of another class using static method of current class ,also using instance also u could do it
  

        
    }
}

//static class Greet  You can not use a static keyword if it is a outer class
 class Greet{
    public static int fun() throws ArithmeticException
    {
        try{
        int  a=5;
        int b=0;
        int c=a/b;

        return c; //normally the the function needs to exit here .but it will execute finally block 
        }

       // catch(Exception  e); //this will throw error ,u should know the type of error before only
        //{}
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("This code will be executed regardless of weather your code throws exception or not");
        }

        return -1; //u must use a return statement if u r using return statemant in the try block

        
    }
}

