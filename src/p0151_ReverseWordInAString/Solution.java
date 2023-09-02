package p0151_ReverseWordInAString;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = " Hello      world ";
		System.out.println(reverseWords(test));

	}
	
    public static String reverseWords(String s) {
    	String[] words = s.split(" ");    	
    	Stack<String> stack = new Stack<>();
    	
    	for (String word : words) {
    		if (!word.isBlank()) {
    			stack.add(word);
    		}
    	}
    	
    	String ans = "";
    	while (!stack.isEmpty()) {
    		ans = ans.concat(stack.pop());
    		
    		if (!stack.isEmpty()) {
    			ans = ans.concat(" ");
    		}
    	}
    	return ans;
    }
}
