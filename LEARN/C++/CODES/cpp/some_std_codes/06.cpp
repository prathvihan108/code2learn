//Fibo series

# include<iostream>

using namespace std;
int main()
{
    int n;
    int a=0,b=1;
    
    cout<<"Enter  a  number\n";
    cin>>n;

    cout<<a<<" "<<b;
   //Logic
    for(int nextnum=0;nextnum<=n;nextnum)
    {
        nextnum=a+b;
        a=b;  //privious a value not needed any more so let b be stored in a
        b=nextnum;  //let sum be stored in b
        cout<<nextnum<<" ";  //prints

    }

    return 0;
}