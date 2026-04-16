/*
Problem: Remove Duplicates from Sorted Array

Intuition:
    Since the array is sorted, duplicate elements will always be adjacent.
    We can keep only unique elements by overwriting duplicates in-place.

Approach:
    Use a pointer (index) to track the position of the next unique element.
    Traverse the array starting from the second element.
    Compare each element with its previous one.
    If they are different, place the element at the current index and increment index.
    Ignore duplicates as they are already covered.

Time Complexity: O(n) where n is the number of elements in the array.
Space Complexity: O(1) - In-place modification, no extra space used.
*/


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        int index = 1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        int k = removeDuplicates(nums);
        for(int i=0;i<k;i++) System.out.print(nums[i] + " ");
    }
}
