//Reverse  a string 




# include<iostream>
# include<algorithm>
using namespace std;

int length_of_string(char ch[]); // Function prototype for length of string

void reverse_string (char *ch)  //u take pointer as function parameter rahter than char ch[],as we can not pass the point again to another pointer using this
{  int n=length_of_string(ch);
    int s=0;
    int e=n-1;
    while(s<=e)
    {
        swap(ch[s],ch[e]);
        s++;
        e--;
    }
}


int length_of_string (char ch[])
{
       int count =0;
    for(int i=0;ch[i]!='\0';i++)
    {
        count++;
    }

    return count;
}

 int main()
{
    char ch[50];
    cout<<"enter the string\n";
    cin>>ch;
 
    reverse_string(ch);


    cout<<"reversed of string is:"<<ch<<endl;
    return 0;
}