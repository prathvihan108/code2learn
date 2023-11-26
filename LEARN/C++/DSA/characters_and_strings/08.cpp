//reversing the words of string //another way 
//input stream: extracts the word/read the word from stream, and puts it to some location 
//output stream: inserts the word / write the word to stream,
//Read key3 for more reference

#include <iostream>
#include <algorithm>
#include <vector>
#include <sstream>

void reverseWords(std::string& s)
{
    std::istringstream iss(s);
    std::vector<std::string> words;

    // Split the string into words
    std::string word;
    while (iss >> word) //what ever the iss is reading/extracting from "s" is written to  string "word"
    {
        words.push_back(word);
    }

    // Reverse the letters within each word
    for (std::string& word : words)
    {
        std::reverse(word.begin(), word.end());
    }

    // Concatenate the reversed words
    std::ostringstream oss;  //oss and iss are instances of iostringstream class
    for (const std::string& word : words)
    {
        oss << word << " ";
    }

    // Get the final revised string
    s = oss.str();

    // Remove the trailing space if it exists
    if (!s.empty())
    {
        s.pop_back();
    }
}

int main()
{
    std::string s;
    std::cout << "Enter a string: ";
    std::getline(std::cin, s);

    reverseWords(s);

    std::cout << "The revised string is: " << s << std::endl;

    return 0;
}
