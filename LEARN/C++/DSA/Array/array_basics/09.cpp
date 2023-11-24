//Searching an element in an 2d array //Linear search

#include<iostream>
using namespace std;
int main()
{
  int m;
  int arr[20][20];
  
  cout<<"Enter number of rows or number and columns \n";
  cin>>m;
  
  cout<<"Enter "<<m*m<<" elements in matrix :\n";
  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<m;j++)
    {
    cin>>arr[i][j];
 
    }
  }
  cout<<"Your square matrix:\n";

  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<m;j++)
    {
    cout<<arr[i][j]<<" ";
 
    }
    cout<<"\n";
  }
    int x;
   //Logic
   cout<<"Enter the search element\n";
   cin>>x;

   for(int i=0;i<m;i++)
   {
    for(int j=0;j<m;j++)
    {


        if(arr[i][j]==x)
        {

            cout<<"ELement found at index ["<<i+1<<"] ["<<j+1<<"] \n";
            return 0;
            
        }
    }
   }
   cout<<"Element not found\n";



return 0;
}