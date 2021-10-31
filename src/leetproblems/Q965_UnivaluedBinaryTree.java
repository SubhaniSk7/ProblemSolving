package leetproblems;

import basics.bst.TreeNode;

public class Q965_UnivaluedBinaryTree {
	int val;

	public boolean isUnivalTree(TreeNode root) {
		val = root.val;
		return dfs(root);
	}

	public boolean dfs(TreeNode root) {
		if (root != null) {
			if (root.val != val)
				return false;
			return dfs(root.left) && dfs(root.right);
		}
		return true;
	}
}
