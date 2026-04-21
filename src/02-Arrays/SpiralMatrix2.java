/*
problem: Spiral Matrix II

intuition:
    We need to generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

approach:   
    1. We can use a similar approach to the Spiral Matrix problem, where we maintain four pointers to keep track of the boundaries of the matrix: top, bottom, left, and right.
    2. We will use a while loop that continues until the top pointer is less than or equal to the bottom pointer and the left pointer is less than or equal to the right pointer.
    3. Inside the loop, we will fill the top row from left to right, then move the top pointer down. Next, we will fill the right column from top to bottom, then move the right pointer left.
    4. If there are still rows to fill, we will fill the bottom row from right to left, then move the bottom pointer up. Finally, if there are still columns to fill, we will fill the left column from bottom to top, then move the left pointer right.
    5. We will keep track of the current value being filled in the matrix and increment it as we fill each cell.

time complexity: O(n^2) since we need to fill n^2 elements in the matrix.
space complexity: O(n^2) since we are creating a new n x n matrix to store the values.
*/

public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left= 0;
        int right = n-1;
        int top = 0;
        int bottom = n -1;
        int value= 1;
        while(top <= bottom && left <= right){

            for(int i = left;i <= right;i++){
                mat[top][i] = value++;
            }
            top++;
            for(int i = top;i <= bottom;i++){
                mat[i][right] = value++;
            }
            right--;
            if(left <= right){
                for(int i= right; i>=left;i--){
                    mat[bottom][i] = value++;  
                }
                bottom--;
            }
            if(top<=bottom){
                for(int i = bottom; i >= top;i--){
                    mat[i][left] = value++;
                }
                left++;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(n);
        for(int[] a:ans){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}
