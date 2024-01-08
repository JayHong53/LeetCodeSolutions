package p0383_RansomNote;

import java.util.Stack;

public class Soloution {
	
	public static void main(String[] args) {
		
		int val = 1994;
		String valstr = intToRoman(val);
		System.out.println(valstr);
	}
	
    public static String intToRoman(int num) {
    	
    	int digits = 0;
    	Stack<Integer> stack = new Stack<>();
    	    	
    	while (num >= 10) {
    		stack.add(num % 10);
    		num = num / 10;
    		digits++;
    	}
    	
    	stack.add(num);
    	digits++;
    	
    	String ret = "";
    	
    	
    	
    	while (digits > 0) {
    		    		
    		int val = stack.pop();
    		
    		System.out.println("Val: " + val + " | Digit: " + digits);
    		ret = ret.concat(romanHelper(val, digits));
    		digits--;
    	}
    	
    	return ret;
    }
    
    public static String romanHelper(int val, int digit) {
    	String[] tens = {"I", "X", "C", "M"};
    	String[] fives = {"V", "L", "D"};

    	String retval = "";	
    	
    	if (val > 0 && val < 4) {
    		for (int i = 0; i < val; i++) {
    			retval = retval.concat(tens[digit-1]);
    		}
    	}
    	
    	if (val == 4) {
    		retval = retval.concat(tens[digit-1] + fives[digit-1]);
    	}
    	
    	if (val == 5) {
    		retval = retval.concat(fives[digit-1]);
    	}
    	
    	if (val > 5 && val < 9) {
    		retval = retval.concat(fives[digit-1]);
    		for (int i = 0; i < val - 5; i++) {
    			retval = retval.concat(tens[digit-1]);
    		}
    	}
    	
    	if (val == 9) {
    		retval = retval.concat(tens[digit-1] + tens[digit]);
    	}
    	
    	return retval;
    }
}
