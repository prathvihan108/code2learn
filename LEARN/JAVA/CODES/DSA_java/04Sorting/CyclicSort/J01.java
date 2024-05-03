//Cyclic Sort
//Array must contain 1 to N numbers if any number is missing in 1 to N then this sorting will not work
//notes present in book
import java.util.Arrays; /
class J01
{
    public static void main(String[] args) {

        int[] arr=new int[]{1,4,5,2,6,3};//array must contain 1 to n numbers 
        sort(arr);
        System.out.println(Arrays.toString(arr));
       
    }

    public static void sort(int arr[])
    {

        int i=0;
        while(i<arr.length)//i will run from 0 to n-1 index
      {
        int correct=arr[i]-1; //it will be the correct index of arr[i] element
        if(arr[correct]!=arr[i])//if elements is not at its correct index swap
        {
            swap(arr,correct,i);
        }
        else{//else increament i;
            i++;
        }

      }

     
      

    }



        public static void swap(int arr[],int a, int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            
        }
}