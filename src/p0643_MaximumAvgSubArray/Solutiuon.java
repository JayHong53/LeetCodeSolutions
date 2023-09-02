package p0643_MaximumAvgSubArray;

public class Solutiuon {

	public static void main(String[] args) {
		
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 6;
		System.out.println(findMaxAverage(nums, k));

	}
	
    public static double findMaxAverage(int[] nums, int k) {	
    	double maxSum = 0;
    	
    	// Get initial Sum
    	double sum = 0;
    	for (int i = 0; i < k; i++) {
    		sum+= nums[i];
    	} 
    	
    	if (nums.length == k) {
    		return sum / k;
    	}
    	
    	int firstIndex = 1; 
    	int lastIndex = k;
    	
    	int minus = nums[0];
    	
    	while (lastIndex < nums.length) {
    		sum -= minus;
    		sum += nums[lastIndex];
    		
    		minus = nums[firstIndex];
    		
    		maxSum = Math.max(maxSum, sum);
    		
    		firstIndex++;
    		lastIndex++;
    	}


    	return maxSum / k;
    }
}
