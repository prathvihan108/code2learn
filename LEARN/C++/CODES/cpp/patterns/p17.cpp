/*
****
***
**
*   //Principle digonal upper stars
*/

# include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter number of rows\n";
    cin>>n;

    for(int i=1;i<=n;i++)  //
    {
        for(int j=1;j<=n-i;j++) //this is nothing but a formula derived by observing the pattern . 
                            // 
        {
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}