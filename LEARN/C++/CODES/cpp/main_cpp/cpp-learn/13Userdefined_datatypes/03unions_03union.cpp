#include<iostream>
using namespace std;

union employee //declaring or defining data type
{
int age;

char name;
float salary;
};

int main()

{
union employee obj1;  //calling data type
obj1.age=5;
cout<<"age";
return 0;
}

//unions is similar to structure but it is better in memory management
  