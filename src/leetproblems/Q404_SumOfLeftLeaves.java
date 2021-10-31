package leetproblems;

import basics.bst.TreeNode;

public class Q404_SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		return sum(root, false);
	}

	public int sum(TreeNode root, boolean left) {
		if (root == null)
			return 0;
		if (left && root.left == null && root.right == null)
			return root.val;

		int l = sum(root.left, true);
		int r = sum(root.right, false);

		return l + r;
	}
}
