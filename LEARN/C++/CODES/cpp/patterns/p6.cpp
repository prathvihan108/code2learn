/*
*
**
***
****
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
        for(int j=1;j<=i;j++) //this is nothing but a formula derived by observing the pattern as there are i 
                            //  number of stars in ith row
        {
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}