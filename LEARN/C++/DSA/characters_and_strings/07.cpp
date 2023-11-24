//reversing the words of string //
# include<iostream>
# include<algorithm>

using namespace std;

void reverse_string_letters(string& s)// "string & " can directly modify new string
{
    int i=0;//first word starts from zero itself
    int j=s.length();

    while(i<j)
    {
        //first find no of characters in each word
        int word_start=i; //cant put it down to while loop
        
        while(i<j && s[i]!=' ')
        {
            i++;
        }
        //now go on swaping
       
        int word_end=i-1; //you need to do i-1 here becoz loop is also counting '\0'character 
       
         while(word_start<word_end)
        {
            swap(s[word_start],s[word_end]);
            word_start++;
            word_end--;
        }

        
        // Skip spaces between words
        while (i < j && s[i] == ' ')
        {
            i++;
        }


      
    }

}



 int main()
{
    string s;
    cout<<"enter a string\n";

    
   getline(cin,s); //is able to read spaces also
   
   reverse_string_letters(s);
    
    

    cout<<"The revised string is: " <<s<<endl;


    return 0;   
}                  