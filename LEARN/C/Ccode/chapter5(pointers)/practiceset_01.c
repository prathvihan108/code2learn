//write a program to find adress of a variable use this adress to print value of variable

# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
int b=4;
int *a=&b;
printf("The adress of a is %d,%d\n",&b,a);
printf("The adress of a is %d,%d\n",b,*a);

return 0;
}

/* pointer variable and variable cannot be same when they are decalred in single function(main or subfunction) itself,
but when pointer variable is declared in sub and variable is declared in subfunction or viseversa than no problem*/