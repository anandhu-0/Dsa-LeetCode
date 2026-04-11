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
