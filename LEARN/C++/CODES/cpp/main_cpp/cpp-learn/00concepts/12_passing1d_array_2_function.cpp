//While passing 1d arrays to functions we actually pass the base adress of 1st element
//so for that the the finction parameter must bre capable of holding adress 


# include<iostream>
using namespace std;
void pass_1d_array_method1(int a[],int n);
void pass_1d_array_method2(int *a,int n);

int main()
{

    int arr[50];
    int n;
    printf("Enetr the number of elements in an array\n");
    scanf("%d",&n);

    for(int i=0; i<n;i++)
    {
       cin>>arr[i];
       
       
  
    }
    cout<<"Calling function 1\n";
    pass_1d_array_method1(arr,n);//function call1
    cout<<"\nCalling function 2\n";
    pass_1d_array_method2(arr,n);//functioncall2




}

void pass_1d_array_method1(int a[],int n)
{
    for(int i=0; i<n;i++)
    {
       cout<<a[i]<<",";
       //cout<<endl;

 
    }

    
}

void pass_1d_array_method2(int *a,int n)
{

for(int i=0; i<n;i++)
    {
       cout<<a[i]<<",";
       //cout<<endl;
       

 
    }
    cout<<"\n";
for(int i=0;i<n;i++)
{
    cout<<(*(a+i))<<",";
}

}