#include <iostream>
#include <vector>
# include<iostream>

using namespace std;

// Function to calculate the sum of each row in a 2D matrix
    vector<int> sumOfRows(const vector<std::vector<int>>& matrix) {
    std::vector<int> rowSums;

    for (const auto& row : matrix) {  //row ieratot will move from one row to another row //simply it it iterator for outer vector
        int sum = 0;
        for (int num : row) {  //num iterator will move from one element to another element in each row
            sum += num;
        }
        rowSums.push_back(sum);
    }

    return rowSums;
}

int main() {
    // Example 2D matrix
   vector<vector<int>> matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //Way we declare 2d matrix in vector

    // Calculate the sum of each row
    std::vector<int> rowSums = sumOfRows(matrix);  //catcher must be of vector type

    // Display the results
    std::cout << "Sum of rows:\n";
    for (int i = 0; i < rowSums.size(); ++i) {
        std::cout << "Row " << i + 1 << ": " << rowSums[i] << std::endl;
    }

    return 0;
}
