//Calculating number of prime numbers  ,which are less than given nymber "n"
//Time complexity for this algorithem is in BigO(n^2)

# include<iostream>
using namespace std;

bool isPrime(int num)
{   
    if(num==0 || num==1)//Base condition
    {
        return false;
    }
    for(int i=2;i<=num-1;i++) //Start from 2 to n-1;
    {
        if(num%i==0)
        {
            return false;
        }

    }
    return true;
}

int countPrime(int n)
{   int cnt=0;
    for(int num=0;num<n;num++)
    {
         if(isPrime(num))
         {
            cnt++;

         }

    }
    return cnt;
   

}

 int main()
{
    int n;
    cout<<"Enter a number\n";
    cin>>n;
    int total=countPrime(n);

    cout<<"total prime numbers :"<<total<<endl;



    return 0;
}