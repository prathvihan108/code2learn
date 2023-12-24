//2d arrays
import java.util.*;

public class J06 {
    public static void main(String[] args) {
        int[][] a; //declaration //it is pointing to null object //null is a special literal in java not a keyword//null can be asssigned to non premitive datatypes only
        a=new int[2][2]  ;//initialisation of object reference with object creted dynamically//it is necessary to specify row size while dynamic creation
        a[1][1]=3;//value initialisation
        a[0][0]=1;
        System.out.println(Arrays.toString(a[0]));//Arrays.toString methods in Arrays classs is used to print the arrays in string format//
      }                                             /*here it will print 0th row  //output [1,0]; 
                                            after the object initilisation with memory each arrays element has default value as 0;*/
}
