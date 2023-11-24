// This program prints multiplicatoion table of given number using given concept(passing arrays to functions)

# include <stdio.h>
# include <math.h>
#include <stdlib.h>
void sky(int *ptr,int n);
int main()
{
    int arr[10];

    int a;
    printf("Enter any number whose table u want\n");
    scanf("%d",&a);
    for(int i=0;i<10;i++)  
    {                          // Here we have taken and stores the table of given number now we will pass it to function to print
     arr[i]=a*(i+1);
    }
    sky(arr,10);        // passing array to function,we must mention the size of array or else compiler prints unwanted values
                        //To pass array to a function function must contain a pointervariable (which will point to all elements of array based on user choice)or it must contain another array to stores values of passed array
                          //In this case i have used a pointer
    

return 0;
}
void sky(int *ptr ,int n)           
{
    for(int i=0;i<10;i++)           //Out put using pointer
    {
        printf("%d\n",*ptr);   //prints the value of variable
        ptr++;
    }

}