
//swaping 2 numbers using pointers concept


#include<iostream>
using namespace std;

int swap(int *a, int *b); //function prototype

int main()
{
int a, b;
cout<<"Enter any two numbers\n";
cin>>a>>b;

cout<<"numbers before swaping"<<a<<"and"<<b<<endl;


swap(&a, &b) ;//passing adress of a and b to swap function

  cout<<"numbers after swaping"<<a<<"and"<<b<<endl;
return 0;
}

int swap(int *a ,int *b) 

{
int temp;
temp=*a;     //now this function has adress of main variables so it can now modify value at adress using "*operator

*a=*b;
*b=temp;
return 0;
}