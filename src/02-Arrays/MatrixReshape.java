/*
problem : Reshape the Matrix

intuition:
    We are given a 2D array (matrix) and we need to reshape it into a new matrix with specified dimensions (r x c). The reshaping should be done in a row-wise manner, meaning that the elements should be filled in the new matrix from left to right and top to bottom.

approach:
    1. First, we need to check if the total number of elements in the original matrix (m x n) is equal to the total number of elements in the new matrix (r x c). If they are not equal, we cannot reshape the matrix and we should return the original matrix.
    2. If the total number of elements is the same, we can proceed with reshaping the matrix. We can use a single loop that iterates through all the elements of the original matrix and fills the new matrix accordingly.
    3. We can calculate the position in the new matrix using the index of the current element in the original matrix. The row index in the new matrix can be calculated as i / c and the column index can be calculated as i % c, where i is the index of the current element in the original matrix.

time complexity: O(m*n) since we need to iterate through all the elements of the original matrix.
space complexity: O(r*c) since we are creating a new matrix to store the reshaped values.

*/

import java.util.Arrays;

public class MatrixReshape {
      public static  int[][] matrixReshape(int[][] mat, int r, int c) {
       
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c) return mat;
        int[][] mat2 = new int[r][c];
        for(int i = 0;i<m*n;i++){
            mat2[i/c][i%c] = mat[i/n][i%n];
        }
        return mat2;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
