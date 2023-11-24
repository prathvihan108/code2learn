// example for range based for loop


#include<iostream>
using namespace std;

int main()
{
    int scores[5]={1,2,3,4, 5};
    for(int score:scores) //here score is variable name 
                           //we can even replace "int" with "auto"
    {
    cout<<score<<endl;
    }
    return 0;
    }
