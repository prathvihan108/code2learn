#include<stdio.h>
# include<math.h>
int main()                                 //+= operater adds a given number to already existing variable
{
    int sum=0,a,i=1;
    printf("Enter any number\n");
    scanf("%d",&a);
    while(i<=a)
    {
        sum += i;
        i++;
        //printf("Sum of %d natural numbers is %d\n",sum);
    }
    printf("Sum of  natural numbers is %d\n",sum);
    return 0;
}