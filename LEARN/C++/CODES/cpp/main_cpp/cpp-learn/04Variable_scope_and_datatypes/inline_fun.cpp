#include<iostream>
using namespace std;



inline int getMax(int& a, int& b) { //unlike normal functions it does'st take any additional memory ,and does under go stack when called,istead function call  is replaced by code
    return (a>b) ? a : b; // inline functions must be shorter(1-3) lines or else compler will throw error
}

int main() {

    int a = 1, b = 2;
    int ans = 0; 

    ans = getMax(a,b);
    cout << ans << endl;

    a = a + 3;
    b = b + 1;

    ans = getMax(a,b);
    cout << ans << endl;



    return 0;
}