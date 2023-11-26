// Here in this we will take the input and produce out put using loops concept
# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
int marks[5];
printf("Enter the marks of 5 students\n");
for(int i=0;i<5;i++)  //we are assuming as adress of each students marks in array so i should start from 0 to 4(n-1)
{
    printf("Enter the marks of student %d\n",i+1); //i+1 is just for convinince of user because "Enter the marks of student 0 "does not look good
    scanf("%d",&marks[i]);

}
for(int i=0;i<5;i++)
{
    printf("The marks of student %d is %d\n",i+1,marks[i]);
}
return 0;
}