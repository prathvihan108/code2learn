# include<iostream>
# include<algorithm>
using namespace std;

void print (int *a,int n);//this is a function we r assigning the address of arr to a "It only holds the address of arr"

int main()
{
    int n;
    int arr[30];
    cout<<"Enetr the size of an array\n";
    cin>>n;
    cout<<"\n";
    cout<<"Enter the array elements\n";

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }
    
   // cout<<"\n";
     print(arr,n);
     cout<<"\n";
    //Sorting
    sort(arr,arr+n);  //here right value must be  1 more than up to what we want array to be sorted becoz 
    //open bracket"[ )"
    
    print(arr,n);

    

    return 0;
}

//function to print array
void print(int *a,int n) 
{
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<",";

  }
}
