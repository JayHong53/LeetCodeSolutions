package p1431_KidsWithTheGreatestNumberOfCandies;

import java.util.*;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	
    	int max = 0;
    	for (int i = 0; i < candies.length; i++) {
    		if (candies[i] >= max) {
    			max = candies[i];
    		}
     	}
    	
    	List<Boolean> ans = new ArrayList<>();
    	for (int i = 0; i < candies.length; i++) {
    		ans.add(candies[i] + extraCandies >= max);
    	}
    	
    	return ans;
    }
}
