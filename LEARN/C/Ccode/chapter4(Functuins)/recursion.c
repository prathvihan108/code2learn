# include<stdio.h>
int factorial(int X);                      //Recursion example using factorial program
int main()
{
    int X,result;
    printf("Enter any num\n");
    scanf("%d",&X);
    result=factorial(X);
    printf("%d",result);
    return 0;

}
int factorial(int X)

{
    int result;
    if(X==1||X==0)
    {
        return 1;     //it will return 1 to subfunction if condition satisfies
    }
    else
    {
    //return X*factorial(X-1);   
           //OR
    result= X*factorial(X-1);  // A sub function calls itself called as recursion// sub function result ans main function result are not same (not linked)
                               //the sub function result valuee is returned to sub function and then it is given to main "result"as u can see.
    }

}
/* Logic of recursion in this case
in the notes */