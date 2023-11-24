#include<iostream>
using namespace std;
//void calculate(mine , mine ) ;
#include <math.h>

class mine
{
int x, y, res;//these are class variables and are going to be different /separate for each obj created
public:
mine(int a ,int b) ;//constructor declaration
void calculate(mine o1,mine o2) ;




};

mine ::mine(int a , int b) //constructor definatiin
{

x=a;
y=b;

}
void mine:: calculate(mine o1, mine o2)//passing objects of class mine to this function
{
res= sqrt(pow((o2.x-o1.x), 2)+ pow((o2.y-o1.x), 2) ) ;
cout<<"Distance between 2 points "<<o1.x<<","<<o1.y<< "\tand" <<o2.x<<","<<o2.y<<"is\t"<<res<<endl;

}

int main() 
{

mine p1(1, 7) ; //implicit calling of function
mine p2(7,8) ;
mine p3(0,0);//
//calculate(p1, p2) ;//u compalsary need to crate a object to access member function of class
 

 p3. calculate(p1, p2)   ;    //it can not be accessed like normal functions


return 0;





}