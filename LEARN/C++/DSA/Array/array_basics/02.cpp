//Finding the maximum element in an array

# include<iostream>
using namespace std;

int main()
{
    int n,arr[50],max;
    cout<<"Eneter the number of elements in an array\n";
    cin>>n;
    cout<<"Eneter"<<n<<"elements in an array\n";
    

    for(int i=0;i<n;i++)
    {

        cin>>arr[i];
    }

    max=arr[0];
   //Loop for finding maximum element
    for(int i=1;i<n;i++)
    {   
        
        if(arr[i]>max)
        {
          
           max=arr[i];
        }

    }
   cout<<"Maximum element is: "<<max<<endl;

}