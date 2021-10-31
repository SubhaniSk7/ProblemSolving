package leetproblems;

import basics.bst.TreeNode;

public class Q100_SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return same(p, q);
	}

	public boolean same(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;

		if (p != null && q != null && p.val == q.val)
			return same(p.left, q.left) && same(p.right, q.right);
		return false;
	}
}
