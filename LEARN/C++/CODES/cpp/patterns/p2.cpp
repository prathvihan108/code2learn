//Divide any pattern to its sub patterns to easily understand the algorithem 
/*
1 2 3 
1 2 3
1 2 3
*/
# include<iostream>

using namespace std;
int main()
{

  int a,b;
  cout<<"Enter number of rows and columns\n";
  cin>>a>>b;
   //Logic
   for(int i=1;i<=a;i++)   //  Controls the outer loop (number of rows)
   {
    
     for(int j=1;j<=b;j++) //Controls the inner loop (number of columns)
     {
        cout<<j<<" ";
     }
     cout<<endl;
   }

return 0;
 }