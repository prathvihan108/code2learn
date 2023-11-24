#include <stdio.h>
#include <string.h>
int str_compare(char s1[],char s2[]);//Prototyping
int main()
{
    int val;
    char s1[40] ;
    char s2[40];
    printf("Enter first string literal\n");
    scanf("%s",s1);
     printf("Enter second string literal\n");
    scanf("%s",s2);
    val=str_compare(s1,s2);                  //Function called for comparing strings and the return value is stored in "val"
    printf("%d",val);
    return 0;
}
//Function for comparing 2 strings
  int str_compare(char s1[],char s2[])        //Adress of s1 and s2 of "main" is passed to s1 and s2 of function "str_compare"
{
   int i;
   for(i=0;s1[i]!='\0'&& s2[i]!='\0';i++)     //this loop keeps on running until it finds first null character
   {                                          //either in first string or second string no matter
       if(s1[i]!=s2[i]) 
        
                                 
       {
        return (s1[i]-s2[i]);          //suppose if s1[i] is not equal to s2[i] then  this statement executes (It will return the 
       }                           //difference of ASCII values of s1[i] and s2[i] where s1[i] nad s2[i] are first non matching characters)
   }                                //difference is negative id ASCII of s1[i]>s2[i],and is positive if vice varsa
                                      
return (s1[i]-s2[i]);        //this condition  only executes only if the  strings enetered by user are same,and it will 
}                              // always  return" 0" as ASCII values of s1[last_character]=s2[last_character] 
   
