#include<iostream>
using namespace std;

class complex;//forward declaration of class""
                //complex compiler will always read code from top to bottom no matter how classes are called in main function
class calculator

{
int a, b;
   public:
   void sum(complex, complex);//we have already used name of class"complex"so to avoid 
                              //error we used forward declaration
};




class complex
{
    int a, b;
    friend void calculator::sum(complex c1, complex c2) ;//this is the syntyx of friend function when a we want to friend a function of different class and is defined outside of it's class
    public:
    void setdata(int x,int y)//function variables(x, y) are  not separate for separate objects like  class vatiables
    {
    a=x;   //so need to to this step also when a function is going to be called by 2 different objects
    b=y;  //if function variables ar also same as it's class variables then to  they are not related to each other
                               
       
    }
    void display() 
    {
      // cout<<("hello\n");
     cout<< "your complex is "<<a<<"+"<<b<<"i"<<endl;
      //cout<<("your comex 02"<<o2.a<<"+"<<o2.b<<"i")<<endl;
    }
};

void calculator::sum(complex c1, complex c2)
{
  a= c1.a + c2.a;   //copy of objects o1 nad o2 is passed to c1 and c2
  b= c1.b + c2.b;  //a and b (RHS)of this class have no link with a and b of "complex" class
                   //so we again need to declare those in class "calculator"
    
    cout<<"sum is"<<a<<"+"<<b<<"i"<<endl;
}
int main()
{
    complex o1, o2, o3;
    o1.setdata(6,5);
    o2.setdata(2, 4) ;
    
    o1.display() ;
  //  o2.setdata(2,4);
    o2.display();
    //o2.display(void) ;
    calculator cal;
    cal.sum(o1, o2);//passing objects as arguments
    return 0;
    }
    
    
    
