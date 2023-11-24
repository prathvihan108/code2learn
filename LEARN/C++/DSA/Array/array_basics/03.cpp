
//Finding the no of even elements in an array

# include<iostream>

using namespace std;
int main()
{   int n,i,j,c=0;
    int a[60];
 
    cout<<"Eneter  no of elements in an array\n";
    cin>>n;

    cout<<"Enter "<<n<<" elements in to an array\n";
    for(int i=0;i<n;i++)
    {

        cin>>a[i];
    }

    //logic

    for(int i=0;i<n;i++)
    {

        if(a[i]%2==0)
        {
            c++;
        }
        
    }

    cout<<"Number of even  numbers in an array: "<<c<<endl;




}
