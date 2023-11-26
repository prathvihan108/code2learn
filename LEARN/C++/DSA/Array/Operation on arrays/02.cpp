//if n- 1 elements only  are there in an array of some size be "s" such that one element is repeated ,need to find that
//Consider each element is entered only once except dublicate
//For exampel n=5,s=9
//array: 1 2 3  3 4 5 6 7 8 //3 is repeated 
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
                //Finding the Duplcate element in array

    for(int i=0;i<n;i++)  //Logic:PLayed with bits
    {
        ans=ans^arr[i];  // 0 XOR NUM = NUM,  //NUM XOR NUM =0 ,  //NUM1 XOR  NUM2 =1   
                     //The logic  :duplcate  gets cancled due to XOR operation and AND "others XOR 0"will give some other number
   }

   for(int i=1;i<n;i++)
   {
    ans=ans^i;   //now when result(ans of first loop) is XOR 'rd with 1 to n-1 numbers all unique elements(odd number of elements) will make 0
                 //But only duplicate element when XOR'rd with 0 will same element 
   }


    cout<<"duplicate:"<<ans<<endl;
    return 0;
}