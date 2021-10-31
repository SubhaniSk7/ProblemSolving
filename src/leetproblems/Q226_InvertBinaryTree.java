package leetproblems;

import basics.bst.TreeNode;

public class Q226_InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			TreeNode temp = root.left;
			root.left = invertTree(root.right);
			root.right = invertTree(temp);
		}
		return root;
	}

	public TreeNode invertTree_1(TreeNode root) {
		if (root == null)
			return null;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree_1(root.left);
		invertTree_1(root.right);
		return root;
	}
}
