public class J18 {
    
  

    public static void main(String[] args) {

        StaticBlock obj=new StaticBlock();



        System.out.println("Value of staticVariable: " + StaticBlock.staticVariable);

        StaticBlock obj2=new StaticBlock();
        StaticBlock.staticVariable+=3;

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
