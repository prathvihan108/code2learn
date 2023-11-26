/*
1
23
456
78910  //This is againa simple counting 
*/

# include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter number of rows\n";
    cin>>n;
    int count=1;

    for(int i=1;i<=n;i++)  
    {
        for(int j=1;j<=i;j++)   //logic 
        {
            cout<<count; 
            count++; //main trick
        }
        cout<<"\n";
    }
    return 0;
}