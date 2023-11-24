# include<stdio.h>
# include <math.h>
int main()
{
    int num1,num2,num3,num4,big;
    printf("Enter 4 numbers\n");
    scanf("%d",&num1);
    scanf("%d",&num2);
    scanf("%d",&num3);
    scanf("%d",&num4);

    if(num2,num3,num4<num1)
    {
        big=num1;
    }
     else if(num1,num3,num4<num2)
     {
        big=num2;
     }
     else if(num1,num2,num4<num3)
     {
        big=num3;
     }
     else if(num1,num2,num3<num4)
     {
        big=num4;
     }
    
   
printf("greater number is %d\n",big);
return 0;

}