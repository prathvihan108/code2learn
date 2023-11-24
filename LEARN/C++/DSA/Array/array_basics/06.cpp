//Printing arrays elements in an 2d array

#include<iostream>
using namespace std;
int main()
{
  int m,n;
  int arr[20][20];
  cout<<"Enter number of rows and number of columns\n";
  cin>>m>>n;

  cout<<"Enter elements in to your 2d matrix\n";



  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cin>>arr[i][j];
 
    }
  }
  
  cout<<"You entered :\n";
  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cout<<arr[i][j]<<" ";
 
    }
    cout<<"\n";
  }




  return 0;
}