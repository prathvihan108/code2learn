#include<iostream>
using namespace std;

int factorial(int n);

int main()
{
int n;
cout<<"Enter any number\n";
cin>>n;
cout<<"The factorial of "<<n<<"is "<<factorial(n)<<endl;
return 0;
}
  
    int factorial(int n) 
    {
    //Base condition
    
    if(n==0){
    
    return 1;
    }
   
 // fact=n*factorial(n-1); 
    return n*factorial(n-1);//recursive condition
    }
    
    
   //a function calling it selfself   
  //is known as recurression
//recurrssion is useful for solving some kind of problems only