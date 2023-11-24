
//Destructor never takes an argumebts nor does it return, it only 
//destructs the objects when there is no need of objects further


#include<iostream>
using namespace std;

// Destructor never takes an argument nor does it return any value 
int count=0;

class num{
    public:
        num(){
            count++;
            cout<<"This is the time when constructor is called for object number"<<count<<endl;
        }

        ~num(){//This is destructor which is called manually by us, if it's not presents also compiler will call it 
            cout<<"This is the time when my destructor is called for object number"<<count<<endl;
            count--;
        }
};




int main(){
    cout<<"We are inside our main function"<<endl;
    cout<<"Creating first object n1"<<endl;
    num n1;
    
    //This is a simple blok below, n2, n3 are getting destroyed as soon as block exits
    //also n1 will be destroyed when main function will end
    {
        cout<<"Entering this block"<<endl;
        cout<<"Creating two more objects"<<endl;
        num n2, n3;
        cout<<"Exiting this block"<<endl;
    }
    cout<<"Back to main"<<endl;
    return 0;
}
    //this is necessary during dynamic initialisation when we need to deallcate memory
    //construcrors which are not used