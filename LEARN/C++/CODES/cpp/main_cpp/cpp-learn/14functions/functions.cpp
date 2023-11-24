#include<iostream>
using namespace std;

// Function prototype
// datatype function-name (arguments);
// int sum(int a, int b); //--> Acceptable
// int sum(int a, b); //--> Not Acceptable 
int sum(int, int); //--> Acceptable 
// void g(void); //--> Acceptable 
void g(); //--> Acceptable 

int main(){
    int num1, num2;
    cout<<"Enter first number"<<endl;
    cin>>num1;
    cout<<"Enter second number"<<endl;
    cin>>num2;
    // num1 and num2 are actual parameters
    cout<<"The sum is "<<sum(num1, num2);//functioncall
    g();
    return 0;
}
//declaration of function

int sum(int a, int b){
    // Formal Parameters a and b will be taking values from actual parameters num1 and num2.
    int c = a+b;
    return c;
    //return a+b
}

void g(){
    cout<<"\nHello, Good Morning";
}
//function variable and main variable have no relationship
//