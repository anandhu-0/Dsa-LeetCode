import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC_1431_KidsWithGreatestCandies {
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
