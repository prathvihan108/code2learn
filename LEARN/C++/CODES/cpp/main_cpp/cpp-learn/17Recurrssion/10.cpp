//Reversing a string using recurrsion

# include<iostream>
# include<string>
using namespace std;

void ReverseString(string &s,int i,int j)
{
  
    if(i>j)
    {
        return;
    }
    swap(s[i],s[j]);
    i++;
    j--;
    return ReverseString(s,i,j);

}

 int main()
{
    string s={"Hello"};
    int size=s.size();
    ReverseString(s,0,size-1);//Note : dont pass only size //pass size-1
    cout<<s<<" ";

    return 0;
}