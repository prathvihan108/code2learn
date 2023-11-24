
 // Derived Class syntax
/*class {{derived-class-name}} : {{visibility-mode}} {{base-class-name}}
{
    class members/methods/etc...
}*/




#include <iostream>
using namespace std;

// Base Class
class Employee
{
public:
    int id;
    float salary;
    Employee(int inpId)//constructor
    {
        id = inpId;
        salary = 34.0;
    }
    Employee() {}
};

// Creating a Programmer class derived from Employee Base class
class Programmer : public Employee  //here employee is base class whose public mamabers are inherited as public mamanets of 
{                                  //as public mambers of class programmer
public:
    int languageCode;
    Programmer(int inpId)//this is how it works, there is no inPId in derived class 
                          //then to the class can access it using concept of inheritance
    {
        id = inpId;
        languageCode = 9;
    }
    void getData(){
        cout<<id<<endl;
    }
};




int main()
{
    Employee harry(1), rohan(2);
    cout << harry.salary << endl;
    cout << rohan.salary << endl;
    Programmer skillF(10);
    cout << skillF.languageCode<<endl;
    cout << skillF.id<<endl;
    skillF.getData();
    return 0;
}

//We may add required additional data to inherited class
//There is no way of inheriring private members of any class
// there are may types of inheritance, such as multiple inheritance,multilevel, etc. 