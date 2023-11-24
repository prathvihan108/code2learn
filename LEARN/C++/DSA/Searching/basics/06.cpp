//Searching an element in an roated sorted array
//Rotated array:For example, let's consider the sorted array [1, 2, 3, 4, 5] and rotate it to the right by 2 positions. The resulting rotated array would be [4, 5, 1, 2, 3]. Similarly, if we rotate the sorted array [1, 2, 3, 4, 5] to the left by 1 position, the resulting rotated array would be [2, 3, 4, 5, 1].


# include<iostream>
using namespace std;
int search (int a[],int key,int size)
{
  int low=0;
   int high=size-1;
  int mid=(low+high)/2;

   while(low<=high)
   {
    if(key==a[mid])  
    {
       return mid;
    }
     //determines whether  left side is sorted
    else if(a[low]<=a[mid]) 
    {
       if(key>=low && key<a[mid]) //We have to determine whether a element is at left
       
       {
        high=mid-1; //focuses on left since sorted
       }
       else
       {
        low=mid+1;//focuses on right since left is not sorted -->right is sorted
       }
    }
    
    else{
        //implies right is sorted if control comes to this 
    
      if(key>a[mid] && key <=a[high]) //We have to determine whether a element is at right
       
       {
        low=mid+1; //focuses on right since sorted
       }
       else
       {
        high=mid-1;//focuses on left since right is not sorted -->left is sorted
       }

    }
     mid=(low+high)/2;

   }
   return -1; //means element is not present any where
}
 int main()
{
    int arr[20];
    int n,key,pos;
  cout<<"Eneter size\n";
  cin>>n;
  cout<<"enter array elements\n";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }
    cout<<"enter key\n";
    cin>>key;
    pos=search(arr,key,n);

    cout<<"search element found at :"<<pos+1<<endl;
    return 0;
}