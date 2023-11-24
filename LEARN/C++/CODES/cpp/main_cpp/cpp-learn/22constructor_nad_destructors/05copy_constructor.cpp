#include<iostream>
using namespace std;

class number
{
    
    int num;
    public:
    number(void) {
    num= 0;
    }//this is default constructor which is necessart to while creatimg objects which we dont want to initialise
    number(int a) {// constructor
        num= a;
    }
    void display( void)
    {
        
       cout<<num<<endl;
       }
    
    
    
    //if we not define copy constructor then too we will not get any errors
//becoz compiler has set it in default mode


number (number &obj) // when wr want to add some more data to our copied constructor we can do by this syntax
{
cout<<"copy constructor is called!"<<endl;
cout<<obj.num;
}
    
    
    
};




int main()
{
    
    number x(6) ;
  
    number y( 8) ;
    number z(9) ;
    x.display() ;
    y.display() ;
    z.display() ;
    
   // invoking copy constructor
    number l(y) ; // this is declaration of copy constructor
                 // this will do every activity which is previously done with y. 
        
        
       //l is the object created and object is copied to it using the syntax
    //here compiler by default calls the  copy constructor, but if we want to add some more data to copy constructor 
    //we can do it as shown above main function
  // number x= y; // 
     // for copy constructor to be invoked object must not be created already
     //l.display() ;.....  if we run this then l is initilised by default constructor
   // z3= z; //copy constructor not invoked
  //  number z3 =z; //copy constructor called
    return 0; 
}
