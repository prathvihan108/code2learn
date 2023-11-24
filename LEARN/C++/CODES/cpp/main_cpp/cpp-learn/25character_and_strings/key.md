##############################################################################################################
Here are some commonly used inbuilt functions of the `std::string` class in C++ along with their descriptions:

1. `length()` or `size()`: Returns the length (number of characters) of the string.

2. `empty()`: Checks if the string is empty and returns `true` if it is, `false` otherwise.

3. `clear()`: Clears the contents of the string, making it an empty string.

4. `substr(pos, len)`: Returns a new string that is a substring of the original string, starting from the position `pos` and containing `len` characters.

5. `append(str)`: Appends the string `str` to the end of the original string.

6. `insert(pos, str)`: Inserts the string `str` into the original string at the position `pos`.

7. `erase(pos, len)`: Erases `len` characters from the original string starting at the position `pos`.

8. `replace(pos, len, str)`: Replaces `len` characters in the original string starting at the position `pos` with the string `str`.

9. `find(str)`: Searches the original string for the first occurrence of the string `str` and returns its position. If not found, it returns `std::string::npos`.

10. `find_first_of(str)`: Searches the original string for the first occurrence of any character from the string `str` and returns its position. If not found, it returns `std::string::npos`.

11. `find_last_of(str)`: Searches the original string for the last occurrence of any character from the string `str` and returns its position. If not found, it returns `std::string::npos`.

12. `find_first_not_of(str)`: Searches the original string for the first occurrence of a character not present in the string `str` and returns its position. If not found, it returns `std::string::npos`.

13. `find_last_not_of(str)`: Searches the original string for the last occurrence of a character not present in the string `str` and returns its position. If not found, it returns `std::string::npos`.

14. `compare(str)`: Compares the original string with the string `str` and returns `0` if they are equal, a negative value if the original string is less than `str`, and a positive value if the original string is greater than `str`.

These are just a few examples of the inbuilt functions available in the `std::string` class. You can refer to the C++ standard library documentation for more details and a complete list of functions available for working with strings.
##############################################################################################################
Here are some commonly used inbuilt functions of the `std::string` class in C++ along with their descriptions:

1. `length()` or `size()`: Returns the length (number of characters) of the string.

2. `empty()`: Checks if the string is empty and returns `true` if it is, `false` otherwise.

3. `clear()`: Clears the contents of the string, making it an empty string.

4. `substr(pos, len)`: Returns a new string that is a substring of the original string, starting from the position `pos` and containing `len` characters.

5. `append(str)`: Appends the string `str` to the end of the original string.

6. `insert(pos, str)`: Inserts the string `str` into the original string at the position `pos`.

7. `erase(pos, len)`: Erases `len` characters from the original string starting at the position `pos`.

8. `replace(pos, len, str)`: Replaces `len` characters in the original string starting at the position `pos` with the string `str`.

9. `find(str)`: Searches the original string for the first occurrence of the string `str` and returns its position. If not found, it returns `std::string::npos`.

10. `find_first_of(str)`: Searches the original string for the first occurrence of any character from the string `str` and returns its position. If not found, it returns `std::string::npos`.

11. `find_last_of(str)`: Searches the original string for the last occurrence of any character from the string `str` and returns its position. If not found, it returns `std::string::npos`.

12. `find_first_not_of(str)`: Searches the original string for the first occurrence of a character not present in the string `str` and returns its position. If not found, it returns `std::string::npos`.

13. `find_last_not_of(str)`: Searches the original string for the last occurrence of a character not present in the string `str` and returns its position. If not found, it returns `std::string::npos`.

14. `compare(str)`: Compares the original string with the string `str` and returns `0` if they are equal, a negative value if the original string is less than `str`, and a positive value if the original string is greater than `str`.

These are just a few examples of the inbuilt functions available in the `std::string` class. You can refer to the C++ standard library documentation for more details and a complete list of functions available for working with strings.
###############################################################################################
//HOw are strings different from character arrays: in terms of function or behaviour

Strings in C++ (`std::string`) and character arrays (`char[]`) have several differences in terms of functionality and behavior:

1. **Dynamic size:** Strings (`std::string`) can dynamically resize themselves as needed, while character arrays have a fixed size determined at compile-time.

2. **Memory management:** Strings handle memory management internally, automatically allocating and deallocating memory as needed. Character arrays require manual memory management, where you need to ensure sufficient memory allocation and deallocation.

3. **Null termination:** Strings store their length internally and are null-terminated, meaning they have a null character (`'\0'`) at the end to mark the end of the string. Character arrays require explicit null termination to indicate the end of the string.

4. **Copy and assignment:** Strings support copy construction and assignment operators (`=`), allowing you to easily create copies or assign one string to another. Character arrays require manual copying using functions like `strcpy()`.

5. **String manipulation functions:** The `std::string` class provides a rich set of member functions for string manipulation, such as concatenation (`+` operator or `append()` function), finding substrings (`find()` function), string comparison (`compare()` function), and more. Character arrays lack built-in functions for these operations, requiring manual implementation or the use of string manipulation functions from the C library (e.g., `strlen()`, `strcpy()`, `strcat()`, etc.).

6. **Range-based iteration:** Strings can be easily iterated over using range-based for loops, allowing you to access individual characters directly. Character arrays require explicit indexing to access individual characters.

7. **String operations:** Strings provide convenience and safety when performing common string operations, such as searching, inserting, erasing, and modifying substrings. These operations are error-prone and require manual handling when using character arrays.

Overall, `std::string` provides a higher level of abstraction, easier memory management, and a wider range of built-in operations compared to character arrays, making it the preferred choice for string manipulation in modern C++ programs.
######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################