# include<stdio.h>
int sum(int a,int b);     //s function prototype tells about datatype(int) and parameters(a,b),it ends with semicolon
int main()
{
   int a=3,b=7,result;//no use of this statement becoz main function and sub function variables are not related.
    
                                        //@The variables of main functiion and sum function are not
                                        //related any way if we take same varibles also as u can see in main function a=3,b=7 & in sum main function
                                        //a=10,b=20 and if u run prgram it will give 30 &not 10.
  // printf("enter 2 numbers\n");      //@reason for int main: it will return an integer to main function that is 0.
   // scanf("%d,%d",&a,&b);            //@if there is void main it will not return any value ,we will not come to know about
   result= sum(a=10,b=20);                  //successful program execution and also in sub functin it will not return any value .
    printf("sum is%d\n",result);       //@reason for return 0: it will return "0"to main function (OperatingSystem) so 
    return 0;                           //that it will confirm the successful end of program.
}                                     /*note:  we can use any number instead of 0 ,but by default in system it is set to o*/
                                    // better to use 0,,But in sub function if we write "return X" X=0,1,2,3,4 etc it will return X to sub
int sum(int a,int b)                  // function ( i.e sub function value will be X)so better to write return variable or if u dont write then also it 
{                                      //take atomatically.
    int result;
    result=a+b;              //this result variable has no relation with main result variable,this variable will return value to sub function and that value is 
                               // is transfered to main result variable as u can see.
  //return result;  
}
