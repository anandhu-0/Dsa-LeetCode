/*
problem: Determine Whether Matrix Can Be Obtained By Rotation

intuition:
    We are given two n x n binary matrices, mat and target. We need to determine if we can rotate mat in 90-degree increments to match target.

approach:
    We can check all four possible rotations (0, 90, 180, and 270 degrees) of mat against target.
    We can use bitwise operations to keep track of which rotations are still valid as we compare each element of mat with the corresponding element in target.  

time complexity: O(n^2) since we need to compare each element of the matrices.
space complexity: O(1) since we are using a constant amount of extra space.
*/


public class RotatedMatrix {
        public static  boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = 0b1111;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(target[row][col]!=mat[row][col]) m &= 0b1110;
                if(target[row][col]!=mat[col][n-1-row]) m &= 0b1101;
                if(target[row][col]!=mat[n-1-row][n-1-col]) m &= 0b1011;
                if(target[row][col]!=mat[n-1-col][row]) m &= 0b0111;
            }    
        }
        if(m==0) return false;
        return true;
    }
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }
}
