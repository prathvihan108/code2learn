#include<iostream>
using namespace std;

 typedef struct employee //here  struct is key word used to create structure 
                 /*employee is the name of structure
            we can use this structure to crate other variabled (for example staff names may be called structure variables)*/
{               
int age;
float salary;
char name;
}x;

int main()
{
x harry;  //harry is variable name of structure(or instance of a structure) 
harry.age=12;//to avoid writing struct and structure name we are using key word typedef before struct and any word(ep, er, ft) after closing structure and than put a semi lon
cout<<harry.age;
return (0);
    
}