#include<iostream>
using namespace std;
     
    
    
class base
{
int data1;
public:
int data2;
void setdata() ;
int getdata1() ;
int getdata2(); 
};
 

void base::setdata()
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



class derived:private base
{
int data3;
public:
void process() ; 
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
//der. setdata() ; // here this line gives error becoz we  are trying to access setdata which has become private member of derived class
     //but still if we want to class this with obj of derived class then we can do it by calling setdata in any function of derived claaa(known as nesting) 
der. process() ;
der. display() ; 
return 0;

}