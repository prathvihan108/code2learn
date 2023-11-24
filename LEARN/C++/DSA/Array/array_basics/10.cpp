//Implepenting linear search using recurrcion

# include<iostream>
using namespace std;

int lin_srch(int a[],int i,int n,int x);

int main()
{
   int n,arr[20],key;
   int index;
   cout<<"Enter number of elements in to an array\n";
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
   index=lin_srch(arr,0,n,key);
   cout<<"Your element is at position: "<<index<<endl;

}

//Recurrsive function
int lin_srch(int a[],int i,int n,int x)
{
   

   //base condition to break recurrsion(Never think that base condition is something when we get success u break!)
   if(i==n)    
   {
    return -1;
   }

   if(a[i]==x)
   {
    return i;
   }

   return lin_srch(a,i+1,n,x);




}