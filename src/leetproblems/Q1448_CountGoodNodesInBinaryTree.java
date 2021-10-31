package leetproblems;

import basics.bst.TreeNode;

public class Q1448_CountGoodNodesInBinaryTree {
	int good = 0;

	public int goodNodes(TreeNode root) {
		dfs(root, Integer.MIN_VALUE);
		return good;
	}

	public void dfs(TreeNode root, int ancestor) {
		if (root != null) {
			int greater = ancestor;
			if (root.val >= ancestor) {
				greater = root.val;
				good++;
			}
			dfs(root.left, greater);
			dfs(root.right, greater);
		}
	}
}
