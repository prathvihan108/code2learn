//when we want to return 2 values at a time from sub function 
# include <stdio.h>
# include <math.h>
#include <stdlib.h>
 float avgsum(int x,int y,float *avg,int *sum);
int main()
{
    int x=7,y=6,sum;
    float avg;
    avgsum(x,y,&avg,&sum); //here i have given adsress of sum and avg so now function can itself modify the value.
    printf("AVerage of given numbers is %f\n",avg);
    printf(" sum of given numbers is %d\n",sum);

return 0;
}
float avgsum(int x,int y,float *avg,int *sum)

{
    *sum=x+y;
    *avg=(float)(x+y)/2; //type casting using float,
}

/* so from this program we come to know that for a function to modify the variables of main program
it is necessary to give the adress of those variables(call by reference)*/