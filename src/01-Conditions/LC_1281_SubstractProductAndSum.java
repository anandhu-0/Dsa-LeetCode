
import java.util.Scanner;



public class LC_1281_SubstractProductAndSum {
    
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("The result is: " + result); // Output: 15
    }
}
