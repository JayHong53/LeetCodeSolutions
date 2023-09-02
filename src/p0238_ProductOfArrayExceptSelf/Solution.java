package p0238_ProductOfArrayExceptSelf;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {2, 1, 1, 5, 10};
		
		for (int i : productExceptSelf(sample)) {
			System.out.print(i + " ");
		} 
	}
	
    public static int[] productExceptSelf(int[] nums) {
    	
    	int[] ret = new int[nums.length];
    	
    	int zeroCount = 0;
    	int product = 1; 
    	
    	for (int n : nums) {
    		if (n == 0) {
    			zeroCount++;
    		}
    		else {
    			product *= n;
    		}
    		if (zeroCount > 1) {
    			int[] ans = new int[nums.length];
    			for (int a = 0; a < ans.length; a++) {
    				ans[a] = 0;
    			}
    			return ans;
    		}
    	}
    	if (zeroCount == 1) {
    		for (int i = 0; i < nums.length; i++) {
    			if (nums[i] == 0) {
    				ret[i] = product;
    			}
    			else {
    				ret[i] = 0;
    			}
    		}
    	}
    	else {
    		for (int i = 0; i < nums.length; i++) {
    			ret[i] = product / nums[i];
    		}
    	}
    	
    	return ret;
    	
    }
}
