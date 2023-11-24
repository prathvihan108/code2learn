# include<stdio.h>
int sum(int n); 
int main()
{
    int n,result;
    printf("Enter any number\n");
    scanf("%d",&n);
    result=sum(n);         //function call
    printf("%d",result);
    return 0;
}
int sum(int n)
{                                        //function defination
    if(n==1)                       //if statement is compulsary or else compiler could not find any n value ,
    {                              //return 1 does not mean it directly returns 1 to subfunction ignoring all
        return 1;
    }
    
    int result;
    result=n+sum(n-1);  
      return result;  
       
}