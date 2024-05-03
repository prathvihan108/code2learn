//Insertion sort
//notes present in book
import java.util.Arrays; //u need to import this in order to use arrays
class J01
{
    public static void main(String[] args) {

        int[] arr=new int[]{1,4,5,2,9,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
       
    }

    public static void sort(int arr[])
    {

        for(int i=0;i<arr.length-1;i++) //here max value of i will be up n-2 only or else j goes outof bond since j=i+1
        {
            for(int j=i+1;j>0;j--)//1st run :sorts up to index 1 ,2nd run:sorts up to index 2.......
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{ //if not then we already know that the all other left side elements are sorted according to algoriyhem logic
                    break;
                }
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