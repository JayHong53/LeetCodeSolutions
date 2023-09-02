package p2114_MaximumNumberOfWords;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String str : sentences) {
        	String[] slices = str.split(" ");
        	maxWords = Math.max(maxWords, slices.length);
        }
        return maxWords;
    }

}
