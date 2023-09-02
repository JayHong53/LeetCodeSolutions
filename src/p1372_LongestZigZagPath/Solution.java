package p1372_LongestZigZagPath;

public class Solution {

	public static void main(String[] args) {

	}
	
    public static int longestZigZag(TreeNode root) {
    	return Math.max(zig(root.left, 0), zag(root.right, 0));
    }
    
    // To Left 
    public static int zig(TreeNode node, int depth) {
    	if (node == null) {
    		return depth;
    	}
    	else {
    		return Math.max(zag(node.right, depth + 1), zig(node.left, depth));
    	}
    }
    
    // To right
    public static int zag(TreeNode node, int depth) {
    	if (node == null) {
    		return depth;
    	}
    	else {
    		return Math.max(zig(node.left, depth + 1), zag(node.left, depth));
    	}
    }
    
    

}
