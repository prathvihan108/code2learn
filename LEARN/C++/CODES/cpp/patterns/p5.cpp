//Divide any pattern to its sub patterns to easily understand the algorithem 
/*

4 3 2 1 
4 3 2 1
4 3 2 1
4 3 2 1
same pattern as privious but solved using different method ,here we can replace "n"with rows +col too if asked
*/ 
# include<iostream>

using namespace std;
int main()
{

  int n;
  cout<<"Enter number of rows and columns\n";
  cin>>n;
   //Logic
   for(int i=1;i<=n;i++)   //  Controls the outer loop (number of rows)
   {
    
     for(int j=1;j<=n;j++) //Controls the inner loop (number of columns)
     {
        cout<<n-j+1<<" ";  //Main logic formula (It can be derived by observing the pattern)
     }                      //instead of""n" we would write "row+col" in case asked
     cout<<endl;
   }

return 0;
 }