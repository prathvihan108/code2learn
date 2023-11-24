#include<iostream>
using namespace std;
int main()
{

 
 //int arr[20]={1,2,3,4,5}; //zero  <<Point to be noted>>
 //int arr[]={1,2,3,4,5}; //garbage
 int arr[]={};   //garbage
 
 //the following operation gives zero only in 1st case(i.e when an array is presized but not completly filled)
 cout<<arr[5]<<endl;
 return 0;
}