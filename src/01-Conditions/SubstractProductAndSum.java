/*
Problem:Subtract the Product and Sum of Digits of an Integer

Intuition:
Break the number into digits and track sum and product.

Approach:
- Initialize sum = 0, product = 1
- Extract each digit using n % 10
- Update sum and product
- Remove digit using n /= 10
- Return product - sum

Time Complexity: O(log n)
Space Complexity: O(1)
*/


import java.util.Scanner;



public class SubstractProductAndSum {
    
    public static int subtractProductAndSum(int n) {
        int sdigit = 0;
        int pdigit = 1;
        while (n > 0) {
            int digit = n % 10;
            sdigit += digit;
            pdigit *= digit;
            n /= 10;
        }
        return pdigit - sdigit;
    }
    
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("The result is: " + result); 
        scanner.close();
    }
}
