/*
also floating point literals : 3.1223E3 means 3.1223*10^3 //we can also use "e" instead of "E" 
*/


#include<iostream>
using namespace std;
int main()
{

    int a,b,c;
    a=25;
    b=031; //octal 25 (we write 0 before 31 to treet it as octal and dicimal value of "31" is 25) 
    c=0x19;//hexadecimal 25 (we write 0x before a number to treet a number as hexadicimal)()hexadicimal of 25 is 19)
cout<<a<<" "<<b<<" "<<c<<endl;
return 0;
}