# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
char river[]="hello";
char *ptr=river;
while(*ptr!='\0')        //this is becoz every string ends with \0
{
    printf("%c",*ptr);   //%c is used fo character     
    ptr++;                 // we no need to use the loop all the time we have alternative method too
}                             //"\0" is necessary or else it will run out of memory and print anything garbage
return 0;
}
/* we can declare string using pointer
*ptr=string[45] \ *ptr="hello" */