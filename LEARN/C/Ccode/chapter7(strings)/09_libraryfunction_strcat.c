# include <stdio.h>
# include <math.h>
#include <stdlib.h>
#include<string.h>

int main()
{
 char st1[18]="shamane";
 char *st2="wadi ";
 strcat(st1,st2);                       //"strcat" is a library function which cancatinate two strings in any one string(the one mentioned first) , 
                                           //here st2 is joined with st1 infront of it and stored in st1(first mentioned string)                            
 printf("The string st1 is %s\n",st1);
 printf("The string st2 is %s",st2);
return 0;
}
/* There is many other library functions for "string.h" other then these*/