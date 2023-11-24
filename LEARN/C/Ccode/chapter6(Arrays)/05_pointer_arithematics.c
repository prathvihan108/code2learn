# include <stdio.h>
# include <math.h>
#include <stdlib.h>
int main()
{
   int i; 
int *lake=&i;
printf("The adress of i is%d\n",lake);
lake++;
printf("The adress of i is%d\n",lake);
 

                                    //adress of i is incressed by 4 bytes as we do lake++ or( lake=lake+1) becoz integer is taking 4 bytes of memeory
                                                //Bytes taken by integer may vary from depending on compiler system etc factors
//lake = lake+1;                    //adress will increase by 4 bytes
//lake = lake+2;                    // adress will increase by 8 bytes
//lake--;                         //adress will decrease by 4 bytes
                                    //For char this compiler reserves only 1 bytes so only 1 bytes will be increamented
return 0;
}
 /* Pointer arithematic:: A pointer can be increamented to point to the next memory location of that type
 (This will not value of the previous adress to the next adress).This arithematic can be used to point various elements in array using single pointer*/