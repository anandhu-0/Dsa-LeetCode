
import java.util.Scanner;

public class LC_1480_RunningSumOfArray {
        public  static int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];
        for(int i =1;i < nums.length;i++){
            runningsum[i]=nums[i] + runningsum[i-1];
            
        }
        return runningsum;
        
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : "); 
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i =0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = runningSum(nums);
        for(int a : ans) System.out.print(a + " ");

    }
}

