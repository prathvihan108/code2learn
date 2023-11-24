//Digonal matrix of matrices


#include<iostream>
using namespace std;
int main()
{
  int m;
  int arr[20][20];
  
  cout<<"Enter number of rows or number and columns \n";
  cin>>m;
  
  cout<<"Enter "<<m*m<<" elements in matrix:\n";
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


  //Logic
cout<<"Digonal elements of given matrix:\n";
for(int i=0;i<m;i++)
  { 

    for(int j=0;j<m;j++)
    {
       if(i==j)   //Condition for digonal
       {

        cout<<arr[i][j]<<",";
       }
 
    }
    cout<<"\n";
  }




  return 0;
}