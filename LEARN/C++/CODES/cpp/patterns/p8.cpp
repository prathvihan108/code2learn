/*

1
12
123
1234
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
        for(int j=1;j<=i;j++) //this is nothing but a formula derived by observing the pattern as there printed i 
                            //  for ith row i times  
        {
            cout<<j;  //main trick
        }
        cout<<"\n";
    }
    return 0;
}