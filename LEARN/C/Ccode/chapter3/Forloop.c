# include<stdio.h>
int main()                                   //For loop works similar to while loop
{                                            //print first n natural numbers using for loop
    int a;
    printf("Enter any number\n");
    scanf("%d",&a);
    for(int i=1;i<=a;++i)
{
    printf("%d\n",i);

    }
    return 0;
}