//we can not use scanf function to give space between words so we use gets(arryname) or puts(arrayname);
// this is one of the convinient way to take input
# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
char mine[34];
printf("Enter Your name\n");
gets(mine);                    //puts(arrayname) also performs the same function but puts the curser in next line
printf(" Your name is%s",mine);
return 0;
}