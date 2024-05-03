class j06
{
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n)
   {
    for(int row=1;row<=2*n;row++)//note for zeroth row it will not print any *
    {
       int totalColsInRow=(row>n)?2*n-row:row;//need to find the correct relation 
      // System.out.println(row);
       for(int col=1;col<=totalColsInRow;col++)
       {
        System.out.print("*");
       }
       System.out.println();
    }
   }
}