
import java.util.Scanner;



public class LC_1281_SubstractProductAndSum {
    
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
