/*
problem : Two Sum

intuition:
    We are given an array of integers and a target value. We need to find the indices of the two numbers in the array that add up to the target.

approach:
    We can use a HashMap to store the numbers we have seen so far and their corresponding indices.
    For each number in the array, we calculate its complement (target - current number) and check if it exists in the HashMap.
    If it does, we have found our two numbers and can return their indices.
    If it doesn't, we add the current number and its index to the HashMap and continue checking.

time complexity: O(n) since we traverse the array once.
space complexity: O(n) in the worst case if all numbers are unique and we store them in the HashMap.
*/

import java.util.HashMap;

public class TwoSum {
    public static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(num.containsKey(complement)){
                return new int[] {num.get(complement),i};
            }
            num.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
