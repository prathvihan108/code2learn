# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
    int n=2,s=3; //here we assumed 2 students and 3 subjects
int mul[n][s]; 
//int n,m;
for(int i=0;i<n;i++)

{
 for(int j=0;j<s;j++)                                  //2nd for loop does not exit until condition gets fail so user can enter marks of n students in s subjects
 {                                                    //so therefore first it takes the all subjects marks of 1st student then goes for 2nd student
    printf("Enter the marks of student %d subject %d\n",i+1,j+1);
    scanf("%d",&mul[i][j]);
  //  sacnf("%d,%d",&mul[i],&mul[j]);                 //this line is wromg here becoz we are not going to store student number in array only marks are going to be storted in all 6 boxes.

 }
}
for(int i=0;i<n;i++)
{
 for(int j=0;j<s;j++)                            // also therefore first it prints the all subjects marks of 1st student then prints for 2nd student
 {
    printf(" Marks of student %d in subject %d is %d\n",i+1,j+1,mul[i][j]);
    
 }
}


return 0;
}
