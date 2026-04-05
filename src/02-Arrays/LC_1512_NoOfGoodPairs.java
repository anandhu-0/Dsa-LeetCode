public class LC_1512_NoOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int goodpair = 0;
        for(int i = 0;i< nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[i]==nums[j] && i < j) goodpair++;
            }
        }
        return goodpair;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = LC_1512_NoOfGoodPairs.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}