package p0011_ContainerWithMostWater;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sampleArr = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(sampleArr));
	}
	
    public static int maxArea(int[] height) {

    	int maxWater = 0;
    
    	for (int i = 0; i < height.length; i++) {

			int currWater = 0;
    		int left = 0;
    		int right = height.length - 1;
    		
    		while (left < i || i < right) {
    			
    			if (right - i >= i - left) {
    				if (height[right] >= height[i]) {
    					currWater = height[i] * (right - i);
    					break;
    				}
    				right--;
    			} 
    			else {
    				if (height[left] >= height[i]) {
    					currWater = height[i] * (i - left);
    					break;
    				}
    				left++;
    			}
    		}
    		
    		maxWater = Math.max(currWater, maxWater);
    	}
     	
    	return maxWater;
    }
}
