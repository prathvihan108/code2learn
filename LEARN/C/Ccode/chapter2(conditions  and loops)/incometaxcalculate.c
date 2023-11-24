
//income tax 



#include<stdio.h>
#include<math.h>
int main()
{
    float tax=0,income;
    printf("rnter your income amount\n");
    scanf("%f",&income);
    if(income>=250000 && income<=500000)
    {
        tax=tax+0.05*(income-250000);
    }
    if(income>=500000 && income<=1000000)
    {
        tax=tax+0.1*(income-500000);
    }
    if(income>=1000000 && income<=5000000)
    {
        tax=tax+0.2*(income-1000000);
    }
    printf("u need to pay \t%f tax\n",tax);
    return 0;
}