/*         public derivatiin   private derivatiin   protected derivation
 
private       not_inherited     not_inherited         not_inherited

public         public          private                protected

protected     protected        private                 protected*/


//Not protected is also a visibilityode which is similar to private
//but the only difference is that protected members can be inherited
//although it stays protected only after inheriting, so only data functions of derived class can access protected 




#include<iostream>
using namespace std;

class Base{
    protected:
        int a; 
    private:
        int b;

};

class Derived: protected Base{
   
};

int main(){
    Base b;
    Derived d;
    // cout<<d.a; // Will not work since a is protected in both base as well as derived class
    return 0;
}

