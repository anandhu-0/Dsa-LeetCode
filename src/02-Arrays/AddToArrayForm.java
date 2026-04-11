/*
Problem : Add to Array-Form of Integer

Intuition:
    We need to add an integer k to a number represented as an array of digits.

Approach:
    Start from the last digit of the array and add k to it.
    Handle the carry if the sum exceeds 9.
    Continue this process until all digits are processed and k becomes 0.
    Reverse the result list to get the final answer.

Time Complexity: O(n) [log k is ignored because its limit is 1 <= k <= 10^4]
Space Complexity: O(n)
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
     public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}
