//Bubble sort 
//notes present in book
import java.util.Arrays; //u need to import this in order to use arrays
class J01
{
    public static void main(String[] args) {

        int[] arr=new int[]{1,4,5,2,9,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
         //System.out.println(arr); what will this print,it prints only object id
        
    }

    public static void sort(int arr[])
    {
  
        boolean swaped=false;

        for(int i=0;i<arr.length-1;i++)//number of passes n-1
        {
            for(int j=0;j<arr.length-1-i;j++)//number of comparisions n-1-i
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);//swaping numbers
                    swaped=true;
            }
            }

              if(!swaped)
              {
                break;
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