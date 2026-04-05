import java.util.Arrays;
import java.util.Scanner;

public class LC_1470_ShuffleArray {

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
