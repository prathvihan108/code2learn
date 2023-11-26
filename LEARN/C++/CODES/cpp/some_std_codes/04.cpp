//Swping  without using temparary variable

# include<iostream>
using namespace std;



int main()
{
    int a,b,t;
    cout<<"Enter two number to swap\n";
    cin>>a>>b;
       cout<<"Before Swaping a and b:"<<a<<","<<b<<endl;
    //Logic
    a=a+b;  //a(5)=3+2
    b=a-b;  //b(3)=5-2 //Got replaced
    a=a-b;   //a(2)=5-3 //Got replaced
 
    cout<<"After swaping a and b:"<<a<<","<<b<<endl;
    return 0;

}