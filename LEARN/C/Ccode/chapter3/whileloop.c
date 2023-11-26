
# include<stdio.h>
#include<math.h>
int main()
{
    int a;                         //first checks condition and than execute code,after 
    printf("Enter a numbaer\n");   //executing checks condition again and than executes if condition satisfied
    scanf("%d",&a);
    while(a<10){
        printf("%d\n",a);
        a++;
    }
return 0;

}