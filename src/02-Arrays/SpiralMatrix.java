/*
problem: Spiral Matrix

intuition:
    We need to traverse the matrix in a spiral order, starting from the top-left corner and moving right, down, left, and up until we have visited all the elements.

approach:
    1. We can use four pointers to keep track of the boundaries of the matrix: top, bottom, left, and right.
    2. We will use a while loop that continues until the top pointer is less than or equal to the bottom pointer and the left pointer is less than or equal to the right pointer.
    3. Inside the loop, we will traverse from left to right along the top row, then move the top pointer down. Next, we will traverse from top to bottom along the right column, then move the right pointer left
    4. If there are still rows to traverse, we will traverse from right to left along the bottom row, then move the bottom pointer up. Finally, if there are still columns to traverse, we will traverse from bottom to top along the left column, then move the left pointer right.
    5. We will add the elements to a result list as we traverse the matrix. 

time complexity: O(m*n) since we need to visit each element of the matrix once.
space complexity: O(m*n) since we are storing all the elements of the matrix in a result list.
*/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
     public  static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0;  //top row
        int bottom =  matrix.length-1;  ///bottom row
        int left = 0;  // left column
        int right = matrix[0].length-1;  // rigth coloumn
        while(top <= bottom && left <= right){
            for(int i = left;i <= right;i++ ){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i <= bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                 for(int  i = right;i >= left;i--){
                    res.add(matrix[bottom][i]);
                 }
                bottom--;
            }
            if(left <= right){
                 for(int i = bottom;i >= top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
           
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }
}
