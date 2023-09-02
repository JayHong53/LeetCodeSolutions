package p2121_GetInterval;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {2,1,3,1,2,3,3};
		
		long[] ans = getDistances(arr);
		for (long l : ans) {
			System.out.print(l + " ");
		}
	
	}
	
    public static long[] getDistances(int[] arr) {
        Map<Integer, List<Integer>> intMap = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
        	List<Integer> list = intMap.getOrDefault(arr[i], null);
        	
        	if (list == null) {
        		list = new ArrayList<Integer>();
        	}
        	list.add(i);
        	intMap.put(arr[i], list);
        }
        
        long[] ans = new long[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	long sum = 0;
        	List<Integer> indexes = intMap.get(arr[i]);
        	
        	for (int j : indexes) {
        		sum += Math.abs(i-j);
        	}
        	
        	ans[i] = sum;
        }
        
        return ans;
    }

}
