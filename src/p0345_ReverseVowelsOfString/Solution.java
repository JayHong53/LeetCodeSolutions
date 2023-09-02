package p0345_ReverseVowelsOfString;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(reverseVowels("Hello, World"));
		

	}

    public static String reverseVowels(String s) {
    	
    	Stack<Character> stack = new Stack<>();
    	char[] chars = s.toCharArray();
    	for (int i = 0; i < chars.length; i++) {
    		if (isVowel(chars[i])) {
    			stack.add(chars[i]);
    		}
    	}
    	
    	for (int i = 0; i < chars.length; i++) {
    		if (isVowel(chars[i])) {
    			chars[i] = stack.pop();
    		}
    	}
    	
    	return new String(chars);
    }
    
    public static boolean isVowel (Character c) {
    	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
    		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
    		return true;
    	}
    	return false;
    }
}
