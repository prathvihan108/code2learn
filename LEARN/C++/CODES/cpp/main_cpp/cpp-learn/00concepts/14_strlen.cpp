#include<iostream>
# include<cstring>
using namespace std;
int str_len(char a[]);

int main()
{

    char s[50];
    int len,v;
    printf("Enter the string literal\n");
    scanf("%s",s);
    len=str_len(s);
    printf("Lenth of string is:%d\n",len);
    v=strlen(s);                            //Inbuilt
    printf("Inbuilt%d",v);

    return 0;
}

int str_len(char a[])
{
    int i;
    for(i=0;a[i]!='\0';i++)
    {

    }
    return i;
}
