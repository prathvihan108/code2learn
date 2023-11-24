//whether a given number is prime or not//complexity O(n^2)

# include<iostream>
using namespace std;
int main()
{
  int n;
    cout<<"Enter a number \n";
    cin>>n;
    //Logic for prime
    for (int i=2;i<n;i++)
    {
        if(n%i==0)  //"n%i"
        {
            cout<<"It is not a prime number\n";
            return 0;//Return s here only if not prime
        }
    }
    cout<<"it is prime\n";
    return 0;
    
}