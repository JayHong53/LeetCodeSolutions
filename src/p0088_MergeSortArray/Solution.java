package p0088_MergeSortArray;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		
		int[] num2 = {2, 5, 6};
		int n = 3;
		
		
		merge(num1, m, num2, n);
		for(int i : num1) {
			System.out.print(i + " "); 
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	    int index = m + n - 1;
	    int i1 = m - 1;
	    int i2 = n - 1;

	    while (index >= 0) {
	        if (i2 < 0 || (i1 >= 0 && nums1[i1] > nums2[i2])) {
	            nums1[index] = nums1[i1];
	            i1--;
	        } else {
	            nums1[index] = nums2[i2];
	            i2--;
	        }
	        index--;
	    }
	}
}
