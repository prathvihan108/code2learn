
class J04
{
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n)
   {
    for(int row=1;row<=n;row++)//loop will run n times
    {
        int space=n-row;

        for(int i=1;i<=space;i++)
        {
            System.out.print(" ");
        }
     
       for(int col=1;col<=row;col++)
       {
        System.out.print("*");//it is basically printing the col number
       }
       System.out.println();
    }
   }
}
