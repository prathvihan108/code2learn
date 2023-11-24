# include<stdio.h>
void swap(int *a, int *b);
int main()
{
    int x=3,y=7;
    printf("a,b before swaping %d,%d\n",x,y);
    swap(&x,&y);                                 //adress of x,y is copied to a,b
    printf("a,b after swaping %d,%d\n",x,y);
    return 0;
}
void swap(int *a, int *b)
{
   // printf("%u\n",a);
int temp;
temp=*a;           //value of adress 'a' i.e 3 is transferred to temp
*a=*b;                //value of adress 'b' i.e 7 is transferred to adress 'a' 
*b=temp;               //value of 'temp' is transferred to adress 'b'
}         
            
            /* call by reference 
            Here adress of variables is passed to the function as arguments
            the function can now modify the value of a variable in calling function using * ans & 
             operators as shown in above example  */
            


