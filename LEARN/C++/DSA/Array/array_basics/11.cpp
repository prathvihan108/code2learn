//Searching an element using recurrsive binary search 


# include<iostream>

using namespace std;

int bin_srch(int a[],int i,int n,int h,int l,int x);

int main()
{  

    int n,key,h,l;
    int arr[40];
    int index;

    cout<<"Enter number of elements in an array\n";
    cin>>n;

    cout<<"Fill the array\n";

   for(int i=0;i<n;i++)
   {

    cin>>arr[i];
   }

   cout<<"Your array:\n";

   for(int i=0;i<n;i++)
   {

    cout<<arr[i]<<" ";

   }
   cout<<"\nEnter the search element\n";
   cin>>key;
   index=bin_srch(arr,0,n,n-1,0,key);
   cout<<"Your search element is at position:"<<index+1<<endl;





   return 0;
   
}   


int bin_srch(int a[],int i,int n,int h,int l,int x)
{

    int mid;
    mid=(h+l)/2;
    //base condition

    if(i==n)
    {
        return -1;
    }

    if(a[mid]==x)
    {

        return mid;
    }
    //recurrcive condition
    else if(x>a[mid])
    {
        return bin_srch(a,i+1,n,h,mid+1,x);

       
    }

    else
    {
    return  bin_srch(a,i+1,n,mid-1,l,x);
    }
     

}



