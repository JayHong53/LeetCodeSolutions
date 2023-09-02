package p1768_MergeStringsAlternately;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "1212";
		String word2 = "45655";
		System.out.println(mergeAlternately(word1, word2));

	}
	
    public static String mergeAlternately(String word1, String word2) {
    	String ans = "";
    	
    	int i = 0;
    	while (i < Math.min(word1.length(), word2.length())) {
    		ans = ans.concat(String.valueOf(word1.charAt(i)));
    		ans = ans.concat(String.valueOf(word2.charAt(i)));
    		i++;
    	}
    	
    	ans = ans.concat(word1.substring(i));
    	ans = ans.concat(word2.substring(i));

    	return ans;
    	
    	

    }
}
