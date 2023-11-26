/*  //arrays
 * int[] marks;             //Declaration!
marks = new int[5];               //Memory allocation!
int[] marks = new int[5];       //Declaration + Memory allocation!
int[] marks = {100,70,80,71,98}  // Declare + Initialize!
 * 
 */

//Unlike c++ ,in java arrays are created as only objects

public class J20 {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5]; //here int[5] is the object created and marks is refering to object
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80}; //see the syntax difference 

        for (int i=0; i<marks.length; i++)
{
        System.out.println(marks[i]);    //Array Traversal
}

        // marks[5] = 96; - throws an error  becoz there are only 4 indices and unlike c++ java throws error rather then printing garbage
        System.out.println(marks[4]);


    }
}
