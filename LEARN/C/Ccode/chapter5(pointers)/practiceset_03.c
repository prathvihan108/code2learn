# include <stdio.h>
# include <math.h>
#include <stdlib.h>
 double multiple(int *x);
int main()
{
    int a;
    printf("Enter any number\n");
    scanf("%d",&a);
    printf("value of 'a' before is %d\n",a);
    multiple(&a);        //adress of a is stored in x;  //now pointer x can modify the value of "a" any time
    printf("value of 'a' after is %d\n",a);
  

return 0;
}
double multiple(int *x)
{
    *x= *x*(10);
    //return *x+10;     //this statement is not usefull here because we waNT TO PRINT value of a using 'a' only and not using function }
}