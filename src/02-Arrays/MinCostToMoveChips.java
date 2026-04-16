
/*
problem : Minimum Cost to Move Chips to The Same Position

intuition:
    The cost to move a chip from an even position to another even position is 0, and the cost to move a chip from an odd position to another odd position is also 0. However, moving a chip from an even position to an odd position (or vice versa) costs 1. Therefore, the minimum cost will be the smaller count between chips at even positions and chips at odd positions.

approach:
    1. Count the number of chips at even positions and the number of chips at odd positions.    
    2. The minimum cost to move all chips to the same position will be the smaller of the two counts (even or odd), since we can move all chips from the larger group to the smaller group at a cost of 1 per chip.

time complexity: O(n) - We need to iterate through the array once to count the chips at even and odd positions.
space complexity: O(1) - We are using a constant amount of space to store the
*/
public class MinCostToMoveChips {
      public static int minCostToMoveChips(int[] position) {
        int evencount = 0;
        int oddcount = 0;
        for(int pos : position){
            if(pos%2 == 0) evencount++;
            else oddcount++;
        }
        return Math.min(evencount,oddcount);
    }

    public static void main(String[] args) {
        int[] position = {1,2,3};
        System.out.println(minCostToMoveChips(position));
    }
}
