# include<iostream>

using namespace std;
int main()
{
   int curvalue=0,value=0,cnt;

   if(cin>>curvalue)
   {
    cnt=1;
    while(cin >> value)
    {
      if(value==curvalue)
      {
        ++cnt;
      }
      else
      {
        cout<<"Number of times the"<<curvalue<<"occured is\t"<<cnt<<"\n";
        curvalue=value;
        cnt=1;
      }

    }
    
    cout<<"Number of times the"<<curvalue<<"occured2 is\t"<<cnt<<"\n";

    

   }
    return 0;   

}