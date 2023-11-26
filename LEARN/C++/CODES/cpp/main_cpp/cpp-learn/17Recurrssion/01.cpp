//counting 0 to n numbers ,forrword
//Fact : reference variables also occupy memory
//interest is the answer for every thing u want to do

# include<iostream>
using namespace std;

int Count( int a)
{
    //Base case 
    if(a==-1) //if we take -1 prints from zero, or if we take a==0,then prints from 1
    {
        return 0;

    }
    Count(a-1);//since recurrence statement is above processing part it is also called head recurrsion
  
    cout<<a<<" ";//Processing part
}

 int main()
{
    int n;
    cout<<"enter a nummber\n";
    cin>>n;
    Count(n);

    return 0;
}