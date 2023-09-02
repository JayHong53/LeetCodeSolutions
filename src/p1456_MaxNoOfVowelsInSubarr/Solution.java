package p1456_MaxNoOfVowelsInSubarr;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// 0 0 0 0 0 0                  last index 5  k = 4
		// 0 0 0 0        first index 0 last index 3 
		//     0 0 0 0    first index 2 last index 5
		
					//    i + k == 5 -> last iteration 
					//    i + k == 6
		
		
		String s = "aabbbce";
		System.out.println(maxVowels(s, 7));

	}
	
    public static int maxVowels(String s, int k) {
        int maxVowel = 0;
        int currVowel = 0;
        
        for (int i = 0; i < s.length() - (k - 1) ; i++) {
        	if (i == 0) {
        		for (int j = 0; j < k; j++) {
        			if (isVowel(s.charAt(j))) {
        				currVowel++;
        			}
        		}
        	}
        	
        	else {
        		if (isVowel(s.charAt(i-1))) {
        			currVowel--;
        		}
        		if (isVowel(s.charAt(i-1+k))) {
        			currVowel++;
        		}
        	}
        	
        	maxVowel = Math.max(currVowel, maxVowel);
        }
   
        return maxVowel;
    }
    
    public static boolean isVowel(char c) {
    	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
