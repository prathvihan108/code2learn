#include<iostream>
using namespace std;
//int exchange( X &g , Y&h) ;

class Y;//forward declaration
 
class X
{
int data;
friend void exchange ( X & , Y &) ;
public:
void setdata(int a)
{
data=a;
}
void display(void)
{
    cout<<data<<endl;
}
};

class Y
{
int num;
friend void exchange ( X & , Y &) ;
public:
void getdata(int b) 
{
num=b;
}
void display(void)
{
    cout<<num<<endl;
}
};

void exchange(X &g, Y &h) //to access the private data of classes we need to make this functiin
                          //as friend of classes X and Y
{
int temp;
temp=g.data;
g.data=h.num;
h.num=temp;


}
   
int main() 
{
X a1;
a1.setdata(5) ;
Y b1;
b1.getdata(8) ;
exchange( a1 , b1) ;//reference of objects a1 and b1 is passed to exchange 
cout<<"hello";
//cout<<"value of data after"<<data //we can not access data directly as it is private member of class so we use function of that class only to print value of data 
cout<<"The value of data after exchanging becomes: ";
    a1.display();
    cout<<"The value of num after exchanging becomes: ";
    b1.display();
}