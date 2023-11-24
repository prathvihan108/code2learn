# include<iostream>
# include<vector>
using namespace std;

 int main()
{
    vector<int> v={1,2,3,4};
    cout<<v.capacity()<<endl;
    v.push_back(3);
    cout<<v.capacity()<<endl;

    cout<<"Before pop"<<endl;

     for(int i:v)
     {
        cout<<i<<" ";
     }cout<<endl;

     v.pop_back();//removes the last element
    
    
      cout<<"After  pop"<<endl;

     for(int i:v)
     {
        cout<<i<<" ";
     }cout<<endl;
  
   cout<<"Before clear"<<endl;

     for(int i:v)
     {
        cout<<i<<" ";
     }cout<<endl;

    v.clear();//This function makes size of vector to zero not capacity of vector
    
     cout<<"After clear"<<endl;

     for(int i:v)
     {
        cout<<i<<" ";
     }cout<<endl;


    return 0;
}