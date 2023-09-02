package p1679_MaxNumberOfKSumPairs;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4};
		int k = 5;
		
		System.out.println(maxOperations(nums, k));

	}
	
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i : nums) {
        	numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        
        int count = 0;
        
        for (int i : nums) {        	
        	if (k == 2 * i) {
        		if (numMap.containsKey(i) && numMap.get(i) >= 2) {
        			numMap.put(i, numMap.get(i) - 2);
        			count++;
        		}
        	}
        	else {
        		if (numMap.containsKey(i) && numMap.containsKey(k-i) &&
        				numMap.get(i) > 0 && numMap.get(k-i) > 0) {
        			
        			numMap.put(i, numMap.get(i) - 1);
        			numMap.put(k-i, numMap.get(k-i) - 1);
        			count++;
        		}
        	}        	
        }    
        
        return count;
    }
}
