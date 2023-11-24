# include<stdio.h>
int main()
{
    int a=35;
    int *j=&a;//j will now store the address of i,j is called pointer variable,*j is called value of adress varibale.s
    printf("The value of a is %d\n",a);
    printf("The value of a is %d\n",*j);    // * ::value of adress operator,prints value stored in adress

    //we use % u(format specifier) to print adress of variable

    printf("The   adress of a is %u\n",&a); // &  ::adress of operator,&a means it will print adress of variable a.
    printf("The adress of a is %u\n",j);
    printf("The value of j(pointer) is %u\n",&j); //it will print adress of pointer variable(i.e" j")
    return 0;
}
  // syntax of declRING POINTER:: datetype *variablename;
 // syntax for storing adress of another variable in pointer:: datatype *variable1= &variable2;

 //note::
 /*  1> "*j=&a " does not mean value of &a shifted to *j(i.e *j not equal to &a) 
    2 >  pinter variabe naame and variable name should not be same in any single function,
    they may be same when pointer varibles declared in subfunction and variables are declared in main*/
