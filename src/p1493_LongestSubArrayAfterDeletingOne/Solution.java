package p1493_LongestSubArrayAfterDeletingOne;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,1,0,1,1,0,0,1};
		System.out.println(longestSubarray(nums));
	}
	
    public static int longestSubarray(int[] nums) {
        int longest = 0;
        int curr = 0;
        
        int head = 0;
        int tail = 0;
        int del = 1;
        
        boolean noZero = true;
        
        while (head < nums.length) {
        	if (nums[head] == 1) {
        		head++;
        		curr++;
        	} else if (nums[head] == 0 && del == 1) {
        		head++;
        		curr++;
        		noZero = false;
        		del--;
        	} else {
        		noZero = false;
        		if (nums[tail] == 0) {
        			tail++;
        			del++;
        			curr--;
        		}
        		else {
        			tail++;
        			curr--;
        		}
        	}
        	
        	longest = Math.max(curr, longest);
        }
        
        if (noZero) {
        	return longest;
        } 
        
        if (del == 0) {
        	longest--;
        }
        
        return longest - 1;
    }

}
