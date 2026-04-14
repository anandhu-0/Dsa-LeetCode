/*
problem:  Find N Unique Integers Sum up to Zero

intuition:
    We need to find n unique integers that sum up to zero.  

approach:
    We can use a simple approach where we generate n-1 unique integers and then calculate the nth integer as the negative sum of the first n-1 integers to ensure that the total sum is zero.
    For example, if n=5, we can generate the integers 1, 2, 3, and 4. The fifth integer would be -10 (the negative sum of 1, 2, 3, and 4) to ensure that the total sum is zero. 

time complexity: O(n) since we need to generate n integers.
space complexity: O(n) since we need to store n integers in the result list.
*/
import java.util.Arrays;
public class SumUpToZero {
     public int[] sumZero(int n) {
        int[] zarr = new int[n];
        int sum=0;
        for(int i =0;i<n-1;i++){
            zarr[i]=i+1;
            sum+=zarr[i];
        }
        zarr[n-1]=-(sum);
        return zarr;
    }
    public static void main(String[] args) {
        SumUpToZero solution = new SumUpToZero();
        int n = 5;
        int[] result = solution.sumZero(n);
        System.out.println( Arrays.toString(result));
    }
    
}
