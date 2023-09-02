package p2352_EqualRowAndColumnPairs;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid = {{3,1,1},
						{1,1,1}, 
						{1,1,1}};
		
		System.out.println(equalPairs(grid));
			

	}
	
    public static int equalPairs(int[][] grid) {
    	
    	int ans = 0;
    	int n = grid.length;
    	
    	String x = "";
    	Map<String, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < n; i++) {
    		x = "";
    		for (int j = 0; j < n; j++) {
    			x += grid[i][j] + "-";
    		}
    		map.put(x, map.getOrDefault(x, 0) + 1);
    	}
    	
    	for (int i = 0; i < n; i++) {
    		x = "";
    		for (int j = 0; j < n; j++) {
    			x += grid[j][i] + "-";
    		}
    		
    		if (map.containsKey(x)) {
    			ans += map.get(x);
    		}
    	}
    	
    	return ans;
        
    }
}
