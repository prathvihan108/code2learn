//Finding unique element in an array

# include<iostream>
using namespace std;

 int main()
{
    int n;
    int arr[23];
     int ans=0; //Dont forget to initilise to 0
    cin>>n;
    

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }
   cout<<endl;
                //Finding the unique element in array

    for(int i=0;i<n;i++)  //Logic:PLayed with bits
    {
        ans=ans^arr[i];  // 0 XOR NUM = NUM,  //NUM XOR NUM =0 ,  //NUM1 XOR  NUM2 =1   
                     //The logic  :same elemnts gets cancled due to XOR operation and AND "UNIQUE XOR 0"will give unique

   }


    cout<<"unique:"<<ans<<endl;
    return 0;
}