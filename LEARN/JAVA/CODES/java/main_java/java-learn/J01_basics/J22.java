//For each loop

/* important
For each loop is an enhanced version of for loop.
It travels each element of the data structure one by one.
Note that you can not skip any element in for loop and it is also not possible to traverse elements in reverse order with the help of for each loop.
It increases the readability of the code.
If you just want to simply traverse an array from start to end then it is recommended to use for each loop.

 */
public class J22 {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};

        for(int i:arr)
        {
            System.out.println(i);
        }



        
    }
}
