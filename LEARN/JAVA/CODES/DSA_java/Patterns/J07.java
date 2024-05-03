
class J07
{
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n)
   {
    for(int row=1;row<=n;row++)//loop will run n times
    {   int space=n-row;

        for(int i=1;i<=space;i++)
        {
            System.out.print(" ");
        }
     
       for(int col=1;col<=row;col++)
       {
        System.out.print(col);//it is basically printing the col number
       }

       for(int col=row-1;col>0;col--)//we should not print 0 so only use >0 symbol
       {
        System.out.print(col);

       }
       System.out.println();
    }
   }
}