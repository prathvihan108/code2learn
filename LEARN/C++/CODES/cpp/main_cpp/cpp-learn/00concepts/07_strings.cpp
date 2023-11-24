# include<iostream>
using namespace std;
int main()
{


    char arr[20]={"Hello world"};
    char a[20];
    char b[20];
    cout<<"Enter a sentence\n";
    cin>>a; //u eneter a sentence"Hello world" and it will read up to space only
    cout<<a<<endl;//Hello
    cout<<arr<<endl;//Hello world ,here we have initilised arr already so it will print whole sentence


    cout<<"************************************cin.getline(array_name,size)***************************";
     
     //we can use getline function to read entire line



    cout<<"\nEnter a sentence\n";
    
    cin.getline(b,100); //Hello world "It reads entire line until it gets "\n" as default
    
    cout<<b<<endl;
     
     //u can also decide up to what word it should read as shown below
     
     cout<<"****************************************************************************************\n";
     cout<<"Eneter a sentence dividing in different lines with a $ symbol in between\n";

     //now "$" works as  "\n" i.e when u enter "$" and press enter it will go to next step
      
     cin.getline(b,100,'$'); //it will only read until it gets $ "$" will not be printed
     cout<<b<<endl;  //getline is also capable of reading "\n" that is when u enter a sentence by pressing
     //enter key(line by line) it will be printed in next line


    return 0;    
}
//the third parametr in getline is called deliminator