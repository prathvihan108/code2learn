//maximum and minimum elemets in array

# include<iostream>

using namespace std;

int arr_max (int a[100],int size)
{
  int max=a[0];
  for(int i=0;i<size;i++)
  {
    if(max<a[i])
    {
        max=a[i];
    }
  }
  return max;
}



int arr_min (int a[100],int size)
{
  int min=a[0];
  for(int i=0;i<size;i++)
  {
    if(min>a[i])
    {
        min=a[i];
    }
  }
  return min;
}



 int main()
{
    int n,arr[100];
    int max,min;
    cout<<"enter size of array\n";
    cin>>n;

    cout<<"Enter "<<n<<" elements in an array\n";

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }

    cout<<"Displaying array\n";
     for(int i=0;i<n;i++)
    {
        cout<<arr[i]<< ",";
        
    }
    cout<<"\n";
    //Calling function

     max=arr_max(arr,n);//Holdes the return value
     min=arr_min(arr,n);
     cout<<"Maximum element in an array is "<<max<<"And minimum element in an array is"<<min<<endl;
    return 0;
}