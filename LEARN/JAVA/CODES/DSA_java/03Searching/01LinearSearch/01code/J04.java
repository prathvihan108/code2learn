public class J04 {
    public static void main(String[] args) {

        int[] arr=new int[]{1,23,4,5};

        int ans=FindMinimum(arr);
        System.out.println(ans);
        
    }


    public static int FindMinimum(int[] arr)
    {
        if(arr.length==0){
        
            return Integer.MAX_VALUE;
        }
        int min=Integer.MAX_VALUE;//set minimum to Interger Max value
        for(int ele:arr)
        {
            if(ele<min){
                min=ele;
                
            }
        }
        return min;
    }
    
}
