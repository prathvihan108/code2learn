# include<iostream>
# include<vector>

using namespace std;

 int main()
{
vector <int > a(5,1);//initilises all elements of vector with 1
for(int i: a)
{
    cout<<a[i]<<endl;
}
    return 0;
}