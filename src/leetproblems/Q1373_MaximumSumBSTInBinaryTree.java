package leetproblems;

import basics.bst.TreeNode;

public class Q1373_MaximumSumBSTInBinaryTree {
	int result = 0;

	public int maxSumBST(TreeNode root) {
		dfs(root);
		return result;
	}

	public int[] dfs(TreeNode root) {
		if (root == null)
			return new int[] { 1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };// {isbst, min, max, sum}

		int[] left = dfs(root.left);
		int[] right = dfs(root.right);

		boolean isBST = (left[0] == 1 && right[0] == 1 && left[2] < root.val && root.val < right[1]);

		int sum = left[3] + right[3] + root.val;
		if (isBST)
			result = Math.max(result, sum);
		return new int[] { isBST ? 1 : 0, Math.min(root.val, left[1]), Math.max(root.val, right[2]), sum };
	}
}
