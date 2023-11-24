#include<iostream>
using namespace std;
     
    
    
class base
{
int data1;
public:
int data2;
void setdata() ;
int getdata1() ;// it is going to return something so i use return
int getdata2(); 
};
 

void base::setdata() //definatiin of functions out side the class
{

 data1=10;

data2=20;

}
int base:: getdata1() 
{

return data1;
}

int base:: getdata2() 
{

return data2;
}

//Derived class from base class


class derived:public base//syntax fo derived class
{
int data3;
public:
void process() ;  //the US actually publically derived so it can access (it's functions/can access public members and functions of base class) 
void display() ;


};


void derived:: display() 
{
cout << "Value of data 1 is " << getdata1() << endl;// Here we need to use the getdata1 function ro access the data1 becoz data1 is private, we can't access from objects
 cout << "Value of data 2 is " << data2 << endl;// we can access data2, data3 easily as they are public members
 cout << "Value of data 3 is " << data3 << endl; 
}


void derived::process() 
{

data3=data2*getdata1() ;

}


int main() 
{

derived der;
der. setdata() ; //here u can see: setdata is not a function of derived class then too its objects can access setdata, this is how inheritance works
der. process() ;
der. display() ; 
return 0;

}