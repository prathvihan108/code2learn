//https://cplusplus.com/reference/string/string/substr/
//https://cplusplus.com/reference/string/string/erase/

//Program to remove all occurances of substring from a given string

# include<iostream>
# include<string>
# include<algorithm>
using namespace std;

string remove_occurances_of_substring(string s1,string sub_str)  //Here the strings are copied to function parameters
{
      while(s1.length()!=0 && s1.find(sub_str)<s1.length())//This loop will untill all occurances of substring are removed
    { 
    
        s1.erase((s1.find(sub_str)),sub_str.length());
        return s1;//returns final string
    }

}

 int main()
{
    
    string s1,sub_str;

    cout<<"Enter a string\n";
    getline(cin,s1);

    cout<<"enter a substring\n";
    getline(cin,sub_str);

    s1=remove_occurances_of_substring( s1,sub_str);
    
    cout<<"s1:"<<s1;


    return 0;
}