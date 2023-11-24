# include <stdio.h>
# include <math.h>                 //input and output of arrays
#include <stdlib.h>
int main()
{
int marks[6]; 
printf("EntER THE marks of 6 students\n ");
scanf("%d",&marks[0]);
scanf("%d",&marks[1]);
scanf("%d",&marks[2]);
scanf("%d",&marks[3]);
scanf("%d",&marks[4]);
scanf("%d",&marks[5]);


printf("marks scored by student 1 is %d\n",marks[0]);
printf("marks scored by student 2 is %d\n",marks[1]);
printf("marks scored by student 3 is %d\n",marks[2]);
printf("marks scored by student 4 is %d\n",marks[3]);
printf("marks scored by student 5 is %d\n",marks[4]);
printf("marks scored by student 6 is %d\n",marks[5]);
return 0;

}

/*input and output operations on arrays is similar to that of variables*/