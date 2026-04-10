/*
Problem: Kids with Greatest candies

Intuition:
    We need to determine if each kid can have the greatest number of candies after receiving some extra candies.

Approach:
    Find the maximum number of candies any kid currently has.
    For each kid, check if adding the extra candies would make their total greater than or equal to the maximum.
    Return a list of booleans indicating the result for each kid.

Time Complexity: O(n)
Space Complexity: O(1)
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestCandies {
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int x : candies) if(x > max) max = x;
        for(int i = 0;i < candies.length;i++){
            if(candies[i] + extraCandies >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter no of kids : ");
        int n = in.nextInt();

        int[] candies = new int[n];

        System.out.print("Enter the number of candies each kid has : ");
        for(int i = 0;i < n;i++) candies[i] = in.nextInt();

        System.out.print("Enter the extra candies : ");
        int extraCandies = in.nextInt();
        
        System.out.println(kidsWithCandies(candies, extraCandies));
        in.close();
    }
}
