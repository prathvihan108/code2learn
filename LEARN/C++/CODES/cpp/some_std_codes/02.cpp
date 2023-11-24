//Reversing a number 

# include<iostream>
using namespace std;

int main()
{
    int num,l,rev=0;

    cout<<"Enter a number to reverse\n";
    cin>>num;

    while(num!=0)              //Dont use "num>=0" it will lead to infinite loop
    {

        l=num%10 ;//Gives the last digit of number
        rev=rev*10+l; //kepps on saving reverse number
        num=num/10;
    }
    cout<<"Reversed number is "<<rev<<endl;
    return 0;
}

