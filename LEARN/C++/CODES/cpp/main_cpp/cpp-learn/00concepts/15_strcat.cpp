# include<iostream>
# include<cstring>
using namespace std;
void str_cat(char s1[],char s2[]);

int main()

{   char s1[40],s2[40];
    printf("Eneter the destination string\n");
    scanf("%s",s1);
    
    printf("Enter the source string\n");
    scanf("%s",s2);
    
    printf("Destination string:%s\n",s1);
    printf("Source string:%s\n",s2);
    
   
    str_cat(s1,s2);
    printf("Destination string after concatenation:%s\n",s1);

}
void str_cat(char s1[],char s2[])
{
  int i,j;
  for(i=0;s1[i]!='\0';i++) //it calculates the length of destination string
  {}
  for(j=0;s2[j]!='\0';j++,i++)
  {

    s1[i]=s2[j];

  }
  s1[i]='\0';  //End the destination string with null
  

  
}