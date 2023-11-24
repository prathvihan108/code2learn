# include<iostream>
using namespace std;

int main()
{


    int n,arr[50],i,j,temp;
    cout<<"Enter the size of an array\n";
    cin>>n;

    cout<<"Enter the array elements\n";

    for( i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    //Bubble sorting

    for(i=0;i<n-1;i++) //if there r n elements in an array then we need to perform n-2 passess
    {
        for(j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }
    cout<<"**********Bubblesort*************\n";

    for(i=0;i<n;i++)
    {

        cout<<arr[i];
        cout<<"\n";
    }
    return 0;


}