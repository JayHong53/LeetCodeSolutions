package p0724_FindPivotIndex;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int pivotIndex(int[] nums) {
    	int sum = 0;
    	int curr = 0;
    	for (int i : nums) {
    		sum += i;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (sum - nums[i] == curr * 2) {
    			return i;
    		}
    		curr += nums[i];
    	}
    	
    	return -1;
    }
}
