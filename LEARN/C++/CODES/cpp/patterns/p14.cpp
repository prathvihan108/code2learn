/*

A 
B B
C C C
D D D D  //It same as printing the numbers as only need to use concept of typecasting
 
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
        
        
     }
     ch++;
      
     cout<<endl;
   }

return 0;
 }