//Merge 2 sorted arrays
/*
    When you dynamically allocate an array using new, the memory for the array is allocated on the heap. The lifetime of this memory is independent of any specific scope or function. It remains valid until it is explicitly deallocated using delete or delete[].

The pointer to the dynamically allocated array can be stored in a local variable within a specific scope, such as a function. In this case, the local variable has its own scope and is destroyed when it goes out of scope. However, the memory allocated for the array on the heap is not affected by the local variable's scope. You can still access the dynamically allocated array outside the scope of the local variable as long as you have a valid pointer to it.

It's important to note that once you deallocate the dynamically allocated memory using delete or delete[], the memory is no longer accessible, and any attempts to access it will result in undefined behavior. Therefore, it's crucial to manage the deallocation of dynamically allocated arrays properly to avoid memory leaks and invalid memory accesses.

*/

# include<iostream>
# include<algorithm>
using namespace std;

int* Merge_arrays (int a1[],int a2[],int n1,int n2) //We can not directly return an array so we return a pointer to that array
{    int * merge=new int[n1+n2]; //here we r using dynamic memory allocation for array ,becoz if we do follow regular method then scope will be limted to local function only and we can not even pass pointer
    int i=0;
    int j=0;
    int p=0;
    while(i<n1 && j<n2)  //This while loop can do work as stand alone when sizes of arrays are equal,or else we need other two while loop to copy remaining elements
    {                    //in to merged array as shown below
        if(a1[i]>a2[j])
        {
            merge[p]=a2[j];
            j++;
            p++;
        }
        else
        {
            merge[p]=a1[i];
            i++;
            p++;
        }
    }
    while(i<n1)
    {
            merge[p]=a1[i];
            i++;
            p++;
    }
     while(j<n2)
    {
            merge[p]=a2[j];
            j++;
            p++;
    }
  return merge; //we are actually returning pointer to first element of dynamically alocated array
}

int main()
{
    int size1,size2;
    int arr1[40],arr2[30];

    cout<<"Enter size of  first array\n";
    cin>>size1;

    cout<<"enter elements in to  an 1st array\n";
    for(int i=0;i<size1;i++)
    {
            cin>>arr1[i];
    }

    cout<<"Enter size of  second array\n";
    cin>>size2;

    cout<<"enter elements in to  an 2nd array\n";
    for(int i=0;i<size2;i++)
    {
            cin>>arr2[i];
    }


   int * merge= Merge_arrays(arr1,arr2,size1,size2);

  cout<<"Merged array\n";
        for(int i=0;i<(size1+size2);i++)
    {
            cout<<merge[i]<<" ";
    }
    
    return 0;
}