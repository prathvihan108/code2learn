//Adress typecasting

# include<iostream>
using namespace std;
int main() {
    int num = 97;
    int* ptr = &num;

    // Address typecasting  //"reinterpret_cast"is key word used
    char* charPtr = reinterpret_cast<char*>(ptr); //here we are asking char ptr to treat the intrger object num as character
    //now charPtr points to num assuming that it is of type character
   
    // Accessing data through the casted pointer
    char value = *charPtr;
    std::cout << "Value: " << value << std::endl;

    return 0;
}
