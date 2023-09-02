package p1071_GreatestCommonDivisorOfStrings;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		System.out.println(getGCD(15, 6));
		System.out.println(gcdOfStrings("abab", "ab"));
		
		for (int i : getAllCD(20, 10)) {
			System.out.print(i + " ");
		}

	}
	
    public static String gcdOfStrings(String str1, String str2) {
    	List<Integer> cds = getAllCD(str1.length(), str2.length());
    	String shorter = str1.length() <= str2.length() ? str1 : str2;
    	
    	for (int i : cds) {
    		String copy1 = str1.replaceAll(shorter.substring(0, i), "");
    		String copy2 = str2.replaceAll(shorter.substring(0, i), "");
    		
    		if (copy1.isEmpty() && copy2.isEmpty()) {
    			return shorter.substring(0, i);
    		}
    	}
    	return "";
    }
    
    public static int getGCD(int a, int b) {
    	int min = (a <= b) ? a : b;
    	
    	int gcd = 1;
    	for (int i = min; i > 0; i--) {
    		if (a % i == 0 && b % i == 0) {
    			gcd = i;
    			break;
    		}
    	}
    	
    	return gcd;
    }
    
    public static List<Integer> getAllCD(int a, int b) {
    	int min = (a <= b) ? a : b;
    	List<Integer> answer = new ArrayList<>();
    	
    	for (int i = min; i > 0; i--) {
    		if (a % i == 0 && b % i == 0) {
    			answer.add(i);
    		}
    	}
    	
    	return answer;
    }
}
