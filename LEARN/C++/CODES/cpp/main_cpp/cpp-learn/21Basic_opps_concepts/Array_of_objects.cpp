#include <iostream>
using namespace std;

class Employee
{
    int id;
    int salary;

public:
    void setId(void) 
    {
        salary = 122;
        cout << "Enter the id of employee" << endl;
        cin >> id;
    }

    void getId(void)
    {
        cout << "The id of this employee is " << id << endl;
    }
};

int main()
{
    // Employee harry, rohan, lovish, shruti;
    // harry.setId();
    // harry.getId();
    Employee fb[4]; // This is an array which can store up to 4 objects(not objects, but can di work of 4 objects) 
    for (int i = 0; i < 4; i++)
    {
        fb[i].setId();
        fb[i].getId();
    }

    return 0;
}
