//While passing 2d arrays to functions we actually pass row pointers to functions
//ROw adress in 2d array is same as adress of its 1st element
//


# include<iostream>

using namespace std;

void pass_2d_array_method1(int a[][20]);
void pass_2d_array_method2(int (*ptr)[20]);//here "(*ptr)[20]" is pointer to an array of 20 elements(i.e (note:20 is column size of 2d array))
                                                //And if we do ptr+1 it will point to  next row
int main()
{

    int arr[20][20]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
    int r,c;

    cout<<"Method 1\n";
    pass_2d_array_method1(arr);   //here arr is actually pointer to 1st row 
                                   //so similarly arr+1 is adress of next row
    cout<<"\nMethod 2\n";


     pass_2d_array_method2(arr);
    
    
}


void pass_2d_array_method1(int a[][20])//it is capable of storing adress of any passed row
{
    int i=2,j=2;//WE are not passing row and col size so we initilise here  only
    cout<<a[i][j]<<"\n";//prints element at a[i][j]
    cout<<(*(*(a+i)+j))<<"\n"; //a is adress of row 1st(zeroth) row //a+i is adress of i th row
}

void pass_2d_array_method2(int (*ptr)[20])//ptr is storing adress of 1st row(same as adress of 1st element)
{                                          //*ptr gives adress of 1 element of 1st row(1 means zero wrt arry)
                                           //similarlt "*(ptr+i)" is adress of 1st element of i th row and +j will iterate through columns
    int i=2,j=2;
    cout<<ptr[i][j]<<"\n";                          //And now if we deference again it will give element at that location
    cout<<(*(*(ptr+i)+j))<<"\n";    
}
