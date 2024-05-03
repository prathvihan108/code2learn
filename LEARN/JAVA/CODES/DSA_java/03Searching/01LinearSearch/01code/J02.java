//Linear search
//Returning the element itself if its pressent in array
//-1 can not be used for returning here .because it may be a element itself
//You can also use true or false logic here
class J02{

    public static void main(String[] args) {

        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        //int[] b=new int[]; this will show an error if since u r not spscifying the size //in the above case size id automatically determined
        int ans=linearSearch(a,45);
        System.out.println(ans);
        

    }

    public static int linearSearch(int[] arr,int target)
    {

        if(arr.length==0)
        {
            return Integer.MAX_VALUE;//returns max value if searched element is not there in array
        }
        else{
           for(int ele:arr)
           {
            if(ele==target)
            {
                return ele;
            }
           }

            }
               return Integer.MAX_VALUE;
        }
     

    }

   
