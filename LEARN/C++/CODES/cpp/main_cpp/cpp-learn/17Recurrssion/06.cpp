//Printing digits present in given number in to words using recurrsion

# include<iostream>
using namespace std;

void print_num_words(int num,string s[11])
{
    if(num==0)
    {
        return;
    }
    int digit=num%10;
    num=num/10;
    print_num_words(num,s); //Recurrsion 
   
    cout<<s[digit]<<" ";//u can print reverse too if u put this above //so this type of logics will actually boost ur logical thinking raher than those logiacal approach of certain programs which u have to remember 
    
}

 int main()
{
    int n;
    cout<<"Enter the nummber\n";
    cin>>n;
   //arr can hold 10 elements with each element of type string
    string arr[11]={"zero","one","two","three","Four","Five","six","seven","eight","nine","ten"};
    print_num_words(n,arr);

    return 0;
}