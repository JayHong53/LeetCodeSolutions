package p0027_RemoveElement;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int removeElement(int[] nums, int val) {
        
    	int count = 0;
    	
    	for (int i = 0; i < nums.length;) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
    
    	}
    	
    	return count; 
    	
    }
}
