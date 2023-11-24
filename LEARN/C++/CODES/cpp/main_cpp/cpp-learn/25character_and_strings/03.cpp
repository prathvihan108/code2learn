//Find a string is whether a pelidrome or not //simple logic

#include <iostream>
#include <algorithm>
using namespace std;

int length_of_string(char ch[]); // Function prototype for length of string

int pelidrome_string (char * ch)
{   int n=length_of_string(ch);
    int s=0;
    int e= n-1;

    while(s<=e)
    {
        if(ch[s]!=ch[e])
        {  
            return 0; //if string is not a pelidrome program will stop here only
            
        }
        s++;  //Dont forget to increament or decreament
        e--;
    }
   return 1;
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
   int check = pelidrome_string(ch);

   if(check==1)
   {
    cout<<"It is a pelidrome\n";

   }
   else{
    cout<<"It  is not a pelidrome\n";
   }

    return 0;
}
