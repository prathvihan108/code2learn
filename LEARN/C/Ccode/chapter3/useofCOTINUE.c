# include<stdio.h>
int main()
{
    int a=6;
    int i=0;
    while(i<=a)
    {                                //continue statement is used to start the loop again it ignores the code down
           if(i!=6){                    //side of' continue" statement unless condition is satisfied if there any
            i++;
        continue;
        }
        else{
            printf("%d",i);
        }
        return 0;
    }
   // return 0;
    
}