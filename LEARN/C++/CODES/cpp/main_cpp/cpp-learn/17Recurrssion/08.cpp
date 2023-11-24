//Recurrsion fncrion to calculate sum of array elements
//For tree : https://www.geeksforgeeks.org/sum-array-elements-using-recursion/

# include<iostream>
using namespace std;
int sum(int arr[],int size)
{   int ans=0;
    //Base case
    if(size==0) //You need to solve only one case ,remaining will solve atomatically
    {
        return 0;
    }
    if(size==1)
    {
        return arr[0]; //note: think how its working
    }
    //Recurrsion call // dont use ans instead of arr[0] becoz ans on LHS is not updated before complition of recurrsion cycle
    ans= arr[0]+ sum(arr+1,size-1); //See what arguments u r passing  //just imagine an array u can easily remember
    return ans;
}


 int main()
{
    int arr[5]={1,2,1,4,8};
    int ans= sum(arr,5);

    cout<<ans<<endl;


    return 0;
}

/*
  //Proper working

  


sum(arr + 1, size - 1): This is the recursive call to the sum function with the updated array pointer arr + 1 and reduced size size - 1. It calculates the sum of the remaining elements in the array.

The recursive call sum(arr + 1, size - 1) returns a value, which is the sum of the remaining elements.

arr[0] represents the first element of the array.

arr[0] + sum(arr + 1, size - 1): The return value of the recursive call is added to the first element of the array, giving the sum of the current element and the sum of the remaining elements.

The final result is assigned to the variable ans.


*/