package p0169_MajorityElement;

import java.util.HashMap;

public class Solution {
	
	public static void main(String[] args) {
		
	}
	
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (!map.containsKey(nums[i])) {
        		map.put(nums[i], 1);
        	}
        	else {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}
        }
        
        int maxOcc = 0;
        int maxRep = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
        	if (map.get(nums[i]) >= maxOcc) {
        		maxOcc = map.get(nums[i]);
        		maxRep = nums[i];
        	}
        }
        
        return maxRep;
    }

}
