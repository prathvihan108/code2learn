//Finding the sum of all the elements in an array

#include<iostream>
using namespace std;

int main()
{
    int n,sum=0,i;
    int a[40];
    cout<<"Eneter nummber of elements in an array\n";
    cin>>n;
    cout<<"Enter "<<n<<" elements in to an array"<<endl;
    
    for (i=0;i<n;i++)
    {
       scanf("%d",&a[i]);
    }

    for (i=0;i<n;i++)
    {
       sum+=a[i];
    }

    cout<<"Sum: "<<sum<<endl;
   
    return 0;

}   
