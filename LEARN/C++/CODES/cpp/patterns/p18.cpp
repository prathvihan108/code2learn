/*
   *
  **
 ***
**** principle diagonal lower triangles*/

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
            cout<<"*";
        }
        
        space--;
        cout<<"\n";
    }
    return 0;
}

/*

    


*/