# include<stdio.h>
# include<math.h>
int main()
{
    int i=1,a;
    printf("Enter any number\n");
    scanf("%d",&a);
    while(i<=10)
    {
        printf("%d\n",i*a);
        i++;
    }
    return 0;
}