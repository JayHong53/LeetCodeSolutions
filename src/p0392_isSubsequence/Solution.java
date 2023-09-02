package p0392_isSubsequence;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc", "abddddd"));

	}
	
    public static boolean isSubsequence(String s, String t) {
    	if (s.isEmpty()) {
    		return true;
    	}
    	
    	if (s.length() > t.length()) {
    		return false;
    	}
    	
    	for (int i = 0; i < t.length(); i++) {
    		if (s.charAt(0) == t.charAt(i)) {
    			return isSubsequence(s.substring(1), t.substring(i+1));
    		}
    	}
    	
    	return false;    
    }
    
    public static boolean isSubsequence(String s, String t, int index) {
    	if (s.isEmpty()) {
    		return true;
    	}
    	
    	for (int i = 0; i < t.length(); i++) {
    		if (s.charAt(0) == t.charAt(i)) {
    			return isSubsequence(s.substring(1), t.substring(i), i);
    		}
    	}
    	
    	return false;
    }
}
