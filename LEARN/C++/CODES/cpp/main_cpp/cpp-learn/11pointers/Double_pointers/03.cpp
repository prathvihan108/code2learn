//Reference variables

#include<iostream>
using namespace std;
//WArning //Dont create functions of type reference or pointer,becoz variables created inside functions has scope limited to function block only ,and so when function ends memory is deallocated and ur reference or pointer variable is poiting to different value
int& func(int a) {
    int num = a;
    int& ans = num;  //ans is reffered to num
    return ans;
}
//Not recommended
int* fun(int n) {
    int* ptr = &n;
    return ptr;
}
//ok
void update2(int& n) {
    n++;
}
//ok
void update1(int n) {
    n++;
}

int main() {

    /*
    int i = 5;

    //create a ref variable 

    int& j = i;

    cout << i << endl; 
    i++;
    cout << i << endl; 
    j++;
    cout << i << endl; 
    cout << j << endl;
    */

   int n = 5;
   
   cout << "Before " << n << endl;
   update2(n);
   cout << "After " << n << endl;


    fun(n);

    return 0;
}