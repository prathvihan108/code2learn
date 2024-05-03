//Steps for solvinf any pattern problem

//1>>number of lines of number of rows present ,that many time the outer forloop will run

//2>>Identyfy for every row how many:
   //Columns are there
      //what types of elements are there
//3>>
class j01
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
        System.out.print("*");
       }
       System.out.println();
    }
   }
}