//Creating a 2d array using dunamic memory allocation
#include <iostream>
using namespace std;

int main() {

    int row;
    cin >> row;

    int col;
    cin >> col;

    //creating a 2D array//Try to imagine,for easy uderstanding of concepts
    int** arr = new int*[row];//arr is a pointer which points to the type int*
    for(int i=0; i<row; i++) {
        arr[i] = new int[col];//arr[i] is  pointer which points to first element of ith row
    }                               //to make it point to other elements ,we can make arr[i]+(1 or 2 or 3...)

    //taking input
    for(int i=0; i<row; i++) {
        for(int j=0; j<col; j++) {
            cin >> arr[i][j];
        }
    }

    //taking output
    cout << endl;
    for(int i=0; i<row; i++) {
        for(int j=0; j<col; j++) {
            cout << arr[i][j] << " ";
        } cout << endl;
    }


    //releasing memory //First release the memory of each row
    for(int i=0; i<row; i++) {
        delete [] arr[i];//syntax for delete
    }   

    delete []arr;//now release memory of main branch

    //how to create a 2D array dynamically
    //input/Output
    //memory free kaise karani hai 

    return 0;
}