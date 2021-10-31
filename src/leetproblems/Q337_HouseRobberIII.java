package leetproblems;

import basics.bst.TreeNode;

public class Q337_HouseRobberIII {
	public int rob(TreeNode root) {
		int[] result = dfs(root);
		return Math.max(result[0], result[1]);
	}

	public int[] dfs(TreeNode root) {
		if (root == null)
			return new int[] { 0, 0 };

		int[] l = dfs(root.left);
		int[] r = dfs(root.right);

		int[] res = new int[2]; // {withRoot, withoutRoot}

		res[0] = root.val + l[1] + r[1];// include root + grand children
		res[1] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);// exclude root , include children
		return res;
	}
}
