package p1004_MaxConsecutiveOnesIII;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		
		System.out.println(longestOnes(nums, k));
	}
	
    public static int longestOnes(int[] nums, int k) {
    	int max = 0;
    	int curr = 0;
    	
    	int head = 0;
    	int tail = 0;
    	
    	int zeroAllowed = k;
    	
    	while (head < nums.length) {
    		// if head == 1, extend length
    		
    		if (nums[head] == 1) {
    			head++;
    			curr++;
        		max = Math.max(curr, max);
    		}
    		// if head == 0 but have some zeros allowed, extend length
    		else if (nums[head] == 0 && zeroAllowed > 0) {
				head++;
				curr++;
				zeroAllowed--;
        		max = Math.max(curr, max);
    		}
    		// else, slide
    		else {
    			if (nums[tail] == 1) {
    				tail++;
    				curr--;
    			}
    			else {
    				tail++;
    				curr--;
    				zeroAllowed++;
    			}
    			continue;
    		}    		
    	}

    	return max;
    }

}
