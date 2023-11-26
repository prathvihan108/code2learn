/*
1
23
345
4567  //This is  simple counting  only but counting starting from row number for each row
*/  //So here is why u need to observe the pattern for solving it ,and u are able to solve it becoz u know the counting logic in tiangular pattern

# include<iostream>
using namespace std;
int main()
{
    int n, count=1;
    cout<<"enter number of rows\n";
    cin>>n;
    

    for(int i=1;i<=n;i++)  
    {
        count=i;             //Main trick
        for(int j=1;j<=i;j++)   //logic 
        {
            cout<<count; 
            count++;
            
        }
        cout<<"\n";
    }
    return 0;
}