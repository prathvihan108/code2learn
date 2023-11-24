# include<iostream>
using namespace std;

void print2d(int a[][100],int s, int t);


int main()
{

    int m,n,arr[100][100]; //2d array should compulsary have dimensions

    cout<<"Enter the number of rows and columns\n";
    cin>>m>>n;

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }
    print2d(arr,m,n);
    
    cout<<"\n";

/*    for(int i=0;i<m;m++)
    {
        for(int j=0;j<n;j++)
        {
            cout<<arr[i][j]<<",";
        }
    }
*/
return 0;
    


}

void print2d(int a[][100],int s,int t)  //note that here we r not using "star" before a becoz "a"
//capable of storing adress of arr as we have alredy used square braces to specify column size
                                  //1st 1d array of size 100 so its actully telling its full adress to "a"
                                     //it is mandatory to give column size while pasing an 2d array because to calculate the address
{

    for(int i=0;i<s;i++)
    {
        for(int j=0;j<t;j++)
        {
            cout<<a[i][j]<<",";
        }
    }

}