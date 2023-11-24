#include <iostream>
#include <vector>

void printInWaveFormat(const std::vector<std::vector<int>>& matrix) {
    for (int i = 0; i < matrix.size(); i++) { //Matrix.size() will give u the no of rows in 2d vector(i.e related to outer vector)
        // For even rows, print elements from left to right
        //we can also use num & 1 concept to find out wether a number is odd or even
        if (i % 2 == 0) {
            for (int j = 0; j < matrix[i].size(); j++) { //matrix[i].size will give u no if cols(i.e related to  inner vector)
                std::cout << matrix[i][j] << " ";
            }
        }
        // For odd rows, print elements from right to left
        else {
            for (int j = matrix[i].size() - 1; j >= 0; j--) {
                std::cout << matrix[i][j] << " ";
            }
        }
    }
}

int main() {
    std::vector<std::vector<int>> matrix = {  //this is how u prepara a 2d vector
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20}
    };

    std::cout << "Wave Format:\n";
    printInWaveFormat(matrix);

    return 0;
}
