//Key: insertion sort is  stable algorithem,
        //worst time complexity:o(n^2)
        //Best time complexity: is o(n) only becoz if array is presorted than algorithem is not going to go inside the while loop
        //space complexity: constant>>since only variables are declared and used 



# include<iostream>
using namespace std;


void insertion_sort(int a[],int n)
{  //Here we are actually assuming first element is at right position so for that reason i startinng from 1
    for(int i=1 ;i<n;i++ )
    {
       int key=a[i];//here we go on getting elment of array one by one from a[1] to a[n-1]
       int j=i-1;
       //now we want to compare the key element we got with all the element bihind it and than insert it in appropriate position
        while(j>=0 && a[j]>key)  //This while loop is dedicated to right shift the numbers in array until u get a lesser value than key 
        {
            a[j+1]=a[j];
            j--;  //Dont forgrt to reduce j
        }   
        a[j+1]=key; //This inserts key at j+1:since j is smaller than j
    }






}


int main()
{
    int size;
    int arr[30];
    cout<<"enter size of array\n";
    cin>>size;

    cout<<"enter array elements\n";

    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }

    insertion_sort(arr,size);

    cout<<"after sorting\n";

    for(int i=0;i<size;i++)
    {
        cout<<arr[i];
    }





    return 0;
}