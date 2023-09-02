package p1732_FindTheHighestAttitude;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println("I made it manually!");
	}
	
    public static int largestAltitude(int[] gain) {
    	int curr = 0;
    	int max = 0;
    			
    	for (int i : gain) {
    		curr += i;
    		max = Math.max(curr, max);
    	}
    
    	return max;
    	
    }


}
