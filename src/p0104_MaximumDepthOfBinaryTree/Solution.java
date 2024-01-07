package p0104_MaximumDepthOfBinaryTree;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 4};
//		
//		TreeNode root = TreeNode.buildTreeNode(arr);
//		TreeNode.displayTree(root);
		

		System.out.println(getM());
	}
	
	public static double getM() {
		

	int hare = 5;
	int tortoise = 11;
	int j = 0;

	for(j=0;j<20;j++)
	{
	 if(hare < tortoise)
	   hare *= 2;
	 else if(hare == tortoise)
	   break;
	 else
	   tortoise += 1;
	}
	return hare + tortoise;
	}
}
