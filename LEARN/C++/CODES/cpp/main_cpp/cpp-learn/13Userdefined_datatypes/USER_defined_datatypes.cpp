#include<iostream>
using namespace std;

typedef struct employee//"typedef and "ep"(it can be anything) are key words used to avoid writing" struct"and structure name
    /* data */
    int eId; //4
    char favChar; //1
    float salary; //4
} ep;

union money
{
    /* data */
    int rice; //4   //at a  time only 1 variable can storre value, no of maximum byte alloutrd is equal to max byte of datatyoe
    
    char car; //1
    float pounds; //4(max 4byte) 
};


int main(){
    enum Meal{ breakfast, lunch, dinner};
    Meal m1 = lunch;
    cout<<(m1==2);
    // cout<<breakfast;
    // cout<<lunch;
    // cout<<dinner; 
    // union money m1;
    // m1.rice = 34;
    // m1.car = 'c';
    // cout<<m1.car;

    // ep harry;// harry is variable , it is not compulsary to declare it after declaring structure, this makes easy data handling, we can even add many variable names in front of ep
    // struct employee shubham;
    // struct employee rohanDas;
    // harry.eId = 1;
    // harry.favChar = 'c';
    // harry.salary = 120000000;
    // cout<<"The value is "<<harry.eId<<endl; 
    // cout<<"The value is "<<harry.favChar<<endl; 
    // cout<<"The value is "<<harry.salary<<endl; 
    return 0;
}
    