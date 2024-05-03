//Binary search in 2d matrix.

//Given matrix is sorted row vice and col vice


//matrix can be m*m or m*n works fine for both
//logic is elemination of rows or cols
//the searching starts from the topriight end element and 

//if target==ele; return indices
//if target>ele ;do row++  since it can not lie beside also becoz array is sorted in ascending order
//else  col--; 
import java.util.Arrays;

public class J04 {
    public static void main(String[] args) {

        int[][] arr=new int[][]{
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49}//note thta this arryas is not completely sorted only row and col wise sorted
            
        };

        int[] ans=search(arr, 8);
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] search(int arr[][] ,int target)
    {
        int row=0;//lower bond
        int col=arr.length-1;//upper bond

        while(row<=arr.length && col>=0) //row pointer moves from oth row to all rows,and col pointer moves from n-1 th col to 0 th col
        {
            if(arr[row][col]==target)
            {
                return new int[]{row,col};
            }
            else if(target>arr[row][col])
            {
                row++;


            }
            else
            {
                col--;
            }

        }
        return new int[]{-1,-1};

    }
}
