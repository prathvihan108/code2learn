//we are using istream as condition 
/*
>>until the state of istream is valid while loop keeps on executing(since val is an int ,any eneterd integer is valid)
>>if we enter EOF (control+z:in windows)(control+d:linux)or something which makes the state false then loop exits


*/


# include<iostream>
using namespace std;

int main()
{

    int n ,sum=0,val=0;

    
    while(cin>>val) 
    {
        sum+=val;
    }
    cout<<"Total of enetered numbers is:"<<sum<<endl;
    return 0;
}