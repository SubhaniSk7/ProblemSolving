package leetproblems;

import basics.bst.TreeNode;

public class Q104_MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
