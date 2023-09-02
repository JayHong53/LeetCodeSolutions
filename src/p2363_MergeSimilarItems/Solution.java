package p2363_MergeSimilarItems;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] item1 = {{1, 1}, {4, 5}, {3, 8}};
		int[][] item2 = {{3, 1}, {1, 5}};
		
		
		printAnswer(mergeSimilarItems(item1, item2));
	}
	
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for (int[] item : items1) {
    		map.put(item[0], item[1]);
    	}
    	
    	for (int[] item : items2) {
    		if (map.containsKey(item[0])) {
    			map.put(item[0], map.get(item[0]) + item[1]);
    		}
    		else map.put(item[0], item[1]);
    	}
    	
    	List<List<Integer>> ans = new ArrayList<>();
    	    	
    	for (int key : map.keySet()) {
    		List<Integer> set = new ArrayList<>();
    		set.add(key);
    		set.add(map.get(key));
    		ans.add(set);    		
    	}
    	
    	ans.sort((o1, o2) -> Integer.compare(o1.get(0), o2.get(0)));
    	
    	return ans;
    	
    }
    
    public static void printAnswer(List<List<Integer>> list) {
    	for (List<Integer> inner : list) {
    		for (Integer i : inner) {
    			System.out.print(i + " ");
    		}
    		System.out.println();
    	}
    }
}
