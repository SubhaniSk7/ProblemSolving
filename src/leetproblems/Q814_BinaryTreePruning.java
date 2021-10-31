package leetproblems;

import basics.bst.TreeNode;

public class Q814_BinaryTreePruning {
	public TreeNode pruneTree(TreeNode root) {
		if (dfs(root))
			return root;
		return null;
	}

	public boolean dfs(TreeNode root) {
		if (root == null)
			return false;
		boolean l = dfs(root.left);
		boolean r = dfs(root.right);
		if (!l)
			root.left = null;
		if (!r)
			root.right = null;
		if (root.val == 1)
			return true;
		return l || r;
	}
}
