package p2185_CountingWordsWithPrefix;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"strr", "strr", "tt"};
		
		System.out.println(prefixCount(sample, "st"));
	}
	
    public static int prefixCount(String[] words, String pref) {
    	int count = 0;
    	int length = pref.length();
    	for (String s : words) {
    		if (s.length() < length) {
    			continue;
    		} else if (s.substring(0, length).equals(pref)) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}
