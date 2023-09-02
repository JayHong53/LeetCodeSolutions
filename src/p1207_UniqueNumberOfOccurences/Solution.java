package p1207_UniqueNumberOfOccurences;

import java.util.*;

public class Solution {
	
	public static void main(String args[]) {
		System.out.println("Helloooowwwww Wooorrrlllldddd");
	}
	
    public boolean uniqueOccurrences(int[] arr) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	HashMap<Integer, Integer> countMap = new HashMap<>();
    	
    	for (int i : arr) {
    		map.put(i, map.getOrDefault(i, 0) + 1);
    	}
    	
    	Set<Integer> keyset = map.keySet();
    	for (int i : keyset) {
    		if (countMap.containsKey(map.get(i))) {
    			return false;
    		}
    		countMap.put(map.get(i), 1);
    	}
    	return true;
    }

}
