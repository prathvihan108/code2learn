#include <iostream>
#include <vector>
# include<algorithm>

using namespace std;

void rotateMatrixBy90(vector<vector<int>>& matrix,int rows,int cols) {
   

    // Transpose the matrix
    for (int i = 0; i < rows; i++) {
        for (int j = i + 1; j < cols; j++) {
            swap(matrix[i][j], matrix[j][i]);
        }
    }

    // Reverse each row
    for (int i = 0; i < rows; i++) {
        reverse(matrix[i].begin(), matrix[i].end());
    }
}

void printMatrix(const vector<vector<int>>& matrix,int rows,int cols) {
    int n = matrix.size();
    for (int i = 0; i < rows; i++) {
        for (int j = i+1; j <cols; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<vector<int>> matrix = { {1, 2, 3,30},
                                   {4, 5, 6,60},
                                   {7, 8, 9,90} };

    cout << "Original Matrix:\n";
    printMatrix(matrix,3,4);

    rotateMatrixBy90(matrix,3,4);

    cout << "\nMatrix after 90 degree rotation:\n";
    printMatrix(matrix,3,4);

    return 0;
}
