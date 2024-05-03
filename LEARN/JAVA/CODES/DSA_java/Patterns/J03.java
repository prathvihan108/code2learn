
class J03
{
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n)
   {
    for(int row=1;row<=n;row++)//loop will run n times
    {
     
       for(int col=1;col<=row;col++)
       {
        System.out.print(col);//it is basically printing the col number
       }
       System.out.println();
    }
   }
}