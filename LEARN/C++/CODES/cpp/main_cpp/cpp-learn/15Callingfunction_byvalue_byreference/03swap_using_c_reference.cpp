
//swaping 2 numbers using reference ofc++ concept
//&y=x means x and y are pointing to same thing


#include<iostream>
using namespace std;

int swap(int &a, int &b); //function prototype

int main()
{
int a, b;
cout<<"Enter any two numbers\n";
cin>>a>>b;

cout<<"numbers before swaping"<<a<<"and"<<b<<endl;


swap(a, b) ;//passing adress of a and b to swap function

  cout<<"numbers after swaping"<<a<<"and"<<b<<endl;
return 0;
}

int swap(int &a ,int &b) 

{
int temp;
temp=a;     //now here variables of swap function are reffering(pointing) to main variables therefore any change in function variablr will also change main variables

a=b;
b=temp;
return 0;
}