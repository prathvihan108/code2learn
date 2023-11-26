# include <stdio.h>
int main()
{
    int radius,height;
    int a=2;
    
    printf("enter radius of cylinder\n");
    scanf("%d",&radius);
    printf("enter height of cylinder\n");
    scanf("%d",&height);
    float volume=(2*3.14*radius*height);
    printf("volume of cylinder=%f\t",volume);

    return 0; 


}