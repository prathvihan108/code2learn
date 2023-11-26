# include <stdio.h>
void display();  //function prototype (is user defined function)
int main()
{
printf("initilising display function\n");
display();                                 //Function call
printf("display function finished\n");
return 0;

}
void display()
{
    printf("i am display\n");    //Function defination
    
}
/* void for sub function means it will not take or return any value to subfuncrion
prototype ends with semecolon
A sub function may also also call anothersub function and when a sub function
calll it self it called recursion  */