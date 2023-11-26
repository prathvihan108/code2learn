//Fibo only printing the nth term not all// for example 7 th term of fibo is 13

#include <bits/stdc++.h>


using namespace std;
//recursive function for fibonacci
int fibonacci(int n)
{
    //if n is zero or one return the number
    if(n<=1)// if n==0 returns zero and if n==1 returns 1 //works same as previous ones
    {
        return n;
    }
    //recursive call to n-1 and n-2 
    return fibonacci(n-1)+fibonacci(n-2);

}
int main()
{
  int n;
    cout<<"Enter a value of n\n";
    cin>>n;
  
  
 cout<<fibonacci(n);
}