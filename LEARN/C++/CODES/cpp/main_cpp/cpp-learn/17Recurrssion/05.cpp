#include<iostream>
using namespace std;

void PrintDigits(int n)
{  //base case
    if (n < 10)
    {
        cout << n << " ";
        return;//note: when u dont;t want to return any thing,but just want to stop recurrsion //u can follow this method//function type is void and then simply return
    }
    
    //recurrsive case
    PrintDigits(n / 10);
    cout << n % 10 << " ";// if put this statement above it will print in reverse
}

int main()
{
    int number;
    cout << "Enter a number: ";
    cin >> number;
    
    cout << "Digits: ";
    PrintDigits(number);
    
    return 0;
}
