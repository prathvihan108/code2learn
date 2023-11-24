# include<iostream>
using namespace std;


int main()
{
  char arr[120]={'a','b','c','\0'}; //null character is compulsary if ur initilising  an  character array
  /*
   
   this is becoz "arr" is holding(pointing) the adress of string and not single character ,so 
   when we do "cout<<arr" it wil print all the elements until it finds null character. 
   */
  char b[20]="Hello world"; //Null character is atomatically placed whwn we initilise in this way
  int a[20]={1,2,3,4};

  cout<<a<<","<<&a[0]<<endl;//This will print adress of a[0]  becoz array is of type int and so "a"is holding 
  //adress of a[0]
  cout<<*a<<","<<a[0]<<endl; //1,1
  
  cout<<arr<<endl;//abc
  cout<<b<<endl;//Hello world
  return 0;    
}

//tip::comments in c++ can not be nested
//u can also write comments inside cout statements