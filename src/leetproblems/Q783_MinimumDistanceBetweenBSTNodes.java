package leetproblems;

import basics.bst.TreeNode;

public class Q783_MinimumDistanceBetweenBSTNodes {
	int ans = Integer.MAX_VALUE;
	TreeNode prev;

	public int minDiffInBST(TreeNode root) {
		prev = null;
		inOrder(root);
		return ans;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);

			if (prev != null)
				ans = Math.min(ans, root.val - prev.val);
			prev = root;
			inOrder(root.right);
		}
	}
}
