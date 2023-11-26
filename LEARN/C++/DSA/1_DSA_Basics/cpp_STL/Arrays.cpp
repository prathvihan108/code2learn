//Array
//Since the stl array function is also fixed sized array only ,we generally not use stl array instead of manual
# include<iostream>
# include<array>

using namespace std;

 int main()
{
    int a[20];
    
    array<int,4> arr={1,2,3,4,};
    int size=arr.size();//we are accessing the size function in array STL

    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<endl;
    }

    cout<<"Element at 2nd index --->"<<arr.at(2)<<endl;  //at funvtion is used to accesss element
    cout<<"arrray empty or not"<<arr.empty()<<endl; //This function returns bool value
    cout<<"First eleemnt"<<arr.front()<<endl;
    cout<<"Last element"<<arr.back()<<endl;



    return 0;
}