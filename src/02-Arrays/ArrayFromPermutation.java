/*
Prroblem: Build Array from permutation.

intution: 
    We need to create an array where each element at index i is the value at the index specified by the element at i in the input array.

Approach:
    We can iterate through the input array and for each element, use its value as an index to access the corresponding element in the input array and store it in the result array.

Time Complexity: O(n) - We iterate through the array once.
Space Complexity: O(n) - We use an additional array to store the result.
*/
import java.util.Scanner;

public class ArrayFromPermutation {

    public static  int[] buildArray(int[] nums){

        int[] ans = new int[nums.length];

        for(int i =0;i < nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = buildArray(nums);
        for(int a : ans) System.out.print(a + " ");
        in.close();
    }
}