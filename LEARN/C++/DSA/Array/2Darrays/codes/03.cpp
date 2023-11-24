//Spiral print

# include<iostream>
# include<vector>

using namespace std;



void SpiralPrint(vector<vector<int>> &v)
{
    int StartingRow=0;
    int StartingCol=0;
    int  EndingCol= v[0].size() -1; //nothing but no_col -1
    int EndingRow =v.size()-1;//nothing but no_rows -1


    int total=v[0].size() * v.size(); //gives total elements
    int count=0;
    while(count<total)
    {     //printing starting row
        for(int i=StartingCol;i<=EndingCol && total>count;i++)
        {
          cout<<v[StartingRow][i]<<" "; //Be carefull here
     
          count++;
         
        }
             StartingRow++;
          //PRINTING ending column
        for(int i=StartingRow;i<=EndingRow &&  total>count;i++)
        {
         cout << v[i][EndingCol] << " ";  //Becarefull here
         
            count++;
     
        }
         EndingCol--;
        //Printing ending row
       for(int i=EndingCol;i>=StartingCol &&  total>count;i--)
        {
          cout<<v[EndingRow][i]<<" ";
          
            count++;
        
        }
        EndingRow--;
        //printing starting col
        for(int i=EndingRow;i>=StartingRow &&  total>count;i--)
        {
            cout << v[i][StartingCol] << " ";
       
            count++;
          
        }
           StartingCol++;
    }

}


 int main()
{
  vector<vector<int>> vec={  {01,02,03,04},
                             {05,06,07,8},
                             {9,10,11,12},
                             {13,14,15,16},
                             
                            };
     SpiralPrint(vec);


    return 0;
}