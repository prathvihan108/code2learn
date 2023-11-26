# include<stdio.h>
int sum(int a, int b);// a,b are parameters
int main()
{
    int x=7,y=3; //instesd of x,y u can also take a,b .It will not affect outcome.
    printf("The value of x,y before calling function are \t%d,%d\n",x,y);
    printf("The sum of x and y is%d\n",sum(x,y)); //arguments to a, b are passed ,x,y values are copied to a and b.
    printf("The value of x,y after calling function are \t%d,%d\n",x,y);
    return 0;

}
int sum(int a,int b)
{

    return a+b;
    a=345;   // here we have changed a and b values, but it will not change the vlues of x and y 
    b=345;   //because and b values are  copied from x and y ,so if we even burn copy than also x,y remain unchanged
               //this case is when we call a function by value ,but if we call a function by adress than this is not the case
}