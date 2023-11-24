//reversing an array in place :
//we can also do it many other logic
//u can also use same logic for mplementing using functions
#include<iostream>
using namespace std;
int main()
{
 int n,t;
 int arr[40];

 cout<<"Enter number of array elements\n";
 cin>>n;
cout<<"Eneter "<<n<<" elements in an array\n";
 for(int i=0;i<n;i++)
 {
 
 cin>>arr[i];
 }

 //Logic


 for(int i=0;i<n/2;i++)//**//
 {
   t=arr[i];
   arr[i]=arr[n-1-i];
   arr[n-1-i]=t;
 }



for(int i=0;i<n;i++)
{
cout<<arr[i]<<" ";
}

 return 0;
}