public class J18 {
    
  
//Satic block
//note static variable does not mean that the value can not be changed it only means the variable/method belongs to class itself
//and is so common to class
/*
 * In Java, a static block is a special block of code
 *  declared using the static keyword within a class. 
 * It is executed when the class is loaded into the Java Virtual Machine (JVM). 
 * The static block is typically used for initializing static variables or
 *  performing one-time setup tasks that should be done before any instances
 *  of the class are created or any static methods are called.
 */
    
    
    public static void main(String[] args) {

        StaticBlock obj=new StaticBlock();



        System.out.println("Value of staticVariable: " + StaticBlock.staticVariable);

        StaticBlock obj2=new StaticBlock();
        StaticBlock.staticVariable+=3;//Here the static block is not called again so value will be 42+3=45 and not 40 again

        System.out.println("Value of staticVariable: " + StaticBlock.staticVariable);

    }
}

class StaticBlock
{   // Static variable
      static int staticVariable;//

    // Static block
    static {
        System.out.println("Static block is executed only once the class is loaded first time.");
        staticVariable = 42;
    }

}
