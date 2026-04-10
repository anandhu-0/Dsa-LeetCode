/*
Problem: Shuffle Array

Intuition:
    We need to rearrange the elements of the array such that elements at even indices are from the first half and elements at odd indices are from the second half.

Approach:
    Initialize two pointers, one for the first half (`a`) and one for the second half (`b`).
    Iterate through the array and place elements alternately from both halves.
    Return the shuffled array.

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {

    static int[] shuffle(int[] nums, int n) {
        int a = 0;
        int b = n;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = i % 2 == 0 ? nums[a++] : nums[b++];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();

        int[] nums = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int[] ans = shuffle(nums, n);

        System.out.print(Arrays.toString(ans));
        in.close();
    }
}
