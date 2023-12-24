import java.util.*; //Arrays is avalable in this package
public class J07 {
    public static void main(String[] args) {
        int a[][]=new int[3][]; //it is optional to specify the column size while declaration and initialisation of 2d arrays.
        //becoz 2d arrays are array of arrays 
        //which means ecah 1d array elememt is a again a reference to another 1d array(that is cols) which can store n elements
      //we can specify the  allocation size separatly
      //currently each row is pointing to null;//if u try to print any row it will give nullpointer exception

     //  a[1][2]=7; this will also give null pointer exception
       // System.out.println(a[1]);//this will give u an Null pointer exception becoz u not initilise memory for cols

       a[0]=new int[3];//initilise cols
       a[1]=new int[4];
       a[2]=new int[5];
       a[0][0]=1;
      // a[3]=new int[6];//this will give ArrayIndexOutOfBondException

       System.out.println(a[0]);// this will print some hash code of object
       System.out.println(Arrays.toString(a[0])); //this will print entire oth row //out put[1,0,0]
        
                                   
    }
    
}
