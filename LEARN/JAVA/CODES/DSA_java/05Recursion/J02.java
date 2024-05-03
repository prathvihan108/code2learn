//Binary search of 1D array using recursion
//notes present
public class J02 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5,6};//Arrat must be sorted
        System.out.println(search(arr, 2, 0, arr.length-1));
        
    }


public static int search(int arr[],int target,int s,int e)
{
    if(s>e)
    {
        return -1;//Element not Found//Also acts as base condition
    }
    int m=s+(e-s)/2;

    if(arr[m]==target)
    {
        return m;
    }
   
    if(target<arr[m])//Search on left half
    {
        return search(arr,target ,s,e=m-1);
    }
    else//Search on Right half
    {
        return search(arr,target ,s+1,e);
    }
    }


}

