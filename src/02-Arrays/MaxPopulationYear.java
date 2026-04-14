/*
problem: Maximum Population Year

intuition:
    We are given logs of birth and death years, and we need to find the year with the maximum population.

approach:
    1. Find the minimum birth year and maximum death year from the logs to determine the range of years we need to consider.
    2. Create an array to keep track of population changes for each year in the range.
    3. For each log, increment the population count at the birth year and decrement it at the death year.
    4. Iterate through the population array to find the year with the maximum population.

time complexity: O(n + m) = O(n) where n is the number of logs and m is the range of years (which is constant).
space complexity: O(m) = O(1) since the range of years is limited (1950 to 2050).
*/


public class MaxPopulationYear {
    public static  int maximumPopulation(int[][] logs) {
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int[] log : logs){
            start=Math.min(start,log[0]);
            end=Math.max(end,log[1]);
        }
        int[] pop = new int[end-start +1];
        for(int[] log : logs){
            pop[log[0] - start]++;
            pop[log[1] - start]--;
        }
        int earliest_year=start;
        int currtpop=0;
        int maxpop=0;
        for(int i=0;i<pop.length;i++){
            currtpop+=pop[i];
            if(currtpop>maxpop){
                maxpop=currtpop;
                earliest_year=start+i;
            }
        }
        return earliest_year;
 
    }

    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }
}
