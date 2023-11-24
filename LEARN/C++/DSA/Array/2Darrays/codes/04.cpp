//3%4 =3,4%4=0
//binary_search_of_2d_array//2d array is again a stored inlinear format so not much complex logic
//works for sorted aray only
# include<iostream>
#include<algorithm>

# include<vector>

using namespace std;



pair<int,int> binary_search_of_2d_array(vector<vector<int>> &v,int key)
{     

    pair <int,int> position; //Creating a variable of type pair
    int low=0;
    int high=(v[0].size() * v.size())-1; //points to last element loacation of 2d array

    int mid=(low+high)/2; //this works fine if it was only 1d array,so for 2d array we need tp find ralation between positions of 1d and 2d array
    int mid_2d=v[(mid)/v[0].size()][(mid)%v[0].size()];//Siple logic to of relation of 2d positions to 1d

    while(low<=high)
    {
        if(mid_2d==key)
        {   
            
           position.first= (mid)/v[0].size(); //row
           position.second=(mid)%v[0].size() ;//column

            return position;
        }
        if(mid_2d>key)
        {
            high=mid-1;//here mid not mid_2d
        }
        else{
            low=mid+1;
        }
       
        mid=(low+high)/2;
        
        mid_2d=v[(mid)/v[0].size()][(mid)%v[0].size()];



    }
    return make_pair(-1,-1) ;
    


}


 int main()
{
    int k;
  vector<vector<int>> vec={  {1,2,3,4},
                             {5,6,7,8},
                             {9,10,11,12},
                             {13,14,15,16},
                             
                            };
                            cout<<"Enter a key eleemnt\n";
                            cin>>k;
   pair<int,int> ans= binary_search_of_2d_array(vec,k);
  //  cout<<ans<<endl;
   cout << "Row: " << ans.first << ", Column: " << ans.second << endl;
   return 0;
}