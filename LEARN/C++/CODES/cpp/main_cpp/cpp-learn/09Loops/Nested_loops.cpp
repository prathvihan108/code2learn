//this is example for nested loops
//nested loops are vary useful for initiliaing/deinitilising big 2d datatypes Or 
//they have power to do big work in small storage

#include<iostream>
using namespace std;

int main()
{
//int i;
    for(int i=1;i<=10; ++i) 
    {
    for(int a=1;a<=10 ;++a) 
    {
     cout<<i<<"*"<<a<<"="<<i*a<<endl;
    
    }
    cout<<"*************"<<endl;
   // cout<<endl;
    
    
    }
    return 0;
   
}