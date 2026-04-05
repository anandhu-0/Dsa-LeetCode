
import java.util.Scanner;

public class LC_1929_ConcatnenationOfArray {

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
    }
}