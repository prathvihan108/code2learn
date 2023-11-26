#include <stdio.h>
# include <math.h>
int main()
{
    float p,m,c;
    float pm,mm,cm,tm;
    printf("enter your physics marks\n");
    scanf("%f",&p);
    printf("entere your maths marks\n");
    scanf("%f",&m);
    printf("enter your chemistry marks\n");
    scanf("%f",&c);
   // tm = (p+c+m)/3;
   // printf("%f",tm);
    pm=((p/100)*100),mm=(m/100*100),cm=(c/100*100);
    tm=(p+c+m)/300*100;
   // printf("%f,%f,%f,%f\n",pm,mm,cm,tm);
   // return 0;
   if(pm>33 && mm>33 && cm>33 && tm>80)
    {
      printf("your r pass \n");
        printf("your total percentage is \t %f\n",tm);
        return 0;

    }
    else{
       printf("better luck next time\n");
        return 0;

    }
        
    
}