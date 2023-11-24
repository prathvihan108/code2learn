/*     
       for(i=0;i<n;i++):&:for(i=1;i<=n;i++) >>>>loop runs n times and condition is checked n+1 times;
       for(i=0;i<=n;i++):for(i=1;i<n;i++)>>loop runs n+1 times and condition is checked n+2 times;
       for(i=1;i<n;i++)>>loop runs n-1 times and condition is checked n times;



*/




# include<stdio.h>
# include<cmath>
# include<iostream>
using namespace std;

int main()

{

    int n,i;
    float sum,mean,var,sd;
    float *ptr,arr[40];
    cout<<"Enter the how many elements \n";
    cin>>n;
    printf("Enter %d real numberes",n);

    ptr=arr;
    
    for(i=0;i<n;i++)
    {
        scanf("%f",ptr);
        ptr++;
    }

   // ptr=arr;
    sum=mean=var=sd=0.00;
    for(i=0;i<n;i++)
    {
        sum=sum+(*ptr);
       // ptr++;
        ptr--;

    }
    //ptr =arr;
    mean=sum/n;

    for(i=0;i<n;i++)
    {
        var=var+pow((*ptr-mean),2);
        ptr++;
       
    }
    var=var/n;


    sd=sqrt(var);
    cout<<"The sum of numbers is:               "<<sum<<endl;
    cout<<"The mean of numbers is:          "<<mean<<endl;
    cout<<"The var of numbers is:       " <<var<<endl;
     cout<<"The sd of numbers is:   "<<sd<<endl;


    return 0;
}
/*
>>indetation is considered only inside the double codes in cout
*/