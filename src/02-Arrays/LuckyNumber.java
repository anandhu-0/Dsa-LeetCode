/*
problem: Lucky Number in a Matrix

intuition:
    We need to find numbers that are the minimum in their row and the maximum in their column.

approach:
    We can iterate through each row of the matrix to find the minimum element and its column index.
    Then, we check if this minimum element is also the maximum in its column by comparing it with all other elements in that column.
    If it is, we add it to our list of lucky numbers.

time complexity: O(m*n) where m is the number of rows and n is the number of columns, since we need to check each element in the matrix.
space complexity: O(k) where k is the number of lucky numbers found, since we store them in a list.

*/
import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
     public static  List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNum = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int col_index=-1;
            for(int c=0;c<matrix[i].length;c++){
                if(matrix[i][c] < min){
                    min=matrix[i][c];
                    col_index=c;
                }
            }
            boolean isnum = true;
            for(int r=0;r<matrix.length;r++){
                if(matrix[r][col_index] > min){
                    isnum=false;
                }
            }
            if(isnum) luckyNum.add(min);
        }
        
        return luckyNum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        List<Integer> result = luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + result);
    }
}