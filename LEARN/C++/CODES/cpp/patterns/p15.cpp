/*

A 
B C
D E F
G H I J
K L M N O  //It same as printing the numbers as only need to use concept of typecasting (used ch to count)
 
*/


# include<iostream>

using namespace std;
int main()
{

  char ch=65; //Ascii value of A is 65  //Ascii value of a is 97
  int n;
  cout<<"Enter number of rows \n";
  cin>>n;
   //Logic
   for(int i=1;i<=n;i++)   //  Controls the outer loop (number of rows)
   {
    
     for(int j=1;j<=i;j++) //Controls the inner loop (number of columns)
     {
        cout<<ch<<" ";
                        //we are using ch instead of instead of "count" here
        ch++;
     }
    
      
     cout<<endl;
   }

return 0;
 }