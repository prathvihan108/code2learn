//Sorting an array using recurrsion

# include<iostream>
using namespace std;

void Sort(int arr[],int size)
{
    //base case
    if(size==0 || size==1)
    {
        return ;
    }
    for(int i=0;i<size-1;i++) //After the end of forloop one greatest element is at end of array
    {
    if(arr[i]>arr[i+1])
    {
        swap(arr[i],arr[i+1]);

    }
    }
    //Recurrsion case
     Sort(arr,size-1);//See the parameters carefully // u can pass "arr"again in case u have to pass "arr+1" then u need to use parameter as *arr
}

 int main()
{
    int arr[5]={10,2,8,4,0};
      Sort(arr,5);
  for(int i=0;i<5;i++)
    {
         cout<<arr[i]<<" ";
    }
   


    return 0;
}