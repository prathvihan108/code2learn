//Bubble sort:

//Key: bubbble sort is  stable algorithem,
        //worst time complexity:o(n^2)
        //Best time complexity: is o(n) only becoz if array is presorted than 1st forloop at i=0 rins only n times
        //space complexity: constant>>since only variables are declared and used 


# include<iostream>
using namespace std;


void bubble_sort (int a[],int n)
{   int temp;
     // this forloop performs n-1 passes
     //the largest value is placed at the end in every round
   
    for(int i=0;i<n-1;i++)//condition is same as i=1;i<=n-1;i++ but we want i value to be used in next loop should be 1 so for taht we use 1st one
    {
         
      bool swap=0; //Not swapped //used for best time complexity
      
       for(int j=0;j<n-i-1;j++)//Runs from j=1 to n-i, 
      {

         //finally swaping the  numbers 
           if(a[j]>a[j+1])
            {
                temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
              swap=1; 
       
            }

      }
    //must be out side the second forloop
      if(swap==0)
      {
        break;//For best time comp
      }
     
     
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

    bubble_sort(arr,size);

    cout<<"after sorting\n";

    for(int i=0;i<size;i++)
    {
        cout<<arr[i];
    }





    return 0;
}