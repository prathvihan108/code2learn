//Linear search
class J01{

    public static void main(String[] args) {

        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        int ans=linearSearch(a,2);
        System.out.println(ans);
        

    }

    public static int linearSearch(int[] arr,int target)
    {

        if(arr.length==0)
        {
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    return i;
                }

            }
        }
        return -1;

    }
   
}