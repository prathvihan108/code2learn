#include<iostream>
using namespace std;

class simple
{
int X, Y;
public:
simple(void); //declaration of constructor
void print(void) ;//here "void" means it takes no arguments
};


 //definition of constructor
simple::simple(void)//syntax-------- --classnamme:: classname(arguments_ifany) ;
{                 //......is a default constructor as it takes no arguments
X =5;            //constructor is similar to the concept "initialisation of variables"
Y= 9;
cout<<"any stuff";//this will also print each time when object is called
} 

  void simple::print(void)                     //void simple::print(void) 
{

cout<<"Hello world\n";
cout<<X<<endl<<Y<<endl;
}



int main() {

simple obj1, obj2;
obj1.print(); //when ever object is called constructor automatically initialises it
obj2.print();
return 0;

}
/*a construcrir is a special member function which initialise thre
objects of class automatically, it should be declared in public section of class only
*/
/*constructor atomatically invokes when obj is created*/

// constructor has same name as that of class
/*A default a constrictor takes no arguments so it initialise all objects to same value*/