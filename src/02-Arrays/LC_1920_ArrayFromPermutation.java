
import java.util.Scanner;

public class LC_1920_ArrayFromPermutation {

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