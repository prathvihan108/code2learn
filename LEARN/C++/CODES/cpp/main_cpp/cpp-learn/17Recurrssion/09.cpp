//linear search using recurrsion

# include<iostream>
using namespace std;

bool LinearSearch(int arr[],int size,int k)
{   //Base case

    if(size==0)
    {
        return 0;
    }
    if(arr[0]==k)
    {
        return 1;
    }
    else
    {
        return LinearSearch(arr+1,size-1,k);
    }
 //   return 0; this is not going to work becoz until any value is returned the function keeps on searchng
}

 int main()
{
    int arr[5]={1,2,1,4,8};
    bool ans= LinearSearch(arr,5,9);

    cout<<ans<<endl;


    return 0;
}