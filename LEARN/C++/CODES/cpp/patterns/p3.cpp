//Divide any pattern to its sub patterns to easily understand the algo
//The main thing while solving a patern is to observe it from zoom out position and u will get an idea to solve it.

/*
1  2  3  4  
5  6  7  8
9  10  11  12
13  14  15  16  //it is just  a counting of numbers  but changing rows
*/
# include<iostream>

using namespace std;
int main()
{

  int n,count=1;
  cout<<"Enter number\n";
  cin>>n;
  //Logic
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {

    
    cout<<count<<"  ";
    count++;
    }
    cout<<endl;
  }

 

  
 

return 0;
 }