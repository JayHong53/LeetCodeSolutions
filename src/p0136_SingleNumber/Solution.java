package p0136_SingleNumber;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {1, 1, 2, 3, 3};
		
		System.out.println(singleNumber(sample));

	}
	
    public static int singleNumber(int[] nums) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int sum = 0;
    	
    	for (int n : nums) {
    		if (map.containsKey(n)) {
    			sum -= n;
    		}
    		else {
    			sum += n;
    			map.put(n, n);
    		}
    	}
    	
    	return sum;
    }


}
