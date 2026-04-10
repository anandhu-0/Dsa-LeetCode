/*
Problem: Concatenation of Array.

Intuition: 
    We need to create a new array that consists of the original array followed by itself.

Approach:
    We can initialize a new array of size 2*n, where n is the length of the input array.
    Then we can iterate through the new array and fill it with elements from the original array.
    For indices less than n, we take elements from the original array directly, and for indices greater than or equal to n, we take elements from the original array using modulo operation.

Time Complexity: O(n) - We iterate through the array once.
Space Complexity: O(n) - We use an additional array to store the result.
*/
import java.util.Scanner;

public class ConcatnenationOfArray {

     public  static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for(int i = 0;i < ans.length;i++){
           ans[i] = i <= nums.length -1 ? nums[i] : nums[i-nums.length];
             
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = getConcatenation(nums);
        for(int a : ans) System.out.print(a + " ");
        in.close();
    }
}