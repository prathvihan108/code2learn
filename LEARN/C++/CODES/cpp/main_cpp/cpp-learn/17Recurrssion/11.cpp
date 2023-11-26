//Program to calculate n power m ,using recurrsion also which has less time complexity cmpared to regular one

# include<iostream>
using namespace std;

int powerCal(int a,int b)
{   int ans;
    //Base case
    if(b==0)
    {
        return 1;
    }
    if(b==1)
    {
        return a;
    }
    //U solve one case remainning will atomatically solved

    ans=powerCal(a,b/2); //imagine how it works
   /* the below lines are going to be executed recurrsion is in returning stage*/
    if(b%2==0)//b is even
    {
       return ans*ans;
    }
    else{//b is odd
       return a*ans*ans;
    }
}

 int main()
{
    int n,m;
    cout<<"Enter values of n and m\n";
    cin>>n>>m;
   int ans= powerCal(n,m);
    cout<<ans;

    return 0;
}