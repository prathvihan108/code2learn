//Total number of occurances of a eleemnt
//Given by : last occurance -first occurance

# include<iostream>
using namespace std;


int first_occurance_binary_search (int a[],int key,int size)
{   
    int pos1;
    int low=0;
    int high=size-1;
    int mid=low+(high-low)/2; //This type of expression is used to avoid integer overflow in some cases when arry is v.big
  //u could have simplify used mid=(low+hgh)/2 but if values are vary high it may exeed integer limts and misbahave
    while(low<=high)
    {
        if(key==a[mid])
        {
            
            pos1=mid;
            high=mid-1;  //Logic
                         //logic lies in ur thinking itself ,known need to think separately to code
        }
        else if(key<mid)
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
         mid=low+(high-low)/2;

    }
    return pos1;

}



int last_occurance_binary_search (int a[],int key,int size)
{   
    int pos2;
    int low=0;
    int high=size-1;
    int mid=low+(high-low)/2; //This type of expression is used to avoid integer overflow in some cases when arry is v.big
  //u could have simplify used mid=(low+hgh)/2 but if values are vary high it may exeed integer limts and misbahave
    while(low<=high)
    {
        if(key==a[mid])
        {
            
            pos2=mid;
            //Logic
             low=mid+1;           //logic lies in ur thinking itself ,known need to think separately to code
        }
        else if(key<mid)
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
         mid=low+(high-low)/2;

    }
    return pos2;

}

 int main()
{   int n,arr[60],key,pos1,pos2;
    cout<<"enter the size of array\n";
    cin>>n;
    cout<<"Enter elments in an array\n";

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }
    cout<<"Enter the key element \n";
    cin>>key;
   
   pos1=first_occurance_binary_search(arr,key,n);//call
   pos2=last_occurance_binary_search(arr,key,n);//call

   cout<<"Total number of occurances of an eleemnt :"<<pos2-pos1+1<<endl;

    return 0;
}