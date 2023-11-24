# include <stdio.h>
# include<stdlib.h>
# include <time.h>
int main()
{
    int a;
   // srand(4);
   srand(time(0));
    a= rand()%10;     
    printf("%d",a);
    return 0;  

                       
                       
}
/*this prints any random number assuming i=1 if we do not specify number
logic: i=1
        a=i
        a=a+5
        a=a*34
        a=a/45
        a=a-48  etc randomnumbers
        
        if we specify i value than it will give different number
        srand(4) is used to do this, and we may also use time(0) function(embeded in srand()) to change i value atomatically after every run
        @@also if we want random number only up to some specified limit,do rand()%limit*/