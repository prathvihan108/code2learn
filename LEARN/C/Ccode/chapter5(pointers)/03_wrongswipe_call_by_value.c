# include<stdio.h>
void wrongswap(int a, int b);
int main()
{
    int a=3,b=7;
    printf("a,b before swaping %d,%d\n",a,b);
    wrongswap(a,b);
    printf("a,b after swaping %d,%d\n",a,b);
    return 0;
}
void wrongswap(int a, int b)
{
int temp;
temp=a;
a=b; 
b=temp;            // This is the logic of swaping numbers 
}         //This logic will not swap a,b because a and b (of sub main function) are copy of a and b (of main function)
            
         /*call by value 
         the variables itself are passed to function as arguments ,and so function cannot modify value of variabled 
         as main variables and subfunction variables are not linked*/



