//Converting dcimal to binary

# include<iostream>
# include<math.h>
using namespace std;

int main()
{
  int n;
  
    cout<<"Enter a Decimal number \n";
    cin>>n;
    int ans=0;
    
   
    while(n!=0)
    {
      int bit=n & 1;   //Bit wise AND operator when operates with "n "will extract last bit of binary representation of n
    
      ans=ans*10+bit;  //Stores the bits in reverse direction;
      n=n >> 1;  //(Right shift operator)   //it will eleminate last digit and stored in n
    
    }
    cout<<ans;
    return 0;      
}