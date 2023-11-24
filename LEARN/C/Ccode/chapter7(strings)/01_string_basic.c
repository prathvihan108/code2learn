//strings are also initialised in same way as we initilise arrays but we put singleinverted commas(case1),or doubleinvertedcommas(case2)
//There is no keyword to declare string its LHS is same as we declare array or pointer.
# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
char string[]={ 'a','b','c','\0'};  // sring is nothig but a 1D array which stores chacters one by one in consecutive memory location
char srting[]="abc";                  // \0(back slas zero) is null character which indicates the end of string in first case,in the second case we no need to write \0 becoz it is atomatically put by c compiler
return 0;                            //Each alphabet is assigned 1 byte of memory
}