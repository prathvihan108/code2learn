//Find wether aan array is sorted/ roteted or unsorted



# include<iostream>
# include<algorithm>
using namespace std;

bool check_rotate_array (int a[],int n)
{   int c=0;
    for(int i=0;i<n;i++) //Simple logic
    
    {
        if(a[i]>a[i+1])
        {
            c++;
        }
    }

    if(a[n-1]>a[0])
    {
        c++;
    }
    
 return c<=1;  //Return true only if count <= 1 //it means array is either sorted or roteted ,if its greater than 1 means unsorted array

}


int main()
{
    int size;
    int arr[40];

    cout<<"Enter size of array\n";
    cin>>size;

    cout<<"enter elements in to  an array\n";
    for(int i=0;i<size;i++)
    {
            cin>>arr[i];
    }

bool ans=check_rotate_array(arr,size);
if(ans==1)
{
    cout<<"Sorted or rotated array\n";

}
else{
    cout<<"Unsorted array\n";
}

 
    return 0;
}