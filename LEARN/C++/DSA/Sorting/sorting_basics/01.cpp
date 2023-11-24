//Selection sort

//Key: selection sort is not stable algorithem,
        //worst time complexity:o(n^2)
        //Best time complexity: is also o(n^2) only becoz if arry is presorted than also  all loops  wiil run
        //space complexity: constant>>since only variables are declared and used 

//note:general
//      i=0 to i<x :loop runs x times
//      i=0 to i<=x :loop runs x+1 times

//      i=1 to  i<x : loop runs x-1 timess
//      i=1 to  i<=x : loop runs x timess


# include<iostream>
using namespace std;


void selection_sort (int a[],int n)
{   int temp;
     // this forloop performs n-1 passes
     //the smallest value is placed at stating of minimum in every round
   
    for(int i=0;i<n-1;i++)//condition is same as i=1;i<=n-1;i++ but we want i value to be used in next loop should be 1 so for taht we use 1st one
    {
        int min_index=i; //WE are assuming  minimum index as eleement as 1st element
      
      //this forloop iterates over reamining elements ans finds minimum element ans positions it at i th position
       for(int j=i+1;j<n;j++)//runs up to n-1
      {
            if(a[j]<a[min_index])
            {
                min_index=j;
            }
      }
      //finally swaping the  numbers 
      temp=a[min_index];
      a[min_index]=a[i];
      a[i]=temp;
       
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

    selection_sort(arr,size);

    cout<<"after sorting\n";

    for(int i=0;i<size;i++)
    {
        cout<<arr[i];
    }





    return 0;
}