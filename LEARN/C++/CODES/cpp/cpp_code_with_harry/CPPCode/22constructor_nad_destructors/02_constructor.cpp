#include<iostream>
using namespace std;

class tea
{
int a, b;
public:
tea(int x, int y) ;
void getdata() ;
void display()
{
cout<<a<<endl<<b<<endl;
}

};

tea ::tea(int x, int y) // through parameteraised constructor wr can initialise different objects 
                         //with different numbers
{
a=x;
b=y;
}


int main() 
{
tea obj1(5,7); //implicit calling of constructor, here arguments are passed 
                 //along with object declaration
obj1.display() ;
tea obj2= tea(8,9) ;//explicit call, here u can see  how it's done

obj2.display();

obj1.display() ; //variables a,b are different for different objects
return 0;
// note that we no need to call constructor in case of default constructor

}





