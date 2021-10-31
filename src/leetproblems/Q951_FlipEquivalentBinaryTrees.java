package leetproblems;

import basics.bst.TreeNode;

public class Q951_FlipEquivalentBinaryTrees {
	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
		return dfs(root1, root2);
	}

	public boolean dfs(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val != root2.val)
			return false;

		boolean one = dfs(root1.left, root2.left) && dfs(root1.right, root2.right);
		boolean two = dfs(root1.left, root2.right) && dfs(root1.right, root2.left);

		return one || two;
	}
}
