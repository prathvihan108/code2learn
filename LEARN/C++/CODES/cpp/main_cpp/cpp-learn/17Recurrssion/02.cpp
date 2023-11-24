//counting 0 to n numbers ,backword

# include<iostream>
using namespace std;

int Count( int a)
{
    //Base case 
    if(a==-1) //if we take -1 prints up to zero, or if we take a==0,then prints up to 1
    {
        return 0;

    }
    
    cout<<a<<" ";//Processing part
   
    Count(a-1);//since recurrence statement is below processing part it is also called tail recurrsion
  
}

 int main()
{
    int n;
    cout<<"enter a nummber\n";
    cin>>n;
    Count(n);

    return 0;
}