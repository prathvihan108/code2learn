//Square root of number using binary search 
//time complexity: O(logn)
//Always take an example of number to remember the logic

# include<iostream>
using namespace std;

int sqrt (int n)//This function gives sqroot of perfect squrares only
{
    int low=0;
    int high=n;
   int  ans=-1;
    
    int   mid=(low+high)/2;
   while(low<=high)
    {
     
        int sqroot = mid*mid;  //Dont forget to put these in side the loop
     
     //logic
      if(sqroot==n)
      {
        return mid;
      }
      if(sqroot<n)
      {
        ans=mid; //store the ans if mid*mid is less than n,becox it may be the ans
        low=mid+1;
      }
      else 
      {
        high =mid-1;
      }
         mid=(low+high)/2;
    }
    return ans;
}


double precised (int n,int precision,int temp_sol)
{   double factor=1; //Must be in double type
    double ans=temp_sol;

    for(int i=0;i<precision;i++)  //Only controls precision 
    {
         factor=factor/10;
     
        
         for(double j=ans;j*j<n;j=j+factor)
         {
            ans=j;

         }
    }
    return ans;
}


 int main()
{
    int n;
    int integer_ans;
    cout<<"Enter  a number \n";
    cin>>n;

    integer_ans=sqrt(n);
   
    cout<<"Sqroot of given number is :\n"<<integer_ans<<endl;
     double ans_1=precised(n,7,integer_ans);
   cout<<"Sqroot of given number in precised form  is :"<<ans_1<<endl;

    return 0;
}