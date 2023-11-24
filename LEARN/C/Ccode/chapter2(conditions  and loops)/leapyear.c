# include<stdio.h>
#include<math.h>
int main()
{
    int year;
    printf("Enter year\n");
    scanf("%d",&year) ;
    if(year%4==0){
    printf("this is a leap year\n");}
    else
    {
        printf("this is not leap year\n");
    }
    return 0;
        
}