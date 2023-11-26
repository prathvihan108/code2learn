/*

A B C D 
E F G H
I J K L
M N O P
 
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
    
     for(int j=1;j<=n;j++) //Controls the inner loop (number of columns)
     {
        cout<<ch<<" ";
        ch++; //main : inside 2nd for loop
        
     }
      
     cout<<endl;
   }

return 0;
 }