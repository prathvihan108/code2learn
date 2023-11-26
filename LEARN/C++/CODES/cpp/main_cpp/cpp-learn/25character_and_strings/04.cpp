//Upper to lower case

#include <iostream>
#include <algorithm>
using namespace std;

int length_of_string(char ch[]); // Function prototype for length of string

void upper_to_lower (char * ch)
{  
    int n=length_of_string(ch);
    int s=0;
    int e= n-1;
    while(s<=e)
    {
        if(ch[s]>='A'&& ch[s]<='Z')
        {
            ch[s]=ch[s]-'A'+'a';//Simple logic u can get it
        }
       

        
        s++;

    }
}
int length_of_string(char ch[])
{
    int count = 0;
    for (int i = 0; ch[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}

int main()
{
    char ch[50];
    cout << "Enter the string: ";
    cin >> ch;
    upper_to_lower(ch);//Function call
    cout << "upper to lower " << ch << endl;
    return 0;
}
