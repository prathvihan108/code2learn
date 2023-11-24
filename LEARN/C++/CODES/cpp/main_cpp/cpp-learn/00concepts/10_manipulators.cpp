/*
    std::cout and std::cin are both objects that are defined in the 
    iostream header file, which is part of the C++ Standard Library.

*/




#include <iostream>
#include <iomanip>//Manimulators are present in iomanip library

int main() {
    std::cout << std::left << "Hello" << std::setw(10) << "World" << std::endl;
    std::cout << std::right << "Goodbye" << std::setw(10) << "Cruel World" << std::endl;
    return 0;
}
/*
In the example above, the first output field is left-justified by default because of 
the std::left manipulator, and the second output field is right-justified by default 
because of the std::right manipulator. 
The output is padded with spaces to fill the specified width of each field.

//setw(10)>>sets the width to 10 so if eneteres characters are less than 10 it will leave spaces in leftside
if there are more characters than limit then it would print same  as normal outputstream would print


*/