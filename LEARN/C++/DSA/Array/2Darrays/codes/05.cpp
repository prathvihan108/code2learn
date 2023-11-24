//if a 2d array is sorted row vise and also sorted column vise,then search a element in 2d array
#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

pair<int, int> Search_sorted_2d_array(vector<vector<int>>& v, int key)
{     
    pair<int, int> position; // Creating a variable of type pair

    int row = v.size();
    int col =  v[0].size(); 
    //We are starting from right top end of matrix so that we can cover all elements
    
    int row_index=0; //points to the first row
    int col_index=v[0].size() - 1 ;// Points to the last last column
    while (row_index<row && col_index>=0)
    {
      

        if (v[row_index][col_index] == key)
        {
            position.first=row_index;
            position.second=col_index;
            return position;
        }
        
        else if(v[row_index][col_index] > key)//in case key eleemnt is less than currrent element then it means the key element does not exist downside the col 
        {
                col_index--;
        }
        else //in case keyeleemnt is greater than current element ,than do ro++
        {
           row_index++;
        }
    }

    return make_pair(-1, -1);
}

int main()
{
    int k;
    vector<vector<int>> vec = { {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}
                              };

    cout << "Enter the key element: ";
    cin >> k;

    pair<int, int> ans = Search_sorted_2d_array(vec, k);
   
    cout << "Row: " << ans.first << ", Column: " << ans.second << endl;

    return 0;
}
