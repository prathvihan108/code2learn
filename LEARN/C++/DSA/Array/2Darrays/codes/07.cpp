//Transpose of rectangular matrix

#include <iostream>
#include <vector>

using namespace std;

vector<vector<int>> transposeMatrix(const vector<vector<int>>& matrix) {
    int rows = matrix.size();
    int columns = matrix[0].size();

    // Create a new matrix with dimensions columns x rows
    vector<vector<int>> transposed(columns, vector<int>(rows));

    // Fill the transposed matrix with elements from the original matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            transposed[j][i] = matrix[i][j];
        }
    }

    return transposed;
}

void printMatrix(const vector<vector<int>>& matrix) {
    int rows = matrix.size();
    int columns = matrix[0].size();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<vector<int>> matrix = { {1, 2, 3},
                                   {4, 5, 6} };

    cout << "Original Matrix:\n";
    printMatrix(matrix);

    vector<vector<int>> transposedMatrix = transposeMatrix(matrix);

    cout << "\nTransposed Matrix:\n";
    printMatrix(transposedMatrix);

    return 0;
}
