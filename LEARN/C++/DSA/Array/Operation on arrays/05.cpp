//rotate an array k times

# include<iostream>
# include<algorithm>
using namespace std;

void rotate_array (int a[],int n,int k)
{   
   int temp[40]; //used temp array so that values are not overwrited
    for(int i=0;i<n;i++)
    {
        temp[(i+k)%n]=a[i];//Maths logic //it ensure that we iterate only between 0 to n-1
    }
   // a=temp; //copy temp array to a;
   for (int i = 0; i < n; i++)
    {
        a[i] = temp[i];
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
    cout<<"enter the position from which u want to rotate\n";
    int k;
    cin>>k;
    rotate_array(arr,size,k);

  cout<<"Rotated array\n";
        for(int i=0;i<size;i++)
    {
            cout<<arr[i]<<" ";
    }
    
    return 0;
}