/*
problem : Maximum Subarray

intuition:
    We need to find the contiguous subarray that has the largest sum.

approach:
    We can use Kadane's algorithm, which is an efficient way to solve this problem in O(n) time.
    We iterate through the array, keeping track of the current sum of the subarray and the maximum sum found so far.
    If the current sum becomes negative, we reset it to zero, as a negative sum would not contribute to a maximum sum in future iterations.

time complexity: O(n) since we traverse the array once.
space complexity: O(1) since we only use a constant amount of extra space to store the current sum and maximum sum.
*/
public class MaximumSubArray {
    public static  int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currntsum = 0;
        for(int num : nums){
            currntsum+=num;
            max=Math.max(currntsum,max);

            if(currntsum<0) currntsum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
    
}
