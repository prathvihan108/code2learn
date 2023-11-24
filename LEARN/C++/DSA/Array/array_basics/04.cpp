//Reversing an array  //not actual array ,only printing

# include<iostream>
using namespace std;

int main()

{
    int n,i,j,a[40];
    cout<<"Enter numbere of elements in an array\n";
    cin>>n;
    cout<<"Enter "<<n<<" elements in an array\n";

    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
   
   

    //logic1
    

    for(int i=n-1;i>=0;i--)
    {
        cout<<a[i]<<" ";
    }
   
   
   return 0;
   
   
   

}
