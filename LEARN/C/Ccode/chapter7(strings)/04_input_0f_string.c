# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
char heven[9];
printf("Enter your name\n");
scanf("%s",heven);            //inpuuting of array takes place ina the same way as of variables But,no need to use "&"operator before name of array
printf("Your name is %s",heven); //"%s" does all the work of loops "\n" and etc 


return 0;
}
/* scanf can not be used to give spaces between words
we have particular functions to perform operations on string array*/