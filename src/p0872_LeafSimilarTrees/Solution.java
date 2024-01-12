package p0872_LeafSimilarTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,2};
		int[] arr2 = {1,2,3};
		TreeNode root1 = TreeNode.buildTreeNode(arr1);
		TreeNode root2 = TreeNode.buildTreeNode(arr2);		
		TreeNode.displayTree(root1);
		TreeNode.displayTree(root2);
		
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		
		queNodes(root1, que1);
		queNodes(root2, que2);

		while (!que1.isEmpty()) {
			System.out.print(que1.poll() + " ");
		}
		System.out.println();
		
		while (!que2.isEmpty()) {
			System.out.print(que2.poll() + " ");
		}
		System.out.println();
		
		System.out.println(leafSimilar(root1, root2));

	}	
	
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
    	if (root1 == null && root2 == null) {
    		return true;
    	}
    	else if (root1 == null || root2 == null) {
    		return false;
    	}
    	
    	Queue<Integer> que1 = new LinkedList<>();
    	Queue<Integer> que2 = new LinkedList<>();
    	
    	queNodes(root1, que1);
    	queNodes(root2, que2);

    	while (!que1.isEmpty() && !que2.isEmpty()) {
    		int val1 = que1.poll();
    		int val2 = que2.poll();
    		
    		if (val1 != val2) {
    			return false;
    		}
    	}
    	
    	if (!que1.isEmpty() || !que2.isEmpty()) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
    public static void queNodes(TreeNode root, Queue<Integer> queue) {
    	if (root == null) {
    		// Do nothing
    	}
    	else if (root.left == null && root.right == null) {
    		queue.offer(root.val);
    	}
    	else if (root.left != null && root.right != null) {
    		queNodes(root.left, queue);
    		queNodes(root.right, queue);
    	}
    	else if (root.left != null && root.right == null) {
    		queNodes(root.left, queue);
    	}
    	else {
    		queNodes(root.right, queue);
    	}
    }
}
