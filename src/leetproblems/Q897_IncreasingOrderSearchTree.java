package leetproblems;

import basics.bst.TreeNode;

public class Q897_IncreasingOrderSearchTree {
	TreeNode prev = null, cur = null;

	public TreeNode increasingBST(TreeNode root) {
		inOrder(root);
		return cur;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			if (prev != null) {
				prev.right = root;
				root.left = null;
				prev.left = null;
			}
			prev = root;
			if (cur == null)
				cur = root;
			inOrder(root.right);
		}
	}
}
