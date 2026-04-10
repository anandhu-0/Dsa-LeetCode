/*
Problem: Richest Customer Wealth

Intuition:
    We need to calculate the total wealth of each customer and find the maximum wealth among them.

Approach:
    Iterate through each customer's accounts and sum up their wealth.
    Keep track of the maximum wealth encountered during the iteration.
    Return the maximum wealth after processing all customers.

Time Complexity: O(m*n) where m is the number of customers and n is the number of accounts per customer.        
Space Complexity: O(1) - We use a constant amount of space to store the maximum wealth.
 */
public class RichestCustomerWealth {

    public static  int maximumWealth(int[][] accounts) {
        
        int maxwealth = 0;
        for(int row = 0;row<accounts.length;row++){
            int currentwealth =0; 
            for(int col = 0;col < accounts[row].length;col++){
                currentwealth += accounts[row][col];

            }
            maxwealth = Math.max(currentwealth,maxwealth);
        }
        
        return maxwealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
        
    }
}
