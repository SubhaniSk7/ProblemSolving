package leetproblems;

import basics.bst.TreeNode;

public class Q530_MinimumAbsoluteDifferenceInBST {
	TreeNode prev = null;
	int ans = Integer.MAX_VALUE;

	public int getMinimumDifference(TreeNode root) {
		inOrder(root);
		return ans;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			if (prev != null)
				ans = Math.min(ans, Math.abs(root.val - prev.val));
			prev = root;
			inOrder(root.right);
		}
	}
}
