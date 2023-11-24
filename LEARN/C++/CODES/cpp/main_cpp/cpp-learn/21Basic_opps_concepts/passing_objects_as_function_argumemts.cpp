#include<iostream>
using namespace std;

class complex{
    int a;
    int b;

    public: 
        void setData(int v1, int v2){ //we need to create this function becoz we can't directly access the private members for initialosation
            a = v1;
            b = v2;
        }

        void setDataBySum(complex o1, complex o2){    //this function is going to get objects as arguments so we can't simply write parameters as normal function
                                                     //but we need to use classname in place of datatype(class is also a datatype )
             //o1and o2 are parameters(objects)                                  //and objectsname (need not to be same as object name defined in mainfunction, 
                                                    //  becoz those objects are any how passed as arguments to these objects)in place of 
     /*addition of 2 complex numbers*/
          a = o1.a + o2.a; //"o1.a" means value of a given to c1 and "o1.b."means value of b given to object c1
            b = o1.b + o2.b;
        }

        void printNumber(){
            cout<<"Your complex number is "<<a<<" + "<<b<<"i"<<endl;
        }
};

int main(){
    complex c1, c2, c3;
    c1.setData(1, 2);
    c1.printNumber();

    c2.setData(3, 4);
    c2.printNumber();

    c3.setDataBySum(c1, c2);//we r passing C1 and c2 as arguments to function"set data by sum"
    c3.printNumber();
    return 0;
}
