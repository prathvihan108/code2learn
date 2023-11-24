#include<iostream>
using namespace std;

inline int product(int a, int b)  //here no need to write function prototype becoz we have defined the function before function 
{                                 //"inline "key word is used before the function name to make it inline
int c;
c=a*b;
return c; //this returns c to function
}

int main()
{
int a, b;
cout<<"Enter any two numbers\n";
cin>>a>>b;
cout<<product(a, b)<<endl; // function call is replaced by inline function
return 0;

  
}
//when inline function is called compiler replaces the function call with the function