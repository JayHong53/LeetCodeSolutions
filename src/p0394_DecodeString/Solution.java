package p0394_DecodeString;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		String s = "3[abcabc]";
		System.out.println(decodeString2(s));
		System.out.println(decodeString(s));


	}
	
	public static String decodeString(String s) {
    	return decodeString(s, "");
    }
    
    public static String decodeString(String s, String decoded) {

    	if (s.length() == 0) {
    		return decoded;
    	}
    	
    	// numbers brackets 
    	else if (s.charAt(0) >= 48 && s.charAt(0) <= 57) {
    		int numberLastIndex = 0;
    		
    		// Getting Number Part;
    		while (s.charAt(numberLastIndex) >= 48 && s.charAt(numberLastIndex) <= 57) {
    			numberLastIndex++;
    		}
    		
    		String numberPart = s.substring(0, numberLastIndex);
    		int number = Integer.parseInt(numberPart);

    		// Getting Bracket Part;
    		int lastBracketIndex = 0;
    		
    		int bracketCloseCounter = 1;
    		for (int i = numberLastIndex + 2; bracketCloseCounter != 0; i++) {
    			if (s.charAt(i) == 91) {
    				bracketCloseCounter++;
    			}
    			if (s.charAt(i) == 93) {
    				bracketCloseCounter--;
    			}
    			lastBracketIndex = i;
    		}
    		
    		String bracketPart = s.substring(numberLastIndex + 1, lastBracketIndex);
    		String bracketDecoded = "";
    		
    		for (int i = 0; i < number; i++) {
    			bracketDecoded = bracketDecoded.concat(decodeString(bracketPart, ""));
    		}
    		
    		decoded = decoded.concat(bracketDecoded);
    		return decodeString(s.substring(lastBracketIndex + 1), decoded);
    		    	
    	}
    	
    	else {
    		decoded = decoded.concat(String.valueOf(s.charAt(0)));
    		return decodeString(s.substring(1), decoded);
    	}
    }
    
    public static String decodeString2(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<StringBuilder> ss = new Stack<>();

        int n = s.length(), num = 0;
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()) {
            // There will be 4 types of characters --> number, [ , ], character

            if(ch >= '0' && ch <= '9') {
                num = (num * 10) + ch - '0';
            } else if(ch == '[') {
                ss.push(str);
                str = new StringBuilder();

                is.push(num);
                num = 0;
            } else if(ch == ']') {
                StringBuilder temp = str;
                str = ss.pop();
                int count = is.pop();

                while(count-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
