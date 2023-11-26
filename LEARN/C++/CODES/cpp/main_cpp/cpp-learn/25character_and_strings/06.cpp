//this program can br still optimised or made user friendly for fault tolerating

# include<iostream>
# include<string>
# include<algorithm>
using namespace std;

char  count_max_charaters (string s)
{
    char arr[26]={0};//Initialised an array wiith zero
    int i=0;
    int j= s.length();//Gives the length of string
    
    while(i<j) //Will run from (0-n-1)
    {
        char ch=s[i];
        int number=0;
        //lower case
        if(ch>='a'&& ch<='z')
        {
            number=ch-'a'; //Here you will get position of  the charcter in(A-Z) //easy
        }
        //upper case
        else{
            number=ch-'A';
        }
        i++;
        arr[number]++;//Increments the position of that particular element in array "arr"//siilarly does for all
    }
            //Now simply find maximum number from the array "arr"and its position
      
      
      int max=1;// You can assign any vlues to it ,how ever it is gong to be over written ,but it can be used to optimise the code for fault tolerance(when given all unique characters)
      int ans=-1; //

    for(int i=0;i<26;i++)
    {
       if(arr[i]>max)
       {
        ans=i;//Position of maximum occuring character
        max=arr[i];//this stoted the count of maximum occuring character
       }
    }
    char final_ans='a'+ans;

    return final_ans;

    

}




 int main()
{
    string s;
    cout<<"enter a string\n";

    
    cin>>s;
    
    char max= count_max_charaters (s);
    cout<<"mximum occuring character is: " <<max<<endl;


    return 0;   
}                  