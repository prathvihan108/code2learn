//Swping using temparary variable

# include<iostream>
using namespace std;



int main()
{
    int a,b,t;
    cout<<"Enter two number to swap\n";
    cin>>a>>b;
       cout<<"Before Swaping a and b:"<<a<<","<<b<<endl;

    t=a;
    a=b;
    b=t;
 
    cout<<"After swaping a and b:"<<a<<","<<b<<endl;
    return 0;

}