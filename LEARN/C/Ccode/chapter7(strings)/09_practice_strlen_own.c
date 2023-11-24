//Write your own function to to the work of strlen(){calculate length of string}

# include <stdio.h>
# include <math.h>
#include <stdlib.h>
void strlen_own(char *ptr,int *length);
int main()
{
    char sky[45];
   int length;
    printf("Enter any word\n");
    scanf("%s",sky);
   // printf("%s",sky);
    strlen_own(sky,&length);
    printf("The length of array is %d",length);


return 0;
}
void strlen_own(char *ptr ,int *length)
{
    
    while(*ptr != '\0')
    {
         ptr++;
         *length++;
        return *length;
    }
}