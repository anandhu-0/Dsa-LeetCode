/*
Problem: Number of Good Pairs

Intuition:
    We need to count the number of pairs (i, j) such that nums[i] == nums[j] and i < j.

Approach:
    We can use a nested loop to compare each pair of elements in the array.
    For each pair, if the elements are equal and the first index is less than the second index, we increment our count of good pairs.

Time Complexity: O(n^2) - We compare each pair of elements in the array.
Space Complexity: O(1) - We use a constant amount of space to store the count of good pairs.
 */
public class NoOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int goodpair = 0;
        for(int i = 0;i< nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[i]==nums[j] && i < j) goodpair++;
            }
        }
        return goodpair;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = NoOfGoodPairs.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}