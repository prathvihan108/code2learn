# include<iostream>
using namespace std;

int gcd (int a,int b)
{   
     
    if(a==0)
    {
        return b;//becoz gcd of any number and zero is any number
    }
    if(b==0)
    {
        return a;
    }
       

  
    while(a!=0 && b!=0)
    {
       
        
        if(a<b)
        {
        b=b%a;
        }
        else{
         a=a%b;
        }
    }
    return a+b;//need to return variable which holds gcd//so gcd may be in a or b ,here actually any one either a or b is zero ,so fianlly sum is returned(nothing but gcd)
}

 int main()
{
    int a,b;

    cout<<"Eneter two numbers\n";

    cin>>a>>b;
    int hcf=gcd(a,b);
    cout<<hcf;

    return 0;
}