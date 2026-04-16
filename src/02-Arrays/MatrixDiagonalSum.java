/*
problem : Matrix Diagonal Sum

intuition:
    We need to calculate the sum of the primary diagonal and the secondary diagonal of the matrix. If the matrix has an odd dimension, we need to subtract the middle element once since it is counted in both diagonals.

approach:
    1. Initialize a variable to store the sum of the diagonals. 
    2. Iterate through the matrix using a loop, adding the elements of the primary diagonal (mat[i][i]) and the secondary diagonal (mat[i][n-1-i]) to the sum.
    3. If the matrix has an odd dimension, subtract the middle element (mat[n/2][n/2]) from the sum to avoid double counting.

time complexity: O(n) - We need to iterate through the matrix once to calculate the sum of the diagonals.
space complexity: O(1) - We are using a constant amount of space to store the sum and a few variables for iteration.    

*/


public class MatrixDiagonalSum {
     public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int row=0;row<mat.length;row++){   
            sum+=mat[row][row];
            sum+=mat[row][mat.length-row-1];
        }
        if(mat.length%2!=0) sum-=mat[mat.length/2][mat.length/2];
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = diagonalSum(mat);
        System.out.println("Diagonal sum: " + result);
    }
}
