/**
 * J06
 */

 /**
  *  Myinterface
  */

  //Anonymous class
  /*
   *  An anonymous class in Java is a class without a name. 
   * It is typically used for a one-time, short-term implementation of an interface or extending a class. 
   * Anonymous classes are declared and instantiated at the same time, often in situations
   *  where creating a separate named class would be unnecessary or overly verbose.

   */

   /*
    * In Java, directly creating an instance of an interface using the new keyword is not allowed.
     However, when you see code like new MyInterface() { ... }, it's actually creating an instance of
      an anonymous class that implements the given interface.
    */
    //anonymous calss is created by compiler automaically at run time

 interface  MyInterface {
    public void MyMethod();
  

 
    
 }
class J06 {
   // Anonymous class
    MyInterface obj=new MyInterface() {

        @Override
        public void MyMethod()
              {
        System.out.println("Hello World");
    }
        
        
    }; //semicolon is must for anonymous class
        
   

    
}