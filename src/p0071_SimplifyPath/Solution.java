package p0071_SimplifyPath;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		
		String val = "/a//b////c/d//././/..";		
		System.out.println(simplifyPath(val));
	}
	
    public static String simplifyPath(String path) {
        
    	Stack<String> dirStack = new Stack<>();
    	String newPath;
    	
    	if (path.length() == 1 || path.length() == 0) {
    		newPath = "";
    	}
    	
    	else {
    		if (path.endsWith("/")) {
    			newPath = path.substring(1, path.length() - 1);
    		}
    		else {
    			newPath = path.substring(1);
    		}
    	}
    	    	
    	String[] dirs = newPath.split("/");
    	
    	for (String s : dirs) {
    		if (s.equals("..")) {
    			if (!dirStack.isEmpty()) {
        			dirStack.pop();
    			}
    			// else do nothing
    		}
    		else if (s.equals(".") || s.isBlank()) {
    			// Do Nothing
    		}
    		else {
    			dirStack.add(s);
    		}
    	}
    	
    	String simplifiedPath = "";
    	
    	while (!dirStack.isEmpty()) {
    		simplifiedPath = "/" + dirStack.pop() + simplifiedPath;
    	}
    	
    	if (simplifiedPath.isEmpty()) {
    		return "/";
    	}
    	
    	return simplifiedPath;
    }
}
