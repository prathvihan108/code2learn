//Fibonacci series using recurrsion// printing up to nth term

# include<iostream>
using namespace std;

int Fibo(int n)
{
    //Base condition
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    return Fibo(n-1)+Fibo(n-2);
   // cout<<n<<" ";

}

 int main()
{
    int n;//n refers to : up to nth term of fibo series and not total numbers to be printed
    cout<<"Enter a value of n\n";
    cin>>n;
   // Fibo(n);

    for(int i=0;i<=n;i++)//runs n+1 times //will print up to nth term//considering zero as 0 th term
    {
        cout<<Fibo(i)<<" ";
    }

    return 0;
}