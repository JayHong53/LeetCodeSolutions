package p0026_RemoveDuplicatedFromSortedArray;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int removeDuplicates(int[] nums) {
    	int index = 0;
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (!map.containsKey(nums[i])) {
    			map.put(nums[i], 1);
    			nums[index] = nums[i];
    			index++;
    		}
    		
    		else if (map.get(nums[i]) == 1) {
    			map.put(nums[i], 2);
    			nums[index] = nums[i];
    			index++;
    		}
    	}
    	
    	return index;
    }


}
