//Chech how many elemets in aa array contain even number of digits
//We can even optimise the approach for fast execution

public class J06 {
    public static void main(String[] args) {
        int[] arr=new int[]{1234,1234,45,567,0};
        int ans=CheckEven(arr);
        //also handle edge case for negative numbers
       System.out.println(CountDigits(0));//this ststements also return true but we know that 0 contains 1 digit which is odd ,so handled edge case for this
        System.out.println(ans);
        
    }

    public static int CheckEven(int[] arr)
    {
        int count=0;
        for(int ele:arr)
        {
            if(CountDigits(ele))
            {
                count++;

            }

        }
        return count;
    }
    public static boolean CountDigits(int num)
    {
        if(num<0) //handle edge case if num is negative convert to positive
        {
            num=num*-1;
        }
        if(num==0)
        {
            return false;//since it contain odd number of digits
            //return 1 gives error can not convert from int to boolean
        }

        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        if(count%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
