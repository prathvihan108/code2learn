# include<stdio.h>
float main()
{
    int principle,time,rate;
    float result;
    printf("enter principle amount\n");
    scanf("%d",&principle);
    printf("enter rate of interest\n");
    scanf("%d",&rate);
    printf("enter time\n");
    scanf("%d",&time);
     
    printf("result=%f",(principle*time*rate)/100);
    return 0;


}