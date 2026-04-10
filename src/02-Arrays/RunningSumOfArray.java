/*
Problem: Running Sum of 1d Array

Intuition:
    We need to calculate the running sum of the array, which means each element at index `i` should be the sum of all elements from index `0` to `i`.

Approach:
    Initialize a new array `runningsum` of the same length as `nums`.
    Set the first element of `runningsum` to be the same as the first element of `nums`.
    Iterate through the `nums` array starting from index `1`, and for each index `i`, set `runningsum[i]` to be the sum of `nums[i]` and `runningsum[i-1]`.
    Return the `runningsum` array.    

Time Complexity: O(n) - We iterate through the array once.
Space Complexity: O(n) - We use an additional array to store the running sums.
 */
import java.util.Scanner;

public class RunningSumOfArray {
        public  static int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];
        for(int i =1;i < nums.length;i++){
            runningsum[i]=nums[i] + runningsum[i-1];
            
        }
        return runningsum;
        
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : "); 
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i =0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = runningSum(nums);
        for(int a : ans) System.out.print(a + " ");

        in.close();
    }
}

