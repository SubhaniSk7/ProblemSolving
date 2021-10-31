package leetproblems;

import basics.bst.TreeNode;

public class Q543_DiameterOfBinaryTree {
	int result = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		cal(root);
		return result - 1;
	}

	public int cal(TreeNode root) {
		if (root == null)
			return 0;
		int l = cal(root.left);
		int r = cal(root.right);

		int temp = 1 + Math.max(l, r);
		int res = Math.max(temp, l + r + 1);
		result = Math.max(result, res);
		return temp;
	}
//	--------------------------------------------------

	public int diameterOfBinaryTree_2(TreeNode root) {// Errichto
		Pair ans = dfs(root);
		return ans.diameter;
	}

	public Pair dfs(TreeNode root) {
		if (root == null)
			return new Pair(0, 0);
		Pair l = dfs(root.left);
		Pair r = dfs(root.right);

		int diameter = Math.max(l.height + r.height, Math.max(l.diameter, r.diameter));
		int height = 1 + Math.max(l.height, r.height);
		return new Pair(diameter, height);
	}

	private class Pair {
		int diameter, height;

		public Pair() {
		}

		public Pair(int x, int y) {
			diameter = x;
			height = y;
		}
	}
}
