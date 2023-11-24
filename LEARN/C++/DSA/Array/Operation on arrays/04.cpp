//Reverse an array 

# include<iostream>
# include<algorithm>
using namespace std;

void reverse_array (int a[],int n)
{
    int i=0,j=n-1;

    while(i<=j)
    {
        swap(a[i],a[j]);
        i++;
        j--;

    }
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
    reverse_array(arr,size);

  cout<<"Reversed array\n";
        for(int i=0;i<size;i++)
    {
            cout<<arr[i]<<" ";
    }
    
    return 0;
}