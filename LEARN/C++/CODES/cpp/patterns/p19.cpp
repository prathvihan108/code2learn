/*
   1
  22
 333
4444 principle diagonal lower triangles*/

/*
   1
  12
 123
1234  if u use j instaed of i


*/

# include<iostream>
using namespace std;
int main()
{
    int n;
    int space;  //we can do it using  only 2 for loops also (i.e not using "s"variable)
    cout<<"enter number of rows\n";
    cin>>n;
    space=n-1;

    for(int i=1;i<=n;i++)  //
    { 
        for(int s=1;s<=space;s++)
        {
            cout<<" ";
        }
        for(int j=1;j<=i;j++) //this is nothing but a formula derived by observing the pattern . 
                            // 
        {
            cout<<i;  //Main trick //And instead of i if u write j ,than it will print another one 
        } 
        
        space--;
        cout<<"\n";
    }
    return 0;
}

/*

    


*/