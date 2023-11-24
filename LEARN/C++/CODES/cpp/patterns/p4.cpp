# include<iostream>
/*
3 2 1 
3 2 1
3 2 1
*/   //The main thing in patterns is to understand some logical facts.such as function of outer forloop/inner forloop


using namespace std;
int main()

{

    int n;
    cout<<"enter a number\n";
    cin>>n;
//logic
    for(int i=1;i<=n;i++)  //outer for loop is only for row counts ,so no need to change anything
    {
        for(int j=n;j>0;j--) //It is responsible for reversing the pattern
        {
           cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}