#include<iostream>
using namespace std;

int swap(int a, int b); //function prototype

int main()
{
int a, b;
cout<<"Enter any two numbers\n";
cin>>a>>b;

cout<<"numbers before swaping"<<a<<"and"<<b<<endl;


swap(a, b) ;//function call

  cout<<"numbers after swaping"<<a<<"and"<<b<<endl;
return 0;
}

int swap(int a ,int b) 
{
int temp;
temp=a,
a=b;
b=temp;
return 0;
}

//we can see that this function is not swaping nubers
//this is becoz main variables have no relation(not same)with function variables although they are same
//to perform this task we need call function by reference of variables