public class LC_1672_RichestCustomerWealth {

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
