package p1448_CountGoodNodesInBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		
		int[] arr1 = {3,1,4,3,-101,1,5};
		TreeNode root1 = TreeNode.buildTreeNode(arr1);
		TreeNode.displayTree(root1);
	
		
		System.out.println(goodNodes(root1));
	}	
	
    public static int goodNodes(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	
    	return countGoodNodes(root, root.val);
    }
    
    
    public static int countGoodNodes(TreeNode root, int maxVal) {
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	int currMax = Math.max(root.val, maxVal);
    	int count = root.val >= maxVal ? 1 : 0;
    	
    	if (root.left == null && root.right == null) {
    		return count;
    	}
    	
    	else if (root.left != null && root.right != null) {
    		return count + countGoodNodes(root.left, currMax) + countGoodNodes(root.right, currMax);
    	}
    	
    	else if (root.left != null && root.right == null) {
    		return count + countGoodNodes(root.left, currMax);
    	}
    	else {
    		return count + countGoodNodes(root.right, currMax);
    	}	
    }
}
