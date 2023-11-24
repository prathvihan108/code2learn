//  Finding first occurence of an element in binary search
# include<iostream>
using namespace std;

int bin_srch(int a[],int l,int h,int x);

int main()
{
    int n,key,h,l,i;
    int arr[]={12,82,87,87,87,120,188}; //Make sure that yhese are in ascending order only
    

    n=sizeof(arr)/sizeof(int);//   this gives number of elements in an array
    cout<<n<<endl;
    cout<<"Enter the key element\n";
    cin>>key;
    int index=bin_srch(arr,0,n-1,key);
    if(index==-1)
    {
        cout<<"Element not found\n";
        return 0;
    }
    cout<<"First occurence of an element in an array is at position:"<<index<<endl;


    return 0;


}  

int bin_srch(int a[],int l,int h,int x)  //i is actually not needed
{   int mid;
    mid =(h+l)/2;
     
     int res=-1;

    while(l<=h)
    {    

        mid=(l+(h))/2;
        if(a[mid]==x)
        {
            res=mid;       //change happens in if block:s
             h=mid-1;//chaecks for left side once again
        }

        else if(x>a[mid])
        {
            l=mid+1;
        }

        else{
           
              h=mid-1;
            }
        mid=(l+(h))/2;
        
    }
 
  return res;


}  //similarly u can do this to find last occurernce