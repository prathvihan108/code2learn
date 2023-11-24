# include <stdio.h>
# include <math.h>
#include <stdlib.h>
//void print(s);
int main()
{
int a=345;
int *ptr;
int **ptrptr;
ptr=&a; 
ptrptr=&ptr;              // this statement(line 10) also means adress of a is stored in variable ptr ,but it doesn't mean
                     //that ptr is a pointer just becoz it stores adress of another variable.ptr is actually a pointer because i have put "*"
                      //as prefix before the decalration of variable ptr (line 8).

printf("The ADRESS of a is %d\n",ptr);               
printf("The value of a is %d\n",**ptrptr);//*ptrptr : diplays  value of adress of ptr(i.e address of a )
                                         //**ptrptr: displays value of a.


return 0;
}