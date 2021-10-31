package leetproblems;

import basics.bst.TreeNode;

public class Q671_SecondMinimumNodeInaBinaryTree {
	int first = -1, second = -1;

	public int findSecondMinimumValue(TreeNode root) {
		first = root.val;
		dfs(root);
		if (first == second)
			return -1;
		return second;
	}

	public void dfs(TreeNode root) {
		if (root != null) {
			if (first < root.val && second == -1)
				second = root.val;
			else if (first < root.val && second > root.val)
				second = root.val;
			dfs(root.left);
			dfs(root.right);
		}
	}
}
