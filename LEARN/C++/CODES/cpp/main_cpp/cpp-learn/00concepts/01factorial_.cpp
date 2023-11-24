//factorial  of a number using recurssion ,
//recurrssion usese stack datatype
//REcurrsion has 2 conditions:Base condition and recurrrisive condition

# include<iostream>
using namespace std;


int fact (int a);

int main()

{

    int n,res;
    cout<<"Enter the number\n";
    cin>>n;
    cout<<fact(n)<<endl;




    return 0;
}


int fact (int a )
{

    //Base condition
    if (a==0) //Dont take 1 or else it will not give correct output
    {
        return 1;
    }
    //Recurrisive condition
    else
    {
        return a*fact(a-1);
    }
}