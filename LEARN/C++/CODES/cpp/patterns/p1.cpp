  /*1
   121
  12321
 1234321*/

# include<stdio.h>


int main()
{

   int i,j,s,space,n;
    printf("Enetr no of rows\n");
    scanf("%d",&n);
    space=n;
    
    for(i=1;i<=n;i++)
    {
      for(s=1;s<=space;s++)
      {
        printf(" ");
      }
    
      for(j=1;j<=i;j++)
      {

        printf("%d",j);
   
      }


       for(j=i-1;j>=1;j--)
       {
        printf("%d",j);
       }
    

       space--;
       printf("\n");
       
    



    }
   return 0;

}