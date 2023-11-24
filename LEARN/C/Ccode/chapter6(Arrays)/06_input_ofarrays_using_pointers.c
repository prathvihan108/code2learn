# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
int heven[4];
int *ptr;
ptr=&heven[0];
for(int i=0;i<4;i++){
    printf("Entere the marks of student %d\n",i+1);
    scanf("%d",ptr);       //no need to add '&'(adress of operator) operator as prifix for "ptr"because ptr is adress itself
    ptr++;

}
for(int i=0;i<4;i++)             //out put of arrays
{
    printf("The marks obtained by student %d is %d\n",i+1,heven[i]);

}

return 0;
}