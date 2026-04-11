/*
Problem: Cells with Odd Values in a Matrix

Intuition:
    We need to determine how many cells in an m x n matrix have odd values after performing a series of increment operations based on the given indices.

Approach:
    Create two arrays, row and col, to keep track of the number of increments for each row and column.
    Iterate through the indices and increment the corresponding row and column counts.
    After processing all indices, iterate through each cell in the matrix and check if the sum of the corresponding row and column increments is odd.
    If it is odd, increment the count of odd-valued cells.
    Return the total count of odd-valued cells.
Time Complexity: O(m*n + k) - We need to check each cell in the matrix after processing the indices, where k is the number of indices.
Space Complexity: O(m + n) - We use two additional arrays to keep track of row
*/
public class OddValuedCells {
    public static int oddCells(int m, int n, int[][] indices) {
        int oddvalues=0;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] a : indices){
            row[a[0]]++;
            col[a[1]]++;
        }
         for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if((row[r]+col[c])%2!=0) oddvalues++;
            }
        }
        return oddvalues;
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};

        int result = oddCells(m, n, indices);
        System.out.println("Number of odd-valued cells: " + result);
    }
}
