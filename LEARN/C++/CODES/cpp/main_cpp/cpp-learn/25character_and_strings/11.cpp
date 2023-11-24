//Finding  permucation of sstring s1 in string s2



# include<iostream>
# include<string>
# include<algorithm>
using namespace std;

bool IsPermucations (string &s1, string &s2)//checks permucations of string s1 in string s2
{
  if(s1.length()>s2.length())
  {
    return 0;
  }

 // string sorted_s1=sort(s1.begin(),s1.end());--->>This is wrong becoz the sort funtion sort() functio does not return sorted string directly
   string sorted_s1=s1;
   sort(sorted_s1.begin(),sorted_s1.end());
  
   //Sliding window appraoch

  for(size_t i=0 ; i<=s2.length()-s1.length(); i++)
  {
    string substring=s2.substr(i,s1.length());
    string sorted_substring=substring;
    sort(sorted_substring.begin(),sorted_substring.end());

        if(sorted_substring==sorted_s1)
        {
            return true;
        }

    

  }
  return false;

}


 int main()
{
    
    string s1,s2;

    cout<<"Enter a string s1\n";
    getline(cin,s1);

    cout<<"enter a string s2\n";
    getline(cin,s2);


    bool ans= IsPermucations(s1,s2);
    if(ans==1)
    {
        cout<<"Permucation is present\n";
    }
    else{
        cout<<"permucation is not present\n";
    }
  

    return 0;
}