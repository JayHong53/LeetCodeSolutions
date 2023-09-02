package p0066_PlusOne;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s1 = {1, 2, 3};
		int[] s2 = {9, 9, 9};
		int[] s3 = {1, 0, 9};
 		
		printArr(plusOne(s1));
		printArr(plusOne(s2));
		printArr(plusOne(s3));
		
	}
	
    public static int[] plusOne(int[] digits) {
    	
    	int currDigit = digits.length - 1;
    	int lastDigit = digits[digits.length-1];
    	
    	if (lastDigit != 9) {
    		digits[digits.length-1] = lastDigit + 1;
    		return digits;
    	} 
    	
    	else {
    		return carryover(digits, currDigit);
    	}
    }

    public static int[] carryover(int[] ori, int currDigit) {
    	
    	if (currDigit == 0 && ori[0] == 9) {
    		int[] newArr = new int[ori.length + 1]; 
    		newArr[0] = 1;
    		
    		ori[currDigit] = 0;
    		
    		for (int i = 0; i < ori.length; i++) {
    			newArr[i+1] = ori[i];
    		}
    		
    		return newArr;
    	}
    	
    	else if (currDigit > 0 && ori[currDigit] == 9) {
    		ori[currDigit] = 0;
    		return carryover(ori, currDigit - 1);
    	}
    	
    	else {
    		ori[currDigit] += 1;
    		return ori;
    	}
    }	
    
    public static void printArr(int[] arr) {
    	for (int n : arr) {
    		System.out.print(n);
    	}
    	System.out.println();
    }
}
