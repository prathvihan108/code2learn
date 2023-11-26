//write a program having variable i ,print the adress of i, pass the variable to a function and print its 
//address ,are they same
# include <stdio.h>
# include <math.h>
#include <stdlib.h>
pass(int a);
int main()
{
int i;
printf("the address of variale i is %u\n",&i);
pass(i);
return 0;
}
pass(int a)
{
    printf("adress of a is %u\n",&a);

}
/* will not be same  because only variable i is copied to variable a and not its adress*/