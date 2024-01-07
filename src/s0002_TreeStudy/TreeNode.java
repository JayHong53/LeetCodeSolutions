package s0002_TreeStudy;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val;}
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.left = left; 
		this.right = right; 
		this.val = val;
	}
	

    // Display the tree structure
    public static void displayTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        displayTreeHelper(root, sb, "", "");
        System.out.println(sb.toString());
    }
    
    public static TreeNode buildTreeNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        TreeNode[] nodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -101) {
                nodes[i] = new TreeNode(arr[i]);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (nodes[i] != null) {
                int leftChildIndex = 2 * i + 1;
                int rightChildIndex = 2 * i + 2;
                
                if (leftChildIndex < arr.length) {
                    nodes[i].left = nodes[leftChildIndex];
                }
                
                if (rightChildIndex < arr.length) {
                    nodes[i].right = nodes[rightChildIndex];
                }
            }
        }
        
        return nodes[0];
    }

    private static void displayTreeHelper(TreeNode node, StringBuilder sb, String prefix, String childrenPrefix) {
        if (node != null) {
            sb.append(prefix);
            sb.append(node.val);
            sb.append("\n");

            if (node.left != null || node.right != null) {
                if (node.left != null && node.right != null) {
                    displayTreeHelper(node.left, sb, childrenPrefix + "├── ", childrenPrefix + "│   ");
                    displayTreeHelper(node.right, sb, childrenPrefix + "└── ", childrenPrefix + "    ");
                } else if (node.left != null) {
                    displayTreeHelper(node.left, sb, childrenPrefix + "└── ", childrenPrefix + "    ");
                } else {
                    displayTreeHelper(node.right, sb, childrenPrefix + "└── ", childrenPrefix + "    ");
                }
            }
        }
    }
 }
