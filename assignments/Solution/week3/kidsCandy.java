//package interview-preparation-tracker.assignments.Solution.week3;

import java.util.ArrayList;
import java.util.List;

public class kidsCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
        
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }

    public static void main(String[] args) {
        kidsCandy k = new kidsCandy();
        int[] candies = {2,3,4,1,2};
        System.out.println(k.kidsWithCandies(candies, 3));
        }

    }

