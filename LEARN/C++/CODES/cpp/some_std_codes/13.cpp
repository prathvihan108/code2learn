//Calculating number of prime numbers  ,which are less than given nymber "n"
/*
compexity bigO(n * log(log(n)))//u can determine it using tailer series
//most of the modern computer scan perform 2^8 operations per second

*/
# include<iostream>
# include<vector>
using namespace std;


int countPrime(int n)
{   
    vector<bool> isPrime(n+1,true);//Consider all as prime number initially//Vector type is bool
    isPrime[0]=isPrime[1]=false;
    int cnt=0;

    for(int i=2;i<=n-1;i++)
    {
        if(isPrime[i])
        {
            cnt++;
            for(int j=2*i;j<n;j=j+i)//see the for loop carefully
            {
                isPrime[j]=false;
            }
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