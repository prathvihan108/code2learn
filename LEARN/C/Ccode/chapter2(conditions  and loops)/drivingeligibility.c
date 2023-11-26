//using equality operaters
# include<stdio.h>
# include<math.h>
int main()
{
    int age;
    printf("Enter your age\n");
    scanf("%d",&age);
    if(age>=18 && age<=90)
    {
        printf("u can drive\n");
    }
    else
    {
        printf("u r not eligible to drive");

    }
    return 0;
}
