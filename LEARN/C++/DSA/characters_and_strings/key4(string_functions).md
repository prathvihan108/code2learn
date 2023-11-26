// string::substr
#include <iostream>
#include <string>

int main ()
{
  std::string str="We think in generalities, but we live in details.";
                                           // (quoting Alfred N. Whitehead)

  std::string str2 = str.substr (3,7);     // "think i"  //Look carefulluy

  std::size_t pos = str.find("live");      // position of "live" in str

  std::string str3 = str.substr (pos);     // get from "live" to the end

  std::cout << str2 << ' ' << str3 << '\n';

  return 0;
}
##############################################################################################################
// string::erase
//note: the second parameter in the erase function as well as find function are the count of charcters u want 
//u want to erase from the first parameter
#include <iostream>
#include <string>

int main ()
{
  std::string str ("This is an example sentence.");
  std::cout << str << '\n';
                                           // "This is an example sentence."
  str.erase (10,8);                        //            ^^^^^^^^
  std::cout << str << '\n';                 //                                             
  str.erase (str.begin()+9);               //           
  std::cout << str << '\n';
                                           // "This is a sentence."
  str.erase (str.begin()+5, str.end()-9);  //       ^^^^^
  std::cout << str << '\n';
                                           // "This sentence."
  return 0;
}
 Edit & run on cpp.sh
Output:
This is an example sentence.
This is an sentence.
This is a sentence.
This sentence.
##############################################################################################################

##############################################################################################################
##############################################################################################################
##############################################################################################################
##############################################################################################################
##############################################################################################################
##############################################################################################################
##############################################################################################################