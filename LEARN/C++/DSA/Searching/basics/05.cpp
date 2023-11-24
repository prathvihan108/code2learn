//peak eleemnt  index in an mountain array 
# include<iostream>
using namespace std;
int peak_ele (int a[],int size)
{
  int low=0;
   int high=size-1;
  int mid=(low+high)/2;

   while(low<high)//not low<=high
   {
    if(a[mid]<a[mid+1])  //Suppose element lies on left mountain line
    {
        low=mid+1;
    }
    else//Suppose eleement lies on right mountain line or is at peak it self
    {
        high=mid; //not:high=mid+1 bocoz if mid is already at peak than it will go to left line
    }
    mid=(low+high)/2;
   }
   return low; //index of peak element

}
 int main()
{
    int arr[20];
    int n,peak;
  cout<<"Eneter size\n";
  cin>>n;
  cout<<"enter array elements\n";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }
    peak=peak_ele(arr,n);

    cout<<"peak eleemnt index is:"<<peak+1<<endl;
    return 0;
}