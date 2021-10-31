package leetproblems;

import basics.bst.TreeNode;

public class Q129_SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
		return dfs(root, 0);
	}

	public int dfs(TreeNode root, int v) {
		if (root == null)
			return 0;
		int s = v * 10 + root.val;
		if (root.left == null && root.right == null)
			return s;
		int l = dfs(root.left, s);
		int r = dfs(root.right, s);
		return l + r;
	}
}
