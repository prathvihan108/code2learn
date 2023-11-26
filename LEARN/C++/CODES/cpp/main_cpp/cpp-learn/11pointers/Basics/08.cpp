# include<iostream>
using namespace std;

 int main()
{
    char str[] = "Hello";
char* ptr = str;

std::cout << ptr<<endl;;  // Prints the entire C-style string
    cout<<&ptr<<endl; //Gives the adress of pointer itself
    cout<< &ptr+1<<endl; //undefined behaviour
    //cout<<&(ptr+1) //will give error
    cout<<&(*(ptr+1))<<endl; //prints "ello" //keep in mind ,when ever u use "&"operator or character pointer it gives the string itself not the adress
    cout<<*(ptr+1)<<endl; //Prints the element at 1st index
    
  
 char *ptr1=ptr;//Copying one pointe to another pointer
 cout<<ptr1<<endl;

    return 0;
}