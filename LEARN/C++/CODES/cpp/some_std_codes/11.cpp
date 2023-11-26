//Factorial of number
//U can also implemnt same algorithem using functions
/*




*/


# include<iostream>
using namespace std;
int main()
{
        int mod=47;
    int fact=1,n;
    cout<<"enter the number\n";
    cin>>n;

    for(int i=1;i<=n;i++)  //Dont take i=0 to i<n ,becoz fact will become zero
    {
        fact=(fact*i)%mod;//using mod operator can stay away integer over flow,but the range of answers will be from 0 to 47(mod)
    }
    cout<<"Factorial of number is "<<fact<<endl;
    return 0;
}