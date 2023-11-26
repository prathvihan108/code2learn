# include<stdio.h>
# include<math.h>
int main()
{
    int a;                                       //first executes code and than checks codition,if condition satisfies than again executes until
                                                  //coditiongets fail
    printf("Enter anumber\n");
    scanf("%d",&a);
    do{
        printf("%d\n",a);
        a++;
    }
    while(a<10);
    return 0;
}
