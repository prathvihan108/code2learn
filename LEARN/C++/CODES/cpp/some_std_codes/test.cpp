//GCD/HCF of 2 numbers using euclidian algorithm iterative method
/*
note:LCM * HCF = num1 * num2


*/
#include <iostream>
using namespace std;

int gcd(int a, int b)
{
    if (a == 0)
    {
        return b; // GCD of any number and zero is the number itself
    }
    if (b == 0)
    {
        return a;
    }

    while (a != 0 && b != 0)
    {
        if (a < b)
        {
            b = b % a;
        }
        else
        {
            a = a % b;
        }
    }
    return a + b; // GCD is stored in 'a' or 'b'
}

int main()
{
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    int hcf = gcd(a, b);
    cout << "GCD(" << a << ", " << b << ") = " << hcf << endl;

    return 0;
}
