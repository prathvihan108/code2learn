# include<stdio.h>
int main()
{
    int a=8;                           //break statements are used to terminate any types of loops
    int i=0;
    while(i<=a)
    {
        if(i==4)
        {
            break;
        }
        printf("%d\n",i);
        i++;
    }
    
}