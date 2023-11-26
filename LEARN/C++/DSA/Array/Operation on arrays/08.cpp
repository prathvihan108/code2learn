//Moves zeros to end of array



# include<iostream>
# include<algorithm>
using namespace std;

void move_zeros_to_end (int a[],int n)
{   int i=0;
     int j=n-1;

     while(i<=j)
     {
        if(a[i]!=0) //if it is non zero coming from start ,then do nothing
        {
            i++;
            
        }
        else if(a[j]==0) //if it is zeros coming from last ,then do nothing
        {
            j--;
        }
        else
        {
            swap(a[i],a[j]);
            i++;
            j--;
        }
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

move_zeros_to_end(arr,size);
  cout<<"Moved zersos  to end of  array\n";
        for(int i=0;i<size;i++)
    {
            cout<<arr[i]<<" ";
    }
    


 
    return 0;
}