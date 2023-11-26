//Add 2 arrys considering it those as numbers
//dont give large in puts becoz it may by pass the integer size
# include<iostream>
# include<vector>
# include<algorithm>
using namespace std;



vector <int> add_arrays (int a1[],int a2[],int n1,int n2) //Function type is vector
{   vector <int> v;
    int i=n1-1;
    int j=n2-1;
    int sum=0;
    int carry=0;
    //General loop to take out carry and sum
    while(i>=0 && j>=0) //it will run up to number of elements are equal
    {
        sum=a1[i]+a2[j]+carry;
        carry=sum/10;
        sum=sum%10;
        v.push_back(sum);
        i--;
        j--;

        
    }

    //Case 1: when first array is bigger than second array
      while(i>=0)
    {
        sum=a1[i]+carry;
        carry=sum/10;
        sum=sum%10;
        v.push_back(sum);
        i--;
        

        
    }
      while(j>=0)
    {
        sum=a2[j]+carry;
        carry=sum/10;
        sum=sum%10;
        v.push_back(sum);
        j--;
        

        
    }
    return v;
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


   vector <int> ans = add_arrays(arr1,arr2,size1,size2);
   reverse(ans.begin(),ans.end());  //we need to reverse the arry becoz sum is stored in reverse order 

  cout<<"added array\n";
        for(int i=0;i<(ans.size());i++)
    {
            cout<<ans[i]<<" ";
    }
    
    return 0;
}