
class J02
{
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n)
   {
    for(int row=1;row<=n;row++)//loop will run n times
    {
     
       for(int col=1;col<=n-row+1;col++)
       {
        System.out.print("*");
       }
       System.out.println();
    }
   }
}