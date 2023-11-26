//Finding common elements in an array

# include<iostream>
# include<vector>
using namespace std;

 int main()
{
    int n;
    int arr1[40],arr2[40];
    int rand_num=33445566;
   
    vector <int> vec; //Declaration of vector


    cout<<"enter size of array\n";
    cin>>n;
    
 cout<<"Enter elements in 1 st array\n";

    for(int i=0;i<n;i++)
    {
        cin>>arr1[i];
       // cout<<" ";

    }
 cout<<"Enter elements in 2nd array\n";
    for(int i=0;i<n;i++)
    {
        cin>>arr2[i];
        //cout<<" ";
        

    }


    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr1[i]==arr2[j])
            {
            vec.push_back(arr2[j]);//push_back is used to push elements in end of vector
            arr2[j]=rand_num;  //Updated so that we can never get same element again in next iteration
            }
        }
    }
    //Displaying vector
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";
    }
    return 0;
}