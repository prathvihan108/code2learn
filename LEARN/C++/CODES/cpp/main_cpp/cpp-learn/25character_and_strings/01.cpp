//Find the length of string
# include<iostream>
using namespace std;

 int main()
{
    char ch[50];
    cout<<"enter the string\n";
    cin>>ch;
    int count =0;
    for(int i=0;ch[i]!='\0';i++)
    {
        count++;
    }
    cout<<"Length of string is:"<<count<<endl;
    return 0;
}