#include <stdio.h>
printstars(int n);
int main()
{
    int n;              ////n stands for number of lines
   printf("enter how many lines\n");
   scanf("%d",&n);
   printstars(n);
   return 0;

}

printstars(int n)
{
    int i;
    if(n==1)
    {
        printf("*\n");
        return;
    }
    printstars(n-1);
    for(i=0;i<(2*n-1);i++)

    {
        printf("*");
        

    }
   printf("\n");
    
}


