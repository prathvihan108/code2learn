# include<iostream>
using namespace std;

int main()
{

    int *a,*b;
    int p,q;
    //So u can point to a variable before initilising it with somr value also
    a=&p;
    b=&q; 
    p=2;
    q=3;
    cout<<*a+*b;
    return 0;
}
//size allocated to pointer variable depends on compiler or systems
//Although u can pint char pinter to an integer but not recommended