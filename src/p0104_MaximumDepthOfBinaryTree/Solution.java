package p0104_MaximumDepthOfBinaryTree;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 4};
		
		TreeNode root = TreeNode.buildTreeNode(arr);
		TreeNode.displayTree(root);
		
		System.out.println(maxDepth(root));
	}
	
	public static int maxDepth(TreeNode root) {
		return digTree(root, 0);
	} 
	
	public static int digTree(TreeNode node, int maxDepth) {
		if (node == null) {
			return maxDepth;
		}
		
		else if (node.left != null && node.right != null) {
			return Math.max(digTree(node.left, maxDepth + 1), digTree(node.right, maxDepth + 1));
		}
		
		else if (node.left != null) {
			return digTree(node.left, maxDepth + 1);
		}
		
		else {
			return digTree(node.right, maxDepth + 1);
		}
	}
}
