package p2390_RemovingStarsFromString;

import java.util.*;

public class Solution {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leet**cod*e";
		
		System.out.println(removeStars(s));

	}
	
    public static String removeStars(String s) {
    	
    	Stack<Character> stack = new Stack<>();
    
    	for (char c : s.toCharArray()) {
    		if (c != '*') {
    			stack.add(c);
    		}
    		else {
    			stack.pop();
    		}
    	}
    	
    	String answer = "";
    	while (!stack.isEmpty()) {
    		String val = String.valueOf(stack.pop());
    		String newAns = val.concat(answer);
    		answer = newAns;
    	}
    	
    	return answer;
    }
}
