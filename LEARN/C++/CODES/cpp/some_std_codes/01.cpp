//LCM of 2 numbers
//steps to solve a problem
//1>>first think of a approach of solution,it can be only possible when u better understand problem statement
//2>> think of how can u implement before writing code
//3>>code
# include<iostream>
using namespace std;
int main()

{

int a,b;
cout<<"Enter two numbers\n";
cin>>a>>b;

int max = (a>b)? a:b;      //Use of ternary operator to find maximum of 2 numbers

for(int i=max ;i<=a*b;i++)  //Simple logic 

{
    if((i%a)==0 && (i%b)==0)
    {
        cout<<"Lcm is "<<i<<endl;
        return 0;
    }
}
return 0;
}