package leetproblems;

import basics.bst.TreeNode;

public class Q979_DistributeCoinsInBinaryTree {
	int moves = 0;

	public int distributeCoins(TreeNode root) {
		dfs(root);
		return moves;
	}

	public int dfs(TreeNode root) {
		if (root == null)
			return 0;
		int l = dfs(root.left);
		int r = dfs(root.right);
		moves += Math.abs(l) + Math.abs(r);

		return root.val + l + r - 1;
	}
}
