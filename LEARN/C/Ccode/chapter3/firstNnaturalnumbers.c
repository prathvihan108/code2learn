# include<stdio.h>
int main()                                //using do while loop 
                                                //prints in reverse
{
    int n;
    printf("Enter a number\n");
    scanf("%d",&n);
    do{
        printf("%d\n",n);
        n--;
    }while(n>=1);
    return 0;
}