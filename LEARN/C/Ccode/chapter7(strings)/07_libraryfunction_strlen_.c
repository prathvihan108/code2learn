//Library functions of string.h are strlen(),strcpy(),strcat(),etc


# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
char str[20];
int a;
printf("Enter any word\n");
scanf("%s",str);

a= strlen(str);        //"strlen(stringname) "is used to calculate length of array/string;For this we need to include "string.h"(library function)
                          //or else it will give warning
printf("The length of string is %d",a);

return 0;
}