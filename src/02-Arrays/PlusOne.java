/*
problem: Plus One

intuition:
    Increment the last digit by one and handle the carry-over if it exceeds 9.return the modified array.

Approach:
 1. Traverse the array from right to left (least significant digit).
 2. If the current digit is less than 9, increment it and return the array (no carry needed).
 3. If the digit is 9, set it to 0 and carry over to the next digit.
 4. If all digits are 9 (loop completes), create a new array of size n+1 with leading 1.
 5. Return the result.

time complexity: O(n) - In the worst case, we may need to traverse the entire array if all digits are 9.
space complexity: O(1) - We are modifying the input array in place, and only    
*/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,8};
        int[] ans = plusOne(digits);
        for(int a : ans) System.out.print(a + " ");
    }
}