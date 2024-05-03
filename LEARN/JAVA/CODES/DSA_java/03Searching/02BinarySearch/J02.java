//Binary Search
//order agnostic binary search
class J02
{
    public static void main(String args[])
    {int arr[]=new int[]{1,2,3,4,5,6,7,8};
    int ans=BinarySearch(arr, 6);
    System.out.println(ans);

    }

    public static int BinarySearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
     
            int start=0;
            int end=arr.length-1;

            while(start<=end)
            {
            int mid=start+(end-start)/2;// (start+end) exceeding integer range some times so use this approcah
          
            if(target==arr[mid])
            {
                return mid;
            }

              if(arr[start]<arr[end])//chack wether ascending 
            {
                   if(target>arr[mid])//lies on left half
            {
              start=mid+1;

            }
            else {//lies on right half
                end=mid-1;
            }
                
            }

            else{//executes if decending

                  if(target>arr[mid])//lies on right half
            {
              start=mid+1;

            }
            else {//lies on left half
                end=mid-1;
            }

            }
          

            }

            return -1;
        
        

    }

}