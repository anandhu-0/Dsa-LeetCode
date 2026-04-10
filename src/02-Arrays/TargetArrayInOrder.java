/*
Problem: Create Target Array in the Given Order

Intuition:
    We need to create an array where each element from `nums` is inserted at the position specified by the corresponding element in `index`.

Approach:
    Initialize an empty ArrayList to store the target array.
    Iterate through the `nums` and `index` arrays simultaneously.
    Insert each element from `nums` at the position specified by `index`.
    Convert the ArrayList to an array and return it.

Time Complexity: O(n^2) - In the worst case, inserting an element at a specific position in an ArrayList takes O(n) time, and we do this for each element.
Space Complexity: O(n) - We are using an ArrayList to store the target array.
*/
import java.util.ArrayList;

public class TargetArrayInOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++) list.add(index[i],nums[i]);
        for(int i =0;i<list.size();i++) target[i]=list.get(i);

        return target;
    }
    public static void main(String[] args) {
        TargetArrayInOrder obj = new TargetArrayInOrder();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = obj.createTargetArray(nums, index);
        for(int x : ans) System.out.print(x+" ");
    }  
    
}
