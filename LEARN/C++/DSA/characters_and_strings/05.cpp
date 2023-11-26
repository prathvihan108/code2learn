//Proper pelidome checker : which ignoores space and convers uper to lower if any exists than check for pelidrome
#include <iostream>
#include <cctype> // Included for the isalnum() function

int length_of_string(char ch[]); // Function prototype for length of string

bool palindrome_string(char* ch)
{
    auto valid_characters = [](char ch) {
        return std::isalnum(ch) && ch != ' '; // Check if a character is alphanumeric and not a space
    };

    auto upper_to_lower = [](char* ch) {
        for (int i = 0; ch[i] != '\0'; i++) {
            if (std::isupper(ch[i])) {
                ch[i] = std::tolower(ch[i]); // Convert uppercase characters to lowercase
            }
        }
    };

    int n = length_of_string(ch);
    upper_to_lower(ch);

    int s = 0;
    int e = n - 1;

    while (s <= e)
    {
        while (s <= e && !valid_characters(ch[s])) {
            s++; // Skip non-valid characters
        }

        while (s <= e && !valid_characters(ch[e])) {
            e--; // Skip non-valid characters
        }

        if (s <= e && ch[s] != ch[e])
        {
            return false;
        }
        s++;
        e--;
    }
    return true;
}

int length_of_string(char ch[])
{
    int count = 0;
    for (int i = 0; ch[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}

int main()
{
    char ch[50];
    std::cout << "Enter the string: ";
    std::cin.getline(ch, 50);

    bool is_palindrome = palindrome_string(ch);

    if (is_palindrome)
    {
        std::cout << "It is a palindrome." << std::endl;
    }
    else
    {
        std::cout << "It is not a palindrome." << std::endl;
    }

    return 0;
}
