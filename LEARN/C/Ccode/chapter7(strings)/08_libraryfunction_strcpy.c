# include <stdio.h>
# include <math.h>
#include <stdlib.h>
#include<string.h>
int main()
{
    char river[56];
    char *lift="hello brother";
    strcpy(river,lift);              //This function "strcpy" copies one string to another string,lift is copied to river
    printf("The river is now %s",river);

return 0;
}