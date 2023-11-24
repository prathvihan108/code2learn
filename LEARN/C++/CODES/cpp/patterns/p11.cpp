/*
1
21
321
4321 //This is againa simple counting but count starting from row number and in reverse order
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
    {   count=i;
        for(int j=1;j<=i;j++)   //logic 
        {
            cout<<count; 
            count--; //main trick
        }
        cout<<"\n";
    }
    return 0;
}