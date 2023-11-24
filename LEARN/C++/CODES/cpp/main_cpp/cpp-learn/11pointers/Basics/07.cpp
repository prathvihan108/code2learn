//how" cout" behaves differently for integers arrray pointers and characters aray pointers

# include<iostream>
using namespace std;

 int main()
{
 int arr[] = {1, 2, 3, 4, 5};
int* ptr = arr;
std::cout << ptr<<endl;  // Prints the memory address of the first element of the integer array
      cout<<ptr+2<<endl; //prints adress of 3rd element
        cout<<*ptr<<endl; //prints 1

cout<<"_____________________________________________________________\n";

char str[] = "Hello";
char* ptr1 = str; //ptr1 is pointer to string or character array
    
    cout<<str<<endl;
std::cout << ptr1<<endl;  // Prints the entire C-style string until it encounters null character
     cout<<ptr1+2<<endl;   //prints "llo" in this case
    cout<<*ptr1<<endl;  //as usual prints element at ptr1 //that is "H"


    return 0;
}