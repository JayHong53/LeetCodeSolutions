package p0167_TwoSum2;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		int target = 4;
		
	    int[] twoSum = twoSum(numbers, target);
	    System.out.println("{" + twoSum[0] + ", " + twoSum[1] + "}");
	    
	    
	    int[] numbers2 = {1, 4, 5, 12, 52, 723};
	    int target2 = 56;
	    
	    int[] twoSum2 = twoSumTwoPointer(numbers2, target2);
	    System.out.println("{" + twoSum2[0] + ", " + twoSum2[1] + "}");


	}
	
    public static int[] twoSum(int[] numbers, int target) {
    	
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < numbers.length; i++) {
    		map.put(numbers[i], i);
    	}
        
    	for (int i = 0; i < numbers.length; i++) {
    		if (map.containsKey(target - numbers[i])) {
    			int[] ans = {i + 1, map.get(target - numbers[i]) + 1};
    			return ans;
    		}
    	}
    	
    	return null;
    }
    
    public static int[] twoSumTwoPointer(int[] numbers, int target) {
    	
    	int left = 0;
    	int right = numbers.length - 1;
    	
    	
    	while (left < right) {
    		int leftval = numbers[left];
    		int rightval = numbers[right];
    		
    		if (leftval + rightval == target) {
    			break;
    		}
    		else if (leftval + rightval > target) {
    			right--;
    		}
    		else {
    			left++;
    		}
    	}
    	
    	int[] ret = {left + 1, right + 1};
    	return ret;
    }

}
