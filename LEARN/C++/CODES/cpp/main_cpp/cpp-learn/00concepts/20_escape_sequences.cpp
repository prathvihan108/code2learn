//Characters() such as backslash double qotation can be printed normally
/*
>>so we make use of escape sequences such as
>> /" : now double qotation is treeted as printing material and not as  part of syntx any more
>> similarly there are many : \n(new line),\t(horizontal tab),\a(alert sound),\'(single qotation)
>>\\ :first backslash represents that it is escape sequence and the second back slash represents that we want to print "\"
>>\b:this gives back space(deletes privius literal)

*/


# include<iostream>
using namespace std;
int main()
{
cout<<"This will be followed by a new line \n and after this i want a horizontal tab \t.And now i want here backslash\\"<<endl;
cout<<"Second line"<<endl;
cout<<"And i want to write this word in \"doublquotes\"  and this in \'single quotes\'. Let us see if all this works correctly\by\? ";
cout<<"\a";//beep sound but not working
}
