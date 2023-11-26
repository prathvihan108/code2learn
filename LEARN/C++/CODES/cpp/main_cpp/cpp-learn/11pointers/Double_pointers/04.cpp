//Two types of memory allocation;
//Dnamic memory allocation:takes place on heap((largre amount of memory)) at runtime:manually required
//Static mamory allocation: takes place on stack(small amount of memory) at compile time:atomatic memory allocation and deallocation

//note int* ptr=new int ---> takes total 8(memory allocated for pointer)+8(memory allocated for dynamic variable)=16 byytes in this casse
#include<iostream>
using namespace std;

int getSum(int *arr, int n) {

    int sum = 0;
    for(int i=0; i<n; i++) {
        sum += arr[i];
    } 
    return sum;
}

int main() {

    int n;
    cin >> n;
    
    //variable size array
    int* arr = new int[n];// note: *arr is pointer and has memory allocated on stack:
                            //but memory allocated for int[n] is on heap

    //takign inputn in aray
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    int ans = getSum(arr, n);

    cout << "answer is "<< ans << endl;

//case 1
    while(true) {
        int i = 5;
    }
    
//case 2// dangerous if u do not deallocate memory using delete key word or else program would crash
    while(true) {
        int* ptr = new int;//after each iteration of while loop pointer *ptr takes constant memory since memory is atomatically deallocated after each iteration,but int is allocated 4 bytes of separete memory every time which go on adding and program may crash if u do not deallocate memory
    }




    return 0;
}