//Converting dcimal to binary

/*

note :  "<<"" left shift operator :2<<1 will give 4,  2<<2 will give 8  3<<2  will give 12
(Nothing but multiplying the number with 2 as given above):works with some(maximum) numbers only not all


 ">>"" left shift operator :2>>1 will give 1,  2>>2 will give 0  3<<2  will give 0
(Nothing but dividing the number with 2 as given above):works with some(maximum) numbers only not all
*/

# include<iostream>
# include<math.h>
using namespace std;

int main()
{
  int n;
  
    cout<<"Enter a Binary number \n";
    cin>>n;
    int ans=0;
    int i=0;
    
   //Logic :Here we have used regular method to convert (i.e 2^i )
    while(n!=0)
    {
      int digit=n%10;   //Will get last digit of binary number
       
       if(digit==1)
       {
        ans=ans+pow(2,i);
       } 
       n=n/10;  //Although n is binary number but compiler do not know it ,so  we use this method to delete last digit
        i++;  //increament of i
    }
    cout<<ans;
    return 0;      
}