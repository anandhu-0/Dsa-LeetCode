/*
Problem: Smaller Numbers Than Current

Intuition:
    For each element, count how many elements are smaller than it.

Approach:
    Initialize an array `ans` to store the results.
    For each element in `nums`, iterate through all elements and count those that are smaller.
    Store the count in the corresponding position in `ans`.
    Return the `ans` array.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
import java.util.Arrays;


public class SmallerNumbersThanCurrent{
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = 0;j < nums.length;j++){
                    if(nums[j] < nums[i] && j!=i) count++;
            }
            ans[i] = count;
        } 
        return ans;  
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.print(Arrays.toString(ans));
    }
}