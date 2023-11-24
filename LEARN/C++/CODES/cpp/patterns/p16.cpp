/*

A 
B C
C D E
D E F G
E F G H I
F G H I J K //It same as printing the numbers as only need to use concept of typecasting
 
*/


# include<iostream>

using namespace std;
int main()
{

  char ch;
  int n;
  cout<<"Enter number of rows \n";
  cin>>n;
   //Logic
   for(int i=1;i<=n;i++)   //  Controls the outer loop (number of rows)
   {
      ch=64+i;  //Main trick :it starts counting from  ith row
     for(int j=1;j<=i;j++) //Controls the inner loop (number of columns)
     {
        cout<<ch<<" ";
        
        ch++;  //we are using ch instead of count as we used in numbers case
     }
    
      
     cout<<endl;
   }

return 0;
 }