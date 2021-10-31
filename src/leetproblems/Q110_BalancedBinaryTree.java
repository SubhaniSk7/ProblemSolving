package leetproblems;

import basics.bst.TreeNode;

public class Q110_BalancedBinaryTree {
	boolean stop = false;

	public boolean isBalanced(TreeNode root) {
		if (height(root) < 0)
			return false;
		return true;
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;
		int l = height(root.left);
		int r = height(root.right);
		if (Math.abs(l - r) > 1) {
			stop = true;
			return Integer.MIN_VALUE;
		}
		if (!stop)
			return 1 + Math.max(l, r);
		return -1;
	}
}
