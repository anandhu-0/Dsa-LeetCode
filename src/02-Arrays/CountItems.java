/*
Problem: Count Items Matching a Rule

Intuition:
    We need to count how many items match a given rule based on the specified key and value.

Approach:
    Determine the index corresponding to the ruleKey (type, color, or name).
    Iterate through the list of items and compare the value at the determined index with the ruleValue.
    Increment a counter for each match found.
    Return the count of matching items.

Time Complexity: O(n) - We iterate through the list of items once.
Space Complexity: O(1) - We use a constant amount of space for the counter and
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {
       public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int NoOfItems=0;
        int index=Integer.MIN_VALUE;
        if(ruleKey.equals("type")) index=0;
        else if(ruleKey.equals("color")) index=1;
        else if(ruleKey.equals("name")) index=2;
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)) NoOfItems++;
        } 
        return NoOfItems;
    }
    public static void main(String[] args) {
       
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println("Matching items: " + result);
    }
}