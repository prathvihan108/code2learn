/*

A A A A A 
B B B B B
C C C C C
D D D D D
E E E E E
 
*/


# include<iostream>

using namespace std;
int main()
{

  char ch=65; //Ascii value of A is 65
  int n;
  cout<<"Enter number of rows \n";
  cin>>n;
   //Logic
   for(int i=1;i<=n;i++)   //  Controls the outer loop (number of rows)
   {
    
     for(int j=1;j<=n;j++) //Controls the inner loop (number of columns)
     {
        cout<<ch<<" ";
        
     }
     ch++; //main : inside ist for loop
     cout<<endl;
   }

return 0;
 }