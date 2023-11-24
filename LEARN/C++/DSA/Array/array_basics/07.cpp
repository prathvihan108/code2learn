//Addition of 2 martices
//Matrices can be only added when no. of rows of both matrices and  no.columns of both matrices are same

//Printing arrays elements in an 2d array

#include<iostream>
using namespace std;
int main()
{
  int m,n;
  int arr1[20][20];
  int arr2[20][20];
  int sum[40][40];
  cout<<"Enter number of rows and number of columns of matrices u want to add \n";
  cin>>m>>n;
  
  cout<<"Enter "<<m*n<<" elements in matrix A:\n";
  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cin>>arr1[i][j];
 
    }
  }
  cout<<"Enter "<<m*n<<" elements in matrix B:\n";

  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cin>>arr2[i][j];
 
    }
  }
  
  cout<<"A::\n";
  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cout<<arr1[i][j]<<" ";
 
    }
    cout<<"\n";
  }

  cout<<"B::\n";
  for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cout<<arr2[i][j]<<" ";
 
    }
    cout<<"\n";
  }
//Logic

for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
        sum[i][j]=arr1[i][j]+arr2[i][j];
    }


  }

  cout<<"Sum of  given matrices:\n";
  cout<<"***************************************\n";

   for(int i=0;i<m;i++)
  { 

    for(int j=0;j<n;j++)
    {
    cout<<sum[i][j]<<" ";
 
    }
    cout<<"\n";
  }

  return 0;
}