//Rotate matrix by 90
#include <iostream>
# include<algorithm>
#include <vector>

using namespace std;

void rotateMatrixBy90(vector<vector<int>>& matrix,int rows,int cols) {
  

    // Transpose the matrix//thistype of transpose id applicable only for square matrix:since rows = cols
    for (int i = 0; i < rows; i++) {
        for (int j =i+1; j <cols; j++) { //u can write any thing since rows=cols
            swap(matrix[i][j], matrix[j][i]);
        }
    }

    // Reverse each row
    for (int i = 0; i < rows; i++) {
        reverse(matrix[i].begin(), matrix[i].end());
    }
}

void printMatrix(const vector<vector<int>>& matrix) {
    int n = matrix.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<vector<int>> matrix = { {1, 2, 3},
                                   {4, 5, 6},
                                   {7, 8, 9} };

    cout << "Original Matrix:\n";
    printMatrix(matrix);

    rotateMatrixBy90(matrix,3,3);

    cout << "\nMatrix after 90 degree rotation:\n";
    printMatrix(matrix);

    return 0;
}
