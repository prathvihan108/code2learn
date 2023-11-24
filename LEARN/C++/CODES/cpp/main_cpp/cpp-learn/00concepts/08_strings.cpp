# include<iostream>
# include<cstring> 
using namespace std;

int main()
{


    char arr[40];
    cout<<"Enetr a string\n";
    cin.getline(arr,100);

    char a[20]="Hello my boy";
    cout<<"*************Before_copying****************************************************\n";
    cout<<arr<<endl;
    cout<<a<<endl;

    strcpy(arr,a); //This will copy data from "a" to "arr"

    cout<<"*************After_copying****************************************************\n";
    cout<<arr<<endl;
    cout<<a<<endl;

    cout<<"*****************************************strlrn(array)***********************************\n";
    cout<<strlen(arr)<<endl;//note it counts space also


    cout<<"*********************cin.get**********************************************************";

    char ch;
    //cin>>ch;//cin can not read spaces so we can  even read spaces by using cin.get
     ch=cin.get();
    
    if(ch==' ')
    {
    cout<<"U entered a space\n";
    }
    else
    {
        cout<<"u have not entered a space\n";
    }
    
    return 0;
}