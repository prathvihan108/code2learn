//capacity of vector doubles when it fills

# include<iostream>
# include<vector>
using namespace std;

 int main()
{
    vector<int> v;
    cout<<"For zero elements  Capacity is "<<v.capacity()<<endl;
    v.push_back(1);
    cout<<"For one element Capacity is "<<v.capacity()<<endl;
    v.push_back(2);
    cout<<"For two elements Capacity is "<<v.capacity()<<endl;
    v.push_back(3);
    cout<<" For three elements Capacity is "<<v.capacity()<<endl;//now capacity will be 4 

    cout<<"Total element that is Size"<<v.size()<<endl; //Print how many number of element are presentin a vector

    cout<<"Element at 2nd pos"<<v.at(2)<<endl;
       cout<<"Front element "<<v.front()<<endl;
        cout<<"Last element "<<v.back()<<endl;

        

    return 0;
}