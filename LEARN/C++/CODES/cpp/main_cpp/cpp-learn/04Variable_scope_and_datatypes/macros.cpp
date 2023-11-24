#include<iostream> 
using namespace std;

#define PI 3.14 //It is calles macro //it doesn take any additional memory//the value of micros are repaced brfore compilation to its call

int main() {

    int r = 5;
    //double pi = 3.14;

    double area = PI * r * r;//PI is replaced by  3.14 before compilation only 

    cout << "Area is " << area << endl;

    return 0;
}
//There are many type of macros