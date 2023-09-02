package p0443_StringCompression;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = "abc".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);

	}
	
    public static int compress(char[] chars) {
    	
    	if (chars.length == 1) {
    		return 1;
    	}
    	
    	char prev = chars[0];
    	int count = 1;
    	
    	String ans = "";
    	
    	for (int i = 1; i < chars.length; i++) {
    		// if same as previous, add count
    		if (chars[i] == prev) {
    			count++;
    		}
    		
    		else {
    			if (count == 1) {
    				ans = ans.concat(String.valueOf(prev));
    			} else {
    				ans = ans.concat(String.valueOf(prev));
    				ans = ans.concat(String.valueOf(count));
    			}
    			
				prev = chars[i];
				count = 1;
    		}
    	}
   
		ans = ans.concat(String.valueOf(prev));
		if (count != 1) {
			ans = ans.concat(String.valueOf(count));			
		}
		
		for (int i = 0; i < ans.length(); i++) {
			chars[i] = ans.charAt(i);
		}
		
		
    	return ans.length();
    }


}
