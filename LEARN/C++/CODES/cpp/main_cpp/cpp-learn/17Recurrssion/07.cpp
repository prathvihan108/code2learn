//Checking whether a an array is sorted or not using recurrsion

# include<iostream>
using namespace std;

bool isSorted(int arr[],int size)
{
    //Base case
    if(size==0 || size ==1)  // in recurrsion u need to solve only one case ,remaining will solve atomatically
    {
        return 1;
    }

    if(arr[0]>arr[1])
    {
        return 0;
    }
    //Recurrsive case
    return isSorted(arr+1,size-1);

}

 int main()
{
    int arr[5]={1,2,1,4,5};
    bool ans= isSorted(arr,5);

    cout<<ans<<endl;


    return 0;
}