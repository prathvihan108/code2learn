//Selection sort
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
  
     for(int i=0;i<arr.length;i++)
    {
        int last=arr.length-1-i;//gets the last index of array  each time the loop runs
        int max=getmax(arr,0,last);
        swap(arr,last,max);
    }
     
      

    }

    public static int getmax(int arr[],int start,int end)
    {
        int max=start;//maximum index is starting index
       for(int i=start;i<=end;i++)
       {
        if(arr[i]>arr[max])
        {
            max=i;

        }
       }
       return max;
    }


        public static void swap(int arr[],int a, int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            
        }
}