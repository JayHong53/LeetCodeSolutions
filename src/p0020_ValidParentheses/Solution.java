package p0020_ValidParentheses;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s3 = ")";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
    	
    	char[] chars = s.toCharArray();
    	Stack<Integer> stack = new Stack<>();
    	
    	if (chars.length % 2 != 0) {
    		return false;
    	}
    	
    	for (int c : chars) {
    		if (c == 40 || c == 91 || c == 123 ) {
    			stack.add(c);
    		}
    		else {
    			try {
    				if (stack.peek() == null || !(stack.peek() - c == -1 || stack.peek() - c == -2)) {
    					return false;
    				}
    				else {
    					stack.pop();
    				}    				
    			} 
    			catch(Exception e) {
    				return false;
    			}
    		}
    	}
    	
    	return stack.isEmpty();
    }
}

