import java.util.ArrayList;

public class LC_1389_TargetArrayInOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++) list.add(index[i],nums[i]);
        for(int i =0;i<list.size();i++) target[i]=list.get(i);

        return target;
    }
    public static void main(String[] args) {
        LC_1389_TargetArrayInOrder obj = new LC_1389_TargetArrayInOrder();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = obj.createTargetArray(nums, index);
        for(int x : ans) System.out.print(x+" ");
    }  
    
}
