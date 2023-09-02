package p0334_IncreasingTriphetSubsequence;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// check it later;
	public boolean increasingTriplet(int[] nums) {
		int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n <= small) {
				small = n;
			} else if (n <= big) {
				big = n;
			} else
				return true;
		}
		return false;
	}

}
